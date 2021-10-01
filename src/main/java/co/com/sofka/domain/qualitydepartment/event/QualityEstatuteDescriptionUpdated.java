package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityEstatuteDescriptionUpdated extends DomainEvent {

    QualityEstatuteId qualityEstatuteId;
    private EstatuteDescription estatuteDescription;

    public QualityEstatuteDescriptionUpdated(QualityEstatuteId qualityEstatuteId, EstatuteDescription estatuteDescription) {
        super("sofka.qualitydepartment.qualityestatutedescriptionupdated");
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
        return this.estatuteDescription;
    }

    public void setEstatuteDescription(EstatuteDescription estatuteDescription) {
        this.estatuteDescription = estatuteDescription;
    }
}
