package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Deadline;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateEvaluationDeadline extends Command {

    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EvaluationID evaluationID;
    private final Deadline deadline;

    public UpdateEvaluationDeadline(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, Deadline deadline){
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
