/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.network.play.server.bp;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;

public class bo
implements aj<a> {
    private String gK = "";
    private String deM = "";
    private int deN;
    private bp deO;

    public bo() {
    }

    public bo(d d2) {
        this.gK = d2.getPlayerName();
        this.deM = d2.akn().getName();
        this.deN = d2.akm();
        this.deO = bp.deP;
    }

    public bo(String string) {
        this.gK = string;
        this.deM = "";
        this.deN = 0;
        this.deO = bp.deQ;
    }

    public bo(String string, g g2) {
        this.gK = string;
        this.deM = g2.getName();
        this.deN = 0;
        this.deO = bp.deQ;
    }

    @Override
    public void a(ak ak2) {
        this.gK = ak2.gs(40);
        this.deO = ak2.k(bp.class);
        this.deM = ak2.gs(16);
        if (this.deO != bp.deQ) {
            this.deN = ak2.afw();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.gK);
        ak2.b(this.deO);
        ak2.eS(this.deM);
        if (this.deO != bp.deQ) {
            ak2.gr(this.deN);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String getPlayerName() {
        return this.gK;
    }

    public String getObjectiveName() {
        return this.deM;
    }

    public int getScoreValue() {
        return this.deN;
    }

    public bp ahU() {
        return this.deO;
    }
}

