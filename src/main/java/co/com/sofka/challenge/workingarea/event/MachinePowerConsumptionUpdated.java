package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.PowerConsumption;
import co.com.sofka.domain.generic.DomainEvent;

public class MachinePowerConsumptionUpdated extends DomainEvent {

    private PowerConsumption powerConsumption;

    public MachinePowerConsumptionUpdated(PowerConsumption powerConsumption) {
        super("sofka.workingarea.machinepowerconsumptionupdated");
        this.powerConsumption = powerConsumption;
    }

    public PowerConsumption getPowerConsumption() {
        return this.powerConsumption;
    }

    public void setPowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

}
