/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.achievement;

import java.util.Comparator;
import net.minecraft.client.gui.achievement.c;
import net.minecraft.client.gui.achievement.h;
import net.minecraft.item.d;
import net.minecraft.stats.f;
import net.minecraft.stats.l;
import net.minecraft.stats.n;

class i
implements Comparator<l> {
    final /* synthetic */ c bvF;
    final /* synthetic */ h bvG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    i(h h2, c c2) {
        this.bvG = h2;
        this.bvF = c2;
    }

    public int a(l l2, l l3) {
        int n2 = d.p(l2.apw());
        int n3 = d.p(l3.apw());
        f f2 = null;
        f f3 = null;
        if (this.bvG.bvx == 0) {
            f2 = n.dqF[n2];
            f3 = n.dqF[n3];
        } else if (this.bvG.bvx == 1) {
            f2 = n.dqD[n2];
            f3 = n.dqD[n3];
        } else if (this.bvG.bvx == 2) {
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
            int n5 = this.bvG.bvE.bvq.c(f2);
            if (n5 != (n4 = this.bvG.bvE.bvq.c(f3))) {
                return (n5 - n4) * this.bvG.bvy;
            }
        }
        return n2 - n3;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((l)object, (l)object2);
    }
}

