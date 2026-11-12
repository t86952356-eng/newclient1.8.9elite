/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.event.impl;

import com.alan.clients.script.api.wrapper.impl.ScriptEntityLiving;
import com.alan.clients.script.api.wrapper.impl.event.CancellableScriptEvent;
import hackclient.rise.eq;

public class ScriptAttackEvent
extends CancellableScriptEvent<eq> {
    public ScriptAttackEvent(eq eq2) {
        super(eq2);
    }

    public ScriptEntityLiving getTarget() {
        return new ScriptEntityLiving(((eq)this.wrapped).dc());
    }

    @Override
    public String getHandlerName() {
        return "onAttack";
    }
}

