package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.qualitydepartment.value.ReportDescription;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityReportDescription extends Command {

    private QualityReportId qualityReportId;
    private ReportDescription reportDescription;

    public UpdateQualityReportDescription(QualityReportId qualityReportId, ReportDescription reportDescription) {
        this.qualityReportId = qualityReportId;
        this.reportDescription = reportDescription;
    }

    public QualityReportId getQualityReportId() {
        return qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }

    public ReportDescription getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(ReportDescription reportDescription) {
        this.reportDescription = reportDescription;
    }
}
