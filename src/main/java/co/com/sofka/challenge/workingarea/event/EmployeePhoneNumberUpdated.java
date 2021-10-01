package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.commons.PhoneNumber;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeePhoneNumberUpdated extends DomainEvent {

    private PhoneNumber phoneNumber;

    public EmployeePhoneNumberUpdated(PhoneNumber phoneNumber) {
        super("sofka.workingarea.employeephonenumberupdated");
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
