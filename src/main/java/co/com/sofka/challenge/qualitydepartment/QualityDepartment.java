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
import java.util.stream.Collectors;

public class QualityDepartment extends AggregateEvent<QualityDepartmentId> {

    protected OfficeNumber officeNumber;
    protected Email email;
    protected List<WorkingAreaId> workingAreaIdList;

    protected List<QualityReport> qualityReportList;
    protected List<QualityEstatute> qualityEstatuteList;
    protected JobCapacitation jobCapacitation;

    public QualityDepartment(QualityDepartmentId qualityDepartmentId, OfficeNumber officeNumber, Email email, List<WorkingAreaId> workingAreaIdList) {
        super(qualityDepartmentId);
        appendChange(new QualityDepartmentCreated(officeNumber, email, workingAreaIdList)).apply();
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
        appendChange(new QualityReportAdded(qualityReportId, reportDescription, grade)).apply();
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

    public void updateQualityReportWorkingAreaId(WorkingAreaId WorkingAreaId){
        Objects.requireNonNull(WorkingAreaId);
        appendChange(new QualityReportWorkingAreaIdUpdated(WorkingAreaId)).apply();
    }

    public void updateQualityReportDescription(ReportDescription reportDescription){
        Objects.requireNonNull(reportDescription);
        appendChange(new QualityReportDescriptionUpdated(reportDescription)).apply();
    }

    public void updateQualityReportGrade(Grade grade){
        Objects.requireNonNull(grade);
        appendChange(new QualityReportGradeUpdated(grade)).apply();
    }

    public void updateJobCapacitationWorkingAreaId(WorkingAreaId workingAreaId){
        Objects.requireNonNull(workingAreaId);
        appendChange(new JobCapacitationWorkingAreaIdUpdated(workingAreaId)).apply();
    }

    public void updateJobCapacitationSubject(CapacitationSubject capacitationSubject){
        Objects.requireNonNull(capacitationSubject);
        appendChange(new JobCapacitationSubjectUpdated(capacitationSubject)).apply();
    }

    public void updateQualityEstatuteName(EstatuteName estatuteName){
        Objects.requireNonNull(estatuteName);
        appendChange(new QualityEstatuteNameUpdated(estatuteName)).apply();
    }

    public Optional<List<QualityReport>> getQualityReportByAreaId(WorkingAreaId workingAreaId){
        Objects.requireNonNull(workingAreaId);
        return Optional.of(
                this.qualityReportList
                .stream()
                .filter(qualityReport -> qualityReport
                        .workingAreaId()
                        .value()
                        .equals(workingAreaId.value()))
                .collect(Collectors.toList()));
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

    public OfficeNumber officeNumber() {
        return this.officeNumber;
    }

    public Email email() {
        return this.email;
    }

    public List<WorkingAreaId> workingAreaIdList() {
        return this.workingAreaIdList;
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
