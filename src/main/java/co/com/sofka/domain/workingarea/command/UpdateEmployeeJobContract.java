package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.workingarea.value.JobContract;
import co.com.sofka.domain.generic.Command;

public class UpdateEmployeeJobContract extends Command {

    private EmployeeId employeeId;
    private JobContract jobContract;

    public UpdateEmployeeJobContract(EmployeeId employeeId, JobContract jobContract) {
        this.employeeId = employeeId;
        this.jobContract = jobContract;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public JobContract getJobContract() {
        return jobContract;
    }

    public void setJobContract(JobContract jobContract) {
        this.jobContract = jobContract;
    }
}
