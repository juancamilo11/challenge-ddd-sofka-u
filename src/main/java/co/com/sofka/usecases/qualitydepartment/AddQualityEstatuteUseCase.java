package co.com.sofka.usecases.qualitydepartment;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.command.AddQualityEstatute;

public class AddQualityEstatuteUseCase extends UseCase<RequestCommand<AddQualityEstatute>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddQualityEstatute> addQualityEstatuteRequestCommand) {
        var command = addQualityEstatuteRequestCommand.getCommand();
        var qualityDepartment = QualityDepartment.from(command.getQualityDepartmentId(), retrieveEvents(command.getQualityDepartmentId().value()));

        qualityDepartment.addQualityEstatute(command.getQualityEstatuteId(), command.getEstatuteName(), command.getEstatuteDescription());

        emit().onResponse(new ResponseEvents(qualityDepartment.getUncommittedChanges()));
    }
}
