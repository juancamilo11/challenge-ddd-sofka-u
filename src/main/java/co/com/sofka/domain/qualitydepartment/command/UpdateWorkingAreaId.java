package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class UpdateWorkingAreaId extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private WorkingAreaId workingAreaId;

    public UpdateWorkingAreaId(QualityDepartmentId qualityDepartmentId, WorkingAreaId workingAreaId) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.workingAreaId = workingAreaId;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
