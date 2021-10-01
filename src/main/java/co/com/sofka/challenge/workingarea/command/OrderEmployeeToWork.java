package co.com.sofka.challenge.workingarea.command;

import co.com.sofka.challenge.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.Command;

public class OrderEmployeeToWork extends Command {

    private EmployeeId employeeId;

    public OrderEmployeeToWork(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }
}
