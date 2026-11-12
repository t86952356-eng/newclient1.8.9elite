/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.entity.player.i;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class bl
implements aj<a> {
    private boolean csU;
    private boolean dbH;
    private boolean cJL;
    private boolean dbI;
    private float cJO;
    private float cJP;

    public bl() {
    }

    public bl(i i2) {
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
    public void a(a a2) {
        a2.a(this);
    }

    public boolean isInvulnerable() {
        return this.csU;
    }

    public void setInvulnerable(boolean bl2) {
        this.csU = bl2;
    }

    public boolean isFlying() {
        return this.dbH;
    }

    public void setFlying(boolean bl2) {
        this.dbH = bl2;
    }

    public boolean isAllowFlying() {
        return this.cJL;
    }

    public void setAllowFlying(boolean bl2) {
        this.cJL = bl2;
    }

    public boolean isCreativeMode() {
        return this.dbI;
    }

    public void setCreativeMode(boolean bl2) {
        this.dbI = bl2;
    }

    public float getFlySpeed() {
        return this.cJO;
    }

    public void bt(float f2) {
        this.cJO = f2;
    }

    public float getWalkSpeed() {
        return this.cJP;
    }

    public void bv(float f2) {
        this.cJP = f2;
    }
}

