/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.nbt.n;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.bf;
import net.minecraft.tileentity.ac;
import net.minecraft.tileentity.b;
import net.minecraft.tileentity.d;
import net.minecraft.util.bi;

public class ab
extends d
implements bi {
    private final b dtl = new ac(this);

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dtl.a(n2);
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        this.dtl.b(n2);
    }

    @Override
    public void jA() {
        this.dtl.apI();
    }

    @Override
    public aj apQ() {
        n n2 = new n();
        this.b(n2);
        n2.eP("SpawnPotentials");
        return new bf(this.aZf, 1, n2);
    }

    @Override
    public boolean aC(int n2, int n3) {
        return this.dtl.hk(n2) || super.aC(n2, n3);
    }

    @Override
    public boolean apV() {
        return true;
    }

    public b aqI() {
        return this.dtl;
    }
}

