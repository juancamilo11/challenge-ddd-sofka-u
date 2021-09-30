package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class CapacitationInfo implements ValueObject<CapacitationInfo.Props> {

    private final LocalDateTime date;
    private final String location;

    public CapacitationInfo(LocalDateTime date, String location) {
        Objects.requireNonNull(date, "Capacitation date cannot be null");
        Objects.requireNonNull(location, "Capacitation location cannot be null");
        if(location.trim().isBlank()) {
            throw new IllegalArgumentException("Capacitation date cannot be blank");
        }
        if(!this.isDateValid(date)){
            throw new IllegalArgumentException("Capacitations have to be scheduled 24 hours in advance");
        }
        this.date = date;
        this.location = location;
    }

    //Capacitations for the same day are not allowed
    private boolean isDateValid(LocalDateTime dateCapacitation) {
        LocalDateTime dateTomorrow = LocalDateTime
                .now()
                .plusDays(1);

        if(dateCapacitation.isAfter(dateTomorrow)){
            return true;
        }
        return false;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public LocalDateTime date() {
                return this.date();
            }

            @Override
            public String location() {
                return this.location();
            }
        };
    }

    public interface Props {
        LocalDateTime date();
        String location();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CapacitationInfo)) return false;
        CapacitationInfo that = (CapacitationInfo) o;
        return date.equals(that.date) && location.equals(that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, location);
    }
}
