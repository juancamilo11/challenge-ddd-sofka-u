package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.CapacitationInfo;
import co.com.sofka.domain.generic.DomainEvent;

public class JobCapacitationInfoUpdated extends DomainEvent {

    private CapacitationInfo capacitationInfo;

    public JobCapacitationInfoUpdated(CapacitationInfo capacitationInfo) {
        super("sofka.qualitydepartment.jobcapacitationinfoupdated");
        this.capacitationInfo = capacitationInfo;
    }

    public CapacitationInfo getCapacitationInfo() {
        return this.capacitationInfo;
    }

    public void setCapacitationInfo(CapacitationInfo capacitationInfo) {
        this.capacitationInfo = capacitationInfo;
    }
}
