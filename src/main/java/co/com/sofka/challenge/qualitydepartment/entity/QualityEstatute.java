package co.com.sofka.challenge.qualitydepartment.entity;

import co.com.sofka.challenge.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.challenge.qualitydepartment.value.EstatuteName;
import co.com.sofka.challenge.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Entity;

public class QualityEstatute extends Entity<QualityEstatuteId> {

    private EstatuteName estatuteName;
    private EstatuteDescription estatuteDescription;

    public QualityEstatute(QualityEstatuteId qualityEstatuteId) {
        super(qualityEstatuteId);
    }
}
