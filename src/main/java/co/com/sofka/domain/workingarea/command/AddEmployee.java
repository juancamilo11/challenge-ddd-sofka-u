package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.workingarea.value.JobContract;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class AddEmployee extends Command {

    private WorkingAreaId workingAreaId;
    private EmployeeId employeeId;
    private Name name;
    private PhoneNumber phoneNumber;
    private JobContract jobContract;

    public AddEmployee(WorkingAreaId workingAreaId, EmployeeId employeeId, Name name, PhoneNumber phoneNumber, JobContract jobContract) {
        this.workingAreaId = workingAreaId;
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.jobContract = jobContract;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }


    public Name getName() {
        return name;
    }


    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }


    public JobContract getJobContract() {
        return jobContract;
    }

}
