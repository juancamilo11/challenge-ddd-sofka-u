package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class QualityDepartmentId extends Identity {
    private QualityDepartmentId(String id){
        super(id);
    }

    public static QualityDepartmentId of(String id) {
        Objects.requireNonNull(id);
        if(id.isBlank()){
            throw new IllegalArgumentException("Id cannot be blank");
        }
        return new QualityDepartmentId(id);
    }
}
