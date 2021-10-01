package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.qualitydepartment.value.JobCapacitationId;

public class UpdateJobCapacitationSubject extends Command {

    private JobCapacitationId jobCapacitationId;
    private CapacitationSubject capacitationSubject;

    public UpdateJobCapacitationSubject(JobCapacitationId jobCapacitationId, CapacitationSubject capacitationSubject) {
        this.capacitationSubject = capacitationSubject;
        this.capacitationSubject = capacitationSubject;
    }

    public JobCapacitationId getJobCapacitationId() {
        return jobCapacitationId;
    }

    public void setJobCapacitationId(JobCapacitationId jobCapacitationId) {
        this.jobCapacitationId = jobCapacitationId;
    }

    public CapacitationSubject getCapacitationSubject() {
        return capacitationSubject;
    }

    public void setCapacitationSubject(CapacitationSubject capacitationSubject) {
        this.capacitationSubject = capacitationSubject;
    }
}
