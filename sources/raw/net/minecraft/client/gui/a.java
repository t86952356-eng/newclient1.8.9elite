/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.util.ba;

public class a {
    private final int bkL;
    private final ba bkM;
    private final ba bkN;
    private final boolean bkO;
    private final int bkP;

    public a(int n2, ba ba2, int n3) {
        this(n2, ba2, n3, ba2, false);
    }

    public a(int n2, ba ba2, int n3, ba ba3, boolean bl2) {
        this.bkM = ba2;
        this.bkL = n2;
        this.bkP = n3;
        this.bkN = ba3;
        this.bkO = bl2;
    }

    public ba DM() {
        return this.bkM;
    }

    public int DN() {
        return this.bkL;
    }

    public int DO() {
        return this.bkP;
    }

    public ba DP() {
        return this.bkN;
    }

    public boolean DQ() {
        return this.bkO;
    }
}

