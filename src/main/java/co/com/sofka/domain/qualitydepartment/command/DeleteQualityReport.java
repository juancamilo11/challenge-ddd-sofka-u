package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.generic.Command;

public class DeleteQualityReport extends Command {

    private QualityReportId qualityReportId;

    public DeleteQualityReport(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }

    public QualityReportId getQualityReportId() {
        return qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }
}
