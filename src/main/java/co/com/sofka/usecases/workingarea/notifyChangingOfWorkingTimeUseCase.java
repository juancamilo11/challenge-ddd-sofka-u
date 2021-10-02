package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.domain.workingarea.event.NotificationDisplayedForChangeOfWorkingTime;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class notifyChangingOfWorkingTimeUseCase extends UseCase<TriggeredEvent<NotificationDisplayedForChangeOfWorkingTime>, ResponseEvents> {

    private final static String message = "Heads up! The working time has been changed!";

    @Override
    public void executeUseCase(TriggeredEvent<NotificationDisplayedForChangeOfWorkingTime> notificationDisplayedForChangeOfWorkingTimeTriggeredEvent) {

        var event = notificationDisplayedForChangeOfWorkingTimeTriggeredEvent.getDomainEvent();
        var workingArea = WorkingArea.from(WorkingAreaId.of(event.aggregateRootId()), this.retrieveEvents());
        workingArea.notifyChangingOfWorkingTime(message);

        emit().onResponse(new ResponseEvents(workingArea.getUncommittedChanges()));
    }
}
