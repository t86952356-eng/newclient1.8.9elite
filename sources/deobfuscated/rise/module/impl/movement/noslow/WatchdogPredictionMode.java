/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19
 */
package rise.module.impl.movement.noslow;

import com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.ahn;
import hackclient.rise.bc;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.en;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import net.minecraft.item.d;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.k;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.combat.KillAura;
import rise.module.impl.movement.NoSlow;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class WatchdogPredictionMode
extends Mode<NoSlow> {
    boolean bi;
    int Na;
    public NumberValue pR = new NumberValue("Max Ping Spoof", this, (Number)8, (Number)0, (Number)30, (Number)1);
    public NumberValue NL = new NumberValue("When to finish eating", this, (Number)30, (Number)20, (Number)36, (Number)1);
    public final BooleanValue NM = new BooleanValue("Non-Blink Speed Bypass", (Mode<?>)this, (Boolean)true);
    @EventLink
    public final Listener<PreMotionEvent> NN = preMotionEvent -> {
        if (WatchdogPredictionMode.aER.bgK.abO() == null) {
            return;
        }
        d d2 = WatchdogPredictionMode.aER.bgK.abO().bP();
        if (WatchdogPredictionMode.aER.bgK.isUsingItem()) {
            if ((!(d2 instanceof cp) || !((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue()) && (d2 instanceof bg && (Boolean)((NoSlow)this.wy()).DO.wD() != false && WatchdogPredictionMode.aER.bgK.isEating() || d2 instanceof ai && (Boolean)((NoSlow)this.wy()).DR.wD() != false || WatchdogPredictionMode.aER.bgK.Vk().bP() instanceof by && !by.gb(WatchdogPredictionMode.aER.bgK.Vk().yc()) && ((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && WatchdogPredictionMode.aER.bgK.isEating())) {
                ++this.Na;
                if (this.Na > ((Number)this.pR.wD()).intValue()) {
                    bm.a(30000, true, false, false, false, true);
                }
            }
            this.bi = true;
        } else if (this.bi) {
            this.Na = 0;
            this.bi = false;
            bm.dispatch();
        }
        if (this.Na > ((Number)this.NL.wD()).intValue()) {
            WatchdogPredictionMode.aER.aIY.chu.ay(false);
        }
    };
    @EventLink
    public final Listener<en> NO = en2 -> {
        if (WatchdogPredictionMode.aER.bgK.isUsingItem() && WatchdogPredictionMode.aER.bgK.cuW > 0.0f && ((Boolean)this.NM.wD()).booleanValue() && this.Na <= ((Number)this.pR.wD()).intValue()) {
            WatchdogPredictionMode.aER.bgK.setSprinting(true);
        }
    };
    @EventLink(cH=1)
    public final Listener<PreUpdateEvent> NP = preUpdateEvent -> {
        if (!(KillAura.mB && this.e(KillAura.class).isEnabled() || WatchdogPredictionMode.aER.bgK.aO && WatchdogPredictionMode.aER.bgK.crx <= 2 || WatchdogPredictionMode.aER.aIY.chp.Re() || WatchdogPredictionMode.aER.aIY.chn.Re() || WatchdogPredictionMode.aER.bgK.Zz <= 5 || !WatchdogPredictionMode.aER.bgK.isUsingItem() || WatchdogPredictionMode.aER.bgK.Vk() != null && WatchdogPredictionMode.aER.bgK.Vk().bP() instanceof cp || WatchdogPredictionMode.aER.bgK.Vk() != null && WatchdogPredictionMode.aER.bgK.Vk().bP() instanceof ai)) {
            bs.a(new Vector2f(WatchdogPredictionMode.aER.bgK.pl + 45.0f, WatchdogPredictionMode.aER.bgK.pm), 10.0, cb.gH);
        }
    };
    @EventLink
    public final Listener<SlowDownEvent> NQ = slowDownEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && WatchdogPredictionMode.aER.bgK.isUsingItem() && WatchdogPredictionMode.aER.bgK.Vk().bP() instanceof bg && this.Na > ((Number)this.pR.wD()).intValue()) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && WatchdogPredictionMode.aER.bgK.isUsingItem() && WatchdogPredictionMode.aER.bgK.Vk().bP() instanceof by && this.Na > ((Number)this.pR.wD()).intValue()) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && WatchdogPredictionMode.aER.bgK.isUsingItem() && WatchdogPredictionMode.aER.bgK.Vk().bP() instanceof cp) {
            ahn.m(new i(j.dbe, b.dtN, ao.dwq));
            bc.dispatch();
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
                UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_19.USE_ITEM, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)0);
                packetWrapper.write((Type)Types.VAR_INT, (Object)WatchdogPredictionMode.aER.bgu.Ho());
                packetWrapper.sendToServer(Protocol1_19To1_18_2.class);
            } else {
                this.d(bu.class);
                ahn.m(new k(bu.bO()));
            }
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && WatchdogPredictionMode.aER.bgK.isUsingItem() && WatchdogPredictionMode.aER.bgK.Vk().bP() instanceof ai && this.Na > ((Number)this.pR.wD()).intValue()) {
            slowDownEvent.cF();
        }
    };

    public WatchdogPredictionMode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }

    @Override
    public void onEnable() {
    }
}

