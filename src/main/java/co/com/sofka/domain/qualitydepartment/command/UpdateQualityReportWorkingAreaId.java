package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityReportWorkingAreaId extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private QualityReportId qualityReportId;
    private WorkingAreaId workingAreaId;

    public UpdateQualityReportWorkingAreaId(QualityDepartmentId qualityDepartmentId, QualityReportId qualityReportId, WorkingAreaId workingAreaId) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.qualityReportId = qualityReportId;
        this.workingAreaId = workingAreaId;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
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
