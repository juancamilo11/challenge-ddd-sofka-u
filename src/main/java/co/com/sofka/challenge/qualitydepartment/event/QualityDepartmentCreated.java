package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.commons.Email;
import co.com.sofka.challenge.qualitydepartment.value.OfficeNumber;
import co.com.sofka.challenge.workingarea.value.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class QualityDepartmentCreated extends DomainEvent {

    private OfficeNumber officeNumber;
    private Email email;
    private WorkingAreaId workingAreaId;

    public QualityDepartmentCreated(OfficeNumber officeNumber, Email email, WorkingAreaId workingAreaId) {
        super("sofka.qualitydepartment.qualitydepartmentcreated");
        this.officeNumber = officeNumber;
        this.email = email;
        this.workingAreaId = workingAreaId;
    }

    public OfficeNumber getOfficeNumber() {
        return this.officeNumber;
    }

    public void setOfficeNumber(OfficeNumber officeNumber) {
        this.officeNumber = officeNumber;
    }

    public Email getEmail() {
        return this.email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public WorkingAreaId getWorkingAreaId() {
        return this.workingAreaId;
    }

    public void setWorkingAreaIdList(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
