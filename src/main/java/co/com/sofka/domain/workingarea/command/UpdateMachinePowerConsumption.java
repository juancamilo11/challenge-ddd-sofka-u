package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.PowerConsumption;
import co.com.sofka.domain.generic.Command;

public class UpdateMachinePowerConsumption extends Command {

    private PowerConsumption powerConsumption;

    public UpdateMachinePowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public PowerConsumption getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
