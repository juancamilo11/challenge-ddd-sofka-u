package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;

public class CapacitationInfo implements ValueObject<CapacitationInfo.Props> {

    private final LocalDateTime date;
    private final String location;

    public CapacitationInfo(LocalDateTime date, String location) {
        this.date = date;
        this.location = location;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public LocalDateTime date() {
                return this.date();
            }

            @Override
            public String location() {
                return this.location();
            }
        };
    }


    public interface Props {
        LocalDateTime date();
        String location();
    }


}
