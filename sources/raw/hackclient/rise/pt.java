/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.dh;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ej;
import hackclient.rise.ek;
import hackclient.rise.es;
import hackclient.rise.ez;
import hackclient.rise.fh;
import hackclient.rise.md;
import hackclient.rise.tn;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.material.Material;
import net.minecraft.entity.c;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import rip.vantage.commons.util.time.a;

public class pt
extends akg<md> {
    public final aki OK = new aki("Smart Mode (if you want it to be always be toggled on)", (akg<?>)this, (Boolean)false);
    public final aki OL = new aki("Silent", (akg<?>)this, (Boolean)false);
    private boolean OD;
    private final a OM = new a();
    private boolean ys;
    private static final int ON = 10;
    private static final double OO = Math.cos(Math.toRadians(130.0));
    @dm
    public final dk<ej> OP = ej2 -> {
        boolean bl2;
        net.minecraft.util.a a2 = pt.aER.bgK.Us().ad(0.05, 0.0, 0.05);
        boolean bl3 = bl2 = !pt.aER.bgF.a((c)pt.aER.bgK, a2).isEmpty();
        if (((pt.aER.bgK.crR && (Boolean)this.OL.wD() != false || pt.aER.bgK.crR && (Boolean)this.OL.wD() == false) && this.OD && pt.aER.bgK.crx > 2 && !pt.aER.aIY.chq.Re() && !this.e(tn.class).isEnabled() && !(pt.aER.bgR instanceof net.minecraft.client.gui.inventory.i) || !((Boolean)this.OK.wD()).booleanValue() && bl2 && this.OD) && !aik.vz()) {
            this.OD = false;
            b b2 = this.u(10);
            if (b2 != null) {
                double d2 = (double)b2.wt() + 0.5;
                double d3 = b2.wu();
                double d4 = (double)b2.wx() + 0.5;
                ahn.n(new f(d2, d3, d4, pt.aER.bgK.aO));
            } else {
                ahn.n(new f(pt.aER.bgK.gW + 0.5, pt.aER.bgK.gX, pt.aER.bgK.gY + 0.5, pt.aER.bgK.aO));
            }
        }
    };
    @dm
    public final dk<fh> OQ = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i && !this.OD && (!((Boolean)this.OL.wD()).booleanValue() || aik.vz())) {
            i i2 = (i)aj2;
            fh2.cF();
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = i2.getYaw();
            float f3 = i2.getPitch();
            this.OD = true;
            ahn.n(new h(d2, d3, d4, f2, f3, pt.aER.bgK.aO));
            if (!((Boolean)this.OL.wD()).booleanValue()) {
                pt.aER.bgK.setPosition(d2, d3, d4);
            }
        }
    };
    @dm
    public final dk<ez> OR = ez2 -> {
        if (!this.OD && !((Boolean)this.OL.wD()).booleanValue()) {
            ez2.setPosZ(0.0);
            ez2.setPosX(0.0);
        }
    };
    @dm
    public final dk<es> OS = es2 -> {
        b b2;
        b b3;
        if (!this.OD && es2.df() instanceof Block && ((Boolean)this.OL.wD()).booleanValue() && !(b3 = es2.dg()).equals(b2 = new b(bt.aF(pt.aER.bgK.gW), (int)(pt.aER.bgK.Us().dtI - 0.49), bt.aF(pt.aER.bgK.gY))) && ((Boolean)this.OL.wD()).booleanValue()) {
            if (aik.vz()) {
                aii.strafe(-0.1);
            }
            es2.cF();
        }
    };
    @dm
    public final dk<dz> OT = dz2 -> {
        if (!this.OD) {
            // empty if block
        }
    };
    @dm
    public final dk<ek> OU = dh::cF;

    public pt(String string, md md2) {
        super(string, md2);
    }

    private boolean e(double d2, double d3) {
        double d4 = pt.aER.bgK.gW;
        double d5 = pt.aER.bgK.gY;
        float f2 = pt.aER.bgK.pl;
        double d6 = Math.toRadians(f2);
        double d7 = -Math.sin(d6);
        double d8 = Math.cos(d6);
        double d9 = d2 - d4;
        double d10 = d3 - d5;
        double d11 = d7 * d9 + d8 * d10;
        double d12 = Math.sqrt(d7 * d7 + d8 * d8);
        double d13 = Math.sqrt(d9 * d9 + d10 * d10);
        if (d13 < 1.0E-8) {
            return false;
        }
        double d14 = d11 / (d12 * d13);
        return d14 <= OO;
    }

    private b u(int n2) {
        double d2 = pt.aER.bgK.gW;
        double d3 = pt.aER.bgK.gX;
        double d4 = pt.aER.bgK.gY;
        int n3 = bt.aF(d3);
        double d5 = Double.MAX_VALUE;
        b b2 = null;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                for (int i4 = -n2; i4 <= n2; ++i4) {
                    double d6;
                    int n4;
                    int n5;
                    int n6 = bt.aF(d2) + i2;
                    b b3 = new b(n6, n5 = n3 + i3, n4 = bt.aF(d4) + i4);
                    Block block = pt.aER.bgF.L(b3).df();
                    Material material = block.xb();
                    if (!material.zw() || !block.isFullBlock() || block instanceof BlockLeaves || block instanceof BlockSnow || !((d6 = pt.aER.bgK.getDistance((double)b3.wt() + 0.5, (double)b3.wu() + 0.5, (double)b3.wx() + 0.5)) >= 1.0) || !(d6 <= 10.0) || !this.e((double)b3.wt() + 0.5, (double)b3.wx() + 0.5) || !(d6 < d5)) continue;
                    d5 = d6;
                    b2 = b3;
                }
            }
        }
        return b2;
    }

    @Override
    public void onEnable() {
        this.OD = true;
    }
}

