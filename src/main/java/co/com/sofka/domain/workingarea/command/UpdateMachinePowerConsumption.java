package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.PowerConsumption;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateMachinePowerConsumption extends Command {

    private WorkingAreaId workingAreaId;
    private PowerConsumption powerConsumption;

    public UpdateMachinePowerConsumption(WorkingAreaId workingAreaId, PowerConsumption powerConsumption) {
        this.workingAreaId = workingAreaId;
        this.powerConsumption = powerConsumption;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public PowerConsumption getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
