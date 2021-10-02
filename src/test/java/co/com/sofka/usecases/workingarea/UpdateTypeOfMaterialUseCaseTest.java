package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.workingarea.command.UpdateTypeOfMaterial;
import co.com.sofka.domain.workingarea.entity.SewingMachine;
import co.com.sofka.domain.workingarea.event.TypeOfMaterialUpdated;
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

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UpdateTypeOfMaterialUseCaseTest {

    private static final String ROOT_ID = "3847C8JC";

    @Mock
    private DomainEventRepository domainEventRepository;

    @Test
    void testTypeOfMaterial(){

        var command = new UpdateTypeOfMaterial(WorkingAreaId.of(ROOT_ID),
                RawMaterialProviderId.of("347J8W7"), new TypeOfMaterial("Tela sintetica"));

        var useCase = new UpdateTypeOfMaterialUseCase();

        var machine = new SewingMachine(SewingMachineId.of("94RFE8C"),
                new UserGuide(Set.of("arrancar","presionar la palanca","apagar")),
                new PowerConsumption(1.200,"KW"));

        Mockito.when(domainEventRepository.getEventsBy(ROOT_ID)).thenReturn(List.of( new WorkingAreaCreated(WorkingAreaId.of(ROOT_ID),
                        new TypeOfMaterial("Algodon"),
                        new Location("Zona este"),
                        new WorkingTime("L-V;8am-5pm"),
                        machine)));
        useCase.addRepository(domainEventRepository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Unable to update the type of the material, try again"))
                .getDomainEvents();

        var event = (TypeOfMaterialUpdated)events.get(0);
        Assertions.assertEquals("Tela sintetica", event.getTypeOfMaterial().value());
        Mockito.verify(domainEventRepository).getEventsBy(ROOT_ID);
    }

}