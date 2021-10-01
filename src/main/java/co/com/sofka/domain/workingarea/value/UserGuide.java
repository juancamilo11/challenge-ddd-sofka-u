package co.com.sofka.domain.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class UserGuide implements ValueObject<Set<String>> {

    private final Set<String> instructionsGuide;

    public UserGuide(Set<String> instructionsGuide){
        Objects.requireNonNull(instructionsGuide, "User guide cannot be null");
        instructionsGuide = instructionsGuide.stream().filter(instruction -> !instruction.trim().isBlank()).collect(Collectors.toSet());
        if(instructionsGuide.isEmpty()){
            throw new IllegalArgumentException("User guide cannot be empty");
        }

        this.instructionsGuide = instructionsGuide;
    }

    @Override
    public Set<String> value() {
        return this.instructionsGuide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserGuide)) return false;
        UserGuide userGuide = (UserGuide) o;
        return instructionsGuide.equals(userGuide.instructionsGuide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionsGuide);
    }
}
