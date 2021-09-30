package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EstatuteDescription implements ValueObject<String> {

    private final String estatuteDescription;

    public EstatuteDescription(String estatuteDescription){
        Objects.requireNonNull(estatuteDescription, "Name for quality estatute cannot be null");
        if(estatuteDescription.trim().isBlank()){
            throw new IllegalArgumentException("Name for quality estatute cannot be blank");
        }
        if(estatuteDescription.length() > 100){
            throw new IllegalArgumentException("Name's lenght for quality estatute must have less than 100 chars");
        }
        this.estatuteDescription = estatuteDescription;
    }

    @Override
    public String value() {
        return this.estatuteDescription;
    }

}
