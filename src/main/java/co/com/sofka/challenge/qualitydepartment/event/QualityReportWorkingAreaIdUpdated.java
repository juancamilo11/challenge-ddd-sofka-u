package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportWorkingAreaIdUpdated extends DomainEvent {

    private WorkingAreaId workingAreaId;

    public QualityReportWorkingAreaIdUpdated(WorkingAreaId workingAreaId) {
        super("sofka.qualitydepartment.qualityreportworkingareaidupdated");
        this.workingAreaId = workingAreaId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return this.workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
