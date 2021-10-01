package co.com.sofka.challenge.workingarea;

import co.com.sofka.challenge.commons.Name;
import co.com.sofka.challenge.commons.PhoneNumber;
import co.com.sofka.challenge.workingarea.event.*;
import co.com.sofka.challenge.workingarea.entity.Employee;
import co.com.sofka.challenge.workingarea.entity.RawMaterialProvider;
import co.com.sofka.challenge.workingarea.entity.SewingMachine;
import co.com.sofka.challenge.workingarea.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    private WorkingArea(WorkingAreaId workingAreaId){
        super(workingAreaId);
        subscribe(new WorkingAreaChange(this));
    }

    public static WorkingArea from(WorkingAreaId workingAreaId, List<DomainEvent> eventList){
        var workingArea = new WorkingArea(workingAreaId);
        eventList.forEach(workingArea::applyEvent);
        return workingArea;
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

    public void addRawMaterialProvider(RawMaterialProviderId rawMaterialProviderId, Name name, PhoneNumber phoneNumber,TypeOfMaterial typeOfMaterial){
        Objects.requireNonNull(rawMaterialProviderId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(phoneNumber);
        Objects.requireNonNull(typeOfMaterial);
        appendChange(new RawMaterialProviderAdded(rawMaterialProviderId, name, phoneNumber, typeOfMaterial)).apply();
    }


    public Optional<Employee> getEmployeeById(EmployeeId employeeId){
        return this.employeeList
                .stream()
                .filter(employee -> employee.identity().equals(employeeId))
                .findFirst();
    }

    public Optional<SewingMachine> getSewingMachineById(SewingMachineId sewingMachineId){
        return this.sewingMachineList
                .stream()
                .filter(employee -> employee.identity().equals(sewingMachineId))
                .findFirst();
    }

    public Optional<RawMaterialProvider> getRawMaterialProviderById(RawMaterialProviderId rawMaterialProviderId){
        return this.rawMaterialProviderList
                .stream()
                .filter(employee -> employee.identity().equals(rawMaterialProviderId))
                .findFirst();
    }

    public void deleteEmployee(EmployeeId employeeId){
        Objects.requireNonNull(employeeId);
        appendChange(new EmployeeDeleted(employeeId)).apply();
    }

    public void deleteSewingMachine(SewingMachineId sewingMachineId){
        Objects.requireNonNull(sewingMachineId);
        appendChange(new SewingMachineDeleted(sewingMachineId)).apply();
    }

    public void deleteRawMaterialProvider(RawMaterialProviderId rawMaterialProviderId){
        Objects.requireNonNull(rawMaterialProviderId);
        appendChange(new RawMaterialProviderDeleted(rawMaterialProviderId)).apply();
    }

    public void orderEmployeeToWork(EmployeeId employeeId){
        Objects.requireNonNull(employeeId);
        appendChange(new EmployeeOrderedToWork(employeeId)).apply();
    }

    public void orderEmployeeToStopWorking(EmployeeId employeeId){
        Objects.requireNonNull(employeeId);
        appendChange(new EmployeeOrderedToTopWorking(employeeId)).apply();
    }

    public void updateTypeOfMaterial(TypeOfMaterial typeOfMaterial){
        Objects.requireNonNull(typeOfMaterial);
        appendChange(new TypeOfMaterialUpdated(typeOfMaterial)).apply();
    }

    public void updateLocation(Location location){
        Objects.requireNonNull(location);
        appendChange(new LocationUpdated(location)).apply();
    }

    public void updateWorkingTime(WorkingTime workingTime){
        Objects.requireNonNull(workingTime);
        appendChange(new WorkingTimeUpdated(workingTime)).apply();
    }

    public void updateEmployeeName(Name name){
        Objects.requireNonNull(name);
        appendChange(new EmployeeNameUpdated(name)).apply();
    }

    public void updateEmployeePhoneNumber(PhoneNumber phoneNumber){
        Objects.requireNonNull(phoneNumber);
        appendChange(new EmployeePhoneNumberUpdated(phoneNumber)).apply();
    }

    public void updateEmployeeJobContract(JobContract jobContract){
        Objects.requireNonNull(jobContract);
        appendChange(new EmployeeJobContractUpdated(jobContract)).apply();
    }

    public void updateMachineDescription(UserGuide userGuide){
        Objects.requireNonNull(userGuide);
        appendChange(new MachineUserGuideUpdated(userGuide)).apply();
    }

    public void updateMachinePowerConsumption(PowerConsumption powerConsumption){
        Objects.requireNonNull(powerConsumption);
        appendChange(new MachinePowerConsumptionUpdated(powerConsumption)).apply();
    }

    public void updateNextMaintenanceDate(NextMaintenanceDate jobContract){
        Objects.requireNonNull(jobContract);
        appendChange(new MachineNextMaintenanceDateUpdated(jobContract)).apply();
    }

    public Location location() {
        return this.location;
    }

    public WorkingTime workingTime() {
        return this.workingTime;
    }

    public List<Employee> employeeList() {
        return this.employeeList;
    }

    public TypeOfMaterial typeOfMaterial() {
        return this.typeOfMaterial;
    }

    public List<SewingMachine> sewingMachineList() {
        return this.sewingMachineList;
    }

    public List<RawMaterialProvider> rawMaterialProviderList() {
        return this.rawMaterialProviderList;
    }
}
