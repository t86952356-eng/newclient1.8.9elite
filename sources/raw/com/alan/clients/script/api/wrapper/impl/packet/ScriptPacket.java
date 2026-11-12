/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.script.api.wrapper.impl.packet;

import com.alan.clients.script.api.wrapper.ScriptWrapper;
import net.minecraft.network.aj;

public abstract class ScriptPacket<T extends aj<?>>
extends ScriptWrapper<T> {
    public ScriptPacket(T t2) {
        super(t2);
    }

    public String getType() {
        return ((aj)this.wrapped).getClass().getSimpleName();
    }

    public String getFullType() {
        return ((aj)this.wrapped).getClass().getName();
    }

    public boolean isType(String string) {
        String string2 = ((aj)this.wrapped).getClass().getSimpleName();
        String string3 = ((aj)this.wrapped).getClass().getName();
        return string2.equals(string) || string3.equals(string) || string3.endsWith("." + string);
    }

    public T getWrapped() {
        return (T)((aj)this.wrapped);
    }
}

