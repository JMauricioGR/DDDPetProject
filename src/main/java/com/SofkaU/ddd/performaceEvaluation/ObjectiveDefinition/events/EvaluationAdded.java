package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.*;

public class EvaluationAdded extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EvaluationID evaluationID;
    private final Deadline deadline;
    private final AreaObjective areaObjective;
    private final GlobalObjective globalObjective;

    public EvaluationAdded(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, Deadline deadline, AreaObjective areaObjective, GlobalObjective globalObjective) {
        super("");
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.evaluationID = evaluationID;
        this.deadline = deadline;
        this.areaObjective = areaObjective;
        this.globalObjective = globalObjective;
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

    public AreaObjective getAreaObjective() {
        return areaObjective;
    }

    public GlobalObjective getGlobalObjective() {
        return globalObjective;
    }
}
