package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.DomainEvent;

public class WorkingAreaIdUpdated extends DomainEvent {

    private WorkingAreaId workingAreaId;

    public WorkingAreaIdUpdated(WorkingAreaId workingAreaId) {
        super("sofka.qualitydepartment.workingareaidupdated");
        this.workingAreaId = workingAreaId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return this.workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
