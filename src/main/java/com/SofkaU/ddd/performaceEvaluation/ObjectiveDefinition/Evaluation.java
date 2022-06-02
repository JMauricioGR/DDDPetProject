package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.EvaluationID;

public class Evaluation extends Entity<EvaluationID> {
    public Evaluation(EvaluationID entityId) {
        super(entityId);
    }
}
