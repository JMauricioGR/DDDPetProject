package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events.*;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
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

    public void AddEvaluation(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, Deadline deadline, AreaObjective areaObjective, GlobalObjective globalObjective){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(evaluationID);
        Objects.requireNonNull(deadline);
        Objects.requireNonNull(areaObjective);
        Objects.requireNonNull(globalObjective);
        appendChange(new EvaluationAdded(objectiveDefinitionID, evaluationID, deadline, areaObjective, globalObjective)).apply();
    }

    public void UpdateBossDepartment(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Department department){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(bossID);
        Objects.requireNonNull(department);
        appendChange(new BossDepartmentUpdated(objectiveDefinitionID, bossID, department)).apply();
    }

    public void UpdateBossName(ObjectiveDefinitionID objectiveDefinitionID, BossID bossID, Name name){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(bossID);
        Objects.requireNonNull(name);
        appendChange(new BossNameUpdated(objectiveDefinitionID, bossID, name)).apply();
    }

    public void UpdateEmployeeDeadline(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Deadline deadline){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(deadline);
        appendChange(new EmployeeDeadlineUpdated(objectiveDefinitionID, employeeID, deadline)).apply();
    }

    public void UpdateEmployeeDepartment(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Department department){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(department);
        appendChange(new EmployeeDepartmentUpdated(objectiveDefinitionID, employeeID, department)).apply();
    }

    public void UpdateEmployeeMetric(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Metric metric){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(metric);
        appendChange(new EmployeeMetricUpdated(objectiveDefinitionID, employeeID, metric)).apply();
    }

    public void UpdateEmployeeName(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Name name){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(name);
        appendChange(new EmployeeNameUpdated(objectiveDefinitionID, employeeID, name)).apply();
    }

    public void UpdateEmployeeObjective(ObjectiveDefinitionID objectiveDefinitionID, EmployeeID employeeID, Objective objective){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(employeeID);
        Objects.requireNonNull(objective);
        appendChange(new EmployeeObjectiveUpdated(objectiveDefinitionID, employeeID, objective)).apply();
    }

    public void UpdateEvaluationAreaObjective(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, AreaObjective areaObjective){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(evaluationID);
        Objects.requireNonNull(areaObjective);
        appendChange(new EvaluationAreaObjectiveUpdated(objectiveDefinitionID, evaluationID, areaObjective)).apply();
    }

    public void UpdateEvaluationDeadline(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, Deadline deadline){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(evaluationID);
        Objects.requireNonNull(deadline);
        appendChange(new EvaluationDeadlineUpdated(objectiveDefinitionID, evaluationID, deadline)).apply();
    }

    public void UpdateEvaluationGlobalObjective(ObjectiveDefinitionID objectiveDefinitionID, EvaluationID evaluationID, GlobalObjective globalObjective){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(evaluationID);
        Objects.requireNonNull(globalObjective);
        appendChange(new EvaluationGlobalObjectiveUpdated(objectiveDefinitionID, evaluationID, globalObjective)).apply();
    }

    public void UpdateEvaluationPeriod(ObjectiveDefinitionID objectiveDefinitionID, EvaluationPeriod evaluationPeriod){
        Objects.requireNonNull(objectiveDefinitionID);
        Objects.requireNonNull(evaluationPeriod);
        appendChange(new EvaluationPeriodUpdated(objectiveDefinitionID, evaluationPeriod)).apply();
    }

    protected Optional<Boss> bossById(BossID bossID){
        return bosses
                .stream()
                .filter(boss -> boss.identity().equals(bossID))
                .findFirst();
    }

    protected Optional<Employee> employeeById(EmployeeID employeeID){
        return employees
                .stream()
                .filter(employee -> employee.identity().equals(employee))
                .findFirst();
    }

    protected Optional<Evaluation> bossById(EvaluationID evaluationID){
        return evaluations
                .stream()
                .filter(evaluation -> evaluation.identity().equals(evaluationID))
                .findFirst();
    }

    public EvaluationPeriod getEvaluationPeriod() {
        return evaluationPeriod;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public Set<Boss> getBosses() {
        return bosses;
    }

    public Set<Evaluation> getEvaluations() {
        return evaluations;
    }
}
