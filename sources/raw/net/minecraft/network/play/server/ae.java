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
    private int crw;
    private byte ddd;
    private byte dde;
    private int cGO;
    private byte ddf;

    public ae() {
    }

    public ae(int n2, d d2) {
        this.crw = n2;
        this.ddd = (byte)(d2.aje() & 0xFF);
        this.dde = (byte)(d2.ajf() & 0xFF);
        this.cGO = d2.getDuration() > Short.MAX_VALUE ? Short.MAX_VALUE : d2.getDuration();
        this.ddf = (byte)(d2.ajh() ? 1 : 0);
    }

    @Override
    public void a(ak ak2) {
        this.crw = ak2.afw();
        this.ddd = ak2.readByte();
        this.dde = ak2.readByte();
        this.cGO = ak2.afw();
        this.ddf = ak2.readByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(this.crw);
        ak2.writeByte(this.ddd);
        ak2.writeByte(this.dde);
        ak2.gr(this.cGO);
        ak2.writeByte(this.ddf);
    }

    public boolean agY() {
        return this.cGO == Short.MAX_VALUE;
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getEntityId() {
        return this.crw;
    }

    public byte getEffectId() {
        return this.ddd;
    }

    public byte getAmplifier() {
        return this.dde;
    }

    public int getDuration() {
        return this.cGO;
    }

    public boolean agZ() {
        return this.ddf != 0;
    }
}

