package co.com.sofka.domain.qualitydepartment.event;

import co.com.sofka.domain.commons.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailUpdated extends DomainEvent {

    private Email email;

    public EmailUpdated(Email email) {
        super("sofka.qualitydepartment.emailupdated");
        this.email = email;
    }

    public Email getEmail() {
        return this.email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
