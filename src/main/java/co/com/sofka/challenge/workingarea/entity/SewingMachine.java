package co.com.sofka.challenge.workingarea.entity;

import co.com.sofka.challenge.workingarea.value.DateNextMaintenance;
import co.com.sofka.challenge.workingarea.value.PowerConsumption;
import co.com.sofka.challenge.workingarea.value.SewingMachineId;
import co.com.sofka.challenge.workingarea.value.UserGuide;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class SewingMachine extends Entity<SewingMachineId> {

    private UserGuide userGuide;
    private PowerConsumption powerConsumption;
    private DateNextMaintenance dateNextMaintenance;


    public SewingMachine(SewingMachineId entityId) {
        super(entityId);
    }

    public UserGuide userGuide() {
        return this.userGuide;
    }

    public PowerConsumption powerConsumption() {
        return this.powerConsumption;
    }

    public DateNextMaintenance dateNextMaintenance() {
        return this.dateNextMaintenance;
    }

    public void updateSerGuide(UserGuide userGuide) {
        this.userGuide = Objects.requireNonNull(userGuide);
    }

    public void updatePowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = Objects.requireNonNull(powerConsumption);
    }

    public void updateDateNextMaintenance(DateNextMaintenance dateNextMaintenance) {
        this.dateNextMaintenance = Objects.requireNonNull(dateNextMaintenance);
    }
}
