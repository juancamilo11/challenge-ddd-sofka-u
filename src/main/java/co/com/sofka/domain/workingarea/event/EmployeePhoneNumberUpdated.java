package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeePhoneNumberUpdated extends DomainEvent {

    private EmployeeId employeeId;
    private PhoneNumber phoneNumber;

    public EmployeePhoneNumberUpdated(EmployeeId employeeId, PhoneNumber phoneNumber) {
        super("sofka.workingarea.employeephonenumberupdated");
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
    }

    public EmployeeId getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
