package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Description implements ValueObject<String> {

    private String descripcion;

    public Description(String value){
        Objects.requireNonNull(value,"Quality report description cannot be null");
        if(value.trim().isBlank()) {
            throw new IllegalArgumentException("Quality report description cannot be blank");
        }
        this.descripcion = value;
    }

    @Override
    public String value() {
        return this.descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Description)) return false;
        Description that = (Description) o;
        return descripcion.equals(that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }
}
