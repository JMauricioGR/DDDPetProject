package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition;

import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events.ObjectiveDefinitionCreated;

import java.util.HashSet;

public class CreateObjectiveDefinition extends EventChange {
    public CreateObjectiveDefinition(ObjectiveDefinition objectiveDefinition) {
        apply((ObjectiveDefinitionCreated event) -> {
            objectiveDefinition.evaluationPeriod = event.getEvaluationPeriod();
            objectiveDefinition.bosses = new HashSet<>();
            objectiveDefinition.employees = new HashSet<>();
            objectiveDefinition.evaluations = new HashSet<>();
        });
    }
}
