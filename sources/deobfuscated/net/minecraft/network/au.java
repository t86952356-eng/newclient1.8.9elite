/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network;

public final class au
extends RuntimeException {
    public static final au daH = new au();

    private au() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

