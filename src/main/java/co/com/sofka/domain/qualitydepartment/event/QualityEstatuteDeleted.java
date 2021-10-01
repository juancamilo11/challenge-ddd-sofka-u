package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityEstatuteDeleted extends DomainEvent {

    private QualityEstatuteId qualityEstatuteId;


    public QualityEstatuteDeleted(QualityEstatuteId qualityEstatuteId) {
        super("sofka.qualitydepartment.qualityestatutedeleted");
        this.qualityEstatuteId = qualityEstatuteId;
    }

    public QualityEstatuteId getQualityEstatuteId() {
        return qualityEstatuteId;
    }

    public void setQualityEstatuteId(QualityEstatuteId qualityEstatuteId) {
        this.qualityEstatuteId = qualityEstatuteId;
    }
}
