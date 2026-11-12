/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class p
implements aj<b> {
    private float strafeSpeed;
    private float forwardSpeed;
    private boolean jumping;
    private boolean sneaking;

    public p() {
    }

    public p(float f2, float f3, boolean bl2, boolean bl3) {
        this.strafeSpeed = f2;
        this.forwardSpeed = f3;
        this.jumping = bl2;
        this.sneaking = bl3;
    }

    @Override
    public void a(ak ak2) {
        this.strafeSpeed = ak2.readFloat();
        this.forwardSpeed = ak2.readFloat();
        byte by2 = ak2.readByte();
        this.jumping = (by2 & 1) > 0;
        this.sneaking = (by2 & 2) > 0;
    }

    @Override
    public void b(ak ak2) {
        ak2.writeFloat(this.strafeSpeed);
        ak2.writeFloat(this.forwardSpeed);
        byte by2 = 0;
        if (this.jumping) {
            by2 = (byte)(by2 | 1);
        }
        if (this.sneaking) {
            by2 = (byte)(by2 | 2);
        }
        ak2.writeByte(by2);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public float getStrafeSpeed() {
        return this.strafeSpeed;
    }

    public float getForwardSpeed() {
        return this.forwardSpeed;
    }

    public boolean isJumping() {
        return this.jumping;
    }

    public boolean isSneaking() {
        return this.sneaking;
    }
}

