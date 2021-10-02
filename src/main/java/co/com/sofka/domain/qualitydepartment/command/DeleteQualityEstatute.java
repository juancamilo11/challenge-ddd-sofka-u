package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.qualitydepartment.value.QualityEstatuteId;
import co.com.sofka.domain.generic.Command;

public class DeleteQualityEstatute extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private QualityEstatuteId qualityEstatuteId;

    public DeleteQualityEstatute(QualityDepartmentId qualityDepartmentId, QualityEstatuteId qualityEstatuteId) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.qualityEstatuteId = qualityEstatuteId;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
    }

    public QualityEstatuteId getQualityEstatuteId() {
        return qualityEstatuteId;
    }

    public void setQualityEstatuteId(QualityEstatuteId qualityEstatuteId) {
        this.qualityEstatuteId = qualityEstatuteId;
    }
}
