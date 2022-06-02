package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Objective;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class EmployeeObjectiveUpdated extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EmployeeID employeeID;
    private final Objective objective;

    public EmployeeObjectiveUpdated(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Objective objective) {
        super("");
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.employeeID = employeeID;
        this.objective = objective;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Objective getObjective() {
        return objective;
    }
}
