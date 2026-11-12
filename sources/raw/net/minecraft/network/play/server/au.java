/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.as;

public class au
implements aj<a> {
    private as ddQ;
    private float ddR;
    private float ddS;
    private float ddT;
    private float ddU;
    private float ddV;
    private float ddW;
    private float ddX;
    private int ddY;
    private boolean ddZ;
    private int[] dea;

    public au() {
    }

    public au(as as2, boolean bl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2, int ... nArray) {
        this.ddQ = as2;
        this.ddZ = bl2;
        this.ddR = f2;
        this.ddS = f3;
        this.ddT = f4;
        this.ddU = f5;
        this.ddV = f6;
        this.ddW = f7;
        this.ddX = f8;
        this.ddY = n2;
        this.dea = nArray;
    }

    @Override
    public void a(ak ak2) {
        this.ddQ = as.hA(ak2.readInt());
        if (this.ddQ == null) {
            this.ddQ = as.dxF;
        }
        this.ddZ = ak2.readBoolean();
        this.ddR = ak2.readFloat();
        this.ddS = ak2.readFloat();
        this.ddT = ak2.readFloat();
        this.ddU = ak2.readFloat();
        this.ddV = ak2.readFloat();
        this.ddW = ak2.readFloat();
        this.ddX = ak2.readFloat();
        this.ddY = ak2.readInt();
        int n2 = this.ddQ.asZ();
        this.dea = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.dea[i2] = ak2.afw();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.ddQ.asY());
        ak2.writeBoolean(this.ddZ);
        ak2.writeFloat(this.ddR);
        ak2.writeFloat(this.ddS);
        ak2.writeFloat(this.ddT);
        ak2.writeFloat(this.ddU);
        ak2.writeFloat(this.ddV);
        ak2.writeFloat(this.ddW);
        ak2.writeFloat(this.ddX);
        ak2.writeInt(this.ddY);
        int n2 = this.ddQ.asZ();
        for (int i2 = 0; i2 < n2; ++i2) {
            ak2.gr(this.dea[i2]);
        }
    }

    public as Zw() {
        return this.ddQ;
    }

    public boolean isLongDistance() {
        return this.ddZ;
    }

    public double ahr() {
        return this.ddR;
    }

    public double ahs() {
        return this.ddS;
    }

    public double aht() {
        return this.ddT;
    }

    public float getXOffset() {
        return this.ddU;
    }

    public float getYOffset() {
        return this.ddV;
    }

    public float getZOffset() {
        return this.ddW;
    }

    public float getParticleSpeed() {
        return this.ddX;
    }

    public int getParticleCount() {
        return this.ddY;
    }

    public int[] ahu() {
        return this.dea;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }
}

