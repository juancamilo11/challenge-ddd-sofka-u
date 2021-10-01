package co.com.sofka.domain.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {

    private final String name;

    public Name(String value){
        Objects.requireNonNull(value,"Name for the employee cannot be null");
        if(value.trim().isBlank())  throw new IllegalArgumentException("Name for the employee cannot be blank");
        if(!value.matches("[a-zA-Z'-]{4,50}"))  throw new IllegalArgumentException("Name for the employee must have more than 3 chars");
        this.name = value;
    }

    @Override
    public String value() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name)) return false;
        Name name1 = (Name) o;
        return name.equals(name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
