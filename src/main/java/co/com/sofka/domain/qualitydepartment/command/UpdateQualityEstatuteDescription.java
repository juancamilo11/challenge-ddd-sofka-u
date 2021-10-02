package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityEstatuteDescription extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private QualityEstatuteId qualityEstatuteId;
    private EstatuteDescription estatuteDescription;

    public UpdateQualityEstatuteDescription(QualityDepartmentId qualityDepartmentId, QualityEstatuteId qualityEstatuteId, EstatuteDescription estatuteDescription) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.qualityEstatuteId = qualityEstatuteId;
        this.estatuteDescription = estatuteDescription;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
    }

    public QualityEstatuteId getQualityEstatuteId() {
        return qualityEstatuteId;
    }

    public void setQualityEstatuteId(QualityEstatuteId qualityEstatuteId) {
        this.qualityEstatuteId = qualityEstatuteId;
    }

    public EstatuteDescription getEstatuteDescription() {
        return estatuteDescription;
    }

    public void setEstatuteDescription(EstatuteDescription estatuteDescription) {
        this.estatuteDescription = estatuteDescription;
    }
}
