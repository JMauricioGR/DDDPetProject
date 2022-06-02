package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;

public class Employee extends Entity<EmployeeID> {
    public Employee(EmployeeID entityId) {
        super(entityId);
    }
}
