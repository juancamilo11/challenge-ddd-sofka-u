package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.domain.workingarea.command.UpdateLocation;
import co.com.sofka.domain.workingarea.command.UpdateTypeOfMaterial;

public class UpdateTypeOfMaterialUseCase extends UseCase<RequestCommand<UpdateTypeOfMaterial>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdateTypeOfMaterial> updateTypeOfMaterialRequestCommand) {
        var command = updateTypeOfMaterialRequestCommand.getCommand();
        var workingArea = WorkingArea.from(command.getWorkingAreaId(), retrieveEvents(command.getWorkingAreaId().value()));
        workingArea.updateTypeOfMaterial(command.getRawMaterialProviderId(),command.getTypeOfMaterial());

        emit().onResponse(new ResponseEvents(workingArea.getUncommittedChanges()));
    }
}
