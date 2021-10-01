package co.com.sofka.domain.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstatuteName implements ValueObject<String> {

    private final String estatuteName;

    public EstatuteName(String estatuteName){
        Objects.requireNonNull(estatuteName, "Name for quality estatute cannot be null");
        if(estatuteName.trim().isBlank()){
            throw new IllegalArgumentException("Name for quality estatute cannot be blank");
        }
        if(estatuteName.length() > 100){
            throw new IllegalArgumentException("Name's lenght for quality estatute must have less than 100 chars");
        }
        this.estatuteName = estatuteName;
    }

    @Override
    public String value() {
        return this.estatuteName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstatuteName)) return false;
        EstatuteName that = (EstatuteName) o;
        return estatuteName.equals(that.estatuteName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(estatuteName);
    }
}
