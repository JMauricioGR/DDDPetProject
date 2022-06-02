package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events.BossAdded;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events.EmployeeAdded;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events.ObjectiveDefinitionCreated;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ObjectiveDefinition extends AggregateEvent<ObjectiveDefinitionID> {
    protected EvaluationPeriod evaluationPeriod;
    protected Set<Employee> employees;
    protected Set<Boss> bosses;
    protected Set<Evaluation> evaluations;

    public ObjectiveDefinition(ObjectiveDefinitionID objectiveDefinitionID, EvaluationPeriod evaluationPeriod){
        this(objectiveDefinitionID);
        appendChange(new ObjectiveDefinitionCreated(evaluationPeriod)).apply();
    }

    public ObjectiveDefinition(ObjectiveDefinitionID entityId) {
        super(entityId);
        subscribe(new CreateObjectiveDefinition(this));
    }

    public static  ObjectiveDefinition from(ObjectiveDefinitionID objectiveDefinitionID, List<DomainEvent> events){
        var objectiveDefinition = new ObjectiveDefinition(objectiveDefinitionID);
        events.forEach(objectiveDefinition::applyEvent);
        return objectiveDefinition;
    }

    public void AddBoss(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Name name, Department department){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(bossID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(department);
        appendChange(new BossAdded(objectiveDefinitionID, bossID, name,department)).apply();
    }

    public void AddEmployee(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Name name, Objective objective, Metric metric, Deadline deadline, Department department){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(objective);
        Objects.requireNonNull(metric);
        Objects.requireNonNull(deadline);
        Objects.requireNonNull(department);
        appendChange(new EmployeeAdded(objectiveDefinitionID, employeeID, name, deadline, department, metric, objective)).apply();

    }

}
