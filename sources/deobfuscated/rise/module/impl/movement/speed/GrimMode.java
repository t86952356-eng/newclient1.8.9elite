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
package rise.module.impl.movement.speed;

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
import hackclient.rise.bs;
import hackclient.rise.cb;
import net.minecraft.entity.r;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PostMotionEvent;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.PreUpdateEvent;
import rise.event.impl.StrafeEvent;
import rise.module.Mode;
import rise.module.impl.movement.Speed;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;
import rise.value.NumberValue;

public class GrimMode
extends Mode<Speed> {
    private final NumberValue PI = new NumberValue("Bounding Box Size", this, (Number)0.4, (Number)0, (Number)1, (Number)0.1);
    private final NumberValue PJ = new NumberValue("in Player Speed", this, (Number)0.08, (Number)0, (Number)0.08, (Number)0.01);
    private final NumberValue PK = new NumberValue("Move Flying Increase", this, (Number)1.0E-4, (Number)0, (Number)0.001, (Number)1.0E-5);
    public final BooleanValue PL = new BooleanValue("Fast Fall", (Mode<?>)this, (Boolean)true);
    private int Gq = 0;
    private int PM = 0;
    @EventLink(cH=1)
    public final Listener<PreUpdateEvent> PN = preUpdateEvent -> {
        this.Gq = !GrimMode.aER.bgK.aO ? ++this.Gq : 0;
        if (!(GrimMode.aER.bgK.crZ || GrimMode.aER.bgK.aO || GrimMode.aER.aIY.chm.Re() && GrimMode.aER.aIY.chp.Re() || GrimMode.aER.aIY.chm.Re() && GrimMode.aER.aIY.chn.Re() || ((Boolean)this.PL.wD()).booleanValue())) {
            bs.a(new Vector2f((float)((double)(GrimMode.aER.bgK.pl + 45.0f) + Math.random()), GrimMode.aER.bgK.pm), 10.0, cb.gH);
        }
    };
    @EventLink(cH=4)
    public final Listener<PreMotionEvent> PO = preMotionEvent -> {
        if (!((Boolean)this.PL.wD()).booleanValue()) {
            return;
        }
        this.PM = this.PM == 0 ? (preMotionEvent.isOnGround() ? 1 : 0) : 0;
        preMotionEvent.setOnGround(this.PM != 0);
        if (GrimMode.aER.bgK.aO) {
            GrimMode.aER.bgK.jump();
        }
    };
    @EventLink(cH=4)
    public final Listener<PostMotionEvent> PP = postMotionEvent -> {
        if (!((Boolean)this.PL.wD()).booleanValue()) {
            return;
        }
        if (!GrimMode.aER.bgK.aO && this.PM >= 0) {
            if (this.Gq < 1 || this.Gq > 5) {
                return;
            }
            this.hp();
            GrimMode.aER.bgK.setSneaking(false);
            if (this.Gq == 2) {
                GrimMode.aER.bgK.jump();
            }
        }
    };
    @EventLink(cH=4)
    public final Listener<StrafeEvent> PQ = strafeEvent -> {
        GrimMode.aER.bgF.dCS.stream().filter(c2 -> c2 instanceof r).map(c2 -> (r)c2).filter(r2 -> r2 != GrimMode.aER.bgK && GrimMode.aER.bgK.Us().ad(((Number)this.PI.wD()).doubleValue(), ((Number)this.PI.wD()).doubleValue(), ((Number)this.PI.wD()).doubleValue()).q(r2.Us())).forEach(r2 -> aii.moveFlying(((Number)this.PJ.wD()).doubleValue()));
        aii.moveFlying(((Number)this.PK.wD()).doubleValue());
        if ((!rise.module.impl.combat.velocity.GrimMode.dj && (rise.module.impl.combat.velocity.GrimMode.tS == 0 || rise.module.impl.combat.velocity.GrimMode.tS >= 6) || !GrimMode.aER.bgK.aO) && GrimMode.aER.bgK.cus == 0 && GrimMode.aER.bgK.aO && GrimMode.aER.aIY.chq.Re()) {
            GrimMode.aER.bgK.jump();
        }
    };

    public GrimMode(String string, Speed speed) {
        super(string, speed);
    }

    @Override
    public void onDisable() {
        GrimMode.aER.aIY.chr.ay(false);
        GrimMode.aER.aIY.chq.ay(false);
        this.Gq = 0;
        this.PM = 0;
    }

    private void hp() {
        if (!ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
            return;
        }
        UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.PLAYER_COMMAND, (UserConnection)userConnection);
        packetWrapper.write((Type)Types.VAR_INT, (Object)GrimMode.aER.bgK.getEntityId());
        packetWrapper.write((Type)Types.VAR_INT, (Object)8);
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.sendToServer(Protocol1_9To1_8.class);
    }
}

