package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class OrderEmployeeToStopWorking extends Command {

    private WorkingAreaId workingAreaId;
    private EmployeeId employeeId;

    public OrderEmployeeToStopWorking(WorkingAreaId workingAreaId, EmployeeId employeeId) {
        this.workingAreaId = workingAreaId;
        this.employeeId = employeeId;
    }

    public WorkingAreaId getWorkingAreaId() {
        return workingAreaId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }
}
