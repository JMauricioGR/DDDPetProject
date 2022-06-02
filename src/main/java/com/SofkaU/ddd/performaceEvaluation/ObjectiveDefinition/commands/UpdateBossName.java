package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.BossID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Name;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateBossName extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final BossID bossID;
    protected final Name name;

    public UpdateBossName(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Name name){
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.bossID = bossID;

        this.name = name;
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
}
