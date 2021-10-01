package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.DomainEvent;

public class JobCapacitationWorkingAreaIdUpdated extends DomainEvent {

    private WorkingAreaId workingAreaId;

    public JobCapacitationWorkingAreaIdUpdated(WorkingAreaId workingAreaId) {
        super("sofka.qualitydepartment.jobcapacitationworkingareaidupdated");
        this.workingAreaId = workingAreaId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return this.workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
