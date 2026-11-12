/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.bm;
import hackclient.rise.dh;
import hackclient.rise.ek;
import hackclient.rise.fd;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.material.Material;
import net.minecraft.network.play.client.f;
import net.minecraft.potion.a;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.value.NumberValue;

public final class MiniBloxMode
extends Mode<Speed> {
    private final NumberValue Pq = new NumberValue("Speed", this, (Number)4, (Number)1, (Number)9.5, (Number)0.1);
    private double xv;
    private boolean xw;
    private static final int Pr = 500;
    private int xy;
    @EventLink
    public final Listener<ek> Ps = dh::cF;
    @EventLink
    private final Listener<fd> Pt = fd2 -> {
        if (MiniBloxMode.aER.bgK.aRg - this.xy > 7) {
            afl.c("silently accepted", new Object[0]);
            fd2.cF();
        }
        this.xv = this.getBaseMoveSpeed();
    };
    @EventLink
    public final Listener<StrafeEvent> Pu = strafeEvent -> {
        aii.useDiagonalSpeed();
        if (MiniBloxMode.aER.bgK.aO && aii.isMoving()) {
            MiniBloxMode.aER.bgK.jump();
            MiniBloxMode.aER.bgK.ue = 0.399;
        }
        if (this.xw && MiniBloxMode.aER.bgK.Zz > 0) {
            aii.strafe(this.getBaseMoveSpeed() * (double)((Number)this.Pq.wD()).floatValue());
        } else if (MiniBloxMode.aER.bgK.Zz > 0) {
            aii.strafe(this.getBaseMoveSpeed() * 1.24);
        }
    };
    @EventLink
    public final Listener<PreUpdateEvent> Pv = preUpdateEvent -> bm.a(25000, true, false, false, false, false, false);
    @EventLink
    public final Listener<PreMotionEvent> Pw = preMotionEvent -> {
        if (this.xw && MiniBloxMode.aER.bgK.aRg - this.xy >= 24) {
            this.xw = false;
        }
        double d2 = Math.toRadians(MiniBloxMode.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        if (MiniBloxMode.aER.bgK.crR) {
            double d5 = MiniBloxMode.aER.bgK.gW - d3 * 0.005;
            double d6 = MiniBloxMode.aER.bgK.gY + d4 * 0.005;
        } else if (aik.vz()) {
            // empty if block
        }
        if (MiniBloxMode.aER.bgK.aRg % 24 == 0) {
            afl.c("payload sent", new Object[0]);
            b b2 = this.s(500);
            if (b2 != null) {
                this.xw = true;
                this.xy = MiniBloxMode.aER.bgK.aRg;
                double d7 = b2.wt() + 0;
                double d8 = b2.wu() + 0;
                double d9 = b2.wx() + 0;
                ahn.n(new f(d7 + 0.5, d8, d9 + 0.5, MiniBloxMode.aER.bgK.aO));
                ahn.n(new f(MiniBloxMode.aER.bgK.gW + MiniBloxMode.aER.bgK.ud, MiniBloxMode.aER.bgK.gX + MiniBloxMode.aER.bgK.ue, MiniBloxMode.aER.bgK.gY + MiniBloxMode.aER.bgK.uf, MiniBloxMode.aER.bgK.aO));
            } else {
                ahn.n(new f(d3 * 9.5, MiniBloxMode.aER.bgK.gX, d4 * 9.5, MiniBloxMode.aER.bgK.aO));
            }
        }
    };

    public MiniBloxMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onEnable() {
        b b2 = this.s(500);
        if (b2 != null) {
            this.xw = true;
            this.xy = MiniBloxMode.aER.bgK.aRg;
            double d2 = b2.wt() + 0;
            double d3 = b2.wu() + 0;
            double d4 = b2.wx() + 0;
            ahn.n(new f(d2 + 0.5, d3, d4 + 0.5, MiniBloxMode.aER.bgK.aO));
            ahn.n(new f(MiniBloxMode.aER.bgK.gW + MiniBloxMode.aER.bgK.ud, MiniBloxMode.aER.bgK.gX + MiniBloxMode.aER.bgK.ue, MiniBloxMode.aER.bgK.gY + MiniBloxMode.aER.bgK.uf, MiniBloxMode.aER.bgK.aO));
        }
        this.xv = 0.0;
    }

    @Override
    public void onDisable() {
        aii.stop();
    }

    private b s(int n2) {
        double d2 = MiniBloxMode.aER.bgK.gW;
        double d3 = MiniBloxMode.aER.bgK.gX;
        double d4 = MiniBloxMode.aER.bgK.gY;
        int n3 = bt.aF(d3);
        double d5 = Double.MAX_VALUE;
        b b2 = null;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                double d6;
                int n4;
                int n5 = bt.aF(d2) + i2;
                b b3 = new b(n5, n3, n4 = bt.aF(d4) + i3);
                Block block = MiniBloxMode.aER.bgF.L(b3).df();
                Material material = block.xb();
                if (!material.zw() || !block.isFullBlock() || block instanceof BlockLeaves || block instanceof BlockSnow || !((d6 = MiniBloxMode.aER.bgK.getDistance((double)b3.wt() + 0.5, b3.wu(), (double)b3.wx() + 0.5)) < d5)) continue;
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
        if (MiniBloxMode.aER.bgK.a(a.dgw)) {
            d2 *= 1.0 + 0.2 * (double)(MiniBloxMode.aER.bgK.b(a.dgw).ajf() + 1);
        }
        return d2;
    }
}

