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
package hackclient.rise;

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
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bc;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.bu;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.em;
import hackclient.rise.en;
import hackclient.rise.go;
import hackclient.rise.mc;
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

public class pj
extends akg<mc> {
    boolean bi;
    int Na;
    public akq pR = new akq("Max Ping Spoof", this, (Number)8, (Number)0, (Number)30, (Number)1);
    public akq NL = new akq("When to finish eating", this, (Number)30, (Number)20, (Number)36, (Number)1);
    public final aki NM = new aki("Non-Blink Speed Bypass", (akg<?>)this, (Boolean)true);
    @dm
    public final dk<ei> NN = ei2 -> {
        if (pj.aER.bgK.abO() == null) {
            return;
        }
        d d2 = pj.aER.bgK.abO().bP();
        if (pj.aER.bgK.isUsingItem()) {
            if ((!(d2 instanceof cp) || !((Boolean)((mc)this.wy()).DQ.wD()).booleanValue()) && (d2 instanceof bg && (Boolean)((mc)this.wy()).DO.wD() != false && pj.aER.bgK.isEating() || d2 instanceof ai && (Boolean)((mc)this.wy()).DR.wD() != false || pj.aER.bgK.Vk().bP() instanceof by && !by.gb(pj.aER.bgK.Vk().yc()) && ((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pj.aER.bgK.isEating())) {
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
            pj.aER.aIY.chu.ay(false);
        }
    };
    @dm
    public final dk<en> NO = en2 -> {
        if (pj.aER.bgK.isUsingItem() && pj.aER.bgK.cuW > 0.0f && ((Boolean)this.NM.wD()).booleanValue() && this.Na <= ((Number)this.pR.wD()).intValue()) {
            pj.aER.bgK.setSprinting(true);
        }
    };
    @dm(cH=1)
    public final dk<ej> NP = ej2 -> {
        if (!(go.mB && this.e(go.class).isEnabled() || pj.aER.bgK.aO && pj.aER.bgK.crx <= 2 || pj.aER.aIY.chp.Re() || pj.aER.aIY.chn.Re() || pj.aER.bgK.Zz <= 5 || !pj.aER.bgK.isUsingItem() || pj.aER.bgK.Vk() != null && pj.aER.bgK.Vk().bP() instanceof cp || pj.aER.bgK.Vk() != null && pj.aER.bgK.Vk().bP() instanceof ai)) {
            bs.a(new akb(pj.aER.bgK.pl + 45.0f, pj.aER.bgK.pm), 10.0, cb.gH);
        }
    };
    @dm
    public final dk<em> NQ = em2 -> {
        if (((Boolean)((mc)this.wy()).DO.wD()).booleanValue() && pj.aER.bgK.isUsingItem() && pj.aER.bgK.Vk().bP() instanceof bg && this.Na > ((Number)this.pR.wD()).intValue()) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DP.wD()).booleanValue() && pj.aER.bgK.isUsingItem() && pj.aER.bgK.Vk().bP() instanceof by && this.Na > ((Number)this.pR.wD()).intValue()) {
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DQ.wD()).booleanValue() && pj.aER.bgK.isUsingItem() && pj.aER.bgK.Vk().bP() instanceof cp) {
            ahn.m(new i(j.dbe, b.dtN, ao.dwq));
            bc.dispatch();
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
                UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_19.USE_ITEM, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)0);
                packetWrapper.write((Type)Types.VAR_INT, (Object)pj.aER.bgu.Ho());
                packetWrapper.sendToServer(Protocol1_19To1_18_2.class);
            } else {
                this.d(bu.class);
                ahn.m(new k(bu.bO()));
            }
            em2.cF();
        }
        if (((Boolean)((mc)this.wy()).DR.wD()).booleanValue() && pj.aER.bgK.isUsingItem() && pj.aER.bgK.Vk().bP() instanceof ai && this.Na > ((Number)this.pR.wD()).intValue()) {
            em2.cF();
        }
    };

    public pj(String string, mc mc2) {
        super(string, mc2);
    }

    @Override
    public void onEnable() {
    }
}

