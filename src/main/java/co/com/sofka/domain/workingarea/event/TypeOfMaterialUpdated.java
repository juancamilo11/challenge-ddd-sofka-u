package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.generic.DomainEvent;

public class TypeOfMaterialUpdated extends DomainEvent {

    private RawMaterialProviderId rawMaterialProviderId;
    private TypeOfMaterial typeOfMaterial;

    public TypeOfMaterialUpdated(RawMaterialProviderId rawMaterialProviderId, TypeOfMaterial typeOfMaterial) {
        super("sofka.workingarea.typeofmaterialupdated");
        this.rawMaterialProviderId = rawMaterialProviderId;
        this.typeOfMaterial = typeOfMaterial;
    }

    public RawMaterialProviderId getRawMaterialProviderId() {
        return this.rawMaterialProviderId;
    }

    public void setRawMaterialProviderId(RawMaterialProviderId rawMaterialProviderId) {
        this.rawMaterialProviderId = rawMaterialProviderId;
    }

    public TypeOfMaterial getTypeOfMaterial() {
        return this.typeOfMaterial;
    }

    public void setTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }
}
