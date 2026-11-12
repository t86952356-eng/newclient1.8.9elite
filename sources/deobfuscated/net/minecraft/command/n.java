/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

public class n
extends Exception {
    private final Object[] cnP;

    public n(String string, Object ... objectArray) {
        super(string);
        this.cnP = objectArray;
    }

    public Object[] Sc() {
        return this.cnP;
    }
}

