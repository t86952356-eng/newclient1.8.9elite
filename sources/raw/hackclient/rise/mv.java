/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dh;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.ek;
import hackclient.rise.eo;
import hackclient.rise.es;
import hackclient.rise.fd;
import hackclient.rise.fi;
import hackclient.rise.lw;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.f;
import net.minecraft.util.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;

public class mv
extends akg<lw> {
    private final akq Fs = new akq("Speed", this, (Number)5, (Number)5, (Number)9.5, (Number)0.1);
    private akd Ft;
    private akb ka;
    private static final int Fu = 50;
    private boolean zd;
    @dm
    public final dk<ei> Fv = ei2 -> {
        double d2 = Math.toRadians(mv.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        if (mv.aER.bgK.crR) {
            mv.aER.bgK.setPosition(mv.aER.bgK.gW - d3 * 0.005, mv.aER.bgK.gX, mv.aER.bgK.gY + d4 * 0.005);
        } else if (aik.vz()) {
            ahn.n(new f(mv.aER.bgK.gW - d3 * 9.5, mv.aER.bgK.gX, mv.aER.bgK.gY + d4 * 9.5, true));
            mv.aER.bgK.ud *= 0.3;
            mv.aER.bgK.uf *= 0.3;
        }
        if (mv.aER.bgK.aRg % 20 == 0) {
            b b2 = this.s(50);
            if (b2 != null) {
                mv.aER.bgK.setPosition((double)b2.wt() + 0.5, b2.wu(), (double)b2.wx() + 0.5);
                this.zd = true;
            }
        } else if (this.zd) {
            this.zd = false;
        }
        float f2 = ((Number)this.Fs.wD()).floatValue();
        mv.aER.bgK.ue = 0.0 + (mv.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (mv.aER.aIY.chr.Re() ? (double)f2 : 0.0);
    };
    @dm
    public final dk<eo> Fw = eo2 -> {
        float f2 = ((Number)this.Fs.wD()).floatValue();
        eo2.setSpeed(f2);
    };
    @dm
    public final dk<fd> Fx = fd2 -> {};
    @dm
    public final dk<fi> Fy = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof e) {
            // empty if block
        }
    };
    @dm
    public final dk<ek> Fz = dh::cF;
    @dm
    public final dk<ej> FA = ej2 -> {};
    @dm
    public final dk<es> FB = es2 -> {
        if (es2.df() instanceof BlockAir) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < mv.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };

    public mv(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onDisable() {
        aii.stop();
        b b2 = this.s(50);
        if (b2 != null) {
            mv.aER.bgK.setPosition((double)b2.wt() + 0.51, b2.wu(), (double)b2.wx() + 0.51);
        }
        double d2 = Math.toRadians(mv.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        mv.aER.bgC.dAp = 0.2f;
    }

    @Override
    public void onEnable() {
        afl.b("try to clip through a block on disable", new Object[0]);
        b b2 = this.s(50);
        if (b2 != null) {
            mv.aER.bgK.setPosition((double)b2.wt() + 0.51, b2.wu(), (double)b2.wx() + 0.51);
        }
        mv.aER.bgC.dAp = 0.2f;
    }

    private b s(int n2) {
        double d2 = mv.aER.bgK.gW;
        double d3 = mv.aER.bgK.gX;
        double d4 = mv.aER.bgK.gY;
        int n3 = bt.aF(d3);
        double d5 = Double.MAX_VALUE;
        b b2 = null;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                double d6;
                int n4;
                int n5 = bt.aF(d2) + i2;
                b b3 = new b(n5, n3, n4 = bt.aF(d4) + i3);
                Block block = mv.aER.bgF.L(b3).df();
                Material material = block.xb();
                if (!material.zw() || !block.isFullBlock() || block instanceof BlockLeaves || !((d6 = mv.aER.bgK.getDistance((double)b3.wt() + 0.5, b3.wu(), (double)b3.wx() + 0.5)) < d5)) continue;
                d5 = d6;
                b2 = b3;
            }
        }
        return b2;
    }
}

