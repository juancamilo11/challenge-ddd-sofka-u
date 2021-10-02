package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.commons.Email;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;

public class UpdateEmail extends Command {

    private QualityDepartment qualityDepartment;
    private Email email;

    public UpdateEmail(QualityDepartment qualityDepartment, Email email) {
        this.qualityDepartment = qualityDepartment;
        this.email = email;
    }

    public QualityDepartment getQualityDepartment() {
        return qualityDepartment;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
