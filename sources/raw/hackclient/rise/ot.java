/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9
 */
package hackclient.rise;

import com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aii;
import hackclient.rise.akb;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.eo;
import hackclient.rise.in;
import hackclient.rise.mh;
import net.minecraft.entity.r;

public class ot
extends akg<mh> {
    private final akq PI = new akq("Bounding Box Size", this, (Number)0.4, (Number)0, (Number)1, (Number)0.1);
    private final akq PJ = new akq("in Player Speed", this, (Number)0.08, (Number)0, (Number)0.08, (Number)0.01);
    private final akq PK = new akq("Move Flying Increase", this, (Number)1.0E-4, (Number)0, (Number)0.001, (Number)1.0E-5);
    public final aki PL = new aki("Fast Fall", (akg<?>)this, (Boolean)true);
    private int Gq = 0;
    private int PM = 0;
    @dm(cH=1)
    public final dk<ej> PN = ej2 -> {
        this.Gq = !ot.aER.bgK.aO ? ++this.Gq : 0;
        if (!(ot.aER.bgK.crZ || ot.aER.bgK.aO || ot.aER.aIY.chm.Re() && ot.aER.aIY.chp.Re() || ot.aER.aIY.chm.Re() && ot.aER.aIY.chn.Re() || ((Boolean)this.PL.wD()).booleanValue())) {
            bs.a(new akb((float)((double)(ot.aER.bgK.pl + 45.0f) + Math.random()), ot.aER.bgK.pm), 10.0, cb.gH);
        }
    };
    @dm(cH=4)
    public final dk<ei> PO = ei2 -> {
        if (!((Boolean)this.PL.wD()).booleanValue()) {
            return;
        }
        this.PM = this.PM == 0 ? (ei2.isOnGround() ? 1 : 0) : 0;
        ei2.setOnGround(this.PM != 0);
        if (ot.aER.bgK.aO) {
            ot.aER.bgK.jump();
        }
    };
    @dm(cH=4)
    public final dk<eg> PP = eg2 -> {
        if (!((Boolean)this.PL.wD()).booleanValue()) {
            return;
        }
        if (!ot.aER.bgK.aO && this.PM >= 0) {
            if (this.Gq < 1 || this.Gq > 5) {
                return;
            }
            this.hp();
            ot.aER.bgK.setSneaking(false);
            if (this.Gq == 2) {
                ot.aER.bgK.jump();
            }
        }
    };
    @dm(cH=4)
    public final dk<eo> PQ = eo2 -> {
        ot.aER.bgF.dCS.stream().filter(c2 -> c2 instanceof r).map(c2 -> (r)c2).filter(r2 -> r2 != ot.aER.bgK && ot.aER.bgK.Us().ad(((Number)this.PI.wD()).doubleValue(), ((Number)this.PI.wD()).doubleValue(), ((Number)this.PI.wD()).doubleValue()).q(r2.Us())).forEach(r2 -> aii.moveFlying(((Number)this.PJ.wD()).doubleValue()));
        aii.moveFlying(((Number)this.PK.wD()).doubleValue());
        if ((!in.dj && (in.tS == 0 || in.tS >= 6) || !ot.aER.bgK.aO) && ot.aER.bgK.cus == 0 && ot.aER.bgK.aO && ot.aER.aIY.chq.Re()) {
            ot.aER.bgK.jump();
        }
    };

    public ot(String string, mh mh2) {
        super(string, mh2);
    }

    @Override
    public void onDisable() {
        ot.aER.aIY.chr.ay(false);
        ot.aER.aIY.chq.ay(false);
        this.Gq = 0;
        this.PM = 0;
    }

    private void hp() {
        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
            return;
        }
        UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.PLAYER_COMMAND, (UserConnection)userConnection);
        packetWrapper.write((Type)Types.VAR_INT, (Object)ot.aER.bgK.getEntityId());
        packetWrapper.write((Type)Types.VAR_INT, (Object)8);
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.sendToServer(Protocol1_9To1_8.class);
    }
}

