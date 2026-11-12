/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.packet.impl.client.protection;

public class g {
    private final int ePR;
    private final int ePS;
    private final boolean ePT;

    public g(int n2, int n3, boolean bl2) {
        this.ePR = n2;
        this.ePS = n3;
        this.ePT = bl2;
    }

    public int getEntityId() {
        return this.ePR;
    }

    public int agG() {
        return this.ePS;
    }

    public boolean isInvisible() {
        return this.ePT;
    }
}

