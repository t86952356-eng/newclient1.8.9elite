/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.gui.achievement;

import com.google.common.collect.Lists;
import net.minecraft.client.gui.achievement.c;
import net.minecraft.client.gui.achievement.d;
import net.minecraft.client.gui.achievement.f;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.stats.l;
import net.minecraft.stats.n;

class e
extends d {
    final /* synthetic */ c bvA;

    public e(c c2, net.minecraft.client.d d2) {
        this.bvA = c2;
        super(c2, d2);
        this.bvv = Lists.newArrayList();
        for (l l2 : n.dpF) {
            boolean bl2 = false;
            int n2 = net.minecraft.item.d.p(l2.apw());
            if (c2.bvq.c(l2) > 0) {
                bl2 = true;
            } else if (n.dqE[n2] != null && c2.bvq.c(n.dqE[n2]) > 0) {
                bl2 = true;
            } else if (n.dqD[n2] != null && c2.bvq.c(n.dqD[n2]) > 0) {
                bl2 = true;
            }
            if (!bl2) continue;
            this.bvv.add(l2);
        }
        this.bvw = new f(this, c2);
    }

    @Override
    protected void drawListHeader(int n2, int n3, Tessellator tessellator) {
        super.drawListHeader(n2, n3, tessellator);
        if (this.bvu == 0) {
            this.bvA.f(n2 + 115 - 18 + 1, n3 + 1 + 1, 18, 18);
        } else {
            this.bvA.f(n2 + 115 - 18, n3 + 1, 18, 18);
        }
        if (this.bvu == 1) {
            this.bvA.f(n2 + 165 - 18 + 1, n3 + 1 + 1, 36, 18);
        } else {
            this.bvA.f(n2 + 165 - 18, n3 + 1, 36, 18);
        }
        if (this.bvu == 2) {
            this.bvA.f(n2 + 215 - 18 + 1, n3 + 1 + 1, 54, 18);
        } else {
            this.bvA.f(n2 + 215 - 18, n3 + 1, 54, 18);
        }
    }

    @Override
    protected void drawSlot(int n2, int n3, int n4, int n5, int n6, int n7) {
        l l2 = this.cb(n2);
        net.minecraft.item.d d2 = l2.apw();
        this.bvA.a(n3 + 40, n4, d2);
        int n8 = net.minecraft.item.d.p(d2);
        this.a(n.dqD[n8], n3 + 115, n4, n2 % 2 == 0);
        this.a(n.dqE[n8], n3 + 165, n4, n2 % 2 == 0);
        this.a(l2, n3 + 215, n4, n2 % 2 == 0);
    }

    @Override
    protected String cc(int n2) {
        return n2 == 0 ? "stat.crafted" : (n2 == 1 ? "stat.used" : "stat.mined");
    }
}

