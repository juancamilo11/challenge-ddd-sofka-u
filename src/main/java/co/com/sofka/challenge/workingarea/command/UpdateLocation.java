package co.com.sofka.challenge.workingarea.command;

import co.com.sofka.challenge.workingarea.value.Location;
import co.com.sofka.domain.generic.Command;

public class UpdateLocation extends Command {

    private Location location;

    public UpdateLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
