package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.workingarea.value.JobContract;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateEmployeeJobContract extends Command {

    private WorkingAreaId workingAreaId;
    private EmployeeId employeeId;
    private JobContract jobContract;

    public UpdateEmployeeJobContract(WorkingAreaId workingAreaId, EmployeeId employeeId, JobContract jobContract) {
        this.workingAreaId = workingAreaId;
        this.employeeId = employeeId;
        this.jobContract = jobContract;
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

    public JobContract getJobContract() {
        return jobContract;
    }

    public void setJobContract(JobContract jobContract) {
        this.jobContract = jobContract;
    }
}
