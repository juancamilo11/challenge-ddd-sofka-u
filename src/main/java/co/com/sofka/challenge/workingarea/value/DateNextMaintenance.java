package co.com.sofka.challenge.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class DateNextMaintenance implements ValueObject<LocalDateTime> {

    private LocalDateTime dateNextMaintenance;

    public DateNextMaintenance(LocalDateTime dateNextMaintenance){
        Objects.requireNonNull(dateNextMaintenance, "Value for next maintenance date cannot be null");
        if(dateNextMaintenance.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Next maintenance date must be in the future");
        }
        this.dateNextMaintenance = dateNextMaintenance;
    }

    @Override
    public LocalDateTime value(){
        return this.dateNextMaintenance;
    }
}
