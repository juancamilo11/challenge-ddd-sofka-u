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
}
