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
    private float xOffset;
    private float yOffset;
    private float zOffset;
    private float particleSpeed;
    private int particleCount;
    private boolean longDistance;
    private int[] dea;

    public au() {
    }

    public au(as as2, boolean bl2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n2, int ... nArray) {
        this.ddQ = as2;
        this.longDistance = bl2;
        this.ddR = f2;
        this.ddS = f3;
        this.ddT = f4;
        this.xOffset = f5;
        this.yOffset = f6;
        this.zOffset = f7;
        this.particleSpeed = f8;
        this.particleCount = n2;
        this.dea = nArray;
    }

    @Override
    public void a(ak ak2) {
        this.ddQ = as.hA(ak2.readInt());
        if (this.ddQ == null) {
            this.ddQ = as.dxF;
        }
        this.longDistance = ak2.readBoolean();
        this.ddR = ak2.readFloat();
        this.ddS = ak2.readFloat();
        this.ddT = ak2.readFloat();
        this.xOffset = ak2.readFloat();
        this.yOffset = ak2.readFloat();
        this.zOffset = ak2.readFloat();
        this.particleSpeed = ak2.readFloat();
        this.particleCount = ak2.readInt();
        int n2 = this.ddQ.asZ();
        this.dea = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.dea[i2] = ak2.afw();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.ddQ.asY());
        ak2.writeBoolean(this.longDistance);
        ak2.writeFloat(this.ddR);
        ak2.writeFloat(this.ddS);
        ak2.writeFloat(this.ddT);
        ak2.writeFloat(this.xOffset);
        ak2.writeFloat(this.yOffset);
        ak2.writeFloat(this.zOffset);
        ak2.writeFloat(this.particleSpeed);
        ak2.writeInt(this.particleCount);
        int n2 = this.ddQ.asZ();
        for (int i2 = 0; i2 < n2; ++i2) {
            ak2.gr(this.dea[i2]);
        }
    }

    public as Zw() {
        return this.ddQ;
    }

    public boolean isLongDistance() {
        return this.longDistance;
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
        return this.xOffset;
    }

    public float getYOffset() {
        return this.yOffset;
    }

    public float getZOffset() {
        return this.zOffset;
    }

    public float getParticleSpeed() {
        return this.particleSpeed;
    }

    public int getParticleCount() {
        return this.particleCount;
    }

    public int[] ahu() {
        return this.dea;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }
}

