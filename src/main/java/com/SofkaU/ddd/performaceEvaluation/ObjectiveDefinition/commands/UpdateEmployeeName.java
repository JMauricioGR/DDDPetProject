package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Name;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateEmployeeName extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final EmployeeID employeeID;
    protected final Name name;

    public UpdateEmployeeName(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Name name){
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
