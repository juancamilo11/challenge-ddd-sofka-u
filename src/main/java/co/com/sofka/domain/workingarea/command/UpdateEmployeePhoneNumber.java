package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateEmployeePhoneNumber extends Command {

    private WorkingAreaId workingAreaId;
    private EmployeeId employeeId;
    private PhoneNumber phoneNumber;

    public UpdateEmployeePhoneNumber(WorkingAreaId workingAreaId, EmployeeId employeeId, PhoneNumber phoneNumber) {
        this.workingAreaId = workingAreaId;
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
