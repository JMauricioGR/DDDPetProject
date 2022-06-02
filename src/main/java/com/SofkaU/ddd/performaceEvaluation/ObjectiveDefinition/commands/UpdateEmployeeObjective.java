package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Objective;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateEmployeeObjective extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final EmployeeID employeeID;
    protected final Objective objective;

    public UpdateEmployeeObjective(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Objective objective){
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
