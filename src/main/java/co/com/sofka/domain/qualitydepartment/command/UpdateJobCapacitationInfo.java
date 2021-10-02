package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;

public class UpdateJobCapacitationInfo extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private CapacitationInfo capacitationInfo;

    public UpdateJobCapacitationInfo(QualityDepartmentId qualityDepartmentId, CapacitationInfo capacitationInfo) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.capacitationInfo = capacitationInfo;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
    }

    public CapacitationInfo getCapacitationInfo() {
        return capacitationInfo;
    }

    public void setCapacitationInfo(CapacitationInfo capacitationInfo) {
        this.capacitationInfo = capacitationInfo;
    }
}
