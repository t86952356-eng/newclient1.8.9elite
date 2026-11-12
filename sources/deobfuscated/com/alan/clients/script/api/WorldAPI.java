/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api;

import com.alan.clients.script.api.wrapper.impl.ScriptBlockPos;
import com.alan.clients.script.api.wrapper.impl.ScriptEntityLiving;
import com.alan.clients.script.api.wrapper.impl.ScriptWorld;
import hackclient.rise.bv;
import net.minecraft.entity.r;
import net.minecraft.util.b;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.TickEvent;

public class WorldAPI
extends ScriptWorld {
    @EventLink
    public final Listener<TickEvent> onTick = tickEvent -> {
        if (this.wrapped == null) {
            this.wrapped = WorldAPI.MC.bgF;
        }
    };

    public WorldAPI() {
        super(WorldAPI.MC.bgF);
        Client.a.e().b(this);
    }

    public ScriptEntityLiving[] getEntities() {
        Object[] objectArray = WorldAPI.MC.bgF.dCS.stream().filter(c2 -> c2 instanceof r).toArray();
        ScriptEntityLiving[] scriptEntityLivingArray = new ScriptEntityLiving[objectArray.length];
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            scriptEntityLivingArray[i2] = new ScriptEntityLiving((r)objectArray[i2]);
        }
        return scriptEntityLivingArray;
    }

    public ScriptEntityLiving getTargetEntity(int n2) {
        r r2 = bv.e(n2);
        return r2 != null ? new ScriptEntityLiving(r2) : null;
    }

    public void removeEntity(int n2) {
        WorldAPI.MC.bgF.co(n2);
    }

    public void removeEntity(ScriptEntityLiving scriptEntityLiving) {
        this.removeEntity(scriptEntityLiving.getEntityId());
    }

    public ScriptBlockPos newBlockPos(int n2, int n3, int n4) {
        return new ScriptBlockPos(new b(n2, n3, n4));
    }

    public String getBlockName(ScriptBlockPos scriptBlockPos) {
        return scriptBlockPos.getBlock().getName();
    }
}

