package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.domain.workingarea.command.CreateWorkingArea;

public class CreateWorkingAreaUseCase extends UseCase<RequestCommand<CreateWorkingArea>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateWorkingArea> createWorkingAreaRequestCommand) {
        var command = createWorkingAreaRequestCommand.getCommand();
        var workingArea = new WorkingArea(command.getWorkingAreaId(),
                    command.getTypeOfMaterial(),
                    command.getLocation(),
                    command.getWorkingTime(),
                    command.getSewingMachine());
        emit().onResponse(new ResponseEvents(workingArea.getUncommittedChanges()));
    }
}