/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import com.alan.clients.script.api.wrapper.impl.ScriptBlock;
import com.alan.clients.script.api.wrapper.impl.vector.ScriptVector3d;
import hackclient.rise.aik;
import hackclient.rise.ain;
import hackclient.rise.bu;
import net.minecraft.client.entity.c;
import net.minecraft.client.multiplayer.j;
import net.minecraft.util.b;
import rise.Client;

public class ScriptBlockPos
extends ScriptWrapper<b> {
    public ScriptBlockPos(b b2) {
        super(b2);
    }

    public ScriptVector3d getPosition() {
        return new ScriptVector3d(((b)this.wrapped).wt(), ((b)this.wrapped).wu(), ((b)this.wrapped).wx());
    }

    public float getHardness() {
        c c2 = ScriptBlockPos.MC.bgK;
        j j2 = ScriptBlockPos.MC.bgF;
        b b2 = (b)this.wrapped;
        Client.a.h().b(bu.class);
        return ain.a(c2, j2, b2, bu.bQ());
    }

    public float getHardness(int n2) {
        return ain.a(ScriptBlockPos.MC.bgK, ScriptBlockPos.MC.bgF, (b)this.wrapped, n2);
    }

    public ScriptBlock getBlock() {
        return new ScriptBlock(aik.u((b)this.wrapped));
    }
}

