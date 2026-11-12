/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akg;
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
import hackclient.rise.mh;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.material.Material;
import net.minecraft.network.play.client.f;
import net.minecraft.potion.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;

public final class qb
extends akg<mh> {
    private final akq Pq = new akq("Speed", this, (Number)4, (Number)1, (Number)9.5, (Number)0.1);
    private double xv;
    private boolean xw;
    private static final int Pr = 500;
    private int xy;
    @dm
    public final dk<ek> Ps = dh::cF;
    @dm
    private final dk<fd> Pt = fd2 -> {
        if (qb.aER.bgK.aRg - this.xy > 7) {
            afl.c("silently accepted", new Object[0]);
            fd2.cF();
        }
        this.xv = this.getBaseMoveSpeed();
    };
    @dm
    public final dk<eo> Pu = eo2 -> {
        aii.useDiagonalSpeed();
        if (qb.aER.bgK.aO && aii.isMoving()) {
            qb.aER.bgK.jump();
            qb.aER.bgK.ue = 0.399;
        }
        if (this.xw && qb.aER.bgK.Zz > 0) {
            aii.strafe(this.getBaseMoveSpeed() * (double)((Number)this.Pq.wD()).floatValue());
        } else if (qb.aER.bgK.Zz > 0) {
            aii.strafe(this.getBaseMoveSpeed() * 1.24);
        }
    };
    @dm
    public final dk<ej> Pv = ej2 -> bm.a(25000, true, false, false, false, false, false);
    @dm
    public final dk<ei> Pw = ei2 -> {
        if (this.xw && qb.aER.bgK.aRg - this.xy >= 24) {
            this.xw = false;
        }
        double d2 = Math.toRadians(qb.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        if (qb.aER.bgK.crR) {
            double d5 = qb.aER.bgK.gW - d3 * 0.005;
            double d6 = qb.aER.bgK.gY + d4 * 0.005;
        } else if (aik.vz()) {
            // empty if block
        }
        if (qb.aER.bgK.aRg % 24 == 0) {
            afl.c("payload sent", new Object[0]);
            b b2 = this.s(500);
            if (b2 != null) {
                this.xw = true;
                this.xy = qb.aER.bgK.aRg;
                double d7 = b2.wt() + 0;
                double d8 = b2.wu() + 0;
                double d9 = b2.wx() + 0;
                ahn.n(new f(d7 + 0.5, d8, d9 + 0.5, qb.aER.bgK.aO));
                ahn.n(new f(qb.aER.bgK.gW + qb.aER.bgK.ud, qb.aER.bgK.gX + qb.aER.bgK.ue, qb.aER.bgK.gY + qb.aER.bgK.uf, qb.aER.bgK.aO));
            } else {
                ahn.n(new f(d3 * 9.5, qb.aER.bgK.gX, d4 * 9.5, qb.aER.bgK.aO));
            }
        }
    };

    public qb(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onEnable() {
        b b2 = this.s(500);
        if (b2 != null) {
            this.xw = true;
            this.xy = qb.aER.bgK.aRg;
            double d2 = b2.wt() + 0;
            double d3 = b2.wu() + 0;
            double d4 = b2.wx() + 0;
            ahn.n(new f(d2 + 0.5, d3, d4 + 0.5, qb.aER.bgK.aO));
            ahn.n(new f(qb.aER.bgK.gW + qb.aER.bgK.ud, qb.aER.bgK.gX + qb.aER.bgK.ue, qb.aER.bgK.gY + qb.aER.bgK.uf, qb.aER.bgK.aO));
        }
        this.xv = 0.0;
    }

    @Override
    public void onDisable() {
        aii.stop();
    }

    private b s(int n2) {
        double d2 = qb.aER.bgK.gW;
        double d3 = qb.aER.bgK.gX;
        double d4 = qb.aER.bgK.gY;
        int n3 = bt.aF(d3);
        double d5 = Double.MAX_VALUE;
        b b2 = null;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                double d6;
                int n4;
                int n5 = bt.aF(d2) + i2;
                b b3 = new b(n5, n3, n4 = bt.aF(d4) + i3);
                Block block = qb.aER.bgF.L(b3).df();
                Material material = block.xb();
                if (!material.zw() || !block.isFullBlock() || block instanceof BlockLeaves || block instanceof BlockSnow || !((d6 = qb.aER.bgK.getDistance((double)b3.wt() + 0.5, b3.wu(), (double)b3.wx() + 0.5)) < d5)) continue;
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
        if (qb.aER.bgK.a(a.dgw)) {
            d2 *= 1.0 + 0.2 * (double)(qb.aER.bgK.b(a.dgw).ajf() + 1);
        }
        return d2;
    }
}

