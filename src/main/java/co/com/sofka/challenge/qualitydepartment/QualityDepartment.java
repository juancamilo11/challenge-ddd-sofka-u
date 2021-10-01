package co.com.sofka.challenge.qualitydepartment;

import co.com.sofka.challenge.commons.Email;
import co.com.sofka.challenge.qualitydepartment.entity.*;
import co.com.sofka.challenge.qualitydepartment.event.*;
import co.com.sofka.challenge.qualitydepartment.value.*;
import co.com.sofka.challenge.workingarea.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class QualityDepartment extends AggregateEvent<QualityDepartmentId> {

    protected OfficeNumber officeNumber;
    protected Email email;
    protected WorkingAreaId workingAreaId;

    protected List<QualityReport> qualityReportList;
    protected List<QualityEstatute> qualityEstatuteList;
    protected JobCapacitation jobCapacitation;

    public QualityDepartment(QualityDepartmentId qualityDepartmentId, OfficeNumber officeNumber, Email email, WorkingAreaId workingAreaId) {
        super(qualityDepartmentId);
        appendChange(new QualityDepartmentCreated(officeNumber, email, workingAreaId)).apply();
    }

    private QualityDepartment(QualityDepartmentId qualityDepartmentId){
        super(qualityDepartmentId);
        subscribe(new QualityDepartmentChange(this));
    }

    public static QualityDepartment from(QualityDepartmentId qualityDepartmentId, List<DomainEvent> eventList){
        var qualityDepartment = new QualityDepartment(qualityDepartmentId);
        eventList.forEach(qualityDepartment::applyEvent);
        return qualityDepartment;
    }

    public void addQualityReport(QualityReportId qualityReportId, WorkingAreaId workingAreaId ,ReportDescription reportDescription, Grade grade){
        Objects.requireNonNull(qualityReportId);
        Objects.requireNonNull(workingAreaId);
        Objects.requireNonNull(reportDescription);
        Objects.requireNonNull(grade);
        appendChange(new QualityReportAdded(qualityReportId, workingAreaId,reportDescription, grade)).apply();
    }

    public void addQualityEstatute(QualityEstatuteId qualityEstatuteId, EstatuteName estatuteName, EstatuteDescription estatuteDescription){
        Objects.requireNonNull(qualityEstatuteId);
        Objects.requireNonNull(estatuteName);
        Objects.requireNonNull(estatuteDescription);
        appendChange(new QualityEstatuteAdded(qualityEstatuteId, estatuteName, estatuteDescription)).apply();
    }

    public void deleteQualityReport(QualityReportId qualityReportId){
        Objects.requireNonNull(qualityReportId);
        appendChange(new QualityReportDeleted(qualityReportId)).apply();
    }

    public void deleteQualityEstatute(QualityEstatuteId qualityEstatuteId){
        Objects.requireNonNull(qualityEstatuteId);
        appendChange(new QualityEstatuteDeleted(qualityEstatuteId)).apply();
    }

    public void updateQualityReportWorkingAreaId(QualityReportId qualityReportId, WorkingAreaId workingAreaId){
        Objects.requireNonNull(qualityReportId);
        Objects.requireNonNull(workingAreaId);
        appendChange(new QualityReportWorkingAreaIdUpdated(qualityReportId, workingAreaId)).apply();
    }

    public void updateQualityReportDescription(QualityReportId qualityReportId, ReportDescription reportDescription){
        Objects.requireNonNull(qualityReportId);
        Objects.requireNonNull(reportDescription);
        appendChange(new QualityReportDescriptionUpdated(qualityReportId, reportDescription)).apply();
    }

    public void updateQualityReportGrade(QualityReportId qualityReportId,Grade grade){
        Objects.requireNonNull(qualityReportId);
        Objects.requireNonNull(grade);
        appendChange(new QualityReportGradeUpdated(qualityReportId, grade)).apply();
    }

    public void updateQualityEstatuteName(EstatuteName estatuteName){
        Objects.requireNonNull(estatuteName);
        appendChange(new QualityEstatuteNameUpdated(estatuteName)).apply();
    }

    public void createJobCapacitation(JobCapacitationId jobCapacitationId, WorkingAreaId workingAreaId, CapacitationSubject capacitationSubject, CapacitationInfo capacitationInfo){
        Objects.requireNonNull(jobCapacitationId);
        Objects.requireNonNull(workingAreaId);
        Objects.requireNonNull(capacitationSubject);
        Objects.requireNonNull(capacitationInfo);
        appendChange(new JobCapacitationCreated(jobCapacitationId, workingAreaId, capacitationSubject, capacitationInfo)).apply();
    }

    public void updateJobCapacitationWorkingAreaId(WorkingAreaId workingAreaId){
        Objects.requireNonNull(workingAreaId);
        appendChange(new JobCapacitationWorkingAreaIdUpdated(workingAreaId)).apply();
    }

    public void updateJobCapacitationSubject(CapacitationSubject capacitationSubject){
        Objects.requireNonNull(capacitationSubject);
        appendChange(new JobCapacitationSubjectUpdated(capacitationSubject)).apply();
    }

    public void updateJobCapacitationInfo(CapacitationInfo capacitationInfo){
        Objects.requireNonNull(capacitationInfo);
        appendChange(new JobCapacitationInfoUpdated(capacitationInfo)).apply();
    }

    public Optional<QualityReport> getQualityReportById(QualityReportId qualityReportId){
        Objects.requireNonNull(workingAreaId);
        return this.qualityReportList
                .stream()
                .filter(qualityReport -> qualityReport
                        .identity()
                        .equals(qualityReportId)).findFirst();
    }

    public Optional<QualityEstatute> getQualityEstatuteById(QualityEstatuteId qualityEstatuteId){
        Objects.requireNonNull(qualityEstatuteId);
        return this.qualityEstatuteList
                        .stream()
                        .filter(qualityEstatute -> qualityEstatute
                                .identity()
                                .equals(qualityEstatuteId))
                .findFirst();
    }

    public void updateOfficeNumber(OfficeNumber officeNumber){
        Objects.requireNonNull(officeNumber);
        appendChange(new OfficeNumberUpdated(officeNumber)).apply();
    }

    public void updateEmail(Email email){
        Objects.requireNonNull(email);
        appendChange(new EmailUpdated(email)).apply();
    }

    public void updateWorkingAreaId(WorkingAreaId workingAreaId){
        Objects.requireNonNull(workingAreaId);
        appendChange(new WorkingAreaIdUpdated(workingAreaId)).apply();
    }

    public OfficeNumber officeNumber() {
        return this.officeNumber;
    }

    public Email email() {
        return this.email;
    }

    public WorkingAreaId workingAreaIdList() {
        return this.workingAreaId;
    }

    public List<QualityReport> qualityReportList() {
        return this.qualityReportList;
    }

    public List<QualityEstatute> qualityEstatuteList() {
        return this.qualityEstatuteList;
    }

    public JobCapacitation jobCapacitation() {
        return this.jobCapacitation;
    }

}
