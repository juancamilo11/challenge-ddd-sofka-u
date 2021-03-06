package co.com.sofka.domain.workingarea.entity;

import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class RawMaterialProvider extends Entity<RawMaterialProviderId> {

    private Name name;
    private PhoneNumber phoneNumber;
    private TypeOfMaterial typeOfMaterial;

    public RawMaterialProvider(RawMaterialProviderId entityId, Name name, PhoneNumber phoneNumber,TypeOfMaterial typeOfMaterial) {
        super(entityId);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.typeOfMaterial = typeOfMaterial;
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
        this.name = Objects.requireNonNull(name);
    }

    public void updatePhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }

    public void updateTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = Objects.requireNonNull(typeOfMaterial);
    }
}
