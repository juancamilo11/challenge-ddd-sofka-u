package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.qualitydepartment.value.JobCapacitationId;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;

public class UpdateJobCapacitationSubject extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private JobCapacitationId jobCapacitationId;
    private CapacitationSubject capacitationSubject;

    public UpdateJobCapacitationSubject(QualityDepartmentId qualityDepartmentId, JobCapacitationId jobCapacitationId, CapacitationSubject capacitationSubject) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.capacitationSubject = capacitationSubject;
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

    public CapacitationSubject getCapacitationSubject() {
        return capacitationSubject;
    }

    public void setCapacitationSubject(CapacitationSubject capacitationSubject) {
        this.capacitationSubject = capacitationSubject;
    }
}
