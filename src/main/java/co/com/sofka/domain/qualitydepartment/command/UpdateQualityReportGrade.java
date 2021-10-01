package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.value.Grade;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.generic.Command;

public class UpdateQualityReportGrade extends Command {

    private QualityReportId qualityReportId;
    private Grade grade;

    public UpdateQualityReportGrade(QualityReportId qualityReportId, Grade grade) {
        this.qualityReportId = qualityReportId;
        this.grade = grade;
    }

    public QualityReportId getQualityReportId() {
        return qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
