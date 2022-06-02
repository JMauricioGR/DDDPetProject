package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationPeriod;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateEvaluationPeriod extends Command {

    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EvaluationPeriod evaluationPeriod;

    public UpdateEvaluationPeriod(ObjectiveDefinitionID objectiveDefinitionID, EvaluationPeriod evaluationPeriod){
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
