/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import net.minecraft.item.co;
import net.minecraft.item.d;

public class ScriptItemStack
extends ScriptWrapper<co> {
    public ScriptItemStack(co co2) {
        super(co2);
    }

    public int getAmount() {
        return ((co)this.wrapped).jX();
    }

    public int getMaxAmount() {
        return ((co)this.wrapped).aeb();
    }

    public int getItemId() {
        return this.wrapped == null ? 0 : d.p(((co)this.wrapped).bP());
    }

    public co getWrapped() {
        return (co)this.wrapped;
    }

    public String getName() {
        return ((co)this.wrapped).getDisplayName();
    }
}

