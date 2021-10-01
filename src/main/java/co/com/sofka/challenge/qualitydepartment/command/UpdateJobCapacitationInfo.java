package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.domain.generic.Command;

public class UpdateJobCapacitationInfo extends Command {

    private CapacitationInfo capacitationInfo;

    public UpdateJobCapacitationInfo(CapacitationInfo capacitationInfo) {
        this.capacitationInfo = capacitationInfo;
    }

    public CapacitationInfo getCapacitationInfo() {
        return capacitationInfo;
    }

    public void setCapacitationInfo(CapacitationInfo capacitationInfo) {
        this.capacitationInfo = capacitationInfo;
    }
}
