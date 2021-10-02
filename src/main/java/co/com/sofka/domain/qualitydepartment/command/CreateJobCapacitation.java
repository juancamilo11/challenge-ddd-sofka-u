package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.domain.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.domain.qualitydepartment.value.JobCapacitationId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class CreateJobCapacitation extends Command {

    private QualityDepartment qualityDepartment;
    private JobCapacitationId jobCapacitationId;
    private WorkingAreaId workingAreaId;
    private CapacitationSubject capacitationSubject;
    private CapacitationInfo capacitationInfo;

    public CreateJobCapacitation(QualityDepartment qualityDepartment, JobCapacitationId jobCapacitationId, WorkingAreaId workingAreaId, CapacitationSubject capacitationSubject, CapacitationInfo capacitationInfo) {
        this.qualityDepartment = qualityDepartment;
        this.jobCapacitationId = jobCapacitationId;
        this.workingAreaId = workingAreaId;
        this.capacitationSubject = capacitationSubject;
        this.capacitationInfo = capacitationInfo;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
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
