package co.com.sofka.domain.workingarea.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class RawMaterialProviderId extends Identity {

    private RawMaterialProviderId(String id){
        super(id);
    }

    public static RawMaterialProviderId of(String id) {
        Objects.requireNonNull(id,"Id for Raw material's provider cannot be null");
        if(id.trim().isBlank()) throw new IllegalArgumentException("Id for Raw material's provider cannot be blank");
        return new RawMaterialProviderId(id);
    }
}
