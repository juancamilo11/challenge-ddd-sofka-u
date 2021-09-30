package co.com.sofka.challenge.qualitydepartment.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ReportDescription implements ValueObject<String> {

    private final String reportDescription;

    public ReportDescription(String value){
        Objects.requireNonNull(value,"Quality report description cannot be null");
        if(value.trim().isBlank()) {
            throw new IllegalArgumentException("Quality report description cannot be blank");
        }
        this.reportDescription = value;
    }

    @Override
    public String value() {
        return this.reportDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReportDescription)) return false;
        ReportDescription that = (ReportDescription) o;
        return reportDescription.equals(that.reportDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportDescription);
    }
}
