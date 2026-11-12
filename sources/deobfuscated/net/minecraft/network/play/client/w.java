/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.entity.player.i;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class w
implements aj<b> {
    private boolean invulnerable;
    private boolean flying;
    private boolean allowFlying;
    private boolean creativeMode;
    private float cJO;
    private float cJP;

    public w() {
    }

    public w(i i2) {
        this.setInvulnerable(i2.cJJ);
        this.setFlying(i2.cJK);
        this.setAllowFlying(i2.cJL);
        this.setCreativeMode(i2.cJM);
        this.bt(i2.getFlySpeed());
        this.bv(i2.getWalkSpeed());
    }

    @Override
    public void a(ak ak2) {
        byte by2 = ak2.readByte();
        this.setInvulnerable((by2 & 1) > 0);
        this.setFlying((by2 & 2) > 0);
        this.setAllowFlying((by2 & 4) > 0);
        this.setCreativeMode((by2 & 8) > 0);
        this.bt(ak2.readFloat());
        this.bv(ak2.readFloat());
    }

    @Override
    public void b(ak ak2) {
        byte by2 = 0;
        if (this.isInvulnerable()) {
            by2 = (byte)(by2 | 1);
        }
        if (this.isFlying()) {
            by2 = (byte)(by2 | 2);
        }
        if (this.isAllowFlying()) {
            by2 = (byte)(by2 | 4);
        }
        if (this.isCreativeMode()) {
            by2 = (byte)(by2 | 8);
        }
        ak2.writeByte(by2);
        ak2.writeFloat(this.cJO);
        ak2.writeFloat(this.cJP);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public boolean isInvulnerable() {
        return this.invulnerable;
    }

    public void setInvulnerable(boolean bl2) {
        this.invulnerable = bl2;
    }

    public boolean isFlying() {
        return this.flying;
    }

    public void setFlying(boolean bl2) {
        this.flying = bl2;
    }

    public boolean isAllowFlying() {
        return this.allowFlying;
    }

    public void setAllowFlying(boolean bl2) {
        this.allowFlying = bl2;
    }

    public boolean isCreativeMode() {
        return this.creativeMode;
    }

    public void setCreativeMode(boolean bl2) {
        this.creativeMode = bl2;
    }

    public void bt(float f2) {
        this.cJO = f2;
    }

    public void bv(float f2) {
        this.cJP = f2;
    }
}

