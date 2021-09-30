package co.com.sofka.challenge.qualitydepartment;

import co.com.sofka.challenge.qualitydepartment.value.QualityDepartmentId;
import co.com.sofka.domain.generic.AggregateEvent;

public class QualityDepartment extends AggregateEvent<QualityDepartmentId> {

    public QualityDepartment(QualityDepartmentId qualityDepartmentId) {
        super(qualityDepartmentId);

    }
}
