package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition;

import co.com.sofka.domain.generic.EventChange;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.events.*;

import java.util.HashSet;

public class CreateObjectiveDefinition extends EventChange {
    public CreateObjectiveDefinition(ObjectiveDefinition objectiveDefinition) {
        apply((ObjectiveDefinitionCreated event) -> {
            objectiveDefinition.evaluationPeriod = event.getEvaluationPeriod();
            objectiveDefinition.bosses = new HashSet<>();
            objectiveDefinition.employees = new HashSet<>();
            objectiveDefinition.evaluations = new HashSet<>();
        });

        apply((BossAdded event) ->{
            objectiveDefinition.bosses.add(new Boss(
                    event.getBossID())
            );
        });
        apply((EmployeeAdded event) ->{
            objectiveDefinition.employees.add(new Employee(
                    event.getEmployeeID())
            );
        });
        apply((EvaluationAdded event) ->{
            objectiveDefinition.evaluations.add(new Evaluation(
                    event.getEvaluationID())
            );
        });

        apply((BossDepartmentUpdated event) ->{
            var bossDepartment =objectiveDefinition.bossById(event.getBossID())
                    .orElseThrow(()-> new IllegalArgumentException("Boss doesn't found"));
        });
        apply((BossNameUpdated event) ->{
            var bossName =objectiveDefinition.bossById(event.getBossID())
                    .orElseThrow(()-> new IllegalArgumentException("Boss doesn't found"));
        });
        apply((EmployeeDeadlineUpdated event) ->{
            var employeeDeadline =objectiveDefinition.employeeById(event.getEmployeeID())
                    .orElseThrow(()-> new IllegalArgumentException("Employee doesn't found"));
        });
        apply((EmployeeDepartmentUpdated event) ->{
            var employeeDepartment =objectiveDefinition.employeeById(event.getEmployeeID())
                    .orElseThrow(()-> new IllegalArgumentException("Employee doesn't found"));
        });
        apply((EmployeeMetricUpdated event) ->{
            var employeeMetric =objectiveDefinition.employeeById(event.getEmployeeID())
                    .orElseThrow(()-> new IllegalArgumentException("Employee doesn't found"));
        });
        apply((EmployeeNameUpdated event) ->{
            var employeeName =objectiveDefinition.employeeById(event.getEmployeeID())
                    .orElseThrow(()-> new IllegalArgumentException("Employee doesn't found"));
        });
        apply((EmployeeObjectiveUpdated event) ->{
            var employeeObjective =objectiveDefinition.employeeById(event.getEmployeeID())
                    .orElseThrow(()-> new IllegalArgumentException("Employee doesn't found"));
        });
        apply((EvaluationAreaObjectiveUpdated event) ->{
            var evaluationAreaObjective =objectiveDefinition.evaluationById(event.getEvaluationID())
                    .orElseThrow(()-> new IllegalArgumentException("Evaluation doesn't found"));
        });
        apply((EvaluationDeadlineUpdated event) ->{
            var evaluationDeadline =objectiveDefinition.evaluationById(event.getEvaluationID())
                    .orElseThrow(()-> new IllegalArgumentException("Evaluation doesn't found"));
        });
        apply((EvaluationGlobalObjectiveUpdated event) ->{
            var evaluationGlobalObjective =objectiveDefinition.evaluationById(event.getEvaluationID())
                    .orElseThrow(()-> new IllegalArgumentException("Evaluation doesn't found"));
        });
        apply((EvaluationPeriodUpdated event) ->{
            objectiveDefinition.evaluationPeriod = event.getEvaluationPeriod();
        });

    }
}
