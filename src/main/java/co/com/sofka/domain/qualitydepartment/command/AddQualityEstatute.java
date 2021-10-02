package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.domain.qualitydepartment.value.EstatuteName;
import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class AddQualityEstatute extends Command {

    private QualityDepartment qualityDepartment;
    private QualityEstatuteId qualityEstatuteId;
    private EstatuteName estatuteName;
    private EstatuteDescription estatuteDescription;

    public AddQualityEstatute(QualityDepartment qualityDepartment, QualityEstatuteId qualityEstatuteId, EstatuteName estatuteName, EstatuteDescription estatuteDescription) {
        this.qualityDepartment = qualityDepartment;
        this.qualityEstatuteId = qualityEstatuteId;
        this.estatuteName = estatuteName;
        this.estatuteDescription = estatuteDescription;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
    }

    public QualityEstatuteId getQualityEstatuteId() {
        return qualityEstatuteId;
    }

    public void setQualityEstatuteId(QualityEstatuteId qualityEstatuteId) {
        this.qualityEstatuteId = qualityEstatuteId;
    }

    public EstatuteName getEstatuteName() {
        return estatuteName;
    }

    public void setEstatuteName(EstatuteName estatuteName) {
        this.estatuteName = estatuteName;
    }

    public EstatuteDescription getEstatuteDescription() {
        return estatuteDescription;
    }

    public void setEstatuteDescription(EstatuteDescription estatuteDescription) {
        this.estatuteDescription = estatuteDescription;
    }
}
