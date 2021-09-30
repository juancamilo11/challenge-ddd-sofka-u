package co.com.sofka.challenge.workingarea;

import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.AggregateEvent;

public class WorkingArea extends AggregateEvent<WorkingAreaId> {

    public WorkingArea(WorkingAreaId workingAreaId) {
        super(workingAreaId);

    }
}
