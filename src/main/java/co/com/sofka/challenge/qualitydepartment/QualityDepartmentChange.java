package co.com.sofka.challenge.qualitydepartment;

import co.com.sofka.challenge.qualitydepartment.entity.JobCapacitation;
import co.com.sofka.challenge.qualitydepartment.entity.QualityEstatute;
import co.com.sofka.challenge.qualitydepartment.entity.QualityReport;
import co.com.sofka.challenge.qualitydepartment.event.*;
import co.com.sofka.domain.generic.EventChange;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class QualityDepartmentChange extends EventChange {

    public QualityDepartmentChange(QualityDepartment qualityDepartment) {
        apply((QualityDepartmentCreated event) -> {
            qualityDepartment.officeNumber = event.getOfficeNumber();
            qualityDepartment.email = event.getEmail();
            qualityDepartment.workingAreaId = event.getWorkingAreaId();
        });

        apply((QualityReportAdded event) -> {
            if(qualityDepartment.qualityReportList == null) {
                qualityDepartment.qualityReportList = new ArrayList<>();
            }
            if(qualityDepartment.getQualityReportById(event.getQualityReportId()).isPresent()){
                throw new IllegalArgumentException("This quality report cannot be twice in the reports' List");
            }
            qualityDepartment.qualityReportList.add(new QualityReport(event.getQualityReportId(),
                    event.getWorkingAreaId(),
                    event.getReportDescription(),
                    event.getGrade()));
        });

        apply((QualityEstatuteAdded event) -> {
            if(qualityDepartment.qualityEstatuteList == null) {
                qualityDepartment.qualityEstatuteList = new ArrayList<>();
            }
            if(qualityDepartment.getQualityEstatuteById(event.getQualityEstatuteId()).isPresent()){
                throw new IllegalArgumentException("This estatute cannot be twice in the Provider's List");
            }
            qualityDepartment.qualityEstatuteList.add(new QualityEstatute(event.getQualityEstatuteId(),
                    event.getEstatuteName(),
                    event.getEstatuteDescription()));
        });

        apply((QualityReportDeleted event) -> {
            if(qualityDepartment.qualityReportList == null || qualityDepartment.qualityReportList.isEmpty()) {
                throw new IllegalArgumentException("There're not any quality report for deleting");
            }
            if(qualityDepartment.getQualityReportById(event.getQualityReportId()).isEmpty()){
                throw new IllegalArgumentException("The quality report was not found in the list");
            }
            qualityDepartment.qualityReportList = qualityDepartment
                    .qualityReportList
                    .stream()
                    .filter(employee -> employee
                            .identity()
                            .equals(event.getQualityReportId()))
                    .collect(Collectors.toList());
        });

        apply((QualityEstatuteDeleted event) -> {
            if(qualityDepartment.qualityEstatuteList == null || qualityDepartment.qualityEstatuteList.isEmpty()) {
                throw new IllegalArgumentException("There're not any quality estatute for deleting");
            }
            if(qualityDepartment.getQualityEstatuteById(event.getQualityEstatuteId()).isEmpty()){
                throw new IllegalArgumentException("The quality estatute was not found in the list");
            }
            qualityDepartment.qualityEstatuteList = qualityDepartment
                    .qualityEstatuteList
                    .stream()
                    .filter(rawMaterialProvider -> rawMaterialProvider
                            .identity().equals(event.getQualityEstatuteId()))
                    .collect(Collectors.toList());
        });

        apply((QualityReportWorkingAreaIdUpdated event) -> {
            if(qualityDepartment.qualityReportList == null || qualityDepartment.qualityReportList.isEmpty()) {
                throw new IllegalArgumentException("There're not any quality report for updating its working area");
            }
            if(qualityDepartment.getQualityReportById(event.getQualityReportId()).isEmpty()){
                throw new IllegalArgumentException("The quality report was not found in the list");
            }
            var qualityReport = qualityDepartment.getQualityReportById(event.getQualityReportId()).orElseThrow();
            qualityReport.updateWorkingAreaId(event.getWorkingAreaId());
        });

        apply((QualityReportDescriptionUpdated event) -> {
            if(qualityDepartment.qualityReportList == null || qualityDepartment.qualityReportList.isEmpty()) {
                throw new IllegalArgumentException("There're not any quality report for updating its description");
            }
            if(qualityDepartment.getQualityReportById(event.getQualityReportId()).isEmpty()){
                throw new IllegalArgumentException("The quality report was not found in the list");
            }
            var qualityReport = qualityDepartment.getQualityReportById(event.getQualityReportId()).orElseThrow();
            qualityReport.updateReportDescription(event.getReportDescription());
        });

        apply((QualityReportGradeUpdated event) -> {
            if(qualityDepartment.qualityReportList == null || qualityDepartment.qualityReportList.isEmpty()) {
                throw new IllegalArgumentException("There're not any quality report for updating its grade");
            }
            if(qualityDepartment.getQualityReportById(event.getQualityReportId()).isEmpty()){
                throw new IllegalArgumentException("The quality report was not found in the list");
            }
            var qualityReport = qualityDepartment.getQualityReportById(event.getQualityReportId()).orElseThrow();
            qualityReport.updateGrade(event.getGrade());
        });

        apply((JobCapacitationCreated event) -> qualityDepartment.jobCapacitation = new JobCapacitation(event.getJobCapacitationId() , event.getWorkingAreaId() , event.getCapacitationSubject() , event.getCapacitationInfo() ));

        apply((JobCapacitationWorkingAreaIdUpdated event) -> qualityDepartment.jobCapacitation.updateWorkingAreaId(event.getWorkingAreaId()));

        apply((JobCapacitationSubjectUpdated event) -> qualityDepartment.jobCapacitation.updateCapacitationSubject(event.getCapacitationSubject()));

        apply((JobCapacitationInfoUpdated event) -> qualityDepartment.jobCapacitation.updateCapacitationInfo(event.getCapacitationInfo()));

        apply((OfficeNumberUpdated event) -> qualityDepartment.officeNumber = event.getOfficeNumber());

        apply((EmailUpdated event) -> qualityDepartment.email = event.getEmail());

        apply((WorkingAreaIdUpdated event) -> qualityDepartment.workingAreaId = event.getWorkingAreaId());


    }
}
