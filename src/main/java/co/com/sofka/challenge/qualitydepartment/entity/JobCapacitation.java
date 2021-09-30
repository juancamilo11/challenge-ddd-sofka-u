package co.com.sofka.challenge.qualitydepartment.entity;

import co.com.sofka.challenge.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.challenge.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.challenge.qualitydepartment.value.JobCapacitationId;
import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Entity;

public class JobCapacitation extends Entity<JobCapacitationId> {

    private WorkingAreaId workingAreaId;
    private CapacitationSubject capacitationSubject;
    private CapacitationInfo capacitationInfo;

    public JobCapacitation(JobCapacitationId jobCapacitationId) {
        super(jobCapacitationId);
    }
}
