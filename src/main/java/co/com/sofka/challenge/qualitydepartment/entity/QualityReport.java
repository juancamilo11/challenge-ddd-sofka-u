package co.com.sofka.challenge.qualitydepartment.entity;

import co.com.sofka.challenge.qualitydepartment.value.ReportDescription;
import co.com.sofka.challenge.qualitydepartment.value.Grade;
import co.com.sofka.challenge.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class QualityReport extends Entity<QualityReportId> {

    private ReportDescription reportDescription;
    private Grade grade;

    public QualityReport(QualityReportId qualityReportId) {
        super(qualityReportId);
    }

    public ReportDescription getReportDescription() {
        return this.reportDescription;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void updateReportDescription(ReportDescription reportDescription) {
        this.reportDescription = Objects.requireNonNull(reportDescription);
    }

    public void updateGrade(Grade grade) {
        this.grade = Objects.requireNonNull(grade);
    }
}
