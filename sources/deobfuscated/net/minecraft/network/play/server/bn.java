/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.scoreboard.c;
import net.minecraft.scoreboard.g;

public class bn
implements aj<a> {
    private String objectiveName;
    private String objectiveValue;
    private c deK;
    private int deL;

    public bn() {
    }

    public bn(g g2, int n2) {
        this.objectiveName = g2.getName();
        this.objectiveValue = g2.getDisplayName();
        this.deK = g2.akp().aki();
        this.deL = n2;
    }

    @Override
    public void a(ak ak2) {
        this.objectiveName = ak2.gs(16);
        this.deL = ak2.readByte();
        if (this.deL == 0 || this.deL == 2) {
            this.objectiveValue = ak2.gs(32);
            this.deK = c.fj(ak2.gs(16));
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.objectiveName);
        ak2.writeByte(this.deL);
        if (this.deL == 0 || this.deL == 2) {
            ak2.eS(this.objectiveValue);
            ak2.eS(this.deK.akj());
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String getObjectiveName() {
        return this.objectiveName;
    }

    public String getObjectiveValue() {
        return this.objectiveValue;
    }

    public int ahS() {
        return this.deL;
    }

    public c ahT() {
        return this.deK;
    }
}

