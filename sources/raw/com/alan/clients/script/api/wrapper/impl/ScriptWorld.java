/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import com.alan.clients.script.api.wrapper.impl.ScriptEntityLiving;
import net.minecraft.entity.r;
import net.minecraft.world.w;

public class ScriptWorld
extends ScriptWrapper<w> {
    public ScriptWorld(w w2) {
        super(w2);
    }

    public String getDimensionName() {
        return ((w)this.wrapped).dDl.getDimensionName();
    }

    public int getDimensionId() {
        return ((w)this.wrapped).dDl.getDimensionId();
    }

    public long getTime() {
        return ((w)this.wrapped).getWorldTime();
    }

    public ScriptEntityLiving[] getLivingEntities() {
        return (ScriptEntityLiving[])((w)this.wrapped).dCS.stream().filter(c2 -> c2 instanceof r).map(c2 -> new ScriptEntityLiving((r)c2)).toArray(ScriptEntityLiving[]::new);
    }

    public ScriptEntityLiving[] getPlayers() {
        return (ScriptEntityLiving[])((w)this.wrapped).dCY.stream().map(ScriptEntityLiving::new).toArray(ScriptEntityLiving[]::new);
    }
}

