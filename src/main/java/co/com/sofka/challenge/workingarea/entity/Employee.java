package co.com.sofka.challenge.workingarea.entity;

import co.com.sofka.challenge.commons.PhoneNumber;
import co.com.sofka.challenge.workingarea.value.EmployeeId;
import co.com.sofka.challenge.commons.Name;
import co.com.sofka.challenge.workingarea.value.IsWorking;
import co.com.sofka.challenge.workingarea.value.JobContract;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Employee extends Entity<EmployeeId> {

    private Name name;
    private PhoneNumber phoneNumber;
    private JobContract jobContract;
    private IsWorking isWorking;

    public Employee(EmployeeId entityId) {
        super(entityId);
    }

    public Name name() {
        return this.name;
    }

    public IsWorking isWorking() {
        return isWorking;
    }

    public PhoneNumber phoneNumber() {
        return this.phoneNumber;
    }

    public JobContract jobContract() {
        return this.jobContract;
    }

    public void updateName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void updatePhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }

    public void updateJobContract(JobContract jobContract) {
        this.jobContract = Objects.requireNonNull(jobContract);
    }

    public void updateIsWorking(IsWorking isWorking) {
        this.isWorking = Objects.requireNonNull(isWorking);
    }
}
