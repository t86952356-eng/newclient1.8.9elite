/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.phase;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.dh;
import hackclient.rise.ek;
import hackclient.rise.es;
import net.minecraft.block.BlockAir;
import net.minecraft.network.play.client.f;
import net.minecraft.network.play.server.i;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.MoveEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Phase;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class WatchdogSemiBlockMode
extends Mode<Phase> {
    private final NumberValue OV = new NumberValue("Amount", this, (Number)1, (Number)0.1, (Number)1.5, (Number)0.1);
    private final NumberValue OW = new NumberValue("Timer", this, (Number)0.1, (Number)0.1, (Number)1, (Number)0.1);
    private final BooleanValue OX = new BooleanValue("Packet", (Mode<?>)this, (Boolean)false);
    private boolean OY;
    private boolean Or;
    private double OZ;
    private double Pa;
    @EventLink
    public final Listener<PreMotionEvent> Pb = preMotionEvent -> {
        this.Or = false;
        double d2 = Math.toRadians(WatchdogSemiBlockMode.aER.bgK.pl);
        double d3 = Math.sin(d2);
        double d4 = Math.cos(d2);
        if (WatchdogSemiBlockMode.aER.bgK.crR) {
            WatchdogSemiBlockMode.aER.bgK.setPosition(WatchdogSemiBlockMode.aER.bgK.gW - d3 * 0.01, WatchdogSemiBlockMode.aER.bgK.gX, WatchdogSemiBlockMode.aER.bgK.gY + d4 * 0.01);
            this.Or = true;
        } else if (this.OY && aik.vz()) {
            WatchdogSemiBlockMode.aER.bgC.dAp = ((Number)this.OW.wD()).floatValue();
            if (!((Boolean)this.OX.wD()).booleanValue()) {
                WatchdogSemiBlockMode.aER.bgK.setPosition(WatchdogSemiBlockMode.aER.bgK.gW - d3 * ((Number)this.OV.wD()).doubleValue(), WatchdogSemiBlockMode.aER.bgK.gX, WatchdogSemiBlockMode.aER.bgK.gY + d4 * ((Number)this.OV.wD()).doubleValue());
            } else {
                ahn.n(new f(WatchdogSemiBlockMode.aER.bgK.gW - d3 * ((Number)this.OV.wD()).doubleValue(), WatchdogSemiBlockMode.aER.bgK.gX, WatchdogSemiBlockMode.aER.bgK.gY + d4 * ((Number)this.OV.wD()).doubleValue(), false));
            }
            this.Or = true;
        }
    };
    @EventLink
    public final Listener<StrafeEvent> Pc = strafeEvent -> {
        if (this.OY && aik.vz()) {
            aii.stop();
        }
    };
    @EventLink
    public final Listener<ek> Pd = dh::cF;
    @EventLink
    public final Listener<es> Pe = es2 -> {
        if (es2.df() instanceof BlockAir && this.Or) {
            double d2 = es2.dg().wt();
            double d3 = es2.dg().wu();
            double d4 = es2.dg().wx();
            if (d3 < WatchdogSemiBlockMode.aER.bgK.gX) {
                // empty if block
            }
        }
    };
    @EventLink
    private final Listener<MoveEvent> Pf = moveEvent -> {
        if (!this.OY || aik.vz()) {
            // empty if block
        }
    };
    @EventLink
    private final Listener<PacketReceiveEvent> Pg = packetReceiveEvent -> {
        if (packetReceiveEvent.dq() instanceof i) {
            i i2 = (i)packetReceiveEvent.dq();
            double d2 = i2.getX();
            double d3 = i2.getZ();
            double d4 = Math.abs(d2 - this.OZ);
            double d5 = Math.abs(d3 - this.Pa);
            this.OZ = d2;
            this.Pa = d3;
            this.OY = d4 <= 0.001 && d5 <= 0.001;
        }
    };

    public WatchdogSemiBlockMode(String string, Phase phase) {
        super(string, phase);
    }

    @Override
    public void onEnable() {
        afl.b("try to jump around a bit before phasing if its the start of a game", new Object[0]);
    }

    @Override
    public void onDisable() {
        this.OY = false;
    }
}

