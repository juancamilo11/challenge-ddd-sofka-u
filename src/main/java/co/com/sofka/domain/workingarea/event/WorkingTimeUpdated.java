package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.workingarea.value.WorkingTime;
import co.com.sofka.domain.generic.DomainEvent;

public class WorkingTimeUpdated extends DomainEvent {

    private WorkingTime workingTime;

    public WorkingTimeUpdated(WorkingTime workingTime) {
        super("sofka.workingarea.workingtimeupdated");
        this.workingTime = workingTime;
    }

    public WorkingTime getWorkingTime() {
        return this.workingTime;
    }

    public void setWorkingTime(WorkingTime workingTime) {
        this.workingTime = workingTime;
    }
}
