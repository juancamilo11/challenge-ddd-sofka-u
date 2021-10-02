package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.workingarea.value.WorkingAreaId;

public class UpdateEmployeeName extends Command {

    private WorkingAreaId workingAreaId;
    private EmployeeId employeeId;
    private Name name;

    public UpdateEmployeeName(WorkingAreaId workingAreaId, EmployeeId employeeId, Name name) {
        this.workingAreaId = workingAreaId;
        this.employeeId = employeeId;
        this.name = name;
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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
