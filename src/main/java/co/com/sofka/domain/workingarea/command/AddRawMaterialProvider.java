package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.commons.PhoneNumber;
import co.com.sofka.domain.workingarea.value.RawMaterialProviderId;
import co.com.sofka.domain.workingarea.value.TypeOfMaterial;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class AddRawMaterialProvider extends Command {

    private WorkingAreaId workingAreaId;
    private RawMaterialProviderId rawMaterialProviderId;
    private Name name;
    private PhoneNumber phoneNumber;
    private TypeOfMaterial typeOfMaterial;

    public AddRawMaterialProvider(WorkingAreaId workingAreaId, RawMaterialProviderId rawMaterialProviderId, Name name, PhoneNumber phoneNumber, TypeOfMaterial typeOfMaterial) {
        this.workingAreaId = workingAreaId;
        this.rawMaterialProviderId = rawMaterialProviderId;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TypeOfMaterial getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(TypeOfMaterial typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }
}
