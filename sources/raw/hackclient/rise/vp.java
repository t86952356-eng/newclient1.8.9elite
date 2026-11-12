/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ej;
import hackclient.rise.fh;
import hackclient.rise.fi;
import hackclient.rise.tn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.server.an;
import net.minecraft.util.b;
import net.minecraft.util.bt;

public class vp
extends akg<tn> {
    private float gZ;
    private boolean dk;
    private boolean El;
    private b Em;
    private int En;
    @dm
    public final dk<ej> aku = ej2 -> {
        float f2 = bt.bN(this.gZ);
        bs.d(false);
        bs.a(new akb(this.gZ, 94.0f), 10.0, cb.gH);
    };
    @dm
    public final dk<fi> akv = fi2 -> {
        e e2;
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof e && ((e2 = (e)aj2) instanceof g || e2 instanceof h) && Math.abs(e2.getPitch() - 90.0f) < 0.001f) {
            e2.setPitch(94.0f);
        }
    };
    @dm
    public final dk<fh> akw = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (vp.aER.bgK.aRg >= this.En) {
            this.dk = false;
        }
        if (aj2 instanceof an) {
            an an2 = (an)aj2;
            b b2 = an2.ahk();
            if (!b2.equals(this.Em)) {
                this.Em = b2;
                this.En = vp.aER.bgK.aRg + 10;
            }
            if (this.El) {
                this.dk = true;
                this.El = false;
            }
        }
    };
    @dm
    public final dk<dz> akx = dz2 -> {
        if (this.dk) {
            dz2.setSneak(true);
        }
        if (this.dk) {
            dz2.setForward(0.0f);
        }
    };

    public vp(String string, tn tn2) {
        super(string, tn2);
    }

    @Override
    public void onEnable() {
        this.En = vp.aER.bgK.aRg + 10;
        this.El = true;
        this.dk = true;
        this.d(bu.class);
        ahn.m(new k(bu.bO()));
        this.d(bu.class);
        ahn.m(new k(bu.bO()));
        this.d(bu.class);
        ahn.m(new k(bu.bO()));
        float f2 = bt.bN(this.gZ);
        bs.d(false);
        double d2 = bt.aJ(Math.toDegrees(aii.direction()));
        double d3 = bt.aJ(Math.toDegrees(Math.atan2(vp.aER.bgK.uf, vp.aER.bgK.ud)) - 90.0);
        boolean bl2 = Math.abs(d2 % 90.0) <= 10.0 || Math.abs(d2 % 90.0) >= 80.0;
        double d4 = (double)Math.round(d2 / 45.0) * 45.0;
        vp.aER.bgK.pl = (float)d4;
        afl.c(d2, new Object[0]);
        this.gZ = bl2 && d2 >= -10.0 && d2 <= 100.0 && vp.aER.bgK.aO ? vp.aER.bgK.pl + 43.0f : (bl2 && vp.aER.bgK.aO ? vp.aER.bgK.pl - 43.0f : vp.aER.bgK.pl);
    }
}

