package co.com.sofka.challenge.qualitydepartment;

import co.com.sofka.challenge.commons.Email;
import co.com.sofka.challenge.qualitydepartment.entity.*;
import co.com.sofka.challenge.qualitydepartment.value.OfficeNumber;
import co.com.sofka.challenge.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.challenge.workingarea.value.WorkingAreaId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class QualityDepartment extends AggregateEvent<QualityDepartmentId> {

    protected OfficeNumber officeNumber;
    protected Email email;
    protected List<WorkingAreaId> workingAreaIdList;

    protected List<QualityReport> qualityReportList;
    protected List<QualityEstatute> qualityEstatuteList;
    protected JobCapacitation jobCapacitation;

    public QualityDepartment(QualityDepartmentId qualityDepartmentId) {
        super(qualityDepartmentId);

    }
}
