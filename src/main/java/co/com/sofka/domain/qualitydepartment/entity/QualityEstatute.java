package co.com.sofka.domain.qualitydepartment.entity;

import co.com.sofka.domain.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.domain.qualitydepartment.value.EstatuteName;
import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class QualityEstatute extends Entity<QualityEstatuteId> {

    private EstatuteName estatuteName;
    private EstatuteDescription estatuteDescription;

    public QualityEstatute(QualityEstatuteId qualityEstatuteId, EstatuteName estatuteName, EstatuteDescription estatuteDescription) {
        super(qualityEstatuteId);
        this.estatuteName = estatuteName;
        this.estatuteDescription = estatuteDescription;
    }

    public EstatuteName estatuteName() {
        return this.estatuteName;
    }

    public EstatuteDescription estatuteDescription() {
        return this.estatuteDescription;
    }

    public void updateEstatuteName(EstatuteName estatuteName) {
        this.estatuteName = Objects.requireNonNull(estatuteName);
    }

    public void updateEstatuteDescription(EstatuteDescription estatuteDescription) {
        this.estatuteDescription = Objects.requireNonNull(estatuteDescription);
    }
}
