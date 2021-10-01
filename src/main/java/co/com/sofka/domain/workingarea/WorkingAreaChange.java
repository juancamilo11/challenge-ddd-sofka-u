package co.com.sofka.domain.workingarea;

import co.com.sofka.domain.workingarea.entity.Employee;
import co.com.sofka.domain.workingarea.entity.RawMaterialProvider;
import co.com.sofka.domain.workingarea.entity.SewingMachine;
import co.com.sofka.domain.workingarea.event.*;
import co.com.sofka.domain.workingarea.value.IsWorking;
import co.com.sofka.domain.generic.EventChange;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class WorkingAreaChange extends EventChange {

    public WorkingAreaChange(WorkingArea workingArea) {
        apply((WorkingAreaCreated event) -> {
            workingArea.typeOfMaterial = event.getTypeOfMaterial();
            workingArea.location = event.getLocation();
            workingArea.workingTime = event.getWorkingTime();
            workingArea.sewingMachine = event.getSewingMachine();
        });

        apply((EmployeeAdded event) -> {
            if(workingArea.employeeList == null) {
                workingArea.employeeList = new ArrayList<>();
            }
            if(workingArea.getEmployeeById(event.getEmployeeId()).isPresent()){
                throw new IllegalArgumentException("This Employee cannot be twice in the Employee's List");
            }
            workingArea.employeeList.add(new Employee(event.getEmployeeId(),
                    event.getName(),
                    event.getPhoneNumber(),
                    event.getJobContract()));
        });

        apply((RawMaterialProviderAdded event) -> {
            if(workingArea.rawMaterialProviderList == null) {
                workingArea.rawMaterialProviderList = new ArrayList<>();
            }
            if(workingArea.getRawMaterialProviderById(event.getRawMaterialProviderId()).isPresent()){
                throw new IllegalArgumentException("This Raw material provider cannot be twice in the Provider's List");
            }
            workingArea.rawMaterialProviderList.add(new RawMaterialProvider(event.getRawMaterialProviderId(),
                    event.getName(),
                    event.getPhoneNumber(),
                    event.getTypeOfMaterial()));
        });

        apply((EmployeeDeleted event) -> {
            if(workingArea.employeeList == null || workingArea.employeeList.isEmpty()) {
                throw new IllegalArgumentException("There're not any employee for deleting");
            }
            if(workingArea.getEmployeeById(event.getEmployeeId()).isEmpty()){
                throw new IllegalArgumentException("The employee was not found in the list");
            }
            workingArea.employeeList = workingArea
                    .employeeList
                    .stream()
                    .filter(employee -> employee
                            .identity()
                            .value()
                            .equals(event.getEmployeeId().value()))
                    .collect(Collectors.toList());
        });

        apply((RawMaterialProviderDeleted event) -> {
            if(workingArea.rawMaterialProviderList == null || workingArea.rawMaterialProviderList.isEmpty()) {
                throw new IllegalArgumentException("There're not any material provider for deleting");
            }
            if(workingArea.getRawMaterialProviderById(event.getRawMaterialProviderId()).isEmpty()){
                throw new IllegalArgumentException("The employee was not found in the list");
            }
            workingArea.rawMaterialProviderList = workingArea
                    .rawMaterialProviderList
                    .stream()
                    .filter(rawMaterialProvider -> rawMaterialProvider
                            .identity()
                            .value()
                            .equals(event.getRawMaterialProviderId().value()))
                    .collect(Collectors.toList());
        });

        apply((EmployeeOrderedToWork event) -> {
            if(workingArea.employeeList == null || workingArea.rawMaterialProviderList.isEmpty()) {
                throw new IllegalArgumentException("There're not any employee for ordering to work");
            }
            if(workingArea.getEmployeeById(event.getEmployeeId()).isEmpty()){
                throw new IllegalArgumentException("The employee was not found in the list");
            }
            var employee = workingArea.getEmployeeById(event.getEmployeeId()).orElseThrow();
            employee.updateIsWorking(new IsWorking(true));
        });

        apply((EmployeeOrderedToTopWorking event) -> {
            if(workingArea.employeeList == null || workingArea.rawMaterialProviderList.isEmpty()) {
                throw new IllegalArgumentException("There're not any employee for ordering to stop working");
            }
            if(workingArea.getEmployeeById(event.getEmployeeId()).isEmpty()){
                throw new IllegalArgumentException("The employee was not found in the list");
            }
            var employee = workingArea.getEmployeeById(event.getEmployeeId()).orElseThrow();
            employee.updateIsWorking(new IsWorking(false));
        });

        apply((TypeOfMaterialUpdated event) -> {
            if(workingArea.rawMaterialProviderList == null || workingArea.rawMaterialProviderList.isEmpty()) {
                throw new IllegalArgumentException("There're not any material provider for updating its type of material");
            }
            if(workingArea.getRawMaterialProviderById(event.getRawMaterialProviderId()).isEmpty()){
                throw new IllegalArgumentException("The employee was not found in the list");
            }
            var rawMaterialProvider = workingArea.getRawMaterialProviderById(event.getRawMaterialProviderId()).orElseThrow();
            rawMaterialProvider.updateTypeOfMaterial(event.getTypeOfMaterial());
        });

        apply((LocationUpdated event) -> workingArea.location = event.getLocation());

        apply((SewingMachineUpdated event) -> {
            workingArea.sewingMachine = new SewingMachine(event.getSewingMachineId(), event.getUserGuide(), event.getPowerConsumption());
        });

        apply((WorkingTimeUpdated event) -> workingArea.workingTime = event.getWorkingTime());

        apply((EmployeeNameUpdated event) -> {
            if(workingArea.employeeList == null || workingArea.rawMaterialProviderList.isEmpty()) {
                throw new IllegalArgumentException("There're not any employee for changing its name");
            }
            if(workingArea.getEmployeeById(event.getEmployeeId()).isEmpty()){
                throw new IllegalArgumentException("The employee was not found in the list");
            }
            var employee = workingArea.getEmployeeById(event.getEmployeeId()).orElseThrow();
            employee.updateName(event.getName());
        });

        apply((EmployeePhoneNumberUpdated event) -> {
            if(workingArea.employeeList == null || workingArea.rawMaterialProviderList.isEmpty()) {
                throw new IllegalArgumentException("There're not any employee for changing its phone number");
            }
            if(workingArea.getEmployeeById(event.getEmployeeId()).isEmpty()){
                throw new IllegalArgumentException("The employee was not found in the list");
            }
            var employee = workingArea.getEmployeeById(event.getEmployeeId()).orElseThrow();
            employee.updatePhoneNumber(event.getPhoneNumber());
        });

        apply((EmployeeJobContractUpdated event) -> {
            if(workingArea.employeeList == null || workingArea.rawMaterialProviderList.isEmpty()) {
                throw new IllegalArgumentException("There're not any employee for changing its job contract");
            }
            if(workingArea.getEmployeeById(event.getEmployeeId()).isEmpty()){
                throw new IllegalArgumentException("The employee was not found in the list");
            }
            var employee = workingArea.getEmployeeById(event.getEmployeeId()).orElseThrow();
            employee.updateJobContract(event.getJobContract());
        });


        apply((MachineUserGuideUpdated event) -> workingArea.sewingMachine.updateSerGuide(event.getUserGuide()));

        apply((MachinePowerConsumptionUpdated event) -> workingArea.sewingMachine.updatePowerConsumption(event.getPowerConsumption()));

        apply((MachineNextMaintenanceDateUpdated event) -> workingArea.sewingMachine.updateNextMaintenanceDate(event.getNextMaintenanceDate()));

    }
}
