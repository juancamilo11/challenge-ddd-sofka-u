package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.generic.DomainEvent;

public class RawMaterialProviderAdded extends DomainEvent {

    private RawMaterialProviderId rawMaterialProviderId;
    private Name name;
    private PhoneNumber phoneNumber;
    private TypeOfMaterial typeOfMaterial;

    public RawMaterialProviderAdded(RawMaterialProviderId rawMaterialProviderId, Name name, PhoneNumber phoneNumber, TypeOfMaterial typeOfMaterial) {
        super("sofka.workingarea.rawmaterialprovideradded");
        this.rawMaterialProviderId = rawMaterialProviderId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.typeOfMaterial = typeOfMaterial;
    }

    public RawMaterialProviderId getRawMaterialProviderId() {
        return this.rawMaterialProviderId;
    }

    public void setRawMaterialProviderId(RawMaterialProviderId rawMaterialProviderId) {
        this.rawMaterialProviderId = rawMaterialProviderId;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TypeOfMaterial getTypeOfMaterial() {
        return this.typeOfMaterial;
    }

    public void setTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }
}
