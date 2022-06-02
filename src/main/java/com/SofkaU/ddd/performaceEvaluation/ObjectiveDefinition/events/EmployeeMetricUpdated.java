package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EmployeeID;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.Metric;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.ObjectiveDefinitionID;

public class EmployeeMetricUpdated extends DomainEvent {
    private final ObjectiveDefinitionID objectiveDefinitionID;
    private final EmployeeID employeeID;
    private final Metric metric;

    public EmployeeMetricUpdated(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Metric metric) {
        super("");
        this.objectiveDefinitionID = objectiveDefinitionID;
        this.employeeID = employeeID;
        this.metric = metric;
    }

    public ObjectiveDefinitionID getObjectiveDefinitionID() {
        return objectiveDefinitionID;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public Metric getMetric() {
        return metric;
    }
}
