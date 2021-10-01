package co.com.sofka.domain.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class WorkingTime implements ValueObject<String> {

    private final String workingTime;

    public WorkingTime(String value){
        Objects.requireNonNull(value,"Working time cannot be null");
        if(!value.matches("L-V;8am-5pm|L-V;10pm-6am")){
            throw new IllegalArgumentException("Working time must be either L-V;8am-5pm or L-V;10pm-6am");
        }
        this.workingTime = value;
    }

    @Override
    public String value() {
        return this.workingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkingTime)) return false;
        WorkingTime that = (WorkingTime) o;
        return workingTime.equals(that.workingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workingTime);
    }
}
