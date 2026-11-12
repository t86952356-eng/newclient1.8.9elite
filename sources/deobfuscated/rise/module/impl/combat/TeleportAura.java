/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 */
package rise.module.impl.combat;

import com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.ahj;
import hackclient.rise.ahn;
import hackclient.rise.ahx;
import hackclient.rise.aib;
import hackclient.rise.ait;
import hackclient.rise.akj;
import hackclient.rise.aks;
import hackclient.rise.bv;
import java.awt.Color;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.minecraft.entity.r;
import net.minecraft.item.ac;
import net.minecraft.item.bj;
import net.minecraft.item.bw;
import net.minecraft.item.cn;
import net.minecraft.item.cp;
import net.minecraft.item.d;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.f;
import rip.vantage.commons.util.time.a;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.AttackEvent;
import rise.event.impl.ClickEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Mode;
import rise.module.Module;
import rise.module.ModuleInfo;
import rise.module.impl.combat.Criticals;
import rise.module.impl.combat.KillAura;
import rise.value.BooleanValue;
import rise.value.ModeValue;
import rise.value.NumberValue;

@ModuleInfo(aliases={"module.combat.teleportaura.name", "Infinite Aura", "Infinite", "TP Aura"}, description="module.combat.teleportaura.description", category=Category.COMBAT)
public final class TeleportAura
extends Module {
    private final ModeValue qi = new ModeValue("Mode", this).a(new Mode[]{new aks("Single")}).a(new Mode[]{new aks("Multiple")}).co("Single");
    private final NumberValue qj = new NumberValue("Range", this, (Number)32, (Number)3, (Number)100, (Number)0.1);
    private final akj qk = new akj("CPS", this, (Number)10, (Number)15, (Number)1, (Number)20, (Number)1);
    private final BooleanValue ql = new BooleanValue("1.9 Cooldown", (Module)this, (Boolean)false);
    private final BooleanValue qm = new BooleanValue("Render", (Module)this, (Boolean)true);
    private final a qn = new a();
    private KillAura gj;
    private List<aib> qo;
    public r jE;
    private long nT;
    @EventLink
    public final Listener<PreUpdateEvent> qp = preUpdateEvent -> {
        List<r> list;
        if (this.gj == null) {
            this.gj = this.e(KillAura.class);
        }
        if ((list = bv.a(((Number)this.qj.wD()).doubleValue(), (boolean)((Boolean)this.gj.nz.wD()), (boolean)((Boolean)this.gj.nA.wD()), (boolean)((Boolean)this.gj.nB.wD()), (boolean)((Boolean)this.gj.nC.wD()), (Boolean)this.gj.nD.wD())).isEmpty()) {
            this.jE = null;
            return;
        }
        list.sort(Comparator.comparingDouble(r2 -> TeleportAura.aER.bgK.S((net.minecraft.entity.c)r2)));
        this.jE = list.get(0);
        if (this.jE == null || TeleportAura.aER.bgK.csb) {
            return;
        }
        this.d(list);
    };
    @EventLink
    public final Listener<Render3DEvent> qq = render3DEvent -> {
        if (!((Boolean)this.qm.wD()).booleanValue() || this.qo == null || this.jE == null) {
            return;
        }
        aib aib2 = null;
        for (aib aib3 : this.qo) {
            if (aib2 != null) {
                ait.a(aib2.getX(), aib2.getY() + 0.01, aib2.getZ(), aib3.getX(), aib3.getY() + 0.01, aib3.getZ(), Color.WHITE, 1.0f);
            }
            aib2 = aib3;
        }
    };

    @Override
    public void onDisable() {
        this.jE = null;
    }

    private void d(List<r> list) {
        boolean bl2;
        if (((Boolean)this.ql.wD()).booleanValue()) {
            double d2 = 4.0;
            if (TeleportAura.aER.bgK.Vk() != null) {
                d d3 = TeleportAura.aER.bgK.Vk().bP();
                if (d3 instanceof cp) {
                    d2 = 1.6;
                } else if (d3 instanceof cn) {
                    d2 = 1.0;
                } else if (d3 instanceof bw) {
                    d2 = 1.2;
                } else if (d3 instanceof ac) {
                    switch (((ac)d3).adY()) {
                        case cVt: 
                        case cVu: {
                            d2 = 0.8;
                            break;
                        }
                        case cVv: {
                            d2 = 0.9;
                            break;
                        }
                        default: {
                            d2 = 1.0;
                            break;
                        }
                    }
                } else if (d3 instanceof bj) {
                    switch (((bj)d3).adY()) {
                        case cVt: 
                        case cVx: {
                            d2 = 1.0;
                            break;
                        }
                        case cVu: {
                            d2 = 2.0;
                            break;
                        }
                        case cVv: {
                            d2 = 3.0;
                            break;
                        }
                        default: {
                            d2 = 4.0;
                        }
                    }
                }
            }
            double d4 = 1.0 / d2 * 20.0 - 1.0;
            bl2 = this.qn.T((long)(d4 * 50.0));
        } else {
            bl2 = this.qn.T(this.nT);
        }
        if (bl2 && this.jE != null && !TeleportAura.aER.aIY.chw.Re() && !TeleportAura.aER.aIY.chu.Re()) {
            if (!((Boolean)this.ql.wD()).booleanValue()) {
                long l2 = Math.round(ahj.l(((Number)this.qk.wD()).intValue(), this.qk.wP().intValue()));
                this.nT = 1000L / l2;
            }
            double d5 = ((Number)this.qj.wD()).doubleValue();
            switch (((Mode)this.qi.wD()).getName()) {
                case "Single": {
                    if (!((double)TeleportAura.aER.bgK.S(this.jE) <= d5)) break;
                    this.e(this.jE);
                    break;
                }
                case "Multiple": {
                    list.removeIf(r2 -> (double)TeleportAura.aER.bgK.S((net.minecraft.entity.c)r2) > d5);
                    if (list.isEmpty()) break;
                    list.forEach(this::e);
                }
            }
            this.qn.aX();
        }
    }

    private void e(r r2) {
        PacketWrapper packetWrapper;
        TeleportAura.aER.bgu.Ht();
        AttackEvent attackEvent = new AttackEvent(r2);
        Client.a.e().d(attackEvent);
        if (attackEvent.isCancelled()) {
            return;
        }
        r2 = attackEvent.dc();
        this.qo = ahx.a(new aib(TeleportAura.aER.bgK.gW, TeleportAura.aER.bgK.gX, TeleportAura.aER.bgK.gY), new aib(r2.gW, r2.gX, r2.gY), true);
        if (this.qo == null) {
            return;
        }
        for (aib aib2 : this.qo) {
            ahn.n(new f(aib2.getX(), aib2.getY(), aib2.getZ(), true));
            if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2) || TeleportAura.aER.bgK == null || TeleportAura.aER.bgF == null || Via.getManager().getConnectionManager() == null || Via.getManager().getConnectionManager().getConnections().isEmpty()) continue;
            packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_21_2.CLIENT_TICK_END, null, (UserConnection)((UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next()));
            packetWrapper.sendToServer(Protocol1_21_2To1_21.class);
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            Client.a.e().d(new ClickEvent());
            TeleportAura.aER.bgK.swingItem();
        }
        ahn.n(new c((net.minecraft.entity.c)r2, net.minecraft.network.play.client.d.daU));
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
            Client.a.e().d(new ClickEvent());
            TeleportAura.aER.bgK.swingItem();
        }
        Collections.reverse(this.qo);
        for (aib aib2 : this.qo) {
            ahn.n(new f(aib2.getX(), aib2.getY(), aib2.getZ(), true));
            if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2) || TeleportAura.aER.bgK == null || TeleportAura.aER.bgF == null || Via.getManager().getConnectionManager() == null || Via.getManager().getConnectionManager().getConnections().isEmpty()) continue;
            packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_21_2.CLIENT_TICK_END, null, (UserConnection)((UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next()));
            packetWrapper.sendToServer(Protocol1_21_2To1_21.class);
        }
        if (this.e(Criticals.class).isEnabled() || TeleportAura.aER.bgK.csf > 0.0f && !TeleportAura.aER.bgK.aO && !TeleportAura.aER.bgK.isOnLadder() && !TeleportAura.aER.bgK.isInWater() && !TeleportAura.aER.bgK.a(net.minecraft.potion.a.dgK) && TeleportAura.aER.bgK.crC == null) {
            TeleportAura.aER.bgK.E(r2);
        }
    }
}

