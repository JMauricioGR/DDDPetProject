package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value;

import ch.qos.logback.core.joran.conditional.IfAction;
import co.com.sofka.domain.generic.ValueObject;

import java.awt.*;
import java.util.Objects;

public class Objective implements ValueObject<String> {
    private final String value;

    public Objective(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Objective is empty");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objective objective = (Objective) o;
        return Objects.equals(value, objective.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }


}
