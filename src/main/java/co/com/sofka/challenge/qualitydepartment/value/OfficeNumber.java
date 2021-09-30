package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OfficeNumber implements ValueObject<Integer> {

    private final Integer officeNumber;

    public OfficeNumber(Integer value){
        Objects.requireNonNull(value, "Office number cannot be null");
        Pattern pattern = Pattern
                .compile("[0-9]{1,2}");
        Matcher matcher = pattern.matcher(String.valueOf(value));
        if (!matcher.find() || value <= 0) {
            throw new IllegalArgumentException("Office number must be between 0 and 100");
        }
        this.officeNumber = value;
    }

    @Override
    public Integer value() {
        return this.officeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OfficeNumber)) return false;
        OfficeNumber that = (OfficeNumber) o;
        return officeNumber.equals(that.officeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeNumber);
    }
}
