package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.Command;

public class OrderEmployeeToStopWorking extends Command {

    private EmployeeId employeeId;

    public OrderEmployeeToStopWorking(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }
}