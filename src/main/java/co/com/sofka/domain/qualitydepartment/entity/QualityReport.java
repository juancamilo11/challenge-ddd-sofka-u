package co.com.sofka.domain.qualitydepartment.entity;

import co.com.sofka.domain.qualitydepartment.value.ReportDescription;
import co.com.sofka.domain.qualitydepartment.value.Grade;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class QualityReport extends Entity<QualityReportId> {

    private WorkingAreaId workingAreaId;
    private ReportDescription reportDescription;
    private Grade grade;

    public QualityReport(QualityReportId qualityReportId, WorkingAreaId workingAreaId, ReportDescription reportDescription, Grade grade) {
        super(qualityReportId);
        this.workingAreaId = workingAreaId;
        this.reportDescription = reportDescription;
        this.grade = grade;
    }

    public WorkingAreaId workingAreaId() {
        return workingAreaId;
    }

    public void updateWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }

    public ReportDescription reportDescription() {
        return this.reportDescription;
    }

    public Grade grade() {
        return this.grade;
    }

    public void updateReportDescription(ReportDescription reportDescription) {
        this.reportDescription = Objects.requireNonNull(reportDescription);
    }

    public void updateGrade(Grade grade) {
        this.grade = Objects.requireNonNull(grade);
    }
}
