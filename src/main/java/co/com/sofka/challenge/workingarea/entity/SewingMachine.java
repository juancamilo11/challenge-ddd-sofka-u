package co.com.sofka.challenge.workingarea.entity;

import co.com.sofka.challenge.workingarea.value.DateNextMaintenance;
import co.com.sofka.challenge.workingarea.value.PowerConsumption;
import co.com.sofka.challenge.workingarea.value.SewingMachineId;
import co.com.sofka.challenge.workingarea.value.UserGuide;
import co.com.sofka.domain.generic.Entity;

public class SewingMachine extends Entity<SewingMachineId> {

    private UserGuide userGuide;
    private PowerConsumption powerConsumption;
    private DateNextMaintenance dateNextMaintenance;


    public SewingMachine(SewingMachineId entityId) {
        super(entityId);
    }
}
