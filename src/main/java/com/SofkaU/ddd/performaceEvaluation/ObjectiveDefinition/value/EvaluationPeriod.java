package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EvaluationPeriod implements ValueObject<String> {
    private final String value;

    public EvaluationPeriod(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Area objective name is empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvaluationPeriod that = (EvaluationPeriod) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
