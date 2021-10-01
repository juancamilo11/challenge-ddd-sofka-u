package co.com.sofka.domain.workingarea.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class WorkingAreaId extends Identity {

    private WorkingAreaId(String id){
        super(id);
    }

    public static WorkingAreaId of(String id) {
        Objects.requireNonNull(id,"Id for working area cannot be null");
        if (id.trim().isBlank()) throw new IllegalArgumentException("Id for working area cannot be blank");
        return new WorkingAreaId(id);
    }

}
