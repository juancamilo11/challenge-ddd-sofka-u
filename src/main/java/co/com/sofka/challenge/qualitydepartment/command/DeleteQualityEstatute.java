package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class DeleteQualityEstatute extends Command {

    private QualityEstatuteId qualityEstatuteId;

    public DeleteQualityEstatute(QualityEstatuteId qualityEstatuteId) {
        this.qualityEstatuteId = qualityEstatuteId;
    }

    public QualityEstatuteId getQualityEstatuteId() {
        return qualityEstatuteId;
    }

    public void setQualityEstatuteId(QualityEstatuteId qualityEstatuteId) {
        this.qualityEstatuteId = qualityEstatuteId;
    }
}
