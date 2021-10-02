package co.com.sofka.usecases.qualitydepartment;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.command.AddQualityReport;
import co.com.sofka.domain.qualitydepartment.command.UpdateOfficeNumber;

public class UpdateOfficeNumberUseCase extends UseCase<RequestCommand<UpdateOfficeNumber>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateOfficeNumber> updateOfficeNumberRequestCommand) {
        var command = updateOfficeNumberRequestCommand.getCommand();
        var qualityDepartment = QualityDepartment.from(command.getQualityDepartmentId(), retrieveEvents(command.getQualityDepartmentId().value()));
        qualityDepartment.updateOfficeNumber(command.getOfficeNumber());

        emit().onResponse(new ResponseEvents(qualityDepartment.getUncommittedChanges()));
    }
}
