/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.potion.d;

public class ae
implements aj<a> {
    private int entityId;
    private byte effectId;
    private byte amplifier;
    private int duration;
    private byte ddf;

    public ae() {
    }

    public ae(int n2, d d2) {
        this.entityId = n2;
        this.effectId = (byte)(d2.aje() & 0xFF);
        this.amplifier = (byte)(d2.ajf() & 0xFF);
        this.duration = d2.getDuration() > Short.MAX_VALUE ? Short.MAX_VALUE : d2.getDuration();
        this.ddf = (byte)(d2.ajh() ? 1 : 0);
    }

    @Override
    public void a(ak ak2) {
        this.entityId = ak2.afw();
        this.effectId = ak2.readByte();
        this.amplifier = ak2.readByte();
        this.duration = ak2.afw();
        this.ddf = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.entityId);
        ak2.writeByte(this.effectId);
        ak2.writeByte(this.amplifier);
        ak2.gr(this.duration);
        ak2.writeByte(this.ddf);
    }

    public boolean agY() {
        return this.duration == Short.MAX_VALUE;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityId() {
        return this.entityId;
    }

    public byte getEffectId() {
        return this.effectId;
    }

    public byte getAmplifier() {
        return this.amplifier;
    }

    public int getDuration() {
        return this.duration;
    }

    public boolean agZ() {
        return this.ddf != 0;
    }
}

