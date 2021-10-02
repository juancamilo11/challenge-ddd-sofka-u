package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.workingarea.event.LocationUpdated;
import co.com.sofka.domain.workingarea.event.NotificationDisplayedForChangeOfLocation;
import co.com.sofka.domain.workingarea.value.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NotifyChangingLocationUseCaseTest {

    private static final String ROOT_ID = "59K2X3D8";

    @Mock
    private DomainEventRepository domainEventRepository;

    @Test
    void notifyGeneratedByLocationChangeTest(){

        var event = new LocationUpdated(new Location("Zona norte de la empresa"));

        event.setAggregateRootId(ROOT_ID);

        var useCase = new NotifyChangingLocationUseCase();

        Mockito.when(domainEventRepository.getEventsBy(ROOT_ID)).thenReturn(List.of(event));

        useCase.addRepository(domainEventRepository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow().getDomainEvents();

        var notification = (NotificationDisplayedForChangeOfLocation) events.get(0);

        Assertions.assertEquals("Location has been updated", notification.getNotification());
        Mockito.verify(domainEventRepository).getEventsBy(ROOT_ID);

    }

}