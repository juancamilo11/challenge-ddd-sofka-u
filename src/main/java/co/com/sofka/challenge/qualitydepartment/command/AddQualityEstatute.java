package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.qualitydepartment.value.EstatuteDescription;
import co.com.sofka.challenge.qualitydepartment.value.EstatuteName;
import co.com.sofka.challenge.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class AddQualityEstatute extends Command {

    private QualityEstatuteId qualityEstatuteId;
    private EstatuteName estatuteName;
    private EstatuteDescription estatuteDescription;

    public AddQualityEstatute(QualityEstatuteId qualityEstatuteId, EstatuteName estatuteName, EstatuteDescription estatuteDescription) {
        this.qualityEstatuteId = qualityEstatuteId;
        this.estatuteName = estatuteName;
        this.estatuteDescription = estatuteDescription;
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
