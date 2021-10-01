package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.workingarea.value.JobContract;
import co.com.sofka.domain.generic.Command;

public class AddEmployee extends Command {

    private EmployeeId employeeId;
    private Name name;
    private PhoneNumber phoneNumber;
    private JobContract jobContract;

    public AddEmployee(EmployeeId employeeId, Name name, PhoneNumber phoneNumber, JobContract jobContract) {
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.jobContract = jobContract;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public JobContract getJobContract() {
        return jobContract;
    }

    public void setJobContract(JobContract jobContract) {
        this.jobContract = jobContract;
    }
}
