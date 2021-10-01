package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.PowerConsumption;
import co.com.sofka.challenge.workingarea.value.SewingMachineId;
import co.com.sofka.challenge.workingarea.value.UserGuide;
import co.com.sofka.domain.generic.DomainEvent;

public class SewingMachineUpdated extends DomainEvent {

    private SewingMachineId sewingMachineId;
    private UserGuide userGuide;
    private PowerConsumption powerConsumption;

    public SewingMachineUpdated(SewingMachineId sewingMachineId, UserGuide userGuide, PowerConsumption powerConsumption) {
        super("sofka.workingarea.sewingmachineupdated");
        this.sewingMachineId = sewingMachineId;
        this.userGuide = userGuide;
        this.powerConsumption = powerConsumption;
    }

    public SewingMachineId getSewingMachineId() {
        return this.sewingMachineId;
    }

    public void setSewingMachineId(SewingMachineId sewingMachineId) {
        this.sewingMachineId = sewingMachineId;
    }

    public UserGuide getUserGuide() {
        return this.userGuide;
    }

    public void setUserGuide(UserGuide userGuide) {
        this.userGuide = userGuide;
    }

    public PowerConsumption getPowerConsumption() {
        return this.powerConsumption;
    }

    public void setPowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
