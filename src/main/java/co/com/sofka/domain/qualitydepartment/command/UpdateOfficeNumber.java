package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.OfficeNumber;
import co.com.sofka.domain.generic.Command;

public class UpdateOfficeNumber extends Command {

    private QualityDepartment qualityDepartment;
    private OfficeNumber officeNumber;

    public UpdateOfficeNumber(QualityDepartment qualityDepartment, OfficeNumber officeNumber) {
        this.qualityDepartment = qualityDepartment;
        this.officeNumber = officeNumber;
    }

    public OfficeNumber getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(OfficeNumber officeNumber) {
        this.officeNumber = officeNumber;
    }
}
