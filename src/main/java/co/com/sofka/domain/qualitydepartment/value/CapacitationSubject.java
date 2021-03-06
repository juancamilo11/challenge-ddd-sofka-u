package co.com.sofka.domain.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CapacitationSubject implements ValueObject<String> {

    private final String capacitationSubject;

    public CapacitationSubject(String capacitationSubject){
        Objects.requireNonNull(capacitationSubject, "Capacitation subject cannot be null");
        if(capacitationSubject.trim().isBlank()){
            throw new IllegalArgumentException("Capacitation subject cannot be blank");
        }
        if(capacitationSubject.length() > 50){
            throw new IllegalArgumentException("capacitation subject's lenght must have less than 50 chars");
        }
        this.capacitationSubject = capacitationSubject;
    }

    @Override
    public String value() {
        return this.capacitationSubject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CapacitationSubject)) return false;
        CapacitationSubject that = (CapacitationSubject) o;
        return capacitationSubject.equals(that.capacitationSubject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacitationSubject);
    }
}
