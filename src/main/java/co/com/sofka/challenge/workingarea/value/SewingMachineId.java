package co.com.sofka.challenge.workingarea.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class SewingMachineId extends Identity {

    private SewingMachineId(String id){
        super(id);
    }

    public static SewingMachineId of(String id) {
        Objects.requireNonNull(id,"Id for Sewing machine cannot be null");
        if(id.trim().isBlank()) throw new IllegalArgumentException("Id for Sewing machine cannot be blank");
        return new SewingMachineId(id);
    }

}
