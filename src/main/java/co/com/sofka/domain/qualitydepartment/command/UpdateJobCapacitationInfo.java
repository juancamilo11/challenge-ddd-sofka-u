package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.domain.generic.Command;

public class UpdateJobCapacitationInfo extends Command {

    private QualityDepartment qualityDepartment;
    private CapacitationInfo capacitationInfo;

    public UpdateJobCapacitationInfo(QualityDepartment qualityDepartment, CapacitationInfo capacitationInfo) {
        this.qualityDepartment = qualityDepartment;
        this.capacitationInfo = capacitationInfo;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
    }

    public CapacitationInfo getCapacitationInfo() {
        return capacitationInfo;
    }

    public void setCapacitationInfo(CapacitationInfo capacitationInfo) {
        this.capacitationInfo = capacitationInfo;
    }
}
