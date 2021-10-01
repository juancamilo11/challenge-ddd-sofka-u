package co.com.sofka.challenge.workingarea.command;

import co.com.sofka.challenge.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.generic.Command;

public class DeleteRawMaterialProvider extends Command {

    private RawMaterialProviderId rawMaterialProviderId;

    public DeleteRawMaterialProvider(RawMaterialProviderId rawMaterialProviderId) {
        this.rawMaterialProviderId = rawMaterialProviderId;
    }

    public RawMaterialProviderId getRawMaterialProviderId() {
        return rawMaterialProviderId;
    }

    public void setRawMaterialProviderId(RawMaterialProviderId rawMaterialProviderId) {
        this.rawMaterialProviderId = rawMaterialProviderId;
    }
}
