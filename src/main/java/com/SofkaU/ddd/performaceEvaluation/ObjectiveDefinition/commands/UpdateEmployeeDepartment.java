package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Department;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class UpdateEmployeeDepartment extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final EmployeeID employeeID;
    protected final Department department;

    public UpdateEmployeeDepartment (ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Department department){
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.employeeID = employeeID;
        this.department = department;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Department getDepartment() {
        return department;
    }
}
