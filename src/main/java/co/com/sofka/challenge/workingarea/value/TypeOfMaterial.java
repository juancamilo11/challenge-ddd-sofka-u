package co.com.sofka.challenge.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TypeOfMaterial implements ValueObject<String> {

    private final String typeOfMaterial;

    public TypeOfMaterial(String typeOfMaterial){
        Objects.requireNonNull(typeOfMaterial, "Type of material of the area cannot be null");
        if(typeOfMaterial.trim().isBlank()){
            throw new IllegalArgumentException("Type of material of the area cannot be blank");
        }
        this.typeOfMaterial = typeOfMaterial;
    }

    @Override
    public String value() {
        return this.typeOfMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypeOfMaterial)) return false;
        TypeOfMaterial that = (TypeOfMaterial) o;
        return typeOfMaterial.equals(that.typeOfMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMaterial);
    }
}
