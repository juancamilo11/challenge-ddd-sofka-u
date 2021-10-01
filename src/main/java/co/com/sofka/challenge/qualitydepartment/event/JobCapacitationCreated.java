package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.challenge.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.challenge.qualitydepartment.value.JobCapacitationId;
import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.DomainEvent;

public class JobCapacitationCreated extends DomainEvent {

    private JobCapacitationId jobCapacitationId;
    private WorkingAreaId workingAreaId;
    private CapacitationSubject capacitationSubject;
    private CapacitationInfo capacitationInfo;


    public JobCapacitationCreated(JobCapacitationId jobCapacitationId, WorkingAreaId workingAreaId, CapacitationSubject capacitationSubject, CapacitationInfo capacitationInfo) {
        super("sofka.qualitydepartment.jobcapacitationcreated");
        this.jobCapacitationId = jobCapacitationId;
        this.workingAreaId = workingAreaId;
        this.capacitationSubject = capacitationSubject;
        this.capacitationInfo = capacitationInfo;
    }

    public JobCapacitationId getJobCapacitationId() {
        return jobCapacitationId;
    }

    public void setJobCapacitationId(JobCapacitationId jobCapacitationId) {
        this.jobCapacitationId = jobCapacitationId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }

    public CapacitationSubject getCapacitationSubject() {
        return capacitationSubject;
    }

    public void setCapacitationSubject(CapacitationSubject capacitationSubject) {
        this.capacitationSubject = capacitationSubject;
    }

    public CapacitationInfo getCapacitationInfo() {
        return capacitationInfo;
    }

    public void setCapacitationInfo(CapacitationInfo capacitationInfo) {
        this.capacitationInfo = capacitationInfo;
    }
}
