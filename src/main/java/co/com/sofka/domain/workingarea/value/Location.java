package co.com.sofka.domain.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Location implements ValueObject<String> {

    private final String location;

    public Location(String location){
        Objects.requireNonNull(location, "Location of the area cannot be null");
        if(location.trim().isBlank()){
            throw new IllegalArgumentException("Location of the area cannot be blank");
        }
        this.location = location;
    }

    @Override
    public String value() {
        return this.location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location1 = (Location) o;
        return location.equals(location1.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }
}
