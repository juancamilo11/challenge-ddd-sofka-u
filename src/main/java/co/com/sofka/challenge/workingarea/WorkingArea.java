package co.com.sofka.challenge.workingarea;

import co.com.sofka.challenge.workingarea.value.Location;
import co.com.sofka.challenge.workingarea.value.TypeOfMaterial;
import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.challenge.workingarea.value.WorkingTime;
import co.com.sofka.domain.generic.AggregateEvent;

public class WorkingArea extends AggregateEvent<WorkingAreaId> {

    private TypeOfMaterial typeOfMaterial;
    private Location location;
    private WorkingTime workingTime;

    public WorkingArea(WorkingAreaId workingAreaId) {
        super(workingAreaId);

    }
}
