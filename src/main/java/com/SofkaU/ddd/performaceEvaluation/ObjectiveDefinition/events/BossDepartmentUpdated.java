package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.BossID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Department;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class BossDepartmentUpdated extends DomainEvent {

    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final BossID bossID;
    private final Department department;

    public BossDepartmentUpdated(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Department department){
        super("");
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
