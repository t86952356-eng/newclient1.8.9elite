/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class p
implements aj<b> {
    private float dbx;
    private float dby;
    private boolean dbz;
    private boolean bg;

    public p() {
    }

    public p(float f2, float f3, boolean bl2, boolean bl3) {
        this.dbx = f2;
        this.dby = f3;
        this.dbz = bl2;
        this.bg = bl3;
    }

    @Override
    public void a(ak ak2) {
        this.dbx = ak2.readFloat();
        this.dby = ak2.readFloat();
        byte by2 = ak2.readByte();
        this.dbz = (by2 & 1) > 0;
        this.bg = (by2 & 2) > 0;
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat(this.dbx);
        ak2.writeFloat(this.dby);
        byte by2 = 0;
        if (this.dbz) {
            by2 = (byte)(by2 | 1);
        }
        if (this.bg) {
            by2 = (byte)(by2 | 2);
        }
        ak2.writeByte(by2);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public float getStrafeSpeed() {
        return this.dbx;
    }

    public float getForwardSpeed() {
        return this.dby;
    }

    public boolean isJumping() {
        return this.dbz;
    }

    public boolean isSneaking() {
        return this.bg;
    }
}

