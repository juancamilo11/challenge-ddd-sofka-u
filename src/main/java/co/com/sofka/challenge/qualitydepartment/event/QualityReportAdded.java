package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.qualitydepartment.value.Grade;
import co.com.sofka.challenge.qualitydepartment.value.QualityReportId;
import co.com.sofka.challenge.qualitydepartment.value.ReportDescription;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportAdded extends DomainEvent {

    private QualityReportId qualityReportId;
    private ReportDescription reportDescription;
    private Grade grade;

    public QualityReportAdded(QualityReportId qualityReportId, ReportDescription reportDescription, Grade grade) {
        super("sofka.qualitydepartment.qualityreportadded");
        this.qualityReportId = qualityReportId;
        this.reportDescription = reportDescription;
        this.grade = grade;
    }

    public QualityReportId getQualityReportId() {
        return this.qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }

    public ReportDescription getReportDescription() {
        return this.reportDescription;
    }

    public void setReportDescription(ReportDescription reportDescription) {
        this.reportDescription = reportDescription;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
