package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.generic.DomainEvent;

public class NotificationDisplayedForChangeOfWorkingTime extends DomainEvent {

    private final String notification;

    public NotificationDisplayedForChangeOfWorkingTime(String notification) {
        super("sofka.workingarea.notificationdisplayedforchangeofworkingtime");
        this.notification = notification;
    }

    public String getNotification() {
        return this.notification;
    }
}
