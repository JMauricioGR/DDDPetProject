package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.commands;

import co.com.sofka.domain.generic.Command;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.*;

public class AddEmployee extends Command {

    protected final ObjectiveDefinitionID objectiveDefinitionID;
    protected final EmployeeID employeeID;
    protected final Name name;
    protected final Objective objective;
    protected final Metric metric;
    protected final Deadline deadline;
    protected final Department department;

    public AddEmployee(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Name name, Objective objective, Metric metric, Deadline deadline, Department department){

        this.objectiveDefinitionID = objectiveDefinitionID;
        this.employeeID = employeeID;
        this.name = name;
        this.objective = objective;
        this.metric = metric;
        this.deadline = deadline;
        this.department = department;
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

    public Objective getObjective() {
        return objective;
    }

    public Metric getMetric() {
        return metric;
    }

    public Deadline getDeadline() {
        return deadline;
    }

    public Department getDepartment() {
        return department;
    }
}
