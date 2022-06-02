package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Deadline;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateEmployeeDeadline extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final EmployeeID employeeID;
    protected final Deadline deadline;

    public UpdateEmployeeDeadline(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Deadline deadline){
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.employeeID = employeeID;
        this.deadline = deadline;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Deadline getDeadline() {
        return deadline;
    }
}
