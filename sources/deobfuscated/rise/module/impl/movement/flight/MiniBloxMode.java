/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.flight;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.akd;
import hackclient.rise.dh;
import hackclient.rise.ek;
import hackclient.rise.es;
import hackclient.rise.fd;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Flight;
import rise.util.math.Vector2f;
import rise.value.NumberValue;

public class MiniBloxMode
extends Mode<Flight> {
    private final NumberValue Fs = new NumberValue("Speed", this, (Number)5, (Number)5, (Number)9.5, (Number)0.1);
    private akd Ft;
    private Vector2f ka;
    private static final int Fu = 50;
    private boolean zd;
    @EventLink
    public final Listener<PreMotionEvent> Fv = preMotionEvent -> {
        double d2 = Math.toRadians(MiniBloxMode.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        if (MiniBloxMode.aER.bgK.crR) {
            MiniBloxMode.aER.bgK.setPosition(MiniBloxMode.aER.bgK.gW - d3 * 0.005, MiniBloxMode.aER.bgK.gX, MiniBloxMode.aER.bgK.gY + d4 * 0.005);
        } else if (aik.vz()) {
            ahn.n(new f(MiniBloxMode.aER.bgK.gW - d3 * 9.5, MiniBloxMode.aER.bgK.gX, MiniBloxMode.aER.bgK.gY + d4 * 9.5, true));
            MiniBloxMode.aER.bgK.ud *= 0.3;
            MiniBloxMode.aER.bgK.uf *= 0.3;
        }
        if (MiniBloxMode.aER.bgK.aRg % 20 == 0) {
            b b2 = this.s(50);
            if (b2 != null) {
                MiniBloxMode.aER.bgK.setPosition((double)b2.wt() + 0.5, b2.wu(), (double)b2.wx() + 0.5);
                this.zd = true;
            }
        } else if (this.zd) {
            this.zd = false;
        }
        float f2 = ((Number)this.Fs.wD()).floatValue();
        MiniBloxMode.aER.bgK.ue = 0.0 + (MiniBloxMode.aER.aIY.chq.Re() ? (double)f2 : 0.0) - (MiniBloxMode.aER.aIY.chr.Re() ? (double)f2 : 0.0);
    };
    @EventLink
    public final Listener<StrafeEvent> Fw = strafeEvent -> {
        float f2 = ((Number)this.Fs.wD()).floatValue();
        strafeEvent.setSpeed(f2);
    };
    @EventLink
    public final Listener<fd> Fx = fd2 -> {};
    @EventLink
    public final Listener<PacketSendEvent> Fy = packetSendEvent -> {
        aj<?> aj2 = packetSendEvent.dq();
        if (aj2 instanceof e) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<ek> Fz = dh::cF;
    @EventLink
    public final Listener<PreUpdateEvent> FA = preUpdateEvent -> {};
    @EventLink
    public final Listener<es> FB = es2 -> {
        if (es2.df() instanceof BlockAir) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < MiniBloxMode.aER.bgK.gX) {
                es2.a(a.h(-15.0, -1.0, -15.0, 15.0, 1.0, 15.0).ae(d2, d3, d4));
            }
        }
    };

    public MiniBloxMode(String string, Flight flight) {
        super(string, flight);
    }

    @Override
    public void onDisable() {
        aii.stop();
        b b2 = this.s(50);
        if (b2 != null) {
            MiniBloxMode.aER.bgK.setPosition((double)b2.wt() + 0.51, b2.wu(), (double)b2.wx() + 0.51);
        }
        double d2 = Math.toRadians(MiniBloxMode.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        MiniBloxMode.aER.bgC.dAp = 0.2f;
    }

    @Override
    public void onEnable() {
        afl.b("try to clip through a block on disable", new Object[0]);
        b b2 = this.s(50);
        if (b2 != null) {
            MiniBloxMode.aER.bgK.setPosition((double)b2.wt() + 0.51, b2.wu(), (double)b2.wx() + 0.51);
        }
        MiniBloxMode.aER.bgC.dAp = 0.2f;
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
                if (!material.zw() || !block.isFullBlock() || block instanceof BlockLeaves || !((d6 = MiniBloxMode.aER.bgK.getDistance((double)b3.wt() + 0.5, b3.wu(), (double)b3.wx() + 0.5)) < d5)) continue;
                d5 = d6;
                b2 = b3;
            }
        }
        return b2;
    }
}

