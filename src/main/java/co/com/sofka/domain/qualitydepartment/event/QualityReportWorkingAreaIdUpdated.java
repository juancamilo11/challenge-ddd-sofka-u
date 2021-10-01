package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportWorkingAreaIdUpdated extends DomainEvent {

    private QualityReportId qualityReportId;
    private WorkingAreaId workingAreaId;

    public QualityReportWorkingAreaIdUpdated(QualityReportId qualityReportId, WorkingAreaId workingAreaId) {
        super("sofka.qualitydepartment.qualityreportworkingareaidupdated");
        this.qualityReportId = qualityReportId;
        this.workingAreaId = workingAreaId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return this.workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }

    public QualityReportId getQualityReportId() {
        return this.qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }
}
