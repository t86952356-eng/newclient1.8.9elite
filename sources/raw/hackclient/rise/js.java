/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bm;
import hackclient.rise.dh;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.ek;
import hackclient.rise.eo;
import hackclient.rise.fd;
import hackclient.rise.fh;
import hackclient.rise.jg;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.material.Material;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.client.h;
import net.minecraft.network.play.server.i;
import net.minecraft.potion.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;

public class js
extends akg<jg> {
    private final akq xs = new akq("Silent Ticks", this, (Number)7, (Number)1, (Number)15, (Number)1);
    private final akq xt = new akq("Teleport Delay", this, (Number)20, (Number)10, (Number)25, (Number)1);
    private final aki xu = new aki("Silent Accept Teleports", (akg<?>)this, (Boolean)true);
    private double xv;
    private boolean xw;
    private static final int xx = 500;
    private int xy;
    @dm
    public final dk<ek> xz = dh::cF;
    @dm
    private final dk<fd> xA = fd2 -> {
        if (js.aER.bgK.aRg - this.xy > ((Number)this.xs.wD()).intValue() && !js.aER.bgK.cIt.cJL) {
            fd2.cF();
        }
        this.xv = this.getBaseMoveSpeed();
    };
    @dm
    public final dk<eo> xB = eo2 -> {};
    @dm
    public final dk<ej> xC = ej2 -> bm.a(1000, true, false, false, false, false, false);
    @dm
    public final dk<ei> xD = ei2 -> {
        if (this.xw && js.aER.bgK.aRg - this.xy >= ((Number)this.xt.wD()).intValue()) {
            this.xw = false;
        }
        double d2 = Math.toRadians(js.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        if (js.aER.bgK.crR) {
            double d5 = js.aER.bgK.gW - d3 * 0.005;
            double d6 = js.aER.bgK.gY + d4 * 0.005;
        } else if (aik.vz()) {
            // empty if block
        }
        if (js.aER.bgK.cIt.cJL) {
            this.xy = js.aER.bgK.aRg;
        }
        if (js.aER.bgK.aRg % ((Number)this.xt.wD()).intValue() == 0 && !js.aER.bgK.cIt.cJL) {
            b b2 = this.s(500);
            if (b2 != null) {
                this.xw = true;
                this.xy = js.aER.bgK.aRg;
                double d7 = b2.wt() + 0;
                double d8 = b2.wu() + 0;
                double d9 = b2.wx() + 0;
                ahn.n(new f(d7 + 0.5, d8, d9 + 0.5, js.aER.bgK.aO));
                ahn.n(new f(js.aER.bgK.gW + js.aER.bgK.ud, js.aER.bgK.gX + js.aER.bgK.ue, js.aER.bgK.gY + js.aER.bgK.uf, js.aER.bgK.aO));
            } else {
                ahn.n(new f(d3 * 9.5, js.aER.bgK.gX, d4 * 9.5, js.aER.bgK.aO));
            }
        }
    };
    @dm
    public final dk<fh> xE = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof i && js.aER.bgK.aRg - this.xy > 0 && !js.aER.bgK.cIt.cJL && ((Boolean)this.xu.wD()).booleanValue()) {
            fh2.setCancelled(true);
            i i2 = (i)aj2;
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = i2.getYaw();
            float f3 = i2.getPitch();
            ahn.n(new h(d2, d3, d4, f2, f3, js.aER.bgK.aO));
            ahn.n(new h(d2, d3, d4, f2, f3, js.aER.bgK.aO));
        }
    };

    public js(String string, jg jg2) {
        super(string, jg2);
    }

    @Override
    public void onEnable() {
        b b2 = this.s(500);
        if (b2 != null) {
            this.xw = true;
            this.xy = js.aER.bgK.aRg;
            double d2 = b2.wt() + 0;
            double d3 = b2.wu() + 0;
            double d4 = b2.wx() + 0;
            ahn.n(new f(d2 + 0.5, d3, d4 + 0.5, js.aER.bgK.aO));
            ahn.n(new f(js.aER.bgK.gW + js.aER.bgK.ud, js.aER.bgK.gX + js.aER.bgK.ue, js.aER.bgK.gY + js.aER.bgK.uf, js.aER.bgK.aO));
        }
        this.xv = 0.0;
    }

    @Override
    public void onDisable() {
    }

    private b s(int n2) {
        double d2 = js.aER.bgK.gW;
        double d3 = js.aER.bgK.gX;
        double d4 = js.aER.bgK.gY;
        int n3 = bt.aF(d3);
        double d5 = Double.MAX_VALUE;
        b b2 = null;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                double d6;
                int n4;
                int n5 = bt.aF(d2) + i2;
                b b3 = new b(n5, n3, n4 = bt.aF(d4) + i3);
                Block block = js.aER.bgF.L(b3).df();
                Material material = block.xb();
                if (!material.zw() || !block.isFullBlock() || block instanceof BlockLeaves || block instanceof BlockSnow || block instanceof BlockWeb || !((d6 = js.aER.bgK.getDistance((double)b3.wt() + 0.5, b3.wu(), (double)b3.wx() + 0.5)) < d5)) continue;
                d5 = d6;
                b2 = b3;
            }
        }
        return b2;
    }

    private double getBaseMoveSpeed() {
        return this.m(0.2873);
    }

    private double m(double d2) {
        if (js.aER.bgK.a(a.dgw)) {
            d2 *= 1.0 + 0.2 * (double)(js.aER.bgK.b(a.dgw).ajf() + 1);
        }
        return d2;
    }
}

