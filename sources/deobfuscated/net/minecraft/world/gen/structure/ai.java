/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.gen.structure;

import java.util.List;
import java.util.Random;
import net.minecraft.world.gen.structure.ak;
import net.minecraft.world.gen.structure.al;
import net.minecraft.world.gen.structure.am;
import net.minecraft.world.gen.structure.an;
import net.minecraft.world.gen.structure.ao;
import net.minecraft.world.gen.structure.ap;
import net.minecraft.world.gen.structure.aq;
import net.minecraft.world.gen.structure.ar;
import net.minecraft.world.gen.structure.as;
import net.minecraft.world.gen.structure.at;
import net.minecraft.world.gen.structure.au;
import net.minecraft.world.gen.structure.av;
import net.minecraft.world.gen.structure.aw;
import net.minecraft.world.gen.structure.ax;
import net.minecraft.world.gen.structure.ay;
import net.minecraft.world.gen.structure.az;
import net.minecraft.world.gen.structure.ba;
import net.minecraft.world.gen.structure.t;
import net.minecraft.world.gen.structure.y;

public class ai {
    private static final aw[] dQW = new aw[]{new aw(az.class, 30, 0, true), new aw(ar.class, 10, 4), new aw(ap.class, 10, 4), new aw(ax.class, 10, 3), new aw(ba.class, 5, 2), new aw(at.class, 5, 1)};
    private static final aw[] dQX = new aw[]{new aw(ao.class, 25, 0, true), new aw(aq.class, 15, 5), new aw(al.class, 5, 10), new aw(ak.class, 5, 10), new aw(am.class, 10, 3, true), new aw(an.class, 7, 2), new aw(au.class, 5, 2)};

    public static void ayV() {
        t.d(ar.class, "NeBCr");
        t.d(as.class, "NeBEF");
        t.d(az.class, "NeBS");
        t.d(am.class, "NeCCS");
        t.d(an.class, "NeCTB");
        t.d(at.class, "NeCE");
        t.d(aq.class, "NeSCSC");
        t.d(ak.class, "NeSCLT");
        t.d(ao.class, "NeSC");
        t.d(al.class, "NeSCRT");
        t.d(au.class, "NeCSR");
        t.d(ba.class, "NeMT");
        t.d(ap.class, "NeRC");
        t.d(ax.class, "NeSR");
        t.d(ay.class, "NeStart");
    }

    private static av a(aw aw2, List<y> list, Random random, int n2, int n3, int n4, net.minecraft.util.ao ao2, int n5) {
        Class<? extends av> clazz = aw2.dRd;
        av av2 = null;
        if (clazz == az.class) {
            av2 = az.m(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == ar.class) {
            av2 = ar.i(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == ap.class) {
            av2 = ap.g(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == ax.class) {
            av2 = ax.a(list, random, n2, n3, n4, n5, ao2);
        } else if (clazz == ba.class) {
            av2 = ba.b(list, random, n2, n3, n4, n5, ao2);
        } else if (clazz == at.class) {
            av2 = at.k(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == ao.class) {
            av2 = ao.f(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == al.class) {
            av2 = al.c(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == ak.class) {
            av2 = ak.b(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == am.class) {
            av2 = am.d(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == an.class) {
            av2 = an.e(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == aq.class) {
            av2 = aq.h(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == au.class) {
            av2 = au.l(list, random, n2, n3, n4, ao2, n5);
        }
        return av2;
    }
}

