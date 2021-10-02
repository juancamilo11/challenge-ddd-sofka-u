package co.com.sofka.usecases.workingarea;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.workingarea.command.AddRawMaterialProvider;

public class AddRawMaterialProviderUseCase extends UseCase<RequestCommand<AddRawMaterialProvider>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddRawMaterialProvider> addRawMaterialProviderRequestCommand) {
        var command = addRawMaterialProviderRequestCommand.getCommand();
        var workingArea = WorkingArea.from(command.getWorkingAreaId(), retrieveEvents(command.getWorkingAreaId().value()));

        workingArea.addRawMaterialProvider(command.getRawMaterialProviderId(), command.getName(), command.getPhoneNumber(), command.getTypeOfMaterial());

        emit().onResponse(new ResponseEvents(workingArea.getUncommittedChanges()));
    }
}