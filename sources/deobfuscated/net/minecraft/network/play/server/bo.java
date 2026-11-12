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
    private String playerName = "";
    private String objectiveName = "";
    private int scoreValue;
    private bp deO;

    public bo() {
    }

    public bo(d d2) {
        this.playerName = d2.getPlayerName();
        this.objectiveName = d2.akn().getName();
        this.scoreValue = d2.akm();
        this.deO = bp.deP;
    }

    public bo(String string) {
        this.playerName = string;
        this.objectiveName = "";
        this.scoreValue = 0;
        this.deO = bp.deQ;
    }

    public bo(String string, g g2) {
        this.playerName = string;
        this.objectiveName = g2.getName();
        this.scoreValue = 0;
        this.deO = bp.deQ;
    }

    @Override
    public void a(ak ak2) {
        this.playerName = ak2.gs(40);
        this.deO = ak2.k(bp.class);
        this.objectiveName = ak2.gs(16);
        if (this.deO != bp.deQ) {
            this.scoreValue = ak2.afw();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.playerName);
        ak2.b(this.deO);
        ak2.eS(this.objectiveName);
        if (this.deO != bp.deQ) {
            ak2.gr(this.scoreValue);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public String getObjectiveName() {
        return this.objectiveName;
    }

    public int getScoreValue() {
        return this.scoreValue;
    }

    public bp ahU() {
        return this.deO;
    }
}

