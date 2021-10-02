package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.generic.Command;

public class DeleteQualityReport extends Command {

    private QualityDepartment qualityDepartment;
    private QualityReportId qualityReportId;

    public DeleteQualityReport(QualityDepartment qualityDepartment, QualityReportId qualityReportId) {
        this.qualityDepartment = qualityDepartment;
        this.qualityReportId = qualityReportId;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
    }

    public QualityReportId getQualityReportId() {
        return qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }
}
