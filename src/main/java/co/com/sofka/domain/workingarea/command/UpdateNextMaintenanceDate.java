package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.NextMaintenanceDate;
import co.com.sofka.domain.generic.Command;

public class UpdateNextMaintenanceDate extends Command {

    private NextMaintenanceDate jobContract;

    public UpdateNextMaintenanceDate(NextMaintenanceDate jobContract) {
        this.jobContract = jobContract;
    }

    public NextMaintenanceDate getJobContract() {
        return jobContract;
    }

    public void setJobContract(NextMaintenanceDate jobContract) {
        this.jobContract = jobContract;
    }
}
