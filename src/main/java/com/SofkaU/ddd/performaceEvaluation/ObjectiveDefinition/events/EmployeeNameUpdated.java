package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Name;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class EmployeeNameUpdated extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EmployeeID employeeID;
    private final Name name;

    public EmployeeNameUpdated(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Name name) {
        super("");
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.employeeID = employeeID;
        this.name = name;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Name getName() {
        return name;
    }
}
