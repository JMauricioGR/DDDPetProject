package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Deadline;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class EvaluationDeadlineUpdated extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EvaluationID evaluationID;
    private final Deadline deadline;

    public EvaluationDeadlineUpdated(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, Deadline deadline) {
        super("");
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.evaluationID = evaluationID;
        this.deadline = deadline;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EvaluationID getEvaluationID() {
        return evaluationID;
    }

    public Deadline getDeadline() {
        return deadline;
    }
}
