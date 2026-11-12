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
import net.minecraft.util.ao;
import net.minecraft.world.gen.structure.cd;
import net.minecraft.world.gen.structure.ce;
import net.minecraft.world.gen.structure.cg;
import net.minecraft.world.gen.structure.ch;
import net.minecraft.world.gen.structure.ci;
import net.minecraft.world.gen.structure.cj;
import net.minecraft.world.gen.structure.ck;
import net.minecraft.world.gen.structure.cl;
import net.minecraft.world.gen.structure.cm;
import net.minecraft.world.gen.structure.cn;
import net.minecraft.world.gen.structure.co;
import net.minecraft.world.gen.structure.cp;
import net.minecraft.world.gen.structure.cq;
import net.minecraft.world.gen.structure.cr;
import net.minecraft.world.gen.structure.cs;
import net.minecraft.world.gen.structure.ct;
import net.minecraft.world.gen.structure.cu;
import net.minecraft.world.gen.structure.cv;
import net.minecraft.world.gen.structure.t;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.gen.structure.y;

public class cc {
    private static final cl[] dRT = new cl[]{new cl(cu.class, 40, 0), new cl(cn.class, 5, 5), new cl(cj.class, 20, 0), new cl(co.class, 20, 0), new cl(cp.class, 10, 6), new cl(cs.class, 5, 5), new cl(cq.class, 5, 5), new cl(ci.class, 5, 4), new cl(cg.class, 5, 4), new cd(ck.class, 10, 2), new ce(cm.class, 20, 1)};
    private static List<cl> dRU;
    private static Class<? extends cv> dRV;
    static int cga;
    private static final ct dRW;

    public static void azf() {
        t.d(cg.class, "SHCC");
        t.d(ch.class, "SHFC");
        t.d(ci.class, "SH5C");
        t.d(cj.class, "SHLT");
        t.d(ck.class, "SHLi");
        t.d(cm.class, "SHPR");
        t.d(cn.class, "SHPH");
        t.d(co.class, "SHRT");
        t.d(cp.class, "SHRC");
        t.d(cq.class, "SHSD");
        t.d(cr.class, "SHStart");
        t.d(cu.class, "SHS");
        t.d(cs.class, "SHSSD");
    }

    public static void azg() {
        dRU = Lists.newArrayList();
        for (cl cl2 : dRT) {
            cl2.dSj = 0;
            dRU.add(cl2);
        }
        dRV = null;
    }

    private static boolean azh() {
        boolean bl2 = false;
        cga = 0;
        for (cl cl2 : dRU) {
            if (cl2.dSk > 0 && cl2.dSj < cl2.dSk) {
                bl2 = true;
            }
            cga += cl2.dSi;
        }
        return bl2;
    }

    private static cv a(Class<? extends cv> clazz, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        cv cv2 = null;
        if (clazz == cu.class) {
            cv2 = cu.w(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == cn.class) {
            cv2 = cn.s(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == cj.class) {
            cv2 = cj.p(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == co.class) {
            cv2 = co.p(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == cp.class) {
            cv2 = cp.t(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == cs.class) {
            cv2 = cs.v(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == cq.class) {
            cv2 = cq.u(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == ci.class) {
            cv2 = ci.o(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == cg.class) {
            cv2 = cg.n(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == ck.class) {
            cv2 = ck.q(list, random, n2, n3, n4, ao2, n5);
        } else if (clazz == cm.class) {
            cv2 = cm.r(list, random, n2, n3, n4, ao2, n5);
        }
        return cv2;
    }

    private static cv a(cr cr2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        if (!cc.azh()) {
            return null;
        }
        if (dRV != null) {
            cv cv2 = cc.a(dRV, list, random, n2, n3, n4, ao2, n5);
            dRV = null;
            if (cv2 != null) {
                return cv2;
            }
        }
        int n6 = 0;
        block0: while (n6 < 5) {
            ++n6;
            int n7 = random.nextInt(cga);
            for (cl cl2 : dRU) {
                if ((n7 -= cl2.dSi) >= 0) continue;
                if (!cl2.iK(n5) || cl2 == cr2.dSo) continue block0;
                cv cv3 = cc.a(cl2.dSh, list, random, n2, n3, n4, ao2, n5);
                if (cv3 == null) continue;
                ++cl2.dSj;
                cr2.dSo = cl2;
                if (!cl2.azi()) {
                    dRU.remove(cl2);
                }
                return cv3;
            }
        }
        w w2 = ch.d(list, random, n2, n3, n4, ao2);
        if (w2 != null && w2.dQC > 1) {
            return new ch(n5, random, w2, ao2);
        }
        return null;
    }

    private static y b(cr cr2, List<y> list, Random random, int n2, int n3, int n4, ao ao2, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n2 - cr2.ayR().dQB) <= 112 && Math.abs(n4 - cr2.ayR().dQD) <= 112) {
            cv cv2 = cc.a(cr2, list, random, n2, n3, n4, ao2, n5 + 1);
            if (cv2 != null) {
                list.add(cv2);
                cr2.dSq.add(cv2);
            }
            return cv2;
        }
        return null;
    }

    static {
        dRW = new ct();
    }
}

