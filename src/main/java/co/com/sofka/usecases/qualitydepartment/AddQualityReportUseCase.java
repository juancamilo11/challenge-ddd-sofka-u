package co.com.sofka.usecases.qualitydepartment;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.command.AddQualityReport;

public class AddQualityReportUseCase extends UseCase<RequestCommand<AddQualityReport>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddQualityReport> addQualityEstatuteRequestCommand) {
        var command = addQualityEstatuteRequestCommand.getCommand();
        var qualityDepartment = QualityDepartment.from(command.getQualityDepartmentId(), retrieveEvents(command.getQualityDepartmentId().value()));

        qualityDepartment.addQualityReport(command.getQualityReportId(), command.getWorkingAreaId(), command.getReportDescription(), command.getGrade());

        emit().onResponse(new ResponseEvents(qualityDepartment.getUncommittedChanges()));
    }

}
