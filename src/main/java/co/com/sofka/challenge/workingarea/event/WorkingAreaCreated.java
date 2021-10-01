package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.Location;
import co.com.sofka.challenge.workingarea.value.TypeOfMaterial;
import co.com.sofka.challenge.workingarea.value.WorkingTime;
import co.com.sofka.domain.generic.DomainEvent;

public class WorkingAreaCreated extends DomainEvent {

    private TypeOfMaterial typeOfMaterial;
    private Location location;
    private WorkingTime workingTime;

    public WorkingAreaCreated(TypeOfMaterial typeOfMaterial, Location location, WorkingTime workingTime) {
        super("sofka.workingarea.workingareacreated");
        this.typeOfMaterial = typeOfMaterial;
        this.location = location;
        this.workingTime = workingTime;
    }

    public TypeOfMaterial getTypeOfMaterial() {
        return this.typeOfMaterial;
    }

    public Location getLocation() {
        return this.location;
    }

    public WorkingTime getWorkingTime() {
        return this.workingTime;
    }

    public void setTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }
}
