package co.com.sofka.challenge.workingarea.event;

import co.com.sofka.challenge.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeOrderedToWork extends DomainEvent {

    private EmployeeId employeeId;

    public EmployeeOrderedToWork(EmployeeId employeeId) {
        super("sofka.workingarea.employeeorderedtowork");
        this.employeeId = employeeId;
    }

    public EmployeeId getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }
}
