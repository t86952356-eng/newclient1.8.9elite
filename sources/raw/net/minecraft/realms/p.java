/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.realms;

import net.minecraft.client.multiplayer.e;

public class p {
    private final String diW;
    private final int diX;

    protected p(String string, int n2) {
        this.diW = string;
        this.diX = n2;
    }

    public String ajZ() {
        return this.diW;
    }

    public int getPort() {
        return this.diX;
    }

    public static p fi(String string) {
        e e2 = e.da(string);
        return new p(e2.HC(), e2.getPort());
    }
}

