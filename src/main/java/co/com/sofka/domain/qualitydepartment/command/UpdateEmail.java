package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.commons.Email;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.value.QualityDepartmentId;

public class UpdateEmail extends Command {

    private QualityDepartmentId qualityDepartmentId;
    private Email email;

    public UpdateEmail(QualityDepartmentId qualityDepartmentId, Email email) {
        this.qualityDepartmentId = qualityDepartmentId;
        this.email = email;
    }

    public QualityDepartmentId getQualityDepartmentId() {
        return qualityDepartmentId;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
