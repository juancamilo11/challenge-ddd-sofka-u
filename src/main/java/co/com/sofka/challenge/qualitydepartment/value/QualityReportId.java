package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class QualityReportId extends Identity {

    private QualityReportId(String id){
        super(id);
    }

    public static QualityReportId of(String id) {
        Objects.requireNonNull(id, "Id for quality report cannot be null");
        if (id.trim().isBlank()) {
            throw new IllegalArgumentException("Id for quality report cannot be blank");
        }
        return new QualityReportId(id);
    }

}
