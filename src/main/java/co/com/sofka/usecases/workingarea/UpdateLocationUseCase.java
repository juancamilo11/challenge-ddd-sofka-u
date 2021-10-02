package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.domain.workingarea.command.UpdateLocation;

public class UpdateLocationUseCase extends UseCase<RequestCommand<UpdateLocation>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateLocation> updateLocationRequestCommand) {
        var command = updateLocationRequestCommand.getCommand();
        var workingArea = WorkingArea.from(command.getWorkingAreaId(), retrieveEvents(command.getWorkingAreaId().value()));
        workingArea.updateLocation(command.getLocation());
        emit().onResponse(new ResponseEvents(workingArea.getUncommittedChanges()));
    }
}
