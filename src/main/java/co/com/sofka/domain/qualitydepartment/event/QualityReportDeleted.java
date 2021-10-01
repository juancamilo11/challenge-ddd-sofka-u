package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportDeleted extends DomainEvent {

    private QualityReportId qualityReportId;

    public QualityReportDeleted(QualityReportId qualityReportId) {
        super("sofka.qualitydepartment.qualityreportdeleted");
        this.qualityReportId = qualityReportId;
    }

    public QualityReportId getQualityReportId() {
        return this.qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }
}
