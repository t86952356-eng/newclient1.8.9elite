/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package hackclient.rise;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import hackclient.rise.ahj;
import hackclient.rise.aix;
import java.util.List;
import net.minecraft.entity.c;
import net.minecraft.util.a;
import net.minecraft.util.ah;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;
import rise.util.InstanceAccess;
import rise.util.math.Vector2f;

public final class aei
implements InstanceAccess {
    public static ce c(Vector2f vector2f, double d2) {
        return aei.a(vector2f, d2, 0.0f);
    }

    public static boolean t(c c2) {
        int n2 = 16 * aei.aER.aIY.bOt;
        Vector2f vector2f = aix.y(c2);
        if (ahj.n(aei.aER.bgK.pl, vector2f.x) > (double)aei.aER.aIY.chV) {
            return false;
        }
        if (c2.csn > 100.0 || !(c2 instanceof net.minecraft.entity.player.a)) {
            ce ce2 = aei.a(vector2f, n2, 0.2f);
            return ce2 != null && ce2.dzu == cf.dzz;
        }
        for (double d2 = 1.0; d2 >= -1.0; d2 -= 0.5) {
            for (double d3 = 1.0; d3 >= -1.0; d3 -= 1.0) {
                for (double d4 = 1.0; d4 >= -1.0; d4 -= 1.0) {
                    Vector2f vector2f2 = aix.d(c2.TN().v((c2.Us().dtK - c2.Us().dtH) * d3, (c2.Us().dtL - c2.Us().dtI) * d2, (c2.Us().dtM - c2.Us().dtJ) * d4));
                    ce ce3 = aei.a(vector2f2, n2, 0.2f);
                    if (ce3 == null || ce3.dzu != cf.dzz) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static ce a(Vector2f vector2f, double d2, float f2) {
        return aei.a(vector2f, d2, f2, aei.aER.bgK);
    }

    public static ce a(Vector2f vector2f, double d2, float f2, c c2) {
        return aei.a(vector2f, d2, f2, c2, false);
    }

    public static ce a(Vector2f vector2f, double d2, float f2, c c2, boolean bl2) {
        float f3 = aei.aER.bgC.bWY;
        ce ce2 = null;
        if (c2 != null && aei.aER.bgF != null) {
            if (!bl2) {
                ce2 = c2.a(d2, vector2f.x, vector2f.y);
            }
            double d3 = d2;
            da da2 = c2.aQ(f3);
            if (ce2 != null) {
                d3 = ce2.daS.x(da2);
            }
            da da3 = aei.aER.bgK.s(vector2f.y, vector2f.x);
            da da4 = da2.al(da3.dAG * d2, da3.dAH * d2, da3.dAI * d2);
            c c3 = null;
            da da5 = null;
            float f4 = 1.0f;
            List<c> list = aei.aER.bgF.a(c2, c2.Us().ac(da3.dAG * d2, da3.dAH * d2, da3.dAI * d2).ad(1.0, 1.0, 1.0), (Predicate<? super c>)Predicates.and(ah.dvJ, c::TO));
            double d4 = d3;
            for (c c4 : list) {
                double d5;
                float f5 = c4.TX() + f2;
                a a2 = c4.Us().ad(f5, f5, f5);
                ce ce3 = a2.c(da2, da4);
                if (a2.o(da2)) {
                    if (!(d4 >= 0.0)) continue;
                    c3 = c4;
                    da5 = ce3 == null ? da2 : ce3.daS;
                    d4 = 0.0;
                    continue;
                }
                if (ce3 == null || !((d5 = da2.x(ce3.daS)) < d4) && d4 != 0.0) continue;
                c3 = c4;
                da5 = ce3.daS;
                d4 = d5;
            }
            if (c3 != null && (d4 < d3 || ce2 == null)) {
                ce2 = new ce(c3, da5);
            }
            return ce2;
        }
        return null;
    }

    public static boolean a(Vector2f vector2f, ao ao2, b b2, boolean bl2) {
        ce ce2 = aei.aER.bgK.a(4.5, vector2f.x, vector2f.y);
        if (ce2 == null) {
            return false;
        }
        da da2 = ce2.daS;
        if (da2 == null) {
            return false;
        }
        return ce2.dg().equals(b2) && (!bl2 || ce2.dzv == ao2);
    }

    public static boolean a(ao ao2, b b2, boolean bl2) {
        ce ce2 = aei.aER.bhc;
        if (ce2 == null) {
            return false;
        }
        da da2 = ce2.daS;
        if (da2 == null || ce2.dg() == null) {
            return false;
        }
        return ce2.dg().equals(b2) && (!bl2 || ce2.dzv == ao2);
    }

    public static Boolean a(Vector2f vector2f, b b2) {
        return aei.a(vector2f, ao.dwr, b2, false);
    }

    public static Boolean a(Vector2f vector2f, b b2, ao ao2) {
        return aei.a(vector2f, ao2, b2, true);
    }
}

