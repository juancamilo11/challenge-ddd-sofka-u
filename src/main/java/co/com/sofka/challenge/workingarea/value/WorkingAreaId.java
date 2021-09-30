package co.com.sofka.challenge.workingarea.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class WorkingAreaId extends Identity {

    private WorkingAreaId(String id){
        super(id);
    }

    public static WorkingAreaId of(String id) {
        Objects.requireNonNull(id);
        if (id.isBlank()) {
            throw new IllegalArgumentException("Id cannot be blank");
        }
        return new WorkingAreaId(id);
    }

}
