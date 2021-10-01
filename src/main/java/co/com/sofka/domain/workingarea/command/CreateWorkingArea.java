package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.entity.SewingMachine;
import co.com.sofka.domain.workingarea.value.Location;
import co.com.sofka.domain.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.workingarea.value.WorkingTime;

public class CreateWorkingArea extends Command {

    private WorkingAreaId workingAreaId;
    private TypeOfMaterial typeOfMaterial;
    private Location location;
    private WorkingTime workingTime;
    private SewingMachine sewingMachine;

    public CreateWorkingArea(WorkingAreaId workingAreaId, TypeOfMaterial typeOfMaterial, Location location, WorkingTime workingTime, SewingMachine sewingMachine) {
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
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public WorkingTime getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }

    public SewingMachine getSewingMachine() {
        return sewingMachine;
    }

    public void setSewingMachine(SewingMachine sewingMachine) {
        this.sewingMachine = sewingMachine;
    }
}
