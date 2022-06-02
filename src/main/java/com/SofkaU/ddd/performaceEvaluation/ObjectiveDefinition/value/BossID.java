package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value;

import co.com.sofka.domain.generic.Identity;

public class BossID extends Identity {
    public BossID(){}

    private BossID(String id){ super(id);}

    public static BossID of(String id){ return new BossID(id);}
}
