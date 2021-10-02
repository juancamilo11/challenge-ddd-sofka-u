package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class DeleteRawMaterialProvider extends Command {

    private WorkingAreaId workingAreaId;
    private RawMaterialProviderId rawMaterialProviderId;

    public DeleteRawMaterialProvider(WorkingAreaId workingAreaId, RawMaterialProviderId rawMaterialProviderId) {
        this.workingAreaId = workingAreaId;
        this.rawMaterialProviderId = rawMaterialProviderId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public RawMaterialProviderId getRawMaterialProviderId() {
        return rawMaterialProviderId;
    }

    public void setRawMaterialProviderId(RawMaterialProviderId rawMaterialProviderId) {
        this.rawMaterialProviderId = rawMaterialProviderId;
    }
}
