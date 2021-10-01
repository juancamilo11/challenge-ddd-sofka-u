package co.com.sofka.domain.qualitydepartment.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class QualityDepartmentId extends Identity {

    private QualityDepartmentId(String id){
        super(id);
    }

    public static QualityDepartmentId of(String id) {
        Objects.requireNonNull(id, "Id for quality area cannot be null");
        if(id.trim().isBlank()){
            throw new IllegalArgumentException("Id for quality department cannot be blank");
        }
        return new QualityDepartmentId(id);
    }
}
