package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.PowerConsumption;
import co.com.sofka.domain.workingarea.value.SewingMachineId;
import co.com.sofka.domain.workingarea.value.UserGuide;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateSewingMachine extends Command {

    private WorkingAreaId workingAreaId;
    private SewingMachineId sewingMachineId;
    private UserGuide userGuide;
    private PowerConsumption powerConsumption;

    public UpdateSewingMachine(WorkingAreaId workingAreaId, SewingMachineId sewingMachineId, UserGuide userGuide, PowerConsumption powerConsumption) {
        this.workingAreaId = workingAreaId;
        this.sewingMachineId = sewingMachineId;
        this.userGuide = userGuide;
        this.powerConsumption = powerConsumption;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public SewingMachineId getSewingMachineId() {
        return sewingMachineId;
    }

    public void setSewingMachineId(SewingMachineId sewingMachineId) {
        this.sewingMachineId = sewingMachineId;
    }

    public UserGuide getUserGuide() {
        return userGuide;
    }

    public void setUserGuide(UserGuide userGuide) {
        this.userGuide = userGuide;
    }

    public PowerConsumption getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
