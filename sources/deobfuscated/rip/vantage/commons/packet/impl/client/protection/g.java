/*
 * Decompiled with CFR 0.152.
 */
package rip.vantage.commons.packet.impl.client.protection;

public class g {
    private final int entityId;
    private final int ePS;
    private final boolean invisible;

    public g(int n2, int n3, boolean bl2) {
        this.entityId = n2;
        this.ePS = n3;
        this.invisible = bl2;
    }

    public int getEntityId() {
        return this.entityId;
    }

    public int agG() {
        return this.ePS;
    }

    public boolean isInvisible() {
        return this.invisible;
    }
}

