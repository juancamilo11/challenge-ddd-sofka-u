package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.commons.Email;
import co.com.sofka.challenge.qualitydepartment.value.OfficeNumber;
import co.com.sofka.challenge.workingarea.value.*;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class QualityDepartmentCreated extends DomainEvent {

    private OfficeNumber officeNumber;
    private Email email;
    private List<WorkingAreaId> workingAreaIdList;

    public QualityDepartmentCreated(OfficeNumber officeNumber, Email email, List<WorkingAreaId> workingAreaIdList) {
        super("sofka.qualitydepartment.qualitydepartmentcreated");
        this.officeNumber = officeNumber;
        this.email = email;
        this.workingAreaIdList = workingAreaIdList;
    }

}
