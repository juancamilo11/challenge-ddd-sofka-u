package co.com.sofka.challenge.workingarea;

import co.com.sofka.challenge.workingarea.entity.Employee;
import co.com.sofka.challenge.workingarea.entity.RawMaterialProvider;
import co.com.sofka.challenge.workingarea.entity.SewingMachine;
import co.com.sofka.challenge.workingarea.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class WorkingArea extends AggregateEvent<WorkingAreaId> {

    private TypeOfMaterial typeOfMaterial;
    private Location location;
    private WorkingTime workingTime;

    private List<Employee> employeeList;
    private List<SewingMachine> sewingMachineList;
    private List<RawMaterialProvider> rawMaterialProviderList;

    public WorkingArea(WorkingAreaId workingAreaId) {
        super(workingAreaId);

    }
}
