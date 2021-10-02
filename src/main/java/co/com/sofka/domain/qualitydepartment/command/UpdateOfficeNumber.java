package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.OfficeNumber;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;

public class UpdateOfficeNumber extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private OfficeNumber officeNumber;

    public UpdateOfficeNumber(QualityDepartmentId qualityDepartmentId, OfficeNumber officeNumber) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.officeNumber = officeNumber;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
    }

    public OfficeNumber getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(OfficeNumber officeNumber) {
        this.officeNumber = officeNumber;
    }
}
