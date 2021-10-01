package co.com.sofka.challenge.workingarea;

import co.com.sofka.challenge.commons.Name;
import co.com.sofka.challenge.commons.PhoneNumber;
import co.com.sofka.challenge.workingarea.event.EmployeeAdded;
import co.com.sofka.challenge.workingarea.event.RawMaterialProviderAdded;
import co.com.sofka.challenge.workingarea.event.SewingMachineAdded;
import co.com.sofka.challenge.workingarea.event.WorkingAreaCreated;
import co.com.sofka.challenge.workingarea.entity.Employee;
import co.com.sofka.challenge.workingarea.entity.RawMaterialProvider;
import co.com.sofka.challenge.workingarea.entity.SewingMachine;
import co.com.sofka.challenge.workingarea.value.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;
import java.util.Objects;

public class WorkingArea extends AggregateEvent<WorkingAreaId> {

    private TypeOfMaterial typeOfMaterial;
    private Location location;
    private WorkingTime workingTime;

    private List<Employee> employeeList;
    private List<SewingMachine> sewingMachineList;
    private List<RawMaterialProvider> rawMaterialProviderList;

    public WorkingArea(WorkingAreaId workingAreaId,TypeOfMaterial typeOfMaterial , Location location, WorkingTime workingTime) {
        super(workingAreaId);
        appendChange(new WorkingAreaCreated(typeOfMaterial, location, workingTime)).apply();
    }

    public void addEmployee(EmployeeId employeeId, Name name, PhoneNumber phoneNumber, JobContract jobContract){
        Objects.requireNonNull(employeeId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(phoneNumber);
        Objects.requireNonNull(jobContract);
        appendChange(new EmployeeAdded(employeeId, name, phoneNumber, jobContract)).apply();
    }

    public void addSewingMachine(SewingMachineId sewingMachineId, UserGuide userGuide, PowerConsumption powerConsumption){
        Objects.requireNonNull(sewingMachineId);
        Objects.requireNonNull(userGuide);
        Objects.requireNonNull(powerConsumption);
        appendChange(new SewingMachineAdded(sewingMachineId, userGuide, powerConsumption)).apply();
    }

    public void addEmployee(RawMaterialProviderId rawMaterialProviderId, Name name, PhoneNumber phoneNumber,TypeOfMaterial typeOfMaterial){
        Objects.requireNonNull(rawMaterialProviderId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(phoneNumber);
        Objects.requireNonNull(typeOfMaterial);
        appendChange(new RawMaterialProviderAdded(rawMaterialProviderId, name, phoneNumber, typeOfMaterial)).apply();
    }




    public TypeOfMaterial getTypeOfMaterial() {
        return this.typeOfMaterial;
    }

    public Location getLocation() {
        return this.location;
    }

    public WorkingTime getWorkingTime() {
        return this.workingTime;
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public List<SewingMachine> getSewingMachineList() {
        return this.sewingMachineList;
    }

    public List<RawMaterialProvider> getRawMaterialProviderList() {
        return this.rawMaterialProviderList;
    }
}
