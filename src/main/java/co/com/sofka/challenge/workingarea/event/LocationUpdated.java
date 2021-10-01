package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.Location;
import co.com.sofka.domain.generic.DomainEvent;

public class LocationUpdated extends DomainEvent {
    private Location location;

    public LocationUpdated(Location location) {
        super("sofka.workingarea.locationupdated");
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
