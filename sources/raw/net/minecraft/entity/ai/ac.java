/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.entity.ai;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.entity.ai.bm;
import net.minecraft.entity.ai.e;
import net.minecraft.entity.j;
import net.minecraft.pathfinding.b;
import net.minecraft.pathfinding.f;
import net.minecraft.util.bt;
import net.minecraft.util.da;
import net.minecraft.village.c;

public class ac
extends e {
    private final j cyz;
    private final double cyA;
    private b cyB;
    private net.minecraft.village.f cyw;
    private final boolean cyC;
    private final List<net.minecraft.village.f> cyD = Lists.newArrayList();

    public ac(j j2, double d2, boolean bl2) {
        this.cyz = j2;
        this.cyA = d2;
        this.cyC = bl2;
        this.eO(1);
        if (!(j2.UU() instanceof f)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    @Override
    public boolean WC() {
        this.WS();
        if (this.cyC && this.cyz.baU.avr()) {
            return false;
        }
        c c2 = this.cyz.baU.avS().e(new net.minecraft.util.b(this.cyz), 0);
        if (c2 == null) {
            return false;
        }
        this.cyw = this.a(c2);
        if (this.cyw == null) {
            return false;
        }
        f f2 = (f)this.cyz.UU();
        boolean bl2 = f2.aiS();
        f2.bR(false);
        this.cyB = f2.al(this.cyw.auF());
        f2.bR(bl2);
        if (this.cyB != null) {
            return true;
        }
        da da2 = bm.a(this.cyz, 10, 7, new da(this.cyw.auF().wt(), this.cyw.auF().wu(), this.cyw.auF().wx()));
        if (da2 == null) {
            return false;
        }
        f2.bR(false);
        this.cyB = this.cyz.UU().V(da2.dAG, da2.dAH, da2.dAI);
        f2.bR(bl2);
        return this.cyB != null;
    }

    @Override
    public boolean WD() {
        if (this.cyz.UU().aiK()) {
            return false;
        }
        float f2 = this.cyz.width + 4.0f;
        return this.cyz.aa(this.cyw.auF()) > (double)(f2 * f2);
    }

    @Override
    public void WG() {
        this.cyz.UU().a(this.cyB, this.cyA);
    }

    @Override
    public void WE() {
        if (this.cyz.UU().aiK() || this.cyz.aa(this.cyw.auF()) < 16.0) {
            this.cyD.add(this.cyw);
        }
    }

    private net.minecraft.village.f a(c c2) {
        net.minecraft.village.f f2 = null;
        int n2 = Integer.MAX_VALUE;
        for (net.minecraft.village.f f3 : c2.aur()) {
            int n3 = f3.I(bt.aF(this.cyz.gW), bt.aF(this.cyz.gX), bt.aF(this.cyz.gY));
            if (n3 >= n2 || this.a(f3)) continue;
            f2 = f3;
            n2 = n3;
        }
        return f2;
    }

    private boolean a(net.minecraft.village.f f2) {
        for (net.minecraft.village.f f3 : this.cyD) {
            if (!f2.auF().equals(f3.auF())) continue;
            return true;
        }
        return false;
    }

    private void WS() {
        if (this.cyD.size() > 15) {
            this.cyD.remove(0);
        }
    }
}

