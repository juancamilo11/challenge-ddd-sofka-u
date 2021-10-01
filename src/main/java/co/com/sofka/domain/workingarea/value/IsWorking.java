package co.com.sofka.domain.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IsWorking implements ValueObject<Boolean> {

    private Boolean isWorking;

    public IsWorking(Boolean isWorking){
        Objects.requireNonNull(isWorking, "Value for the employee's working state cannot be null");
    }

    @Override
    public Boolean value(){
        return this.isWorking;
    }
}