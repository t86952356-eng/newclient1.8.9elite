/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package net.minecraft.network.play.server;

import lombok.Generated;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.scoreboard.g;

public class bq
implements aj<a> {
    private int position;
    private String scoreName;

    public bq() {
    }

    public bq(int n2, g g2) {
        this.position = n2;
        this.scoreName = g2 == null ? "" : g2.getName();
    }

    @Override
    public void a(ak ak2) {
        this.position = ak2.readByte();
        this.scoreName = ak2.gs(16);
    }

    @Override
    public void b(ak ak2) {
        ak2.writeByte(this.position);
        ak2.eS(this.scoreName);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public int getPosition() {
        return this.position;
    }

    public String getScoreName() {
        return this.scoreName;
    }

    @Generated
    public void setPosition(int n2) {
        this.position = n2;
    }

    @Generated
    public void setScoreName(String string) {
        this.scoreName = string;
    }
}

