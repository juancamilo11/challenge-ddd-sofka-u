package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.qualitydepartment.value.QualityReportId;
import co.com.sofka.challenge.qualitydepartment.value.ReportDescription;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportDescriptionUpdated extends DomainEvent {

    private QualityReportId qualityReportId;
    private ReportDescription reportDescription;

    public QualityReportDescriptionUpdated(QualityReportId qualityReportId, ReportDescription reportDescription) {
        super("sofka.qualitydepartment.qualityreportdescriptionupdated");
        this.qualityReportId = qualityReportId;
        this.reportDescription = reportDescription;
    }

    public QualityReportId getQualityReportId() {
        return this.qualityReportId;
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
