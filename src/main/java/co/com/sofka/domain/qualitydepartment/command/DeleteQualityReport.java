package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.generic.Command;

public class DeleteQualityReport extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private QualityReportId qualityReportId;

    public DeleteQualityReport(QualityDepartmentId qualityDepartmentId, QualityReportId qualityReportId) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.qualityReportId = qualityReportId;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
    }

    public QualityReportId getQualityReportId() {
        return qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }
}
