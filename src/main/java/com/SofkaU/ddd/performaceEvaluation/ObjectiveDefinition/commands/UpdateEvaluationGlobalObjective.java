package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.GlobalObjective;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateEvaluationGlobalObjective extends Command {

    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EvaluationID evaluationID;
    private final GlobalObjective globalObjective;

    public UpdateEvaluationGlobalObjective(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, GlobalObjective globalObjective){
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
