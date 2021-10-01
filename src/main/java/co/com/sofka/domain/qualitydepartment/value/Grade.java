package co.com.sofka.domain.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Grade implements ValueObject<Double> {

    private final Double grade;

    public Grade(Double value){
        Objects.requireNonNull(value,"Grade for quality report cannot be null");
        if(value < 0  || value > 100) {
            throw new IllegalArgumentException("Grade for quality report must be between 0 and 100");
        }
        this.grade = value;
    }

    @Override
    public Double value() {
        return this.grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grade)) return false;
        Grade grade1 = (Grade) o;
        return grade.equals(grade1.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade);
    }
}
