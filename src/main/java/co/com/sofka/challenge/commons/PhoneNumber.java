package co.com.sofka.challenge.commons;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber implements ValueObject<PhoneNumber.PhoneProps> {

    private final String prefix;
    private final String phoneNumber;

    public PhoneNumber(String prefix, String phoneNumber){
        Objects.requireNonNull(prefix,"Prefix for employee's phone number cannot be null");
        Objects.requireNonNull(phoneNumber,"Phone number for the employee cannot be null");

        if(prefix.trim().isBlank() || phoneNumber.trim().isBlank()){
            throw new IllegalArgumentException("No-one of the parameters for the phone number can be blank");
        }

        Pattern pattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
        Matcher matcher = pattern.matcher(prefix + phoneNumber);
        if(!matcher.find()){
            throw new IllegalArgumentException("The phone number must have the '+' then the prefix, and finally the number");
        }
        this.prefix = prefix;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public PhoneNumber.PhoneProps value() {
        return new PhoneProps() {
            @Override
            public String prefix() {
                return this.prefix();
            }

            @Override
            public String phoneNumber() {
                return this.phoneNumber();
            }
        };
    }

    public interface PhoneProps {
        String prefix();
        String phoneNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return prefix.equals(that.prefix) && phoneNumber.equals(that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, phoneNumber);
    }
}
