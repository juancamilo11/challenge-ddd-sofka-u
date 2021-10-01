package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class UpdateWorkingAreaId extends Command {

    private WorkingAreaId workingAreaId;

    public UpdateWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }
}
