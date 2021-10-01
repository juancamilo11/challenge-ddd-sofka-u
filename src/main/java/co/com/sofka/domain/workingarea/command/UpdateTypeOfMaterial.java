package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.generic.Command;

public class UpdateTypeOfMaterial extends Command {

    private RawMaterialProviderId rawMaterialProviderId;
    private TypeOfMaterial typeOfMaterial;

    public UpdateTypeOfMaterial(RawMaterialProviderId rawMaterialProviderId, TypeOfMaterial typeOfMaterial) {
        this.rawMaterialProviderId = rawMaterialProviderId;
        this.typeOfMaterial = typeOfMaterial;
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
