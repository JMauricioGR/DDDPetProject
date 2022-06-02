package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.*;

public class AddEvaluation extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final EvaluationID evaluationID;
    protected final Deadline deadline;
    protected final AreaObjective areaObjective;
    protected final GlobalObjective globalObjective;

    public AddEvaluation(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, Deadline deadline, AreaObjective areaObjective, GlobalObjective globalObjective){
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
