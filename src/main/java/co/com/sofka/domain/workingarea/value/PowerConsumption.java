package co.com.sofka.domain.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PowerConsumption implements ValueObject<PowerConsumption.PowerProps> {

    private final Double powerConsumption;
    private final String units;

    public PowerConsumption(Double powerConsumption, String units) {
        Objects.requireNonNull(powerConsumption, "Machine's power consumption cannot be null");
        Objects.requireNonNull(units, "Power consumption units cannot be null");
        if(units.trim().isBlank()) {
            throw new IllegalArgumentException("Power units cannot be blank");
        }
        if(powerConsumption <= 0){
            throw new IllegalArgumentException("Power consumption must be greater than zero");
        }
        this.powerConsumption = powerConsumption;
        this.units = units;
    }

    @Override
    public PowerConsumption.PowerProps value() {
        return new PowerConsumption.PowerProps() {
            @Override
            public Double powerConsumption() {
                return this.powerConsumption();
            }

            @Override
            public String units() {
                return this.units();
            }
        };
    }

    public interface PowerProps {
        Double powerConsumption();
        String units();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PowerConsumption)) return false;
        PowerConsumption that = (PowerConsumption) o;
        return powerConsumption.equals(that.powerConsumption) && units.equals(that.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, units);
    }
}
