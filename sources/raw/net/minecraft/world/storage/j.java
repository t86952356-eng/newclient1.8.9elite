/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import net.minecraft.world.ao;

public class j
implements Comparable<j> {
    private final String dTy;
    private final String dTz;
    private final long dTA;
    private final long dTB;
    private final boolean dTC;
    private final ao dTD;
    private final boolean dTE;
    private final boolean dTF;

    public j(String string, String string2, long l2, long l3, ao ao2, boolean bl2, boolean bl3, boolean bl4) {
        this.dTy = string;
        this.dTz = string2;
        this.dTA = l2;
        this.dTB = l3;
        this.dTD = ao2;
        this.dTC = bl2;
        this.dTE = bl3;
        this.dTF = bl4;
    }

    public String azD() {
        return this.dTy;
    }

    public String getDisplayName() {
        return this.dTz;
    }

    public long ajY() {
        return this.dTB;
    }

    public boolean azE() {
        return this.dTC;
    }

    public long azs() {
        return this.dTA;
    }

    public int a(j j2) {
        return this.dTA < j2.dTA ? 1 : (this.dTA > j2.dTA ? -1 : this.dTy.compareTo(j2.dTy));
    }

    public ao azF() {
        return this.dTD;
    }

    public boolean azv() {
        return this.dTE;
    }

    public boolean azG() {
        return this.dTF;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((j)object);
    }
}

