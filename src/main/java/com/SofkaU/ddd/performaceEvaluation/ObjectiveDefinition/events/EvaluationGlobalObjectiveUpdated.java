package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.GlobalObjective;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class EvaluationGlobalObjectiveUpdated extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EvaluationID evaluationID;
    private final GlobalObjective globalObjective;

    public EvaluationGlobalObjectiveUpdated(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, GlobalObjective globalObjective) {
        super("");
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.evaluationID = evaluationID;
        this.globalObjective = globalObjective;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EvaluationID getEvaluationID() {
        return evaluationID;
    }

    public GlobalObjective getGlobalObjective() {
        return globalObjective;
    }
}
