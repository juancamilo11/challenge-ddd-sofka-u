package co.com.sofka.challenge.qualitydepartment.command;

import co.com.sofka.challenge.qualitydepartment.value.CapacitationSubject;
import co.com.sofka.domain.generic.Command;

public class UpdateJobCapacitationSubject extends Command {

    private CapacitationSubject capacitationSubject;

    public UpdateJobCapacitationSubject(CapacitationSubject capacitationSubject) {
        this.capacitationSubject = capacitationSubject;
    }

    public CapacitationSubject getCapacitationSubject() {
        return capacitationSubject;
    }

    public void setCapacitationSubject(CapacitationSubject capacitationSubject) {
        this.capacitationSubject = capacitationSubject;
    }
}
