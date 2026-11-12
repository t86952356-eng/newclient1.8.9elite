/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package rise.module.impl.movement.speed;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aii;
import hackclient.rise.aks;
import hackclient.rise.bs;
import hackclient.rise.cb;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PacketSendEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.Speed;
import rise.module.impl.player.Scaffold;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.ModeValue;

public class LegitMode
extends Mode<Speed> {
    private final ModeValue Qd = new ModeValue("Rotation Exploit Mode", this).a(new Mode[]{new aks("Off")}).a(new Mode[]{new aks("Rotate (Fully Legit)")}).a(new Mode[]{new aks("Speed Equivalent (Almost legit, Very hard to flag)")}).co("Speed Equivalent (Almost legit, Very hard to flag)");
    private final BooleanValue Qe = new BooleanValue("CPU SpeedUp Exploit", (Mode<?>)this, (Boolean)true);
    private final BooleanValue Qf = new BooleanValue("No Jump Delay", (Mode<?>)this, (Boolean)true);
    @EventLink(cH=1)
    public final Listener<PreUpdateEvent> Qg = preUpdateEvent -> {
        switch (((Mode)this.Qd.wD()).getName()) {
            case "Rotate (Fully Legit)": {
                if (KillAura.mB && this.e(KillAura.class).isEnabled() || LegitMode.aER.bgK.aO || LegitMode.aER.aIY.chp.Re() || LegitMode.aER.aIY.chn.Re() || LegitMode.aER.bgK.Zz <= 5) break;
                bs.a(new Vector2f(LegitMode.aER.bgK.pl + 45.0f, LegitMode.aER.bgK.pm), 10.0, cb.gH);
                break;
            }
            case "Speed Equivalent (Almost legit, Very hard to flag)": {
                aii.useDiagonalSpeed();
            }
        }
        if (((Boolean)this.Qf.wD()).booleanValue()) {
            LegitMode.aER.bgK.cvk = 0;
        }
        if (((Boolean)this.Qe.wD()).booleanValue()) {
            LegitMode.aER.bgC.dAp = 1.004f;
        }
    };
    @EventLink
    Listener<PacketSendEvent> Qh = packetSendEvent -> {
        boolean bl2 = LegitMode.aER.bgK.isSprinting();
        if (!LegitMode.aER.bgK.isSprinting() || !bl2) {
            // empty if block
        }
    };
    @EventLink(cH=4)
    public final Listener<StrafeEvent> Qi = strafeEvent -> {
        if (!LegitMode.aER.bgK.crR || !this.e(Scaffold.class).isEnabled()) {
            // empty if block
        }
        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2) && LegitMode.aER.bgK.ae > 2 && LegitMode.aER.bgK.Zz > 2 && ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_4)) {
            aii.moveFlying(1.0E-5);
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().equalTo(ProtocolVersion.v1_8)) {
            // empty if block
        }
        if (LegitMode.aER.bgK.aO && aii.isMoving() && LegitMode.aER.aIY.chq.Re() && !LegitMode.aER.bgK.csz) {
            LegitMode.aER.bgK.jump();
        }
    };

    public LegitMode(String string, Speed speed) {
        super(string, speed);
    }
}

