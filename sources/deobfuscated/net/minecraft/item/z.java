/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.item;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.a;
import net.minecraft.dispenser.e;
import net.minecraft.entity.p;
import net.minecraft.entity.r;
import net.minecraft.item.co;
import net.minecraft.util.ah;
import net.minecraft.util.am;
import net.minecraft.util.b;

class z
extends a {
    z() {
    }

    @Override
    protected co b(e e2, co co2) {
        b b2 = e2.dg().x(BlockDispenser.aQ(e2.zg()));
        int n2 = b2.wt();
        int n3 = b2.wu();
        int n4 = b2.wx();
        net.minecraft.util.a a2 = new net.minecraft.util.a(n2, n3, n4, n2 + 1, n3 + 1, n4 + 1);
        Predicate predicate = e2.de().a(r.class, a2, Predicates.and(ah.dvJ, (Predicate)new am(co2)));
        if (predicate.size() > 0) {
            r r2 = (r)predicate.get(0);
            int n5 = r2 instanceof net.minecraft.entity.player.a ? 1 : 0;
            int n6 = p.W(co2);
            co co3 = co2.aeg();
            co3.cWZ = 1;
            r2.c(n6 - n5, co3);
            if (r2 instanceof p) {
                ((p)r2).f(n6, 2.0f);
            }
            --co2.cWZ;
            return co2;
        }
        return super.b(e2, co2);
    }
}

