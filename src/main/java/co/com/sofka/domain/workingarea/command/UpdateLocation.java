package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.Location;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateLocation extends Command {

    private WorkingAreaId workingAreaId;
    private Location location;

    public UpdateLocation(WorkingAreaId workingAreaId, Location location) {
        this.workingAreaId = workingAreaId;
        this.location = location;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
