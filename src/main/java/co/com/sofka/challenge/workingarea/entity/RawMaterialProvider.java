package co.com.sofka.challenge.workingarea.entity;

import co.com.sofka.challenge.commons.Name;
import co.com.sofka.challenge.commons.PhoneNumber;
import co.com.sofka.challenge.workingarea.value.RawMaterialProviderId;
import co.com.sofka.challenge.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.generic.Entity;

public class RawMaterialProvider extends Entity<RawMaterialProviderId> {

    private Name name;
    private PhoneNumber phoneNumber;
    private TypeOfMaterial typeOfMaterial;

    public RawMaterialProvider(RawMaterialProviderId entityId) {
        super(entityId);
    }

    public Name name() {
        return this.name;
    }

    public PhoneNumber phoneNumber() {
        return this.phoneNumber;
    }

    public TypeOfMaterial typeOfMaterial() {
        return this.typeOfMaterial;
    }

    public void updateName(Name name) {
        this.name = name;
    }

    public void updatePhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }
}
