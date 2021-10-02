package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.domain.workingarea.command.UpdateEmployeeJobContract;
import co.com.sofka.domain.workingarea.entity.SewingMachine;
import co.com.sofka.domain.workingarea.event.WorkingAreaCreated;
import co.com.sofka.domain.workingarea.value.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class UpdateJobContractUseCaseTest {

    private final static String ROOT_ID = "453EA75J3";

    @Mock
    private DomainEventRepository repository;

    @Test
    void updateEmployeeJobContract(){
        var command = new UpdateEmployeeJobContract( WorkingAreaId.of("3847WJ8C4"),
                EmployeeId.of("765CJ48C"),
                new JobContract("Production Management",30.000));
        var useCase = new UpdateJobContractUseCase();

        var machine = new SewingMachine(SewingMachineId.of("94RFE8C"),
                new UserGuide(Set.of("arrancar","presionar la palanca","apagar")),
                new PowerConsumption(1.200,"KW"));

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new WorkingAreaCreated(WorkingAreaId.of("843NFEC8C"),
                        new TypeOfMaterial("Algodon"),
                        new Location("Zona este"),
                        new WorkingTime("L-V;8am-5pm"),
                        machine)),
                new JobContr(RefereeID.of("23er45"),
                        new Name("David"),
                        new RefereeType("Virtual assistance"),
                        new Clothes("Gray uniform")));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong while changing the clothes to the referee"))
                .getDomainEvents();

        //Esta bien que este en la posicion 1.

        var event = (RefereeClothesChanged)events.get(0);
        Assertions.assertEquals("White uniform", event.getClothes().value());
        Mockito.verify(repository).getEventsBy(ROOTID);
    }

}

}
