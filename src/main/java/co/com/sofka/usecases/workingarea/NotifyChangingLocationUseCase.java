package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.domain.workingarea.event.LocationUpdated;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class NotifyChangingLocationUseCase extends UseCase<TriggeredEvent<LocationUpdated>, ResponseEvents> {
    private static final String message = "Location has been updated";
    @Override
    public void executeUseCase(TriggeredEvent<LocationUpdated> locationUpdatedTriggeredEvent) {
        var event = locationUpdatedTriggeredEvent.getDomainEvent();
        var workingArea = WorkingArea.from(WorkingAreaId.of(event.aggregateRootId()), this.retrieveEvents());
        workingArea.notifyChangingLocation(message);

        emit().onResponse(new ResponseEvents(workingArea.getUncommittedChanges()));
    }
}