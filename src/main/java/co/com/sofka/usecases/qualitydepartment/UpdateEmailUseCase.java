package co.com.sofka.usecases.qualitydepartment;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.command.AddQualityReport;
import co.com.sofka.domain.qualitydepartment.command.UpdateEmail;

public class UpdateEmailUseCase extends UseCase<RequestCommand<UpdateEmail>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateEmail> updateEmailRequestCommand) {
        var command = updateEmailRequestCommand.getCommand();
        var qualityDepartment = QualityDepartment.from(command.getQualityDepartmentId(), retrieveEvents(command.getQualityDepartmentId().value()));
        qualityDepartment.updateEmail(command.getEmail());

        emit().onResponse(new ResponseEvents(qualityDepartment.getUncommittedChanges()));
    }
}
