package co.com.sofka.challenge.workingarea.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class JobContract implements ValueObject<JobContract.ContractProps> {

    private final String jobPosition;
    private final Double salary;

    public JobContract(String jobPosition, Double salary) {
        Objects.requireNonNull(jobPosition, "Job contract for the employee cannot be null");
        Objects.requireNonNull(salary, "Salary for the employee cannot be null");

        if (!jobPosition.trim().matches("Production Management|Textile Manufacturer|Illustrator")) {
            throw new IllegalArgumentException("Job position not allowed, it must be Production Management, Textile Manufacturer or Illustrator");
        }

        if(salary <= 0.0) {
            throw new IllegalArgumentException("Salary not allowed, it must be greater than zero");
        }

        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    @Override
    public ContractProps value() {
        return new ContractProps() {
            @Override
            public String jobPosition() {
                return this.jobPosition();
            }

            @Override
            public Double salary() {
                return this.salary();
            }
        };
    }


    public interface ContractProps {
        String jobPosition();
        Double salary();
    }

}
