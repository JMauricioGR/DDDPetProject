package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Department;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class EmployeeDepartmentUpdated extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EmployeeID employeeID;
    private final Department department;

    public EmployeeDepartmentUpdated(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Department department) {
        super("");
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
