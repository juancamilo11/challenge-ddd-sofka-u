package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.qualitydepartment.value.EstatuteName;
import co.com.sofka.challenge.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityEstatuteName extends Command {

    private QualityEstatuteId qualityEstatuteId;
    private EstatuteName estatuteName;

    public UpdateQualityEstatuteName(QualityEstatuteId qualityEstatuteId, EstatuteName estatuteName) {
        this.qualityEstatuteId = qualityEstatuteId;
        this.estatuteName = estatuteName;
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
}
