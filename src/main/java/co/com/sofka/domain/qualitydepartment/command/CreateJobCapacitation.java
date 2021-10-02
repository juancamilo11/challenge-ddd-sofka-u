package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.domain.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.domain.qualitydepartment.value.JobCapacitationId;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class CreateJobCapacitation extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private JobCapacitationId jobCapacitationId;
    private WorkingAreaId workingAreaId;
    private CapacitationSubject capacitationSubject;
    private CapacitationInfo capacitationInfo;

    public CreateJobCapacitation(QualityDepartmentId qualityDepartmentId, JobCapacitationId jobCapacitationId, WorkingAreaId workingAreaId, CapacitationSubject capacitationSubject, CapacitationInfo capacitationInfo) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.jobCapacitationId = jobCapacitationId;
        this.workingAreaId = workingAreaId;
        this.capacitationSubject = capacitationSubject;
        this.capacitationInfo = capacitationInfo;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
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
