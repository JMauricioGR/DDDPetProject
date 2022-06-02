package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value;

import co.com.sofka.domain.generic.Identity;

public class ObjectiveDefinitionID extends Identity {
    public ObjectiveDefinitionID(){}

    private ObjectiveDefinitionID(String id){ super(id);}

    public static ObjectiveDefinitionID of(String id){ return new ObjectiveDefinitionID(id);}
}
