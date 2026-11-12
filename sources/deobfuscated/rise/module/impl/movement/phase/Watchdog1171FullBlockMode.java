/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.phase;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.dh;
import hackclient.rise.ek;
import hackclient.rise.es;
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
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.event.impl.MoveInputEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreUpdateEvent;
import rise.module.Mode;
import rise.module.impl.movement.Phase;
import rise.module.impl.player.Scaffold;
import rise.value.BooleanValue;

public class Watchdog1171FullBlockMode
extends Mode<Phase> {
    public final BooleanValue OK = new BooleanValue("Smart Mode (if you want it to be always be toggled on)", (Mode<?>)this, (Boolean)false);
    public final BooleanValue OL = new BooleanValue("Silent", (Mode<?>)this, (Boolean)false);
    private boolean OD;
    private final a OM = new a();
    private boolean ys;
    private static final int ON = 10;
    private static final double OO = Math.cos(Math.toRadians(130.0));
    @EventLink
    public final Listener<PreUpdateEvent> OP = preUpdateEvent -> {
        boolean bl2;
        net.minecraft.util.a a2 = Watchdog1171FullBlockMode.aER.bgK.Us().ad(0.05, 0.0, 0.05);
        boolean bl3 = bl2 = !Watchdog1171FullBlockMode.aER.bgF.a((c)Watchdog1171FullBlockMode.aER.bgK, a2).isEmpty();
        if (((Watchdog1171FullBlockMode.aER.bgK.crR && (Boolean)this.OL.wD() != false || Watchdog1171FullBlockMode.aER.bgK.crR && (Boolean)this.OL.wD() == false) && this.OD && Watchdog1171FullBlockMode.aER.bgK.crx > 2 && !Watchdog1171FullBlockMode.aER.aIY.chq.Re() && !this.e(Scaffold.class).isEnabled() && !(Watchdog1171FullBlockMode.aER.bgR instanceof net.minecraft.client.gui.inventory.i) || !((Boolean)this.OK.wD()).booleanValue() && bl2 && this.OD) && !aik.vz()) {
            this.OD = false;
            b b2 = this.u(10);
            if (b2 != null) {
                double d2 = (double)b2.wt() + 0.5;
                double d3 = b2.wu();
                double d4 = (double)b2.wx() + 0.5;
                ahn.n(new f(d2, d3, d4, Watchdog1171FullBlockMode.aER.bgK.aO));
            } else {
                ahn.n(new f(Watchdog1171FullBlockMode.aER.bgK.gW + 0.5, Watchdog1171FullBlockMode.aER.bgK.gX, Watchdog1171FullBlockMode.aER.bgK.gY + 0.5, Watchdog1171FullBlockMode.aER.bgK.aO));
            }
        }
    };
    @EventLink
    public final Listener<PacketReceiveEvent> OQ = packetReceiveEvent -> {
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof i && !this.OD && (!((Boolean)this.OL.wD()).booleanValue() || aik.vz())) {
            i i2 = (i)aj2;
            packetReceiveEvent.cF();
            double d2 = i2.getX();
            double d3 = i2.getY();
            double d4 = i2.getZ();
            float f2 = i2.getYaw();
            float f3 = i2.getPitch();
            this.OD = true;
            ahn.n(new h(d2, d3, d4, f2, f3, Watchdog1171FullBlockMode.aER.bgK.aO));
            if (!((Boolean)this.OL.wD()).booleanValue()) {
                Watchdog1171FullBlockMode.aER.bgK.setPosition(d2, d3, d4);
            }
        }
    };
    @EventLink
    public final Listener<MoveEvent> OR = moveEvent -> {
        if (!this.OD && !((Boolean)this.OL.wD()).booleanValue()) {
            moveEvent.setPosZ(0.0);
            moveEvent.setPosX(0.0);
        }
    };
    @EventLink
    public final Listener<es> OS = es2 -> {
        b b2;
        b b3;
        if (!this.OD && es2.df() instanceof Block && ((Boolean)this.OL.wD()).booleanValue() && !(b3 = es2.dg()).equals(b2 = new b(bt.aF(Watchdog1171FullBlockMode.aER.bgK.gW), (int)(Watchdog1171FullBlockMode.aER.bgK.Us().dtI - 0.49), bt.aF(Watchdog1171FullBlockMode.aER.bgK.gY))) && ((Boolean)this.OL.wD()).booleanValue()) {
            if (aik.vz()) {
                aii.strafe(-0.1);
            }
            es2.cF();
        }
    };
    @EventLink
    public final Listener<MoveInputEvent> OT = moveInputEvent -> {
        if (!this.OD) {
            // empty if block
        }
    };
    @EventLink
    public final Listener<ek> OU = dh::cF;

    public Watchdog1171FullBlockMode(String string, Phase phase) {
        super(string, phase);
    }

    private boolean e(double d2, double d3) {
        double d4 = Watchdog1171FullBlockMode.aER.bgK.gW;
        double d5 = Watchdog1171FullBlockMode.aER.bgK.gY;
        float f2 = Watchdog1171FullBlockMode.aER.bgK.pl;
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
        double d2 = Watchdog1171FullBlockMode.aER.bgK.gW;
        double d3 = Watchdog1171FullBlockMode.aER.bgK.gX;
        double d4 = Watchdog1171FullBlockMode.aER.bgK.gY;
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
                    Block block = Watchdog1171FullBlockMode.aER.bgF.L(b3).df();
                    Material material = block.xb();
                    if (!material.zw() || !block.isFullBlock() || block instanceof BlockLeaves || block instanceof BlockSnow || !((d6 = Watchdog1171FullBlockMode.aER.bgK.getDistance((double)b3.wt() + 0.5, (double)b3.wu() + 0.5, (double)b3.wx() + 0.5)) >= 1.0) || !(d6 <= 10.0) || !this.e((double)b3.wt() + 0.5, (double)b3.wx() + 0.5) || !(d6 < d5)) continue;
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

