package co.com.sofka.challenge.workingarea.command;

import co.com.sofka.challenge.workingarea.value.UserGuide;
import co.com.sofka.domain.generic.Command;

public class UpdateMachineDescription extends Command {

    private UserGuide userGuide;

    public UpdateMachineDescription(UserGuide userGuide) {
        this.userGuide = userGuide;
    }

    public UserGuide getUserGuide() {
        return userGuide;
    }

    public void setUserGuide(UserGuide userGuide) {
        this.userGuide = userGuide;
    }
}
