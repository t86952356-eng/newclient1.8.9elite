/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.achievement;

import java.util.Comparator;
import net.minecraft.client.gui.achievement.c;
import net.minecraft.client.gui.achievement.e;
import net.minecraft.item.d;
import net.minecraft.stats.l;
import net.minecraft.stats.n;

class f
implements Comparator<l> {
    final /* synthetic */ c bvB;
    final /* synthetic */ e bvC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    f(e e2, c c2) {
        this.bvC = e2;
        this.bvB = c2;
    }

    public int a(l l2, l l3) {
        int n2 = d.p(l2.apw());
        int n3 = d.p(l3.apw());
        net.minecraft.stats.f f2 = null;
        net.minecraft.stats.f f3 = null;
        if (this.bvC.bvx == 2) {
            f2 = n.dqC[n2];
            f3 = n.dqC[n3];
        } else if (this.bvC.bvx == 0) {
            f2 = n.dqD[n2];
            f3 = n.dqD[n3];
        } else if (this.bvC.bvx == 1) {
            f2 = n.dqE[n2];
            f3 = n.dqE[n3];
        }
        if (f2 != null || f3 != null) {
            int n4;
            if (f2 == null) {
                return 1;
            }
            if (f3 == null) {
                return -1;
            }
            int n5 = this.bvC.bvA.bvq.c(f2);
            if (n5 != (n4 = this.bvC.bvA.bvq.c(f3))) {
                return (n5 - n4) * this.bvC.bvy;
            }
        }
        return n2 - n3;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((l)object, (l)object2);
    }
}

