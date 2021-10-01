package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.qualitydepartment.value.Grade;
import co.com.sofka.challenge.qualitydepartment.value.QualityReportId;
import co.com.sofka.challenge.qualitydepartment.value.ReportDescription;
import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class AddQualityReport extends Command {

    private QualityReportId qualityReportId;
    private WorkingAreaId workingAreaId;
    private ReportDescription reportDescription;
    private Grade grade;

    public AddQualityReport(QualityReportId qualityReportId, WorkingAreaId workingAreaId, ReportDescription reportDescription, Grade grade) {
        this.qualityReportId = qualityReportId;
        this.workingAreaId = workingAreaId;
        this.reportDescription = reportDescription;
        this.grade = grade;
    }

    public QualityReportId getQualityReportId() {
        return qualityReportId;
    }

    public void setQualityReportId(QualityReportId qualityReportId) {
        this.qualityReportId = qualityReportId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(WorkingAreaId workingAreaId) {
        this.workingAreaId = workingAreaId;
    }

    public ReportDescription getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(ReportDescription reportDescription) {
        this.reportDescription = reportDescription;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
