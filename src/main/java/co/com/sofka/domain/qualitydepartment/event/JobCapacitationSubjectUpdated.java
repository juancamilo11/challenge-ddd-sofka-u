package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.qualitydepartment.value.JobCapacitationId;

public class JobCapacitationSubjectUpdated extends DomainEvent {

    private JobCapacitationId jobCapacitationId;
    private CapacitationSubject capacitationSubject;

    public JobCapacitationSubjectUpdated(JobCapacitationId jobCapacitationId, CapacitationSubject capacitationSubject) {
        super("sofka.qualitydepartment.jobcapacitationsubjectupdated");
        this.jobCapacitationId = jobCapacitationId;
        this.capacitationSubject = capacitationSubject;
    }

    public JobCapacitationId getJobCapacitationId() {
        return jobCapacitationId;
    }

    public void setJobCapacitationId(JobCapacitationId jobCapacitationId) {
        this.jobCapacitationId = jobCapacitationId;
    }

    public CapacitationSubject getCapacitationSubject() {
        return this.capacitationSubject;
    }

    public void setCapacitationSubject(CapacitationSubject capacitationSubject) {
        this.capacitationSubject = capacitationSubject;
    }
}
