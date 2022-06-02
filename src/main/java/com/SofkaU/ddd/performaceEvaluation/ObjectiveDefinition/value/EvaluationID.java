package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value;

import co.com.sofka.domain.generic.Identity;

public class EvaluationID extends Identity{
    public EvaluationID(){}

    private EvaluationID(String id){ super(id);}

    public static EvaluationID of(String id){ return new EvaluationID(id);}
}
