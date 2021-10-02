package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.qualitydepartment.value.ReportDescription;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityReportDescription extends Command {

    private QualityDepartment qualityDepartment;
    private QualityReportId qualityReportId;
    private ReportDescription reportDescription;

    public UpdateQualityReportDescription(QualityDepartment qualityDepartment, QualityReportId qualityReportId, ReportDescription reportDescription) {
        this.qualityDepartment = qualityDepartment;
        this.qualityReportId = qualityReportId;
        this.reportDescription = reportDescription;
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

    public ReportDescription getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(ReportDescription reportDescription) {
        this.reportDescription = reportDescription;
    }
}
