/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.nbt.n;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;

public class bf
implements aj<a> {
    private b jI;
    private int tileEntityType;
    private n det;

    public bf() {
    }

    public bf(b b2, int n2, n n3) {
        this.jI = b2;
        this.tileEntityType = n2;
        this.det = n3;
    }

    @Override
    public void a(ak ak2) {
        this.jI = ak2.afu();
        this.tileEntityType = ak2.readUnsignedByte();
        this.det = ak2.afz();
    }

    @Override
    public void b(ak ak2) {
        ak2.ak(this.jI);
        ak2.writeByte((byte)this.tileEntityType);
        ak2.y(this.det);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public b Ab() {
        return this.jI;
    }

    public int getTileEntityType() {
        return this.tileEntityType;
    }

    public n ahK() {
        return this.det;
    }
}

