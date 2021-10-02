package co.com.sofka.usecases.qualitydepartment;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.qualitydepartment.QualityDepartment;
import co.com.sofka.domain.qualitydepartment.command.AddQualityReport;
import co.com.sofka.domain.workingarea.WorkingArea;
import co.com.sofka.domain.workingarea.command.AddEmployee;

public class AddQualityEstatuteUseCase extends UseCase<RequestCommand<AddQualityReport>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddQualityReport> addQualityReportRequestCommand) {
        var command = addQualityReportRequestCommand.getCommand();
        var qualityDepartment = QualityDepartment.from(command., retrieveEvents(command.getWorkingAreaId().value()));

        workingArea.addEmployee(command.getEmployeeId(), command.getName(), command.getPhoneNumber(), command.getJobContract());

        emit().onResponse(new ResponseEvents(workingArea.getUncommittedChanges()));
    }
}
