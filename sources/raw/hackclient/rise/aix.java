/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.aei;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.bs;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.d;
import net.minecraft.entity.c;
import net.minecraft.util.a;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.da;

public final class aix
implements aea {
    public static akb c(akd akd2, akd akd3) {
        akd akd4 = akd3.f(akd2);
        double d2 = Math.hypot(akd4.getX(), akd4.getZ());
        if (!(aix.af(akd4.getX()) && aix.af(akd4.getY()) && aix.af(akd4.getZ()) && aix.af(d2))) {
            return aix.aER.bgK == null ? new akb(0.0f, 0.0f) : new akb(aix.aER.bgK.pl, aix.aER.bgK.pm);
        }
        float f2 = (float)(bt.y(akd4.getZ(), akd4.getX()) * 57.2957763671875) - 90.0f;
        float f3 = (float)(-(bt.y(akd4.getY(), d2) * 57.2957763671875));
        return new akb(f2, f3);
    }

    public static akb y(c c2) {
        if (!aix.z(c2) || aix.aER.bgK == null) {
            return aix.aER.bgK == null ? new akb(0.0f, 0.0f) : new akb(aix.aER.bgK.pl, aix.aER.bgK.pm);
        }
        return aix.d(c2.TN().v(0.0, Math.max(0.0, Math.min(aix.aER.bgK.gX - c2.gX + (double)aix.aER.bgK.getEyeHeight(), (c2.Us().dtL - c2.Us().dtI) * 0.9)), 0.0));
    }

    public static da b(b b2, ao ao2) {
        double d2 = (double)b2.wt() + 0.5;
        double d3 = (double)b2.wu() + 0.5;
        double d4 = (double)b2.wx() + 0.5;
        return new da(d2 += (double)ao2.asM().wt() * 0.5, d3 += (double)ao2.asM().wu() * 0.5, d4 += (double)ao2.asM().wx() * 0.5);
    }

    public static akb a(c c2, boolean bl2, double d2) {
        akb akb2 = aix.y(c2);
        if (!bl2 || !aix.z(c2) || !aix.af(d2) || d2 <= 0.0) {
            return akb2;
        }
        ce ce2 = aei.c(akb2, d2);
        if (ce2 != null && ce2.dzu == cf.dzz) {
            return akb2;
        }
        for (double d3 = 1.0; d3 >= 0.0; d3 -= 0.25 + Math.random() * 0.1) {
            for (double d4 = 1.0; d4 >= -0.5; d4 -= 0.5) {
                for (double d5 = 1.0; d5 >= -0.5; d5 -= 0.5) {
                    akb akb3 = aix.d(c2.TN().v((c2.Us().dtK - c2.Us().dtH) * d4, (c2.Us().dtL - c2.Us().dtI) * d3, (c2.Us().dtM - c2.Us().dtJ) * d5));
                    ce ce3 = aei.c(akb3, d2);
                    if (ce3 == null || ce3.dzu != cf.dzz) continue;
                    return akb3;
                }
            }
        }
        return akb2;
    }

    public static akb a(c c2, a a2, boolean bl2, double d2, boolean bl3) {
        return aix.a(c2, a2, bl2, d2, bl3, 0.0f);
    }

    public static akb a(c c2, a a2, boolean bl2, double d2, boolean bl3, float f2) {
        if (a2 == null || a2.aqW()) {
            return aix.y(c2);
        }
        da da2 = bl2 ? aix.i(a2) : aix.h(a2);
        return aix.h(aix.a(c2, a2, da2, d2, bl3, f2));
    }

    public static da a(c c2, a a2, da da2, double d2, boolean bl2, float f2) {
        if (c2 == null || a2 == null || da2 == null) {
            return da2;
        }
        da da3 = aix.aER.bgK.aQ(1.0f);
        da da4 = aix.i(a2);
        akb akb2 = aix.h(da2);
        akb akb3 = aix.h(da4);
        if (aix.a(akb3, c2, d2, bl2, f2)) {
            return da4;
        }
        da da5 = null;
        double d3 = Double.MAX_VALUE;
        for (da da6 : aix.a(a2, da2)) {
            akb akb4 = aix.h(da6);
            if (!aix.a(akb4, c2, d2, bl2, f2)) continue;
            double d4 = Math.abs(bt.bN(akb4.getX() - akb2.getX()));
            double d5 = Math.abs(akb4.getY() - akb2.getY());
            double d6 = da6.y(da3) + (d4 + d5) * 1.0E-5;
            if (!(d6 < d3)) continue;
            d3 = d6;
            da5 = da6;
        }
        return da5 == null ? da2 : da5;
    }

    public static boolean a(akb akb2, c c2, double d2, boolean bl2) {
        return aix.a(akb2, c2, d2, bl2, 0.0f);
    }

    public static boolean a(akb akb2, c c2, double d2, boolean bl2, float f2) {
        ce ce2 = aei.a(akb2, d2, f2, aix.aER.bgK, bl2);
        return ce2 != null && ce2.dzu == cf.dzz && ce2.dzw == c2;
    }

    private static da h(a a2) {
        double d2 = a2.dtL - a2.dtI;
        double d3 = a2.dtI + Math.max(0.0, Math.min(aix.aER.bgK.gX - a2.dtI + (double)aix.aER.bgK.getEyeHeight(), d2 * 0.9));
        return new da(a2.dtH + (a2.dtK - a2.dtH) / 2.0, d3, a2.dtJ + (a2.dtM - a2.dtJ) / 2.0);
    }

    private static List<da> a(a a2, da da2) {
        double[] dArray = new double[]{0.05, 0.25, 0.5, 0.75, 0.95};
        double[] dArray2 = new double[]{0.05, 0.2, 0.35, 0.5, 0.65, 0.8, 0.95};
        ArrayList<da> arrayList = new ArrayList<da>(dArray.length * dArray2.length * 4 + dArray.length * dArray.length * 2 + 2);
        arrayList.add(da2);
        arrayList.add(aix.h(a2));
        for (double d2 : dArray2) {
            for (double d3 : dArray) {
                arrayList.add(aix.a(a2, 0.01, d2, d3));
                arrayList.add(aix.a(a2, 0.99, d2, d3));
                arrayList.add(aix.a(a2, d3, d2, 0.01));
                arrayList.add(aix.a(a2, d3, d2, 0.99));
            }
        }
        for (double d2 : dArray) {
            for (double d3 : dArray) {
                arrayList.add(aix.a(a2, d2, 0.02, d3));
                arrayList.add(aix.a(a2, d2, 0.98, d3));
            }
        }
        return arrayList;
    }

    private static da a(a a2, double d2, double d3, double d4) {
        return new da(a2.dtH + (a2.dtK - a2.dtH) * d2, a2.dtI + (a2.dtL - a2.dtI) * d3, a2.dtJ + (a2.dtM - a2.dtJ) * d4);
    }

    public static da i(a a2) {
        da da2 = aix.aER.bgK.aQ(1.0f);
        double d2 = 0.03;
        return new da(aix.c(da2.dAG, a2.dtH + 0.03, a2.dtK - 0.03), aix.c(da2.dAH, a2.dtI + 0.03, a2.dtL - 0.03), aix.c(da2.dAI, a2.dtJ + 0.03, a2.dtM - 0.03));
    }

    private static double c(double d2, double d3, double d4) {
        if (d3 > d4) {
            return (d3 + d4) / 2.0;
        }
        return Math.max(d3, Math.min(d4, d2));
    }

    private static boolean z(c c2) {
        return c2 != null && c2.Us() != null && !c2.Us().aqW() && aix.af(c2.gW) && aix.af(c2.gX) && aix.af(c2.gY);
    }

    private static boolean af(double d2) {
        return !Double.isNaN(d2) && !Double.isInfinite(d2);
    }

    public static akb a(da da2, ao ao2) {
        return aix.a(new akd(da2.dAG, da2.dAH, da2.dAI), ao2);
    }

    public static akb h(da da2) {
        return aix.c(aix.aER.bgK.TN().v(0.0, aix.aER.bgK.getEyeHeight(), 0.0), new akd(da2.dAG, da2.dAH, da2.dAI));
    }

    public static akb w(b b2) {
        return aix.c(aix.aER.bgK.TN().v(0.0, aix.aER.bgK.getEyeHeight(), 0.0), new akd(b2.wt(), b2.wu(), b2.wx()).v(0.5, 0.5, 0.5));
    }

    public static akb d(akd akd2) {
        return aix.c(aix.aER.bgK.TN().v(0.0, aix.aER.bgK.getEyeHeight(), 0.0), akd2);
    }

    public static akb a(akd akd2, ao ao2) {
        double d2 = akd2.getX() + 0.5;
        double d3 = akd2.getY() + 0.5;
        double d4 = akd2.getZ() + 0.5;
        return aix.d(new akd(d2 += (double)ao2.asM().wt() * 0.5, d3 += (double)ao2.asM().wu() * 0.5, d4 += (double)ao2.asM().wx() * 0.5));
    }

    public static akb m(akb akb2) {
        akb akb3 = aix.aER.bgK.DD();
        float f2 = (float)((double)aix.aER.aIY.cgq * (1.0 + Math.random() / 1000000.0) * (double)0.6f + (double)0.2f);
        double d2 = (double)(f2 * f2 * f2 * 8.0f) * 0.15;
        float f3 = akb3.x + (float)((double)Math.round((double)(akb2.x - akb3.x) / d2) * d2);
        float f4 = akb3.y + (float)((double)Math.round((double)(akb2.y - akb3.y) / d2) * d2);
        return new akb(f3, bt.I(f4, -90.0f, 90.0f));
    }

    public static akb b(akb akb2, akb akb3) {
        float f2 = (float)((double)aix.aER.aIY.cgq * (1.0 + Math.random() / 1000000.0) * (double)0.6f + (double)0.2f);
        double d2 = (double)(f2 * f2 * f2 * 8.0f) * 0.15;
        float f3 = akb3.x + (float)((double)Math.round((double)(akb2.x - akb3.x) / d2) * d2);
        float f4 = akb3.y + (float)((double)Math.round((double)(akb2.y - akb3.y) / d2) * d2);
        return new akb(f3, bt.I(f4, -90.0f, 90.0f));
    }

    public static akb n(akb akb2) {
        akb akb3 = aix.aER.bgK.DD();
        float f2 = akb3.x + bt.bN(akb2.x - akb3.x);
        float f3 = bt.I(akb2.y, -90.0f, 90.0f);
        return new akb(f2, f3);
    }

    public static akb o(akb akb2) {
        if (akb2 == null) {
            return null;
        }
        float f2 = akb2.x + bt.bN(aix.aER.bgK.pl - akb2.x);
        float f3 = aix.aER.bgK.pm;
        return new akb(f2, f3);
    }

    public static akb d(akb akb2, double d2) {
        return aix.a(bs.fl, akb2, d2);
    }

    public static akb a(akb akb2, akb akb3, double d2) {
        if (d2 != 0.0) {
            double d3;
            double d4 = bt.bN(akb3.x - akb2.x);
            double d5 = Math.sqrt(d4 * d4 + (d3 = (double)(akb3.y - akb2.y)) * d3);
            if (d5 < 1.0E-4) {
                return new akb(0.0f, 0.0f);
            }
            double d6 = Math.abs(d4 / d5);
            double d7 = Math.abs(d3 / d5);
            double d8 = d2 * d6;
            double d9 = d2 * d7;
            float f2 = (float)Math.max(Math.min(d4, d8), -d8);
            float f3 = (float)Math.max(Math.min(d3, d9), -d9);
            return new akb(f2, f3);
        }
        return new akb(0.0f, 0.0f);
    }

    public static akb e(akb akb2, double d2) {
        return aix.b(bs.fl, akb2, d2);
    }

    public static akb b(akb akb2, akb akb3, double d2) {
        float f2 = akb3.x;
        float f3 = akb3.y;
        float f4 = akb2.x;
        float f5 = akb2.y;
        if (d2 != 0.0) {
            akb akb4 = aix.d(akb3, d2);
            f2 = f4 + akb4.x;
            f3 = f5 + akb4.y;
            for (int i2 = 1; i2 <= (int)((double)((float)d.BI() / 20.0f) + Math.random() * 10.0); ++i2) {
                if ((double)(Math.abs(akb4.x) + Math.abs(akb4.y)) > 1.0E-4) {
                    f2 = (float)((double)f2 + (Math.random() - 0.5) / 1000.0);
                    f3 = (float)((double)f3 - Math.random() / 200.0);
                }
                akb akb5 = new akb(f2, f3);
                akb akb6 = aix.m(akb5);
                f2 = akb6.x;
                f3 = Math.max(-90.0f, Math.min(90.0f, akb6.y));
            }
        }
        return new akb(f2, f3);
    }

    @Generated
    private aix() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

