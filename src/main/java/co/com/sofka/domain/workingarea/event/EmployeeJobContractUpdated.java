package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.workingarea.value.JobContract;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeJobContractUpdated extends DomainEvent {

    private EmployeeId employeeId;
    private JobContract jobContract;

    public EmployeeJobContractUpdated(EmployeeId employeeId,JobContract jobContract) {
        super("sofka.workingarea.employeejobcontractupdated");
        this.employeeId = employeeId;
        this.jobContract = jobContract;
    }

    public EmployeeId getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public JobContract getJobContract() {
        return this.jobContract;
    }

    public void setJobContract(JobContract jobContract) {
        this.jobContract = jobContract;
    }
}