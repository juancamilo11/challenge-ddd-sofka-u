package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class DeleteQualityEstatute extends Command {

    private QualityDepartment qualityDepartment;
    private QualityEstatuteId qualityEstatuteId;

    public DeleteQualityEstatute(QualityDepartment qualityDepartment, QualityEstatuteId qualityEstatuteId) {
        this.qualityDepartment = qualityDepartment;
        this.qualityEstatuteId = qualityEstatuteId;
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
}
