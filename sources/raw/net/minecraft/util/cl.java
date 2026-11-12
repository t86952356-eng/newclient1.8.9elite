/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import net.minecraft.crash.a;

public class cl
extends RuntimeException {
    private final a dzJ;

    public cl(a a2) {
        this.dzJ = a2;
    }

    public a atz() {
        return this.dzJ;
    }

    @Override
    public Throwable getCause() {
        return this.dzJ.SG();
    }

    @Override
    public String getMessage() {
        return this.dzJ.getDescription();
    }
}

