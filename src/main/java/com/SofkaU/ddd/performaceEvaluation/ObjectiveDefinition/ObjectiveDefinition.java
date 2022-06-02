package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events.ObjectiveDefinitionCreated;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationPeriod;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

import java.util.List;
import java.util.Set;

public class ObjectiveDefinition extends AggregateEvent<ObjectiveDefinitionID> {
    protected EvaluationPeriod evaluationPeriod;
    protected Set<Employee> employees;
    protected Set<Boss> bosses;
    protected Set<Evaluation> evaluations;

    public ObjectiveDefinition(ObjectiveDefinitionID objectiveDefinitionID, EvaluationPeriod evaluationPeriod){
        this(objectiveDefinitionID);
        appendChange(new ObjectiveDefinitionCreated(evaluationPeriod)).apply();
    }

    public ObjectiveDefinition(ObjectiveDefinitionID entityId) {
        super(entityId);
        subscribe(new CreateObjectiveDefinition(this));
    }

    public static  ObjectiveDefinition from(ObjectiveDefinitionID objectiveDefinitionID, List<DomainEvent> events){
        var objectiveDefinition = new ObjectiveDefinition(objectiveDefinitionID);
        events.forEach(objectiveDefinition::applyEvent);
        return objectiveDefinition;
    }

}
