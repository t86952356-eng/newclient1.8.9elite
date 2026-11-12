/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2
 *  com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9
 */
package rise.module.impl.movement.noslow;

import com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2;
import com.viaversion.viarewind.protocol.v1_9to1_8.Protocol1_9To1_8;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.afl;
import net.minecraft.item.ai;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.cp;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;
import rise.event.impl.SlowDownEvent;
import rise.module.Mode;
import rise.module.impl.movement.NoSlow;

public class Grim19Mode
extends Mode<NoSlow> {
    int Na;
    @EventLink
    public final Listener<PreMotionEvent> Nb = preMotionEvent -> {
        if (Grim19Mode.aER.bgK.isUsingItem() && ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_9)) {
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_19.USE_ITEM, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)1);
                packetWrapper.write((Type)Types.VAR_INT, (Object)Grim19Mode.aER.bgu.Ho());
                packetWrapper.sendToServer(Protocol1_19To1_18_2.class);
            } else {
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_9.USE_ITEM, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)1);
                packetWrapper.sendToServer(Protocol1_9To1_8.class);
            }
            ++this.Na;
        } else if (Grim19Mode.aER.bgK.isUsingItem() && Grim19Mode.aER.bgK.aRg % 5 == 0) {
            afl.b("use 1.9+ for this bypass", new Object[0]);
        } else {
            this.Na = 0;
        }
    };
    @EventLink
    public final Listener<SlowDownEvent> Nc = slowDownEvent -> {
        if (((Boolean)((NoSlow)this.wy()).DO.wD()).booleanValue() && Grim19Mode.aER.bgK.isUsingItem() && Grim19Mode.aER.bgK.Vk().bP() instanceof bg) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DP.wD()).booleanValue() && Grim19Mode.aER.bgK.isUsingItem() && Grim19Mode.aER.bgK.Vk().bP() instanceof by) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DQ.wD()).booleanValue() && Grim19Mode.aER.bgK.isUsingItem() && Grim19Mode.aER.bgK.Vk().bP() instanceof cp) {
            slowDownEvent.cF();
        }
        if (((Boolean)((NoSlow)this.wy()).DR.wD()).booleanValue() && Grim19Mode.aER.bgK.isUsingItem() && Grim19Mode.aER.bgK.Vk().bP() instanceof ai) {
            slowDownEvent.cF();
        }
    };

    public Grim19Mode(String string, NoSlow noSlow) {
        super(string, noSlow);
    }
}

