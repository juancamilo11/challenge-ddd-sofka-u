package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityReportWorkingAreaId extends Command {

    private QualityReportId qualityReportId;
    private WorkingAreaId workingAreaId;

    public UpdateQualityReportWorkingAreaId(QualityReportId qualityReportId, WorkingAreaId workingAreaId) {
        this.qualityReportId = qualityReportId;
        this.workingAreaId = workingAreaId;
    }

    public QualityReportId getQualityReportId() {
        return qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
