package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationPeriod;

public class ObjectiveDefinitionCreated extends DomainEvent {
    private final EvaluationPeriod evaluationPeriod;

    public ObjectiveDefinitionCreated(EvaluationPeriod evaluationPeriod) {
        super("ddd.objectivedefinition.created");
        this.evaluationPeriod = evaluationPeriod;
    }

    public EvaluationPeriod getEvaluationPeriod(){
        return evaluationPeriod;
    }
}
