/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.security;

import net.minecraft.network.aj;
import rise.util.InstanceAccess;

public abstract class a
implements InstanceAccess {
    private final String axM;
    private final String axN;

    public a(String string, String string2) {
        this.axM = string;
        this.axN = string2;
    }

    public abstract boolean k(aj<?> var1);
}

