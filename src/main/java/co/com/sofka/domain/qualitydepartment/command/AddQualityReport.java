package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.Grade;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.qualitydepartment.value.QualityReportId;
import co.com.sofka.domain.qualitydepartment.value.ReportDescription;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.Command;

public class AddQualityReport extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private QualityReportId qualityReportId;
    private WorkingAreaId workingAreaId;
    private ReportDescription reportDescription;
    private Grade grade;

    public AddQualityReport(QualityDepartment qualityDepartment, QualityReportId qualityReportId, WorkingAreaId workingAreaId, ReportDescription reportDescription, Grade grade) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.qualityReportId = qualityReportId;
        this.workingAreaId = workingAreaId;
        this.reportDescription = reportDescription;
        this.grade = grade;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
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
