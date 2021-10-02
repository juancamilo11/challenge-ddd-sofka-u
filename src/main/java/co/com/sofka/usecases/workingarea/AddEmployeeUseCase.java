package co.com.sofka.usecases.workingarea;

import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.workingarea.command.AddEmployee;

public class AddEmployeeUseCase extends UseCase<RequestCommand<AddEmployee>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddEmployee> addEmployeeRequestCommand) {
        var command = addEmployeeRequestCommand.getCommand();
        var workingArea = WorkingArea.from(command.getWorkingAreaId(), retrieveEvents(command.getWorkingAreaId().value()));

        workingArea.addEmployee(command.getEmployeeId(), command.getName(), command.getPhoneNumber(), command.getJobContract());

        emit().onResponse(new ResponseEvents(workingArea.getUncommittedChanges()));
    }
}
