package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.NextMaintenanceDate;
import co.com.sofka.domain.generic.DomainEvent;

public class MachineNextMaintenanceDateUpdated extends DomainEvent {

    private NextMaintenanceDate nextMaintenanceDate;

    public MachineNextMaintenanceDateUpdated(NextMaintenanceDate nextMaintenanceDate) {
        super("sofka.workingarea.employeenameupdated");
        this.nextMaintenanceDate = nextMaintenanceDate;
    }

    public NextMaintenanceDate getNextMaintenanceDate() {
        return this.nextMaintenanceDate;
    }

    public void setNextMaintenanceDate(NextMaintenanceDate nextMaintenanceDate) {
        this.nextMaintenanceDate = nextMaintenanceDate;
    }

}
