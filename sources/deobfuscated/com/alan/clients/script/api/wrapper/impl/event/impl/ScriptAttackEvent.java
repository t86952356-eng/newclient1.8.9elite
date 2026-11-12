/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.ScriptEntityLiving;
import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import rise.event.impl.AttackEvent;

public class ScriptAttackEvent
extends CancellableScriptEvent<AttackEvent> {
    public ScriptAttackEvent(AttackEvent attackEvent) {
        super(attackEvent);
    }

    public ScriptEntityLiving getTarget() {
        return new ScriptEntityLiving(((AttackEvent)this.wrapped).dc());
    }

    @Override
    public String getHandlerName() {
        return "onAttack";
    }
}

