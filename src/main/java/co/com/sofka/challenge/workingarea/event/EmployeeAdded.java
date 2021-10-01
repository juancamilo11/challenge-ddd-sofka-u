package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.commons.Name;
import co.com.sofka.challenge.commons.PhoneNumber;
import co.com.sofka.challenge.workingarea.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeAdded extends DomainEvent {

    private EmployeeId employeeId;
    private Name name;
    private PhoneNumber phoneNumber;
    private JobContract jobContract;

    public EmployeeAdded(EmployeeId employeeId, Name name, PhoneNumber phoneNumber, JobContract jobContract) {
        super("sofka.workingarea.employeeadded");
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.jobContract = jobContract;
    }

    public EmployeeId getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public JobContract getJobContract() {
        return this.jobContract;
    }

    public void setJobContract(JobContract jobContract) {
        this.jobContract = jobContract;
    }
}
