package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.workingarea.value.SewingMachineId;
import co.com.sofka.domain.generic.DomainEvent;

public class SewingMachineDeleted extends DomainEvent {

    private SewingMachineId sewingMachineId;

    public SewingMachineDeleted(SewingMachineId sewingMachineId) {
        super("sofka.workingarea.sewingmachinedeleted");
        this.sewingMachineId = sewingMachineId;
    }

    public SewingMachineId getSewingMachineId() {
        return this.sewingMachineId;
    }

    public void setSewingMachineId(SewingMachineId sewingMachineId) {
        this.sewingMachineId = sewingMachineId;
    }
}
