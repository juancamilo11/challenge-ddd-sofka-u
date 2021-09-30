package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class QualityEstatuteId extends Identity {

    private QualityEstatuteId(String id){
        super(id);
    }

    public static QualityEstatuteId of(String id) {
        Objects.requireNonNull(id, "Id for quality estatute cannot be null");
        if(id.trim().isBlank()){
            throw new IllegalArgumentException("Id for quality estatute cannot be blank");
        }
        return new QualityEstatuteId(id);
    }

}
