package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateTypeOfMaterial extends Command {

    private WorkingAreaId workingAreaId;
    private RawMaterialProviderId rawMaterialProviderId;
    private TypeOfMaterial typeOfMaterial;

    public UpdateTypeOfMaterial(WorkingAreaId workingAreaId, RawMaterialProviderId rawMaterialProviderId, TypeOfMaterial typeOfMaterial) {
        this.workingAreaId = workingAreaId;
        this.rawMaterialProviderId = rawMaterialProviderId;
        this.typeOfMaterial = typeOfMaterial;
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

    public TypeOfMaterial getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }
}
