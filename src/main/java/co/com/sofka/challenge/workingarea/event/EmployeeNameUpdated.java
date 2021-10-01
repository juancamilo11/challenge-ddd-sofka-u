package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.commons.Name;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeNameUpdated extends DomainEvent {

    private  Name name;

    public EmployeeNameUpdated(Name name) {
        super("sofka.workingarea.employeenameupdated");
        this.name = name;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
