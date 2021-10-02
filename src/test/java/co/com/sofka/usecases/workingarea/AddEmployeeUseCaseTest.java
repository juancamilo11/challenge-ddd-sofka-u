package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.command.AddEmployee;
import co.com.sofka.domain.workingarea.entity.SewingMachine;
import co.com.sofka.domain.workingarea.event.EmployeeAdded;
import co.com.sofka.domain.workingarea.event.WorkingAreaCreated;
import co.com.sofka.domain.workingarea.value.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
class AddEmployeeUseCaseTest {

    private final static String ROOT_ID = "453EA75J3";

    @Mock
    private DomainEventRepository domainEventRepository;

    @Test
    void testAddingEmployee(){
        var command = new AddEmployee(
                WorkingAreaId.of(ROOT_ID),
                EmployeeId.of("457DNSMER"),
                new Name("Juan Cardona"),
                new PhoneNumber("+57","3122679384"),
                new JobContract("Production Management", 300.000));

        var useCase = new AddEmployeeUseCase();

        var machine = new SewingMachine(SewingMachineId.of("94RFE8C"),
                new UserGuide(Set.of("arrancar","presionar la palanca","apagar")),
                new PowerConsumption(1.200,"KW"));

        Mockito.when(domainEventRepository.getEventsBy(ROOT_ID))
                .thenReturn(List.of(
                new WorkingAreaCreated(WorkingAreaId.of("843NFEC8C"),
                        new TypeOfMaterial("Algodon"),
                        new Location("Zona este"),
                        new WorkingTime("L-V;8am-5pm"),
                        machine)));

        useCase.addRepository(domainEventRepository);
        var events = UseCaseHandler
                        .getInstance()
                        .setIdentifyExecutor(ROOT_ID)
                        .syncExecutor(useCase, new RequestCommand<>(command))
                        .orElseThrow(()->new IllegalArgumentException("Unable to create a new employee, try again"))
                        .getDomainEvents();

        var event = (EmployeeAdded)events.get(0);
        Assertions.assertEquals("Juan Cardona", event.getName().value());
        Mockito.verify(domainEventRepository).getEventsBy(ROOT_ID);
    }
}