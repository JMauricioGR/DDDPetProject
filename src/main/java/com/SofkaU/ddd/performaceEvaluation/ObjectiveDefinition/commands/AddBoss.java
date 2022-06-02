package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.BossID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Department;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Name;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class AddBoss extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final BossID bossID;
    protected final Name name;
    protected final Department department;

    public AddBoss(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Name name, Department department){

        this.objectiveDefinitionID = objectiveDefinitionID;
        this.bossID = bossID;
        this.name = name;
        this.department = department;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public BossID getBossID() {
        return bossID;
    }

    public Name getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
