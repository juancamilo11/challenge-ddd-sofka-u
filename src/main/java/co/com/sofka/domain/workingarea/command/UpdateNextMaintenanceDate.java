package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.NextMaintenanceDate;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateNextMaintenanceDate extends Command {

    private WorkingAreaId workingAreaId;
    private NextMaintenanceDate jobContract;

    public UpdateNextMaintenanceDate(WorkingAreaId workingAreaId, NextMaintenanceDate jobContract) {
        this.workingAreaId = workingAreaId;
        this.jobContract = jobContract;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public NextMaintenanceDate getJobContract() {
        return jobContract;
    }

    public void setJobContract(NextMaintenanceDate jobContract) {
        this.jobContract = jobContract;
    }
}
