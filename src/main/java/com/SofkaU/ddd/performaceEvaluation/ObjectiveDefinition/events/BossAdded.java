package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.BossID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Department;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Name;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class BossAdded extends DomainEvent {

    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final BossID bossID;
    private final Name name;
    private final Department department;

    public BossAdded(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Name name, Department department) {
        super("ddd.boss.created");
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
