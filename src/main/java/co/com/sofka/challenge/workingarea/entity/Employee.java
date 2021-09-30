package co.com.sofka.challenge.workingarea.entity;

import co.com.sofka.challenge.commons.PhoneNumber;
import co.com.sofka.challenge.workingarea.value.EmployeeId;
import co.com.sofka.challenge.commons.Name;
import co.com.sofka.challenge.workingarea.value.JobContract;
import co.com.sofka.domain.generic.Entity;

public class Employee extends Entity<EmployeeId> {

    private Name name;
    private PhoneNumber phoneNumber;
    private JobContract jobContract;

    public Employee(EmployeeId entityId) {
        super(entityId);
    }
}
