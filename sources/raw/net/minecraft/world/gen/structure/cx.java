/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.world.gen.structure;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.world.gen.structure.cz;
import net.minecraft.world.gen.structure.da;
import net.minecraft.world.gen.structure.db;
import net.minecraft.world.gen.structure.dc;
import net.minecraft.world.gen.structure.dd;
import net.minecraft.world.gen.structure.de;
import net.minecraft.world.gen.structure.df;
import net.minecraft.world.gen.structure.dg;
import net.minecraft.world.gen.structure.dh;
import net.minecraft.world.gen.structure.di;
import net.minecraft.world.gen.structure.dk;
import net.minecraft.world.gen.structure.dl;
import net.minecraft.world.gen.structure.dm;
import net.minecraft.world.gen.structure.dn;
import net.minecraft.world.gen.structure.do;
import net.minecraft.world.gen.structure.t;
import net.minecraft.world.gen.structure.u;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cx {
    public static void azk() {
        t.d(dd.class, "ViBH");
        t.d(da.class, "ViDF");
        t.d(db.class, "ViF");
        t.d(dl.class, "ViL");
        t.d(dc.class, "ViPH");
        t.d(dg.class, "ViSH");
        t.d(do.class, "ViSmH");
        t.d(cz.class, "ViST");
        t.d(de.class, "ViS");
        t.d(dk.class, "ViStart");
        t.d(dh.class, "ViSR");
        t.d(df.class, "ViTRH");
        t.d(dn.class, "ViW");
    }

    public static List<di> a(Random random, int n2) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new di(dg.class, 4, bt.b(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new di(cz.class, 20, bt.b(random, 0 + n2, 1 + n2)));
        arrayList.add(new di(dd.class, 20, bt.b(random, 0 + n2, 2 + n2)));
        arrayList.add(new di(do.class, 3, bt.b(random, 2 + n2, 5 + n2 * 3)));
        arrayList.add(new di(dc.class, 15, bt.b(random, 0 + n2, 2 + n2)));
        arrayList.add(new di(da.class, 3, bt.b(random, 1 + n2, 4 + n2)));
        arrayList.add(new di(db.class, 3, bt.b(random, 2 + n2, 4 + n2 * 2)));
        arrayList.add(new di(de.class, 15, bt.b(random, 0, 1 + n2)));
        arrayList.add(new di(df.class, 8, bt.b(random, 0 + n2, 3 + n2 * 2)));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (((di)iterator.next()).dSK != 0) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private static int L(List<di> list) {
        boolean bl2 = false;
        int n2 = 0;
        for (di di2 : list) {
            if (di2.dSK > 0 && di2.dSJ < di2.dSK) {
                bl2 = true;
            }
            n2 += di2.dSI;
        }
        return bl2 ? n2 : -1;
    }

    private static dm a(dk dk2, di di2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        Class<? extends dm> clazz = di2.dSH;
        dm dm2 = null;
        if (clazz == dg.class) {
            dm2 = dg.k(dk2, list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == cz.class) {
            dm2 = cz.d(dk2, list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == dd.class) {
            dm2 = dd.h(dk2, list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == do.class) {
            dm2 = do.l(dk2, list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == dc.class) {
            dm2 = dc.g(dk2, list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == da.class) {
            dm2 = da.e(dk2, list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == db.class) {
            dm2 = db.f(dk2, list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == de.class) {
            dm2 = de.i(dk2, list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == df.class) {
            dm2 = df.j(dk2, list, random, n2, n3, n4, ao2, n5);
        }
        return dm2;
    }

    private static dm a(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        int n6 = cx.L(dk2.dSO);
        if (n6 <= 0) {
            return null;
        }
        int n7 = 0;
        block0: while (n7 < 5) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (di di2 : dk2.dSO) {
                if ((n8 -= di2.dSI) >= 0) continue;
                if (!di2.iL(n5) || di2 == dk2.dSN && dk2.dSO.size() > 1) continue block0;
                dm dm2 = cx.a(dk2, di2, list, random, n2, n3, n4, ao2, n5);
                if (dm2 == null) continue;
                ++di2.dSJ;
                dk2.dSN = di2;
                if (!di2.azl()) {
                    dk2.dSO.remove(di2);
                }
                return dm2;
            }
        }
        w w2 = dl.b(dk2, list, random, n2, n3, n4, ao2);
        if (w2 != null) {
            return new dl(dk2, n5, random, w2, ao2);
        }
        return null;
    }

    private static y b(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n2 - dk2.ayR().dQB) <= 112 && Math.abs(n4 - dk2.ayR().dQD) <= 112) {
            dm dm2 = cx.a(dk2, list, random, n2, n3, n4, ao2, n5 + 1);
            if (dm2 != null) {
                int n6;
                int n7 = (dm2.dQI.dQB + dm2.dQI.dQE) / 2;
                int n8 = (dm2.dQI.dQD + dm2.dQI.dQG) / 2;
                int n9 = dm2.dQI.dQE - dm2.dQI.dQB;
                int n10 = dm2.dQI.dQG - dm2.dQI.dQD;
                int n11 = n6 = n9 > n10 ? n9 : n10;
                if (dk2.avp().a(n7, n8, n6 / 2 + 4, u.dQw)) {
                    list.add(dm2);
                    dk2.dSP.add(dm2);
                    return dm2;
                }
            }
            return null;
        }
        return null;
    }

    private static y c(dk dk2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        if (n5 > 3 + dk2.dQx) {
            return null;
        }
        if (Math.abs(n2 - dk2.ayR().dQB) <= 112 && Math.abs(n4 - dk2.ayR().dQD) <= 112) {
            w w2 = dh.a(dk2, list, random, n2, n3, n4, ao2);
            if (w2 != null && w2.dQC > 10) {
                int n6;
                dh dh2 = new dh(dk2, n5, random, w2, ao2);
                int n7 = (dh2.dQI.dQB + dh2.dQI.dQE) / 2;
                int n8 = (dh2.dQI.dQD + dh2.dQI.dQG) / 2;
                int n9 = dh2.dQI.dQE - dh2.dQI.dQB;
                int n10 = dh2.dQI.dQG - dh2.dQI.dQD;
                int n11 = n6 = n9 > n10 ? n9 : n10;
                if (dk2.avp().a(n7, n8, n6 / 2 + 4, u.dQw)) {
                    list.add(dh2);
                    dk2.dSQ.add(dh2);
                    return dh2;
                }
            }
            return null;
        }
        return null;
    }
}

