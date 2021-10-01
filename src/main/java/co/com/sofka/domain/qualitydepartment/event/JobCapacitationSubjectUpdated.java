package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.domain.generic.DomainEvent;

public class JobCapacitationSubjectUpdated extends DomainEvent {

    private CapacitationSubject capacitationSubject;

    public JobCapacitationSubjectUpdated(CapacitationSubject capacitationSubject) {
        super("sofka.qualitydepartment.jobcapacitationsubjectupdated");
        this.capacitationSubject = capacitationSubject;
    }

    public CapacitationSubject getCapacitationSubject() {
        return this.capacitationSubject;
    }

    public void setCapacitationSubject(CapacitationSubject capacitationSubject) {
        this.capacitationSubject = capacitationSubject;
    }
}
