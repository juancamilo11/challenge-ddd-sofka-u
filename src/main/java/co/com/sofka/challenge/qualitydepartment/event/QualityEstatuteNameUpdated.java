package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.qualitydepartment.value.EstatuteName;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityEstatuteNameUpdated extends DomainEvent {

    private EstatuteName estatuteName;

    public QualityEstatuteNameUpdated(EstatuteName estatuteName) {
        super("sofka.qualitydepartment.qualityestatutenameupdated");
        this.estatuteName = estatuteName;
    }

    public EstatuteName getEstatuteName() {
        return this.estatuteName;
    }

    public void setEstatuteName(EstatuteName estatuteName) {
        this.estatuteName = estatuteName;
    }
}
