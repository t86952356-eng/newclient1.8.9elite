/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import net.minecraft.entity.player.a;
import net.minecraft.item.co;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.be;
import net.minecraft.world.storage.f;

public class g {
    public final a dTp;
    private boolean dTq = true;
    private int dQB = 0;
    private int dQC = 0;
    private int dQE = 127;
    private int dQF = 127;
    private int dTr;
    public int dTs;
    final /* synthetic */ f dTt;

    public g(f f2, a a2) {
        this.dTt = f2;
        this.dTp = a2;
    }

    public aj aY(co co2) {
        if (this.dTq) {
            this.dTq = false;
            return new be(co2.yc(), this.dTt.dTk, this.dTt.dTo.values(), this.dTt.dTl, this.dQB, this.dQC, this.dQE + 1 - this.dQB, this.dQF + 1 - this.dQC);
        }
        return this.dTr++ % 5 == 0 ? new be(co2.yc(), this.dTt.dTk, this.dTt.dTo.values(), this.dTt.dTl, 0, 0, 0, 0) : null;
    }

    public void bs(int n2, int n3) {
        if (this.dTq) {
            this.dQB = Math.min(this.dQB, n2);
            this.dQC = Math.min(this.dQC, n3);
            this.dQE = Math.max(this.dQE, n2);
            this.dQF = Math.max(this.dQF, n3);
        } else {
            this.dTq = true;
            this.dQB = n2;
            this.dQC = n3;
            this.dQE = n2;
            this.dQF = n3;
        }
    }
}

