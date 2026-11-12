/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.profiler;

public final class e
implements Comparable<e> {
    public double dij;
    public double dik;
    public String dil;

    public e(String string, double d2, double d3) {
        this.dil = string;
        this.dij = d2;
        this.dik = d3;
    }

    public int a(e e2) {
        return e2.dij < this.dij ? -1 : (e2.dij > this.dij ? 1 : e2.dil.compareTo(this.dil));
    }

    public int ajx() {
        return (this.dil.hashCode() & 0xAAAAAA) + 0x444444;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((e)object);
    }
}

