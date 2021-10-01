package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.OfficeNumber;
import co.com.sofka.domain.generic.DomainEvent;

public class OfficeNumberUpdated extends DomainEvent {

    private OfficeNumber officeNumber;

    public OfficeNumberUpdated(OfficeNumber officeNumber) {
        super("sofka.qualitydepartment.officenumberupdated");
        this.officeNumber = officeNumber;
    }

    public OfficeNumber getOfficeNumber() {
        return this.officeNumber;
    }

    public void setOfficeNumber(OfficeNumber officeNumber) {
        this.officeNumber = officeNumber;
    }
}
