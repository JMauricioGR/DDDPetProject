package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.BossID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Department;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateBossDepartment extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final BossID bossID;
    protected final Department department;

    public UpdateBossDepartment(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Department department){
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.bossID = bossID;

        this.department = department;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public BossID getBossID() {
        return bossID;
    }

    public Department getDepartment() {
        return department;
    }
}
