package co.com.sofka.usecases.qualitydepartment;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.command.CreateQualityDepartment;

public class CreateQualityDepartmentUseCase extends UseCase<RequestCommand<CreateQualityDepartment>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateQualityDepartment> createQualityDepartmentRequestCommand) {
        var command = createQualityDepartmentRequestCommand.getCommand();
        var qualityDepartment = new QualityDepartment(
                    command.getQualityDepartmentId(),
                    command.getOfficeNumber(),
                    command.getEmail(),
                    command.getWorkingAreaId()
        );
        emit().onResponse(new ResponseEvents(qualityDepartment.getUncommittedChanges()));
    }
}
