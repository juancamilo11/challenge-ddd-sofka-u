package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.*;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeAdded extends DomainEvent {

    private EmployeeId employeeId;
    private Name name;
    private PhoneNumber phoneNumber;
    private JobContract jobContract;
    private IsWorking isWorking;

    public EmployeeAdded(EmployeeId employeeId, Name name, PhoneNumber phoneNumber, JobContract jobContract) {
        super("sofka.workingarea.employeeadded");
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.jobContract = jobContract;
        this.isWorking = new IsWorking(false);
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

    public IsWorking getIsWorking() {
        return this.isWorking;
    }

    public void setIsWorking(IsWorking isWorking) {
        this.isWorking = isWorking;
    }
}
