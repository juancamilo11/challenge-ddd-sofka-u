package co.com.sofka.challenge.workingarea.command;

import co.com.sofka.challenge.workingarea.value.WorkingTime;
import co.com.sofka.domain.generic.Command;

public class UpdateWorkingTime extends Command {

    private WorkingTime workingTime;

    public UpdateWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }

    public WorkingTime getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }
}
