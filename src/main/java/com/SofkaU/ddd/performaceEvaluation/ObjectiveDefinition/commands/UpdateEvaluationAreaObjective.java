package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.AreaObjective;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateEvaluationAreaObjective extends Command {

    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EvaluationID evaluationID;
    private final AreaObjective areaObjective;

    public UpdateEvaluationAreaObjective(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, AreaObjective areaObjective){
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.evaluationID = evaluationID;
        this.areaObjective = areaObjective;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EvaluationID getEvaluationID() {
        return evaluationID;
    }

    public AreaObjective getAreaObjective() {
        return areaObjective;
    }
}
