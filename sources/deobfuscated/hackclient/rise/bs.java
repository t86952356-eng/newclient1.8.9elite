/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.aix;
import hackclient.rise.am;
import hackclient.rise.cb;
import hackclient.rise.fp;
import java.util.function.Function;
import lombok.Generated;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.util.math.Vector2f;

public final class bs
extends am {
    private static boolean dj;
    private static boolean fj;
    public static Vector2f fk;
    public static Vector2f fl;
    public static Vector2f fm;
    public static Vector2f fn;
    private static double fo;
    private static cb fp;
    private static Function<Vector2f, Boolean> fq;
    private static boolean fr;
    private static boolean fs;
    private static float ft;
    private static final Vector2f fu;
    @EventLink(cH=0)
    public final Listener<PreUpdateEvent> fv = preUpdateEvent -> {
        if (!dj || fk == null || fl == null || fm == null || fn == null) {
            fm = fn = new Vector2f(bs.aER.bgK.pl, bs.aER.bgK.pm);
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
    @EventLink(cH=1)
    public final Listener<MoveInputEvent> fw = moveInputEvent -> {
        if (dj && fp == cb.gH && fk != null) {
            float f2 = bs.fk.x;
            aii.a(moveInputEvent, f2);
        }
    };
    @EventLink(cH=0)
    public final Listener<fp> fx = fp2 -> {
        if (dj && fk != null && fs) {
            fp2.a(fk);
        }
    };
    @EventLink(cH=0)
    public final Listener<StrafeEvent> fy = strafeEvent -> {
        if (dj && (fp == cb.gH || fp == cb.gI) && fk != null) {
            strafeEvent.setYaw(bs.fk.x);
        }
    };
    @EventLink(cH=0)
    public final Listener<JumpEvent> fz = jumpEvent -> {
        if (dj && (fp == cb.gH || fp == cb.gI || fp == cb.gJ) && fk != null) {
            jumpEvent.setYaw(bs.fk.x);
        }
    };
    @EventLink(cH=0)
    public final Listener<PreMotionEvent> fA = preMotionEvent -> {
        if (dj && fk != null) {
            boolean bl2;
            float f2 = bs.fk.x;
            float f3 = bs.fk.y;
            preMotionEvent.setYaw(f2);
            preMotionEvent.setPitch(f3);
            bs.aER.bgK.pn = f2;
            bs.aER.bgK.po = f3;
            if (!fr) {
                bs.aER.bgK.pl = f2;
                bs.aER.bgK.pm = f3;
            }
            fn = new Vector2f(f2, f3);
            boolean bl3 = bl2 = Math.abs((bs.fk.x - bs.aER.bgK.pl) % 360.0f) < 1.0f && Math.abs(bs.fk.y - bs.aER.bgK.pm) < 1.0f;
            if (bl2) {
                dj = false;
                if (fr) {
                    this.bI();
                }
            }
            fl = fk;
        } else {
            fl = new Vector2f(bs.aER.bgK.pl, bs.aER.bgK.pm);
        }
        fm = new Vector2f(bs.aER.bgK.pl, bs.aER.bgK.pm);
        fj = false;
    };

    public static void a(Vector2f vector2f, double d2, cb cb2) {
        bs.a(vector2f, d2, cb2, null, true);
    }

    public static void a(Vector2f vector2f, double d2, cb cb2, Function<Vector2f, Boolean> function) {
        bs.a(vector2f, d2, cb2, function, true);
    }

    public static void a(Vector2f vector2f, double d2, cb cb2, Function<Vector2f, Boolean> function, boolean bl2) {
        bs.a(vector2f, d2, cb2, function, bl2, true);
    }

    public static void a(Vector2f vector2f, double d2, cb cb2, Function<Vector2f, Boolean> function, boolean bl2, boolean bl3) {
        fm = vector2f;
        fo = d2 * 36.0;
        fp = cb2;
        fq = function;
        fr = bl2;
        fs = bl3;
        dj = true;
        bs.bJ();
    }

    public static Vector2f bH() {
        return dj && fl != null ? fl : new Vector2f(bs.aER.bgK.pl, bs.aER.bgK.pm);
    }

    private void bI() {
        Vector2f vector2f = new Vector2f(bs.aER.bgK.pl, bs.aER.bgK.pm);
        Vector2f vector2f2 = aix.o(aix.b(vector2f, fl));
        bs.aER.bgK.pl = vector2f2.x;
        bs.aER.bgK.pm = vector2f2.y;
    }

    public static void bJ() {
        if (!fj) {
            float f2 = bs.fm.x;
            float f3 = bs.fm.y;
            if (fq != null && (Math.abs(f2 - bs.fk.x) > 5.0f || Math.abs(f3 - bs.fk.y) > 5.0f)) {
                Vector2f vector2f = new Vector2f(fm.getX(), fm.getY());
                double d2 = Math.random() * Math.random() * Math.random() * 20.0;
                fu.setX((float)((double)fu.getX() + (double)(-bt.bx((float)Math.toRadians(ft += (float)((20.0 + (Math.random() - 0.5) * (Math.random() * Math.random() * Math.random() * 360.0)) * (double)(bs.aER.bgK.aRg / 10 % 2 == 0 ? -1 : 1))))) * d2));
                fu.setY((float)((double)fu.getY() + (double)bt.bB((float)Math.toRadians(ft)) * d2));
                float f4 = f2 + fu.getX();
                float f5 = f3 + fu.getY();
                if (!fq.apply(new Vector2f(f4, f5)).booleanValue()) {
                    ft = (float)Math.toDegrees(Math.atan2(vector2f.getX() - f4, f5 - vector2f.getY())) - 180.0f;
                    f4 = f2;
                    f5 = f3;
                    fu.setX((float)((double)fu.getX() + (double)(-bt.bx((float)Math.toRadians(ft))) * d2));
                    fu.setY((float)((double)fu.getY() + (double)bt.bB((float)Math.toRadians(ft)) * d2));
                    f4 += fu.getX();
                    f5 += fu.getY();
                }
                if (!fq.apply(new Vector2f(f4, f5)).booleanValue()) {
                    fu.setX(0.0f);
                    fu.setY(0.0f);
                    f4 = (float)((double)bs.fm.x + Math.random() * 2.0);
                    f5 = (float)((double)bs.fm.y + Math.random() * 2.0);
                }
                f2 = f4;
                f3 = f5;
            }
            fk = aix.e(new Vector2f(f2, f3), fo + Math.random());
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
        fl = new Vector2f(0.0f, 0.0f);
        fr = true;
        fs = true;
        fu = new Vector2f(0.0f, 0.0f);
    }
}

