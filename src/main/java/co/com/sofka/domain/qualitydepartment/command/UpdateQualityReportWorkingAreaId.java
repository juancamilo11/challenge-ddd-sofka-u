package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityReportWorkingAreaId extends Command {

    private QualityDepartment qualityDepartment;
    private QualityReportId qualityReportId;
    private WorkingAreaId workingAreaId;

    public UpdateQualityReportWorkingAreaId(QualityDepartment qualityDepartment, QualityReportId qualityReportId, WorkingAreaId workingAreaId) {
        this.qualityDepartment = qualityDepartment;
        this.qualityReportId = qualityReportId;
        this.workingAreaId = workingAreaId;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
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
