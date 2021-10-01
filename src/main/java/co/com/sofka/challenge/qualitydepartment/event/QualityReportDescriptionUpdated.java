package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.qualitydepartment.value.ReportDescription;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportDescriptionUpdated extends DomainEvent {

    private ReportDescription reportDescription;

    public QualityReportDescriptionUpdated(ReportDescription reportDescription) {
        super("sofka.qualitydepartment.qualityreportdescriptionupdated");
        this.reportDescription = reportDescription;
    }

    public ReportDescription getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(ReportDescription reportDescription) {
        this.reportDescription = reportDescription;
    }
}
