/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.entity.player.c;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;

public class y
implements aj<b> {
    private String dbK;
    private int dbL;
    private c cgz;
    private boolean colorsEnabled;
    private int modelPartFlags;

    public y() {
    }

    public y(String string, int n2, c c2, boolean bl2, int n3) {
        this.dbK = string;
        this.dbL = n2;
        this.cgz = c2;
        this.colorsEnabled = bl2;
        this.modelPartFlags = n3;
    }

    @Override
    public void a(ak ak2) {
        this.dbK = ak2.gs(7);
        this.dbL = ak2.readByte();
        this.cgz = c.fH(ak2.readByte());
        this.colorsEnabled = ak2.readBoolean();
        this.modelPartFlags = ak2.readUnsignedByte();
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.dbK);
        ak2.writeByte(this.dbL);
        ak2.writeByte(this.cgz.ace());
        ak2.writeBoolean(this.colorsEnabled);
        ak2.writeByte(this.modelPartFlags);
    }

    @Override
    public void a(b b2) {
        b2.b(this);
    }

    public String agg() {
        return this.dbK;
    }

    public c act() {
        return this.cgz;
    }

    public boolean isColorsEnabled() {
        return this.colorsEnabled;
    }

    public int getModelPartFlags() {
        return this.modelPartFlags;
    }
}

