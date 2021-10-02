package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.workingarea.event.NotificationDisplayedForChangeOfWorkingTime;
import co.com.sofka.domain.workingarea.event.WorkingTimeUpdated;
import co.com.sofka.domain.workingarea.value.WorkingTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotifyChangingOfWorkingTimeUseCaseTest {
    private static final String ROOT_ID = "49K2F3D8";

    @Mock
    private DomainEventRepository domainEventRepository;

    @Test
    void notifyGeneratedByChangeOfWorkingTimeTest(){

        var event = new WorkingTimeUpdated(new WorkingTime("L-V;10pm-6am"));

        event.setAggregateRootId(ROOT_ID);

        var useCase = new NotifyChangingOfWorkingTimeUseCase();

        Mockito.when(domainEventRepository.getEventsBy(ROOT_ID)).thenReturn(List.of(event));

        useCase.addRepository(domainEventRepository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow().getDomainEvents();

        var notification = (NotificationDisplayedForChangeOfWorkingTime) events.get(0);

        Assertions.assertEquals("L-V;10pm-6am", notification.getNotification());
        Mockito.verify(domainEventRepository).getEventsBy(ROOT_ID);

    }
}