package co.com.sofka.challenge.qualitydepartment.entity;

import co.com.sofka.challenge.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.challenge.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.challenge.qualitydepartment.value.JobCapacitationId;
import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class JobCapacitation extends Entity<JobCapacitationId> {

    private WorkingAreaId workingAreaId;
    private CapacitationSubject capacitationSubject;
    private CapacitationInfo capacitationInfo;

    public JobCapacitation(JobCapacitationId jobCapacitationId) {
        super(jobCapacitationId);
    }

    public WorkingAreaId workingAreaId() {
        return this.workingAreaId;
    }

    public CapacitationSubject capacitationSubject() {
        return this.capacitationSubject;
    }

    public CapacitationInfo capacitationInfo() {
        return this.capacitationInfo;
    }

    public void updateWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = Objects.requireNonNull(workingAreaId);
    }

    public void updateCapacitationSubject(CapacitationSubject capacitationSubject) {
        this.capacitationSubject = Objects.requireNonNull(capacitationSubject);
    }

    public void updateCapacitationInfo(CapacitationInfo capacitationInfo) {
        this.capacitationInfo = Objects.requireNonNull(capacitationInfo);
    }
}
