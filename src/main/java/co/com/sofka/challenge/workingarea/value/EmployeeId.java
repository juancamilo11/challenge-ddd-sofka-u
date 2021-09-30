package co.com.sofka.challenge.workingarea.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class EmployeeId extends Identity {

    private EmployeeId(String id){
        super(id);
    }

    public static EmployeeId of(String id) {
        Objects.requireNonNull(id, "Id for employee cannot be null");
        if(id.trim().isBlank()) throw new IllegalArgumentException("Id for employee cannot be blank");
        return new EmployeeId(id);
    }
}
