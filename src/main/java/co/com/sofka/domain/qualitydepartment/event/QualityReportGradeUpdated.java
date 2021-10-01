package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.qualitydepartment.value.Grade;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportGradeUpdated extends DomainEvent {

    private QualityReportId qualityReportId;
    private Grade grade;

    public QualityReportGradeUpdated(QualityReportId qualityReportId, Grade grade) {
        super("sofka.qualitydepartment.qualityreportgradeupdated");
        this.qualityReportId = qualityReportId;
        this.grade = grade;
    }

    public QualityReportId getQualityReportId() {
        return this.qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}
