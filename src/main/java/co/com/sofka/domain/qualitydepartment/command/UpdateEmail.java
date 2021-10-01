package co.com.sofka.domain.qualitydepartment.command;

import co.com.sofka.domain.commons.Email;
import co.com.sofka.domain.generic.Command;

public class UpdateEmail extends Command {

    private Email email;

    public UpdateEmail(Email email) {
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
