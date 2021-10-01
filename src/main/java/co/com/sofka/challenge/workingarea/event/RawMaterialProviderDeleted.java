package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.generic.DomainEvent;

public class RawMaterialProviderDeleted extends DomainEvent {

    private RawMaterialProviderId rawMaterialProviderId;

    public RawMaterialProviderDeleted(RawMaterialProviderId rawMaterialProviderId) {
        super("sofka.workingarea.rawmaterialproviderdeleted");
        this.rawMaterialProviderId = rawMaterialProviderId;
    }

    public RawMaterialProviderId getRawMaterialProviderId() {
        return this.rawMaterialProviderId;
    }

    public void setSewingMachineId(RawMaterialProviderId rawMaterialProviderId) {
        this.rawMaterialProviderId = rawMaterialProviderId;
    }
}
