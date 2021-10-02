package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.generic.DomainEvent;

public class NotificationDisplayedForChangeOfLocation extends DomainEvent {

    private final String notification;

    public NotificationDisplayedForChangeOfLocation(String notification) {
        super("sofka.workingarea.notificationdisplayedforchangeoflocation");
        this.notification = notification;
    }

    public String getNotification() {
        return this.notification;
    }
}

