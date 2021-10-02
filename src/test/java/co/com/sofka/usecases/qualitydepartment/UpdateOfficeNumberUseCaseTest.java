package co.com.sofka.usecases.qualitydepartment;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.commons.Email;
import co.com.sofka.domain.qualitydepartment.command.UpdateOfficeNumber;
import co.com.sofka.domain.qualitydepartment.event.OfficeNumberUpdated;
import co.com.sofka.domain.qualitydepartment.event.QualityDepartmentCreated;
import co.com.sofka.domain.qualitydepartment.value.OfficeNumber;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UpdateOfficeNumberUseCaseTest {

    private static final String ROOT_ID = "475WD88";

    @Mock
    private DomainEventRepository domainEventRepository;

    @Test
    void updateOfficeTest(){

        var command = new UpdateOfficeNumber(QualityDepartmentId.of(ROOT_ID), new OfficeNumber(143));

        var useCase = new UpdateOfficeNumberUseCase();

        Mockito.when(domainEventRepository.getEventsBy(ROOT_ID)).thenReturn(List.of(
           new QualityDepartmentCreated(new OfficeNumber(765), new Email("juan.1234@gmail.com"), WorkingAreaId.of("236FDDC"))
        ));

        useCase.addRepository(domainEventRepository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (OfficeNumberUpdated)events.get(0);
        Assertions.assertEquals(143, event.getOfficeNumber().value());
        Mockito.verify(domainEventRepository).getEventsBy(ROOT_ID);

    }

}