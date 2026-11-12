/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import com.alan.clients.script.api.wrapper.impl.ScriptItemStack;
import net.minecraft.entity.player.g;

public class ScriptInventory
extends ScriptWrapper<g> {
    public ScriptInventory(g g2) {
        super(g2);
    }

    public ScriptItemStack getItemStackInSlot(int n2) {
        return new ScriptItemStack(((g)this.wrapped).fi(n2));
    }

    private int slot(int n2) {
        if (n2 >= 36) {
            return 8 - (n2 - 36);
        }
        if (n2 < 9) {
            return n2 + 36;
        }
        return n2;
    }

    public ScriptItemStack getHeldItem() {
        return new ScriptItemStack(((g)this.wrapped).acE());
    }
}

