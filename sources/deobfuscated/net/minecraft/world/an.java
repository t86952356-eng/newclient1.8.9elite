/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.world.ao;
import net.minecraft.world.ap;
import net.minecraft.world.storage.o;

public final class an {
    private final long dEp;
    private final ao dEq;
    private final boolean dEr;
    private final boolean dEs;
    private final ap dEt;
    private boolean dEu;
    private boolean dEv;
    private String dkZ = "";

    public an(long l2, ao ao2, boolean bl2, boolean bl3, ap ap2) {
        this.dEp = l2;
        this.dEq = ao2;
        this.dEr = bl2;
        this.dEs = bl3;
        this.dEt = ap2;
    }

    public an(o o2) {
        this(o2.avD(), o2.If(), o2.awB(), o2.azv(), o2.awC());
    }

    public an awx() {
        this.dEv = true;
        return this;
    }

    public an awy() {
        this.dEu = true;
        return this;
    }

    public an gB(String string) {
        this.dkZ = string;
        return this;
    }

    public boolean awz() {
        return this.dEv;
    }

    public long avD() {
        return this.dEp;
    }

    public ao If() {
        return this.dEq;
    }

    public boolean awA() {
        return this.dEs;
    }

    public boolean awB() {
        return this.dEr;
    }

    public ap awC() {
        return this.dEt;
    }

    public boolean awD() {
        return this.dEu;
    }

    public static ao ih(int n2) {
        return ao.ii(n2);
    }

    public String aln() {
        return this.dkZ;
    }
}

