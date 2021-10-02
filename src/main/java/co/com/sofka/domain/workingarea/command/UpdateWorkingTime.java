package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.workingarea.value.WorkingTime;
import co.com.sofka.domain.generic.Command;

public class UpdateWorkingTime extends Command {

    private WorkingAreaId workingAreaId;
    private WorkingTime workingTime;

    public UpdateWorkingTime(WorkingAreaId workingAreaId, WorkingTime workingTime) {
        this.workingAreaId = workingAreaId;
        this.workingTime = workingTime;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public WorkingTime getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }
}
