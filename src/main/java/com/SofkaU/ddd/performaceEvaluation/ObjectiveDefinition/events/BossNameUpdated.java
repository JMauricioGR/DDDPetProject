package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.BossID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Name;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class BossNameUpdated extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final BossID bossID;
    private final Name name;

    public BossNameUpdated(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Name name) {
        super("");
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
