package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityEstatuteDescriptionUpdated extends DomainEvent {

    private EstatuteDescription estatuteDescription;

    public QualityEstatuteDescriptionUpdated(EstatuteDescription estatuteDescription) {
        super("sofka.qualitydepartment.qualityestatutedescriptionupdated");
        this.estatuteDescription = estatuteDescription;
    }

    public EstatuteDescription getEstatuteDescription() {
        return this.estatuteDescription;
    }

    public void setEstatuteDescription(EstatuteDescription estatuteDescription) {
        this.estatuteDescription = estatuteDescription;
    }
}
