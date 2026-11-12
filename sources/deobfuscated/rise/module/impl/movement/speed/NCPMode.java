/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.movement.speed;

import hackclient.rise.aii;
import hackclient.rise.fd;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.t;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class NCPMode
extends Mode<Speed> {
    private boolean LK;
    private double LL;
    private final NumberValue Qw = new NumberValue("Jump Motion", this, (Number)0.4, (Number)0.4, (Number)0.42, (Number)0.01);
    private final NumberValue Qx = new NumberValue("Ground Speed", this, (Number)1.75, (Number)0.1, (Number)2.5, (Number)0.05);
    private final NumberValue Qy = new NumberValue("Bunny Slope", this, (Number)0.66, (Number)0, (Number)1, (Number)0.01);
    private final NumberValue Qz = new NumberValue("Timer", this, (Number)1, (Number)0.1, (Number)10, (Number)0.05);
    private final BooleanValue QA = new BooleanValue("Damage Boost", (Mode<?>)this, (Boolean)true);
    private final BooleanValue QB = new BooleanValue("Custom Boost", (Mode<?>)this, (Boolean)false);
    private final NumberValue QC = new NumberValue("Boost Speed", this, (Number)0.8, (Number)0.1, (Number)9.5, (Number)0.1);
    private final BooleanValue QD = new BooleanValue("Low Hop", (Mode<?>)this, (Boolean)false);
    private final BooleanValue QE = new BooleanValue("Y-port Hop", (Mode<?>)this, (Boolean)false);
    private final NumberValue QF = new NumberValue("Hurt Time", this, (Number)6, (Number)1, (Number)10, (Number)1);
    @EventLink
    public final Listener<PacketReceiveEvent> QG = packetReceiveEvent -> {
        t t2;
        if (!((Boolean)this.QA.wD()).booleanValue()) {
            return;
        }
        aj<?> aj2 = packetReceiveEvent.dq();
        if (aj2 instanceof t && (t2 = (t)aj2).getEntityID() == NCPMode.aER.bgK.getEntityId()) {
            this.LL = Math.hypot((double)t2.dcR / 8000.0, (double)t2.dcT / 8000.0);
        }
    };
    @EventLink
    public final Listener<StrafeEvent> QH = strafeEvent -> {
        if (((Boolean)this.QD.wD()).booleanValue() && NCPMode.aER.bgK.tR == 4) {
            NCPMode.aER.bgK.ue = -0.09800000190734864;
        }
        if (((Boolean)this.QE.wD()).booleanValue() && NCPMode.aER.bgK.tR == 5 && Math.abs(NCPMode.aER.bgK.ue - 0.09800000190734864) < 0.12) {
            NCPMode.aER.bgK.ue = -0.09800000190734864;
        }
        if (((Boolean)this.QB.wD()).booleanValue() && NCPMode.aER.bgK.css <= ((Number)this.QF.wD()).intValue()) {
            this.LL = ((Number)this.QC.wD()).doubleValue();
        }
        double d2 = aii.getAllowedHorizontalDistance();
        if (aii.isMoving()) {
            switch (NCPMode.aER.bgK.tR) {
                case 0: {
                    float f2 = ((Number)this.Qw.wD()).floatValue();
                    float f3 = NCPMode.aER.bgK.crR ? 0.42f : (f2 == 0.4f ? f2 : 0.42f);
                    NCPMode.aER.bgK.ue = aii.jumpBoostMotion(f3);
                    this.LL = d2 * ((Number)this.Qx.wD()).doubleValue();
                    break;
                }
                case 1: {
                    this.LL -= ((Number)this.Qy.wD()).doubleValue() * (this.LL - d2);
                    break;
                }
                default: {
                    this.LL -= this.LL / (double)159.9f;
                }
            }
            NCPMode.aER.bgC.dAp = ((Number)this.Qz.wD()).floatValue();
            this.LK = false;
        } else if (!this.LK) {
            this.LL = aii.getAllowedHorizontalDistance();
            NCPMode.aER.bgC.dAp = 1.0f;
            this.LK = true;
        }
        if (NCPMode.aER.bgK.crR) {
            this.LL = aii.getAllowedHorizontalDistance();
        }
        strafeEvent.setSpeed(Math.max(this.LL, d2), Math.random() / 2000.0);
    };
    @EventLink
    public final Listener<fd> QI = fd2 -> {
        this.LL = 0.0;
    };

    public NCPMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onDisable() {
        this.LL = 0.0;
    }
}

