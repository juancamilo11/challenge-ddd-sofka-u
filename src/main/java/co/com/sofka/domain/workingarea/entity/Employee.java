package co.com.sofka.domain.workingarea.entity;

import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.workingarea.value.IsWorking;
import co.com.sofka.domain.workingarea.value.JobContract;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Employee extends Entity<EmployeeId> {

    private Name name;
    private PhoneNumber phoneNumber;
    private JobContract jobContract;
    private IsWorking isWorking;

    public Employee(EmployeeId entityId, Name name, PhoneNumber phoneNumber, JobContract jobContract) {
        super(entityId);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.jobContract = jobContract;
    }

    public Name name() {
        return this.name;
    }

    public PhoneNumber phoneNumber() {
        return this.phoneNumber;
    }

    public JobContract jobContract() {
        return this.jobContract;
    }

    public IsWorking isWorking() {
        return this.isWorking;
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
