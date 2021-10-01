package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.workingarea.value.UserGuide;
import co.com.sofka.domain.generic.DomainEvent;

public class MachineUserGuideUpdated extends DomainEvent {

    private UserGuide userGuide;

    public MachineUserGuideUpdated(UserGuide userGuide) {
        super("sofka.workingarea.machineuserguideupdated");
        this.userGuide = userGuide;
    }

    public UserGuide getUserGuide() {
        return this.userGuide;
    }

    public void setUserGuide(UserGuide userGuide) {
        this.userGuide = userGuide;
    }

}
