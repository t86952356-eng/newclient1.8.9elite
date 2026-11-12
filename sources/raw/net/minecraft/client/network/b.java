/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.network;

import net.minecraft.client.d;

public class b {
    private final String bEt;
    private final String bEu;
    private long bEv;

    public b(String string, String string2) {
        this.bEt = string;
        this.bEu = string2;
        this.bEv = d.Bj();
    }

    public String HW() {
        return this.bEt;
    }

    public String HX() {
        return this.bEu;
    }

    public void HY() {
        this.bEv = d.Bj();
    }
}

