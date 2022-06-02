package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationPeriod;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class EvaluationPeriodUpdated extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EvaluationPeriod evaluationPeriod;

    public EvaluationPeriodUpdated(ObjectiveDefinitionID objectiveDefinitionID, EvaluationPeriod evaluationPeriod) {
        super("");
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.evaluationPeriod = evaluationPeriod;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EvaluationPeriod getEvaluationPeriod() {
        return evaluationPeriod;
    }
}
