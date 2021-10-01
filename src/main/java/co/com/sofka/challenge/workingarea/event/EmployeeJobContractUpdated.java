package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.JobContract;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeJobContractUpdated extends DomainEvent {

    private JobContract jobContract;

    public EmployeeJobContractUpdated(JobContract jobContract) {
        super("sofka.workingarea.employeejobcontractupdated");
    }

    public JobContract getJobContract() {
        return this.jobContract;
    }

    public void setJobContract(JobContract jobContract) {
        this.jobContract = jobContract;
    }
}