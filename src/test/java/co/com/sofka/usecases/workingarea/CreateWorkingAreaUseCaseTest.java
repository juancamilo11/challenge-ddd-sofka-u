package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.workingarea.command.CreateWorkingArea;
import co.com.sofka.domain.workingarea.entity.SewingMachine;
import co.com.sofka.domain.workingarea.event.WorkingAreaCreated;
import co.com.sofka.domain.workingarea.value.*;
import org.junit.jupiter.api.*;

import java.util.Set;

class CreateWorkingAreaUseCaseTest {

    @Test
    @DisplayName("Test for: Create a new WorkingArea")
    void createQualityDepartment() {

        //Arrange
        WorkingAreaId id = WorkingAreaId.of("NF4875KDH");
        TypeOfMaterial typeOfMaterial = new TypeOfMaterial("Algodon");
        Location location = new Location("Zona Sur de la fabrica");
        WorkingTime workingTime = new WorkingTime("L-V;10pm-6am");

        SewingMachine machine = new SewingMachine(
                SewingMachineId.of("4573E5KDJ"),
                new UserGuide(Set.of("encender","accionar la palanca","cocer","detener")),
                new PowerConsumption(1.2,"KW"));

        var command = new CreateWorkingArea(id, typeOfMaterial, location, workingTime, machine);

        var useCase = new CreateWorkingAreaUseCase();

        //Act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //Assert
        var event = (WorkingAreaCreated) events.get(0);

        Assertions.assertEquals("Zona Sur de la fabrica", event.getLocation().value());
        Assertions.assertEquals("L-V;10pm-6am", event.getWorkingTime().value());
    }
}