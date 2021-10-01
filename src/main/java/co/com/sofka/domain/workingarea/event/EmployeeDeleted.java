package co.com.sofka.domain.workingarea.event;

import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmployeeDeleted extends DomainEvent {

    private EmployeeId employeeId;

    public EmployeeDeleted(EmployeeId employeeId) {
        super("sofka.workingarea.employeedeleted");
        this.employeeId = employeeId;
    }

    public EmployeeId getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }
}
