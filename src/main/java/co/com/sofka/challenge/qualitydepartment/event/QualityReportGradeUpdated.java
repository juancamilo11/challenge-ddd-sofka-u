package co.com.sofka.challenge.qualitydepartment.event;

import co.com.sofka.challenge.qualitydepartment.value.Grade;
import co.com.sofka.domain.generic.DomainEvent;

public class QualityReportGradeUpdated extends DomainEvent {

    private Grade grade;

    public QualityReportGradeUpdated(Grade grade) {
        super("sofka.qualitydepartment.qualityreportgradeupdated");
        this.grade = grade;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}
