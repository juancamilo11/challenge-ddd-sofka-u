package co.com.sofka.challenge.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class NextMaintenanceDate implements ValueObject<LocalDateTime> {

    private LocalDateTime nextMaintenanceDate;

    public NextMaintenanceDate(LocalDateTime nextMaintenanceDate){
        Objects.requireNonNull(nextMaintenanceDate, "Value for next maintenance date cannot be null");
        if(nextMaintenanceDate.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("Next maintenance date must be in the future");
        }
        this.nextMaintenanceDate = nextMaintenanceDate;
    }

    @Override
    public LocalDateTime value(){
        return this.nextMaintenanceDate;
    }
}
