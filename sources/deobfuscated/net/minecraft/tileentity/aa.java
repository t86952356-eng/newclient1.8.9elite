/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.tileentity;

import net.minecraft.nbt.n;
import net.minecraft.tileentity.d;
import net.minecraft.util.ba;
import net.minecraft.util.s;
import net.minecraft.util.t;
import net.minecraft.world.m;
import net.minecraft.world.q;

public abstract class aa
extends d
implements m,
net.minecraft.world.n {
    private q dtk = q.dCy;

    @Override
    public void a(n n2) {
        super.a(n2);
        this.dtk = q.L(n2);
    }

    @Override
    public void b(n n2) {
        super.b(n2);
        if (this.dtk != null) {
            this.dtk.K(n2);
        }
    }

    @Override
    public boolean IH() {
        return this.dtk != null && !this.dtk.isEmpty();
    }

    @Override
    public q II() {
        return this.dtk;
    }

    @Override
    public void a(q q2) {
        this.dtk = q2;
    }

    @Override
    public ba xW() {
        return this.xV() ? new s(this.xU()) : new t(this.xU(), new Object[0]);
    }
}

