package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.generic.DomainEvent;

public class TypeOfMaterialUpdated extends DomainEvent {

    private TypeOfMaterial typeOfMaterial;

    public TypeOfMaterialUpdated(TypeOfMaterial typeOfMaterial) {
        super("sofka.workingarea.typeofmaterialupdated");
        this.typeOfMaterial = typeOfMaterial;
    }

    public TypeOfMaterial getTypeOfMaterial() {
        return this.typeOfMaterial;
    }

    public void setTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }
}
