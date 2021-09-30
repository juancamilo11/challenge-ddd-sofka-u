package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class JobCapacitationId extends Identity {

    private JobCapacitationId(String id){
        super(id);
    }

    public static JobCapacitationId of(String id) {
        Objects.requireNonNull(id, "Id for job capacitation cannot be null");
        if(id.trim().isBlank()){
            throw new IllegalArgumentException("Id for job capacitation cannot be blank");
        }
        return new JobCapacitationId(id);
    }

}
