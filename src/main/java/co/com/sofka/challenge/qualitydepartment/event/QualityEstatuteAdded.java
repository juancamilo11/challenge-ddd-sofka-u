package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.challenge.qualitydepartment.value.EstatuteName;
import co.com.sofka.challenge.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityEstatuteAdded extends DomainEvent {

    private QualityEstatuteId qualityEstatuteId;
    private EstatuteName estatuteName;
    private EstatuteDescription estatuteDescription;

    public QualityEstatuteAdded(QualityEstatuteId qualityEstatuteId, EstatuteName estatuteName, EstatuteDescription estatuteDescription) {
        super("sofka.qualitydepartment.qualityestatuteadded");
        this.qualityEstatuteId = qualityEstatuteId;
        this.estatuteName = estatuteName;
        this.estatuteDescription = estatuteDescription;
    }

    public QualityEstatuteId getQualityEstatuteId() {
        return this.qualityEstatuteId;
    }

    public void setQualityEstatuteId(QualityEstatuteId qualityEstatuteId) {
        this.qualityEstatuteId = qualityEstatuteId;
    }

    public EstatuteName getEstatuteName() {
        return this.estatuteName;
    }

    public void setEstatuteName(EstatuteName estatuteName) {
        this.estatuteName = estatuteName;
    }

    public EstatuteDescription getEstatuteDescription() {
        return this.estatuteDescription;
    }

    public void setEstatuteDescription(EstatuteDescription estatuteDescription) {
        this.estatuteDescription = estatuteDescription;
    }
}
