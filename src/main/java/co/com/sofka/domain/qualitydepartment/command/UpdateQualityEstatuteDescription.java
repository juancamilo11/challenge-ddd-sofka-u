package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityEstatuteDescription extends Command {

    private QualityDepartment qualityDepartment;
    private QualityEstatuteId qualityEstatuteId;
    private EstatuteDescription estatuteDescription;

    public UpdateQualityEstatuteDescription(QualityDepartment qualityDepartment, QualityEstatuteId qualityEstatuteId, EstatuteDescription estatuteDescription) {
        this.qualityDepartment = qualityDepartment;
        this.qualityEstatuteId = qualityEstatuteId;
        this.estatuteDescription = estatuteDescription;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
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
