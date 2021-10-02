package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.commons.Email;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.OfficeNumber;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class CreateQualityDepartment extends Command {

    private QualityDepartment qualityDepartment;
    private QualityDepartmentId qualityDepartmentId;
    private OfficeNumber officeNumber;
    private Email email;
    private WorkingAreaId workingAreaId;

    public CreateQualityDepartment(QualityDepartment qualityDepartment, QualityDepartmentId qualityDepartmentId, OfficeNumber officeNumber, Email email, WorkingAreaId workingAreaId) {
        this.qualityDepartment = qualityDepartment;
        this.qualityDepartmentId = qualityDepartmentId;
        this.officeNumber = officeNumber;
        this.email = email;
        this.workingAreaId = workingAreaId;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
    }

    public void setQualityDepartmentId(QualityDepartmentId qualityDepartmentId) {
        this.qualityDepartmentId = qualityDepartmentId;
    }

    public OfficeNumber getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(OfficeNumber officeNumber) {
        this.officeNumber = officeNumber;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
