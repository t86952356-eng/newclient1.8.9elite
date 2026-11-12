/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.ei;
import hackclient.rise.eo;
import hackclient.rise.ez;
import hackclient.rise.fh;
import hackclient.rise.mh;
import net.minecraft.init.Blocks;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import net.minecraft.util.bt;

public class qh
extends akg<mh> {
    private static float Qo = 0.0f;
    private static final float Qp = 45.0f;
    private int PR = 0;
    public final aki Qq = new aki("allow more strafing", (akg<?>)this, (Boolean)true);
    @dm
    public final dk<ed> Qr = ed2 -> ++this.PR;
    private double ue;
    private double ud;
    private double uf;
    @dm
    public final dk<fh> Qs = fh2 -> {
        t t2;
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == qh.aER.bgK.getEntityId()) {
            this.ud = (double)t2.agN() / 8000.0;
            this.uf = (double)t2.agP() / 8000.0;
            this.ue = (double)t2.agP() / 8000.0;
        }
    };
    @dm
    public final dk<ez> Qt = ez2 -> {
        double d2 = bt.aJ(Math.toDegrees(aii.direction()));
        double d3 = bt.aJ(Math.toDegrees(Math.atan2(qh.aER.bgK.uf, qh.aER.bgK.ud)) - 90.0);
        double d4 = d2 / 1.4;
        if (qh.aER.bgK.ae > 8) {
            if (qh.aER.bgK.aO) {
                aii.strafe();
            }
            if (ahj.n(d2, d3) < 90.0) {
                aii.strafe();
            } else if (((Boolean)this.Qq.wD()).booleanValue()) {
                aii.strafe(aii.speed() * 0.7);
            }
        }
    };
    @dm
    public final dk<eo> Qu = eo2 -> {
        if (this.PR % 2 != 1 || qh.aER.bgK.aO) {
            // empty if block
        }
        if (qh.aER.bgK.tR == 10) {
            // empty if block
        }
        double d2 = Math.hypot(qh.aER.bgK.ud - (qh.aER.bgK.csh - qh.aER.bgK.csk), qh.aER.bgK.uf - (qh.aER.bgK.csj - qh.aER.bgK.csm));
        if (qh.aER.bgK.ae >= 8 && !qh.aER.bgK.aO && qh.aER.bgK.tR != 1 && (aik.p(0.0, qh.aER.bgK.ue, 0.0) == Blocks.cLc || qh.aER.bgK.tR <= 10) || !qh.aER.bgK.aO && qh.aER.bgK.tR != 1 && aik.p(0.0, qh.aER.bgK.ue, 0.0) == Blocks.cLc || qh.aER.bgK.ae >= 8) {
            // empty if block
        }
    };
    @dm
    public final dk<ei> Qv = ei2 -> {
        if (qh.aER.bgK.ae > 20) {
            // empty if block
        }
        double d2 = aii.roundToGround(ei2.getPosY());
        float f2 = bd.cY;
        if (qh.aER.bgK.aO) {
            qh.aER.bgK.jump();
        }
    };

    public qh(String string, mh mh2) {
        super(string, mh2);
    }

    public static void a(ez ez2, double d2, float f2, float f3, float f4) {
        boolean bl2;
        if (f2 == 0.0f && f3 == 0.0f) {
            return;
        }
        float f5 = f4;
        boolean bl3 = bl2 = f2 < 0.0f;
        float f6 = 90.0f * (f2 > 0.0f ? 0.5f : (bl2 ? -0.5f : 1.0f));
        if (bl2) {
            f5 += 180.0f;
        }
        if (f3 > 0.0f) {
            f5 -= f6;
        } else if (f3 < 0.0f) {
            f5 += f6;
        }
        f5 = (f5 + 360.0f) % 360.0f;
        float f7 = f5 - Qo;
        f7 = (f7 + 180.0f) % 360.0f - 180.0f;
        Qo = Math.abs(f7) < 45.0f ? f5 : (Qo += Math.signum(f7) * 45.0f);
        Qo = (Qo + 360.0f) % 360.0f;
        double d3 = StrictMath.cos(Math.toRadians((double)Qo + 90.0));
        double d4 = StrictMath.cos(Math.toRadians(Qo));
        ez2.setPosX(d3 * d2);
        ez2.setPosZ(d4 * d2);
    }

    @Override
    public void onEnable() {
        this.ud = 0.0;
        this.uf = 0.0;
    }
}

