package co.com.sofka.challenge.qualitydepartment.entity;

import co.com.sofka.challenge.qualitydepartment.value.ReportDescription;
import co.com.sofka.challenge.qualitydepartment.value.Grade;
import co.com.sofka.challenge.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.generic.Entity;

public class QualityReport extends Entity<QualityReportId> {

    private ReportDescription reportDescription;
    private Grade grade;

    public QualityReport(QualityReportId qualityReportId) {
        super(qualityReportId);
    }
}
