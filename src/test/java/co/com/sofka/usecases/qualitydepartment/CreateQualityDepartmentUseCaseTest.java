package co.com.sofka.usecases.qualitydepartment;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.commons.Email;
import co.com.sofka.domain.qualitydepartment.command.CreateQualityDepartment;
import co.com.sofka.domain.qualitydepartment.event.QualityDepartmentCreated;
import co.com.sofka.domain.qualitydepartment.value.OfficeNumber;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CreateQualityDepartmentUseCaseTest {

    @Test
    @DisplayName("Test for: Create a new QualityDepartment")
    void createQualityDepartment() {

        //Arrange
        QualityDepartmentId id = QualityDepartmentId.of("GO95L7NEE");
        OfficeNumber officeNumber = new OfficeNumber(123);
        Email email = new Email("juan.cadona@gmail.com");
        WorkingAreaId areaId = WorkingAreaId.of("57RKDNV474");
        var command = new CreateQualityDepartment(id, officeNumber, email, areaId);

        var useCase = new CreateQualityDepartmentUseCase();

        //Act
        var events = UseCaseHandler.getInstance()
                        .syncExecutor(useCase, new RequestCommand<>(command))
                        .orElseThrow()
                        .getDomainEvents();

        //Assert
        var event = (QualityDepartmentCreated) events.get(0);

        Assertions.assertEquals("juan.cadona@gmail.com", event.getEmail().value());
    }
}