package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.qualitydepartment.value.OfficeNumber;
import co.com.sofka.domain.generic.Command;

public class UpdateOfficeNumber extends Command {

    private OfficeNumber officeNumber;

    public UpdateOfficeNumber(OfficeNumber officeNumber) {
        this.officeNumber = officeNumber;
    }

    public OfficeNumber getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(OfficeNumber officeNumber) {
        this.officeNumber = officeNumber;
    }
}
