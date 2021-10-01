package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.commons.Name;
import co.com.sofka.challenge.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeNameUpdated extends DomainEvent {

    private EmployeeId employeeId;
    private  Name name;

    public EmployeeNameUpdated(EmployeeId employeeId, Name name) {
        super("sofka.workingarea.employeenameupdated");
        this.employeeId = employeeId;
        this.name = name;
    }

    public EmployeeId getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
