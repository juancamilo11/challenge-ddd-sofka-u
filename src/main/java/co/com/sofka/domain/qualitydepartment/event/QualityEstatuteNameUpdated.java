package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.EstatuteName;
import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityEstatuteNameUpdated extends DomainEvent {

    private QualityEstatuteId qualityEstatuteId;
    private EstatuteName estatuteName;

    public QualityEstatuteNameUpdated(QualityEstatuteId qualityEstatuteId, EstatuteName estatuteName) {
        super("sofka.qualitydepartment.qualityestatutenameupdated");
        this.qualityEstatuteId = qualityEstatuteId;
        this.estatuteName = estatuteName;
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
}
