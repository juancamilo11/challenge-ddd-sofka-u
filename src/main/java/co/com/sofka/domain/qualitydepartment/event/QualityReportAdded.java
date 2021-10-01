package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.Grade;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.qualitydepartment.value.ReportDescription;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportAdded extends DomainEvent {

    private WorkingAreaId workingAreaId;
    private QualityReportId qualityReportId;
    private ReportDescription reportDescription;
    private Grade grade;

    public QualityReportAdded(QualityReportId qualityReportId, WorkingAreaId workingAreaId, ReportDescription reportDescription, Grade grade) {
        super("sofka.qualitydepartment.qualityreportadded");
        this.qualityReportId = qualityReportId;
        this.workingAreaId = workingAreaId;
        this.reportDescription = reportDescription;
        this.grade = grade;
    }

    public QualityReportId getQualityReportId() {
        return this.qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return this.workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
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
