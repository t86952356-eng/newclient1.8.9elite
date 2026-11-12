/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.ba;

public class cd
implements aj<a> {
    private ba bqS;
    private ba bqR;

    public cd() {
    }

    public cd(ba ba2) {
        this.bqS = ba2;
    }

    @Override
    public void a(ak ak2) {
        this.bqS = ak2.afv();
        this.bqR = ak2.afv();
    }

    @Override
    public void b(ak ak2) {
        ak2.j(this.bqS);
        ak2.j(this.bqR);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public ba aiu() {
        return this.bqS;
    }

    public ba aiv() {
        return this.bqR;
    }
}

