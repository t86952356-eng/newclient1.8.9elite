/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aix;
import hackclient.rise.akb;
import hackclient.rise.am;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.fp;
import java.util.function.Function;
import lombok.Generated;
import net.minecraft.util.bt;

public final class bs
extends am {
    private static boolean dj;
    private static boolean fj;
    public static akb fk;
    public static akb fl;
    public static akb fm;
    public static akb fn;
    private static double fo;
    private static cb fp;
    private static Function<akb, Boolean> fq;
    private static boolean fr;
    private static boolean fs;
    private static float ft;
    private static final akb fu;
    @dm(cH=0)
    public final dk<ej> fv = ej2 -> {
        if (!dj || fk == null || fl == null || fm == null || fn == null) {
            fm = fn = new akb(bs.aER.bgK.pl, bs.aER.bgK.pm);
            fl = fn;
            fk = fn;
        }
        if (dj) {
            bs.bJ();
        }
        if (fp == cb.gJ && dj && Math.abs((double)(bs.fk.x % 360.0f) - Math.toDegrees(aii.direction()) % 360.0) > 45.0) {
            bs.aER.aIY.chs.ay(false);
            bs.aER.bgK.setSprinting(false);
        }
    };
    @dm(cH=1)
    public final dk<dz> fw = dz2 -> {
        if (dj && fp == cb.gH && fk != null) {
            float f2 = bs.fk.x;
            aii.a(dz2, f2);
        }
    };
    @dm(cH=0)
    public final dk<fp> fx = fp2 -> {
        if (dj && fk != null && fs) {
            fp2.a(fk);
        }
    };
    @dm(cH=0)
    public final dk<eo> fy = eo2 -> {
        if (dj && (fp == cb.gH || fp == cb.gI) && fk != null) {
            eo2.setYaw(bs.fk.x);
        }
    };
    @dm(cH=0)
    public final dk<ed> fz = ed2 -> {
        if (dj && (fp == cb.gH || fp == cb.gI || fp == cb.gJ) && fk != null) {
            ed2.setYaw(bs.fk.x);
        }
    };
    @dm(cH=0)
    public final dk<ei> fA = ei2 -> {
        if (dj && fk != null) {
            boolean bl2;
            float f2 = bs.fk.x;
            float f3 = bs.fk.y;
            ei2.setYaw(f2);
            ei2.setPitch(f3);
            bs.aER.bgK.pn = f2;
            bs.aER.bgK.po = f3;
            if (!fr) {
                bs.aER.bgK.pl = f2;
                bs.aER.bgK.pm = f3;
            }
            fn = new akb(f2, f3);
            boolean bl3 = bl2 = Math.abs((bs.fk.x - bs.aER.bgK.pl) % 360.0f) < 1.0f && Math.abs(bs.fk.y - bs.aER.bgK.pm) < 1.0f;
            if (bl2) {
                dj = false;
                if (fr) {
                    this.bI();
                }
            }
            fl = fk;
        } else {
            fl = new akb(bs.aER.bgK.pl, bs.aER.bgK.pm);
        }
        fm = new akb(bs.aER.bgK.pl, bs.aER.bgK.pm);
        fj = false;
    };

    public static void a(akb akb2, double d2, cb cb2) {
        bs.a(akb2, d2, cb2, null, true);
    }

    public static void a(akb akb2, double d2, cb cb2, Function<akb, Boolean> function) {
        bs.a(akb2, d2, cb2, function, true);
    }

    public static void a(akb akb2, double d2, cb cb2, Function<akb, Boolean> function, boolean bl2) {
        bs.a(akb2, d2, cb2, function, bl2, true);
    }

    public static void a(akb akb2, double d2, cb cb2, Function<akb, Boolean> function, boolean bl2, boolean bl3) {
        fm = akb2;
        fo = d2 * 36.0;
        fp = cb2;
        fq = function;
        fr = bl2;
        fs = bl3;
        dj = true;
        bs.bJ();
    }

    public static akb bH() {
        return dj && fl != null ? fl : new akb(bs.aER.bgK.pl, bs.aER.bgK.pm);
    }

    private void bI() {
        akb akb2 = new akb(bs.aER.bgK.pl, bs.aER.bgK.pm);
        akb akb3 = aix.o(aix.b(akb2, fl));
        bs.aER.bgK.pl = akb3.x;
        bs.aER.bgK.pm = akb3.y;
    }

    public static void bJ() {
        if (!fj) {
            float f2 = bs.fm.x;
            float f3 = bs.fm.y;
            if (fq != null && (Math.abs(f2 - bs.fk.x) > 5.0f || Math.abs(f3 - bs.fk.y) > 5.0f)) {
                akb akb2 = new akb(fm.getX(), fm.getY());
                double d2 = Math.random() * Math.random() * Math.random() * 20.0;
                fu.setX((float)((double)fu.getX() + (double)(-bt.bx((float)Math.toRadians(ft += (float)((20.0 + (Math.random() - 0.5) * (Math.random() * Math.random() * Math.random() * 360.0)) * (double)(bs.aER.bgK.aRg / 10 % 2 == 0 ? -1 : 1))))) * d2));
                fu.setY((float)((double)fu.getY() + (double)bt.bB((float)Math.toRadians(ft)) * d2));
                float f4 = f2 + fu.getX();
                float f5 = f3 + fu.getY();
                if (!fq.apply(new akb(f4, f5)).booleanValue()) {
                    ft = (float)Math.toDegrees(Math.atan2(akb2.getX() - f4, f5 - akb2.getY())) - 180.0f;
                    f4 = f2;
                    f5 = f3;
                    fu.setX((float)((double)fu.getX() + (double)(-bt.bx((float)Math.toRadians(ft))) * d2));
                    fu.setY((float)((double)fu.getY() + (double)bt.bB((float)Math.toRadians(ft)) * d2));
                    f4 += fu.getX();
                    f5 += fu.getY();
                }
                if (!fq.apply(new akb(f4, f5)).booleanValue()) {
                    fu.setX(0.0f);
                    fu.setY(0.0f);
                    f4 = (float)((double)bs.fm.x + Math.random() * 2.0);
                    f5 = (float)((double)bs.fm.y + Math.random() * 2.0);
                }
                f2 = f4;
                f3 = f5;
            }
            fk = aix.e(new akb(f2, f3), fo + Math.random());
            if (fp == cb.gH || fp == cb.gI) {
                bs.aER.bgK.pp = bs.fk.x;
            }
            bs.aER.bgK.pq = bs.fk.x;
        }
        fj = true;
        if (fs) {
            bs.aER.bgT.al(1.0f);
        }
    }

    @Generated
    public static void c(boolean bl2) {
        dj = bl2;
    }

    @Generated
    public static void d(boolean bl2) {
        fj = bl2;
    }

    @Generated
    public static boolean bd() {
        return dj;
    }

    @Generated
    public static boolean bK() {
        return fj;
    }

    static {
        fl = new akb(0.0f, 0.0f);
        fr = true;
        fs = true;
        fu = new akb(0.0f, 0.0f);
    }
}

