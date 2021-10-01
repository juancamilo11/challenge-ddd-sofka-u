package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.challenge.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityEstatuteDescription extends Command {

    private QualityEstatuteId qualityEstatuteId;
    private EstatuteDescription estatuteDescription;

    public UpdateQualityEstatuteDescription(QualityEstatuteId qualityEstatuteId, EstatuteDescription estatuteDescription) {
        this.qualityEstatuteId = qualityEstatuteId;
        this.estatuteDescription = estatuteDescription;
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
