package co.com.sofka.domain.workingarea.command;

import co.com.sofka.domain.commons.Name;
import co.com.sofka.domain.workingarea.value.EmployeeId;
import co.com.sofka.domain.generic.Command;

public class UpdateEmployeeName extends Command {

    private EmployeeId employeeId;
    private Name name;

    public UpdateEmployeeName(EmployeeId employeeId, Name name) {
        this.employeeId = employeeId;
        this.name = name;
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
