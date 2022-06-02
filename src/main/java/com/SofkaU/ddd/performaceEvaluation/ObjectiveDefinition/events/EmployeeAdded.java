package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.*;

public class EmployeeAdded extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EmployeeID employeeID;
    private final Name name;
    private final Deadline deadline;
    private final Department department;
    private final Metric metric;
    private final Objective objective;

    public EmployeeAdded(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Name name, Deadline deadline, Department department, Metric metric, Objective objective ) {
        super("");
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.employeeID = employeeID;
        this.name = name;
        this.deadline = deadline;
        this.department = department;
        this.metric = metric;
        this.objective = objective;
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

    public Deadline getDeadline() {
        return deadline;
    }

    public Department getDepartment() {
        return department;
    }

    public Metric getMetric() {
        return metric;
    }

    public Objective getObjective() {
        return objective;
    }
}
