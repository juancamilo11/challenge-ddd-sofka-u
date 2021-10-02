package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class UpdateJobCapacitationWorkingAreaId extends Command {

    private QualityDepartment qualityDepartment;
    private WorkingAreaId workingAreaId;

    public UpdateJobCapacitationWorkingAreaId(QualityDepartment qualityDepartment, WorkingAreaId workingAreaId) {
        this.qualityDepartment = qualityDepartment;
        this.workingAreaId = workingAreaId;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
