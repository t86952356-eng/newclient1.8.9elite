/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.b;
import net.minecraft.item.d;
import net.minecraft.util.ao;
import net.minecraft.util.dg;
import net.minecraft.world.gen.structure.ad;
import net.minecraft.world.gen.structure.ae;
import net.minecraft.world.gen.structure.af;
import net.minecraft.world.gen.structure.ag;
import net.minecraft.world.gen.structure.t;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class ab {
    private static final List<dg> dQN = Lists.newArrayList((Object[])new dg[]{new dg(Items.cPn, 0, 1, 5, 10), new dg(Items.cPo, 0, 1, 3, 5), new dg(Items.cQG, 0, 4, 9, 5), new dg(Items.cRa, b.cUN.ado(), 4, 9, 5), new dg(Items.cPm, 0, 1, 2, 3), new dg(Items.cPl, 0, 3, 8, 10), new dg(Items.cPT, 0, 1, 3, 15), new dg(Items.cPf, 0, 1, 1, 1), new dg(d.I(Blocks.cMx), 0, 4, 8, 1), new dg(Items.cRl, 0, 2, 4, 10), new dg(Items.cRk, 0, 2, 4, 10), new dg(Items.cQE, 0, 1, 1, 3), new dg(Items.cSo, 0, 1, 1, 1)});

    public static void ayU() {
        t.d(ad.class, "MSCorridor");
        t.d(ae.class, "MSCrossing");
        t.d(af.class, "MSRoom");
        t.d(ag.class, "MSStairs");
    }

    private static y a(List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        int n6 = random.nextInt(100);
        if (n6 >= 80) {
            w w2 = ae.b(list, random, n2, n3, n4, ao2);
            if (w2 != null) {
                return new ae(n5, random, w2, ao2);
            }
        } else if (n6 >= 70) {
            w w3 = ag.c(list, random, n2, n3, n4, ao2);
            if (w3 != null) {
                return new ag(n5, random, w3, ao2);
            }
        } else {
            w w4 = ad.a(list, random, n2, n3, n4, ao2);
            if (w4 != null) {
                return new ad(n5, random, w4, ao2);
            }
        }
        return null;
    }

    private static y a(y y2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        if (n5 > 8) {
            return null;
        }
        if (Math.abs(n2 - y2.ayR().dQB) <= 80 && Math.abs(n4 - y2.ayR().dQD) <= 80) {
            y y3 = ab.a(list, random, n2, n3, n4, ao2, n5 + 1);
            if (y3 != null) {
                list.add(y3);
                y3.a(y2, list, random);
            }
            return y3;
        }
        return null;
    }
}

