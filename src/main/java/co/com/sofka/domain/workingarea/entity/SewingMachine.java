package co.com.sofka.domain.workingarea.entity;

import co.com.sofka.domain.workingarea.value.NextMaintenanceDate;
import co.com.sofka.domain.workingarea.value.PowerConsumption;
import co.com.sofka.domain.workingarea.value.SewingMachineId;
import co.com.sofka.domain.workingarea.value.UserGuide;
import co.com.sofka.domain.generic.Entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class SewingMachine extends Entity<SewingMachineId> {

    private UserGuide userGuide;
    private PowerConsumption powerConsumption;
    private NextMaintenanceDate nextMaintenanceDate;


    public SewingMachine(SewingMachineId entityId, UserGuide userGuide, PowerConsumption powerConsumption) {
        super(entityId);
        this.userGuide = userGuide;
        this.powerConsumption = powerConsumption;
        this.nextMaintenanceDate = new NextMaintenanceDate(LocalDateTime
                .now()
                .plusYears(1));     //First maintenance is the following year
    }

    public UserGuide userGuide() {
        return this.userGuide;
    }

    public PowerConsumption powerConsumption() {
        return this.powerConsumption;
    }

    public NextMaintenanceDate dateNextMaintenance() {
        return this.nextMaintenanceDate;
    }

    public void updateSerGuide(UserGuide userGuide) {
        this.userGuide = Objects.requireNonNull(userGuide);
    }

    public void updatePowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = Objects.requireNonNull(powerConsumption);
    }

    public void updateNextMaintenanceDate(NextMaintenanceDate nextMaintenanceDate) {
        this.nextMaintenanceDate = Objects.requireNonNull(nextMaintenanceDate);
    }
}
