package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.UserGuide;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateMachineDescription extends Command {

    private WorkingAreaId workingAreaId;
    private UserGuide userGuide;

    public UpdateMachineDescription(WorkingAreaId workingAreaId, UserGuide userGuide) {
        this.workingAreaId = workingAreaId;
        this.userGuide = userGuide;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public UserGuide getUserGuide() {
        return userGuide;
    }

    public void setUserGuide(UserGuide userGuide) {
        this.userGuide = userGuide;
    }
}
