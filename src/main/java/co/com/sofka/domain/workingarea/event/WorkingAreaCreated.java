package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.workingarea.entity.SewingMachine;
import co.com.sofka.domain.workingarea.value.Location;
import co.com.sofka.domain.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.workingarea.value.WorkingTime;
import co.com.sofka.domain.generic.DomainEvent;

public class WorkingAreaCreated extends DomainEvent {

    private WorkingAreaId workingAreaId;
    private TypeOfMaterial typeOfMaterial;
    private Location location;
    private WorkingTime workingTime;
    private SewingMachine sewingMachine;

    public WorkingAreaCreated(WorkingAreaId workingAreaId, TypeOfMaterial typeOfMaterial, Location location, WorkingTime workingTime, SewingMachine sewingMachine) {
        super("sofka.workingarea.workingareacreated");
        this.workingAreaId = workingAreaId;
        this.typeOfMaterial = typeOfMaterial;
        this.location = location;
        this.workingTime = workingTime;
        this.sewingMachine = sewingMachine;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
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

    public SewingMachine getSewingMachine() {
        return this.sewingMachine;
    }

    public void setSewingMachine(SewingMachine sewingMachine) {
        this.sewingMachine = sewingMachine;
    }
}
