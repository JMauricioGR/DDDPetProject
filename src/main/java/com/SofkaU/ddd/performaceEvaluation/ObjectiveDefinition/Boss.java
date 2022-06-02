package com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition;

import co.com.sofka.domain.generic.Entity;
import com.SofkaU.ddd.performaceEvaluation.ObjectiveDefinition.value.BossID;

public class Boss extends Entity<BossID> {
    public Boss(BossID entityId) {
        super(entityId);
    }
}
