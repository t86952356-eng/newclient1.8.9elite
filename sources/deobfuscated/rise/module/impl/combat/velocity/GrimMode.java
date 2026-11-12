/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19
 */
package rise.module.impl.combat.velocity;

import com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.ahn;
import hackclient.rise.akd;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.cb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import net.minecraft.network.aj;
import net.minecraft.network.play.a;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.server.ad;
import net.minecraft.network.play.server.an;
import net.minecraft.network.play.server.bc;
import net.minecraft.network.play.server.i;
import net.minecraft.network.play.server.t;
import net.minecraft.network.play.server.v;
import net.minecraft.network.play.server.z;
import net.minecraft.util.ao;
import net.minecraft.util.b;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.JumpEvent;
import rise.event.impl.MoveEvent;
import rise.event.impl.PacketReceiveEvent;
import rise.event.impl.StrafeEvent;
import rise.event.impl.TickEvent;
import rise.module.Mode;
import rise.module.impl.combat.Velocity;
import rise.module.impl.movement.Speed;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;
import rise.value.BooleanValue;

public final class GrimMode
extends Mode<Velocity> {
    private final BooleanValue tL = new BooleanValue("Smart Combat (for High Ping)", (Mode<?>)this, (Boolean)false);
    private final BooleanValue tM = new BooleanValue("Rotate", (Mode<?>)this, (Boolean)true);
    private int tN;
    private final Set<b> tO = new HashSet<b>();
    private boolean tP = false;
    public static boolean dk;
    public static boolean dj;
    public static boolean tt;
    public static boolean tQ;
    public static float jq;
    public static float jp;
    private int tR;
    public static int tS;
    private final ArrayList<aj<?>> tT = new ArrayList();
    private double tU;
    private final double tV = 0.03;
    private final double tW = 0.053299998353843775;
    private final double tX = 1.0;
    private int tY;
    private boolean tZ;
    private akd ua;
    private boolean gD;
    private float ub;
    private boolean uc;
    private double ud;
    private double ue;
    private double uf;
    private int ug;
    @EventLink
    public final Listener<PacketReceiveEvent> uh = packetReceiveEvent -> {
        aj<a> aj2;
        boolean bl2;
        Speed speed = this.e(Speed.class);
        boolean bl3 = bl2 = speed.isEnabled() && speed.hl().wD() instanceof rise.module.impl.movement.speed.GrimMode && (Boolean)((rise.module.impl.movement.speed.GrimMode)speed.hl().wD()).PL.wD() != false;
        if (tt || GrimMode.aER.bgK.Zz < 7 || GrimMode.aER.bgK.crZ || bl2) {
            return;
        }
        aj<?> aj3 = packetReceiveEvent.dq();
        if (aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == GrimMode.aER.bgK.getEntityId()) {
            if (!GrimMode.aER.bgK.aO) {
                this.tT.add(aj2);
                dj = true;
            } else {
                this.tP = true;
            }
            packetReceiveEvent.cF();
        }
        if ((aj3 = packetReceiveEvent.dq()) instanceof bc) {
            aj2 = (bc)aj3;
            if (dj) {
                this.tT.add(aj2);
                packetReceiveEvent.cF();
            }
        }
        if ((aj3 = packetReceiveEvent.dq()) instanceof z) {
            aj2 = (z)aj3;
            if (dj) {
                this.tT.add(aj2);
                packetReceiveEvent.cF();
            }
        }
        if ((aj3 = packetReceiveEvent.dq()) instanceof v) {
            aj2 = (v)aj3;
            if (dj) {
                this.tT.add(aj2);
                packetReceiveEvent.cF();
            }
        }
        if ((aj3 = packetReceiveEvent.dq()) instanceof ad) {
            aj2 = (ad)aj3;
            if (dj) {
                this.tT.add(aj2);
                packetReceiveEvent.cF();
            }
        }
        if ((aj3 = packetReceiveEvent.dq()) instanceof i) {
            aj2 = (i)aj3;
            if (dj) {
                this.tT.add(aj2);
                packetReceiveEvent.cF();
            }
        }
        if ((aj3 = packetReceiveEvent.dq()) instanceof an && this.tO.remove(aj3 = ((an)(aj2 = (an)aj3)).ahk()) && this.tO.isEmpty()) {
            this.tP = false;
            this.ug = 0;
        }
    };
    @EventLink
    public final Listener<MoveEvent> ui = moveEvent -> {
        boolean bl2;
        Speed speed = this.e(Speed.class);
        boolean bl3 = bl2 = speed.isEnabled() && speed.hl().wD() instanceof rise.module.impl.movement.speed.GrimMode && (Boolean)((rise.module.impl.movement.speed.GrimMode)speed.hl().wD()).PL.wD() != false;
        if ((GrimMode.aER.bgK.Zz < 7 || GrimMode.aER.bgK.crZ || bl2) && GrimMode.aER.bgK.aO) {
            if (!this.tT.isEmpty() || this.tP || dj) {
                tt = true;
                this.ug = 0;
                this.tP = false;
                this.tO.clear();
                dj = false;
                this.uc = false;
                this.tT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
                this.tT.clear();
                tt = false;
            }
            return;
        }
        if (this.tP) {
            moveEvent.cF();
        }
        if (GrimMode.aER.bgK.tR > 25 && dj) {
            dj = false;
            tt = true;
            this.tT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.tT.clear();
            tt = false;
        }
    };
    @EventLink
    public final Listener<StrafeEvent> uj = strafeEvent -> {
        boolean bl2;
        Speed speed = this.e(Speed.class);
        boolean bl3 = bl2 = speed.isEnabled() && speed.hl().wD() instanceof rise.module.impl.movement.speed.GrimMode && (Boolean)((rise.module.impl.movement.speed.GrimMode)speed.hl().wD()).PL.wD() != false;
        if (GrimMode.aER.bgK.Zz < 7 || GrimMode.aER.bgK.crZ) {
            return;
        }
        if (GrimMode.aER.bgK.crx > 3 && GrimMode.aER.bgK.aO && dj) {
            GrimMode.aER.bgK.jump();
        }
        if (this.tP) {
            if (!this.uc) {
                this.ud = GrimMode.aER.bgK.ud;
                this.ue = GrimMode.aER.bgK.ue;
                this.uf = GrimMode.aER.bgK.uf;
                this.uc = true;
            }
        } else if (this.uc) {
            GrimMode.aER.bgK.ud = this.ud;
            GrimMode.aER.bgK.ue = this.ue;
            GrimMode.aER.bgK.uf = this.uf;
            this.uc = false;
        }
    };
    @EventLink
    public final Listener<JumpEvent> uk = jumpEvent -> {
        boolean bl2;
        Speed speed = this.e(Speed.class);
        boolean bl3 = bl2 = speed.isEnabled() && speed.hl().wD() instanceof rise.module.impl.movement.speed.GrimMode && (Boolean)((rise.module.impl.movement.speed.GrimMode)speed.hl().wD()).PL.wD() != false;
        if (GrimMode.aER.bgK.Zz < 7 || GrimMode.aER.bgK.crZ || bl2) {
            return;
        }
        if (GrimMode.aER.bgK.aO && dj) {
            this.tP = true;
            dj = false;
            tt = true;
            bm.dispatch();
            Vector2d vector2d = new Vector2d(GrimMode.aER.bgK.ud, GrimMode.aER.bgK.uf);
            double d2 = GrimMode.aER.bgK.ue;
            this.tT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.tT.clear();
            GrimMode.aER.bgK.ud = vector2d.getX();
            GrimMode.aER.bgK.uf = vector2d.getY();
            GrimMode.aER.bgK.ue = d2;
            tt = false;
        }
    };
    @EventLink
    public final Listener<TickEvent> ul = tickEvent -> {
        boolean bl2;
        Speed speed = this.e(Speed.class);
        boolean bl3 = bl2 = speed.isEnabled() && speed.hl().wD() instanceof rise.module.impl.movement.speed.GrimMode && (Boolean)((rise.module.impl.movement.speed.GrimMode)speed.hl().wD()).PL.wD() != false;
        if (!this.tP || bl2) {
            tQ = false;
            return;
        }
        b b2 = new b(GrimMode.aER.bgK);
        if (((Boolean)this.tM.wD()).booleanValue()) {
            tQ = true;
            if (!((Boolean)this.tL.wD()).booleanValue()) {
                bs.d(false);
                bs.a(new Vector2f(GrimMode.aER.bgK.pl, (float)(90.0 - Math.random() * 0.1)), 10.0, cb.gH);
            }
        } else {
            tQ = false;
        }
        ao ao2 = ao.dwr;
        float f2 = (float)(GrimMode.aER.bgK.gW - (double)b2.wt());
        float f3 = 1.0f;
        float f4 = (float)(GrimMode.aER.bgK.gY - (double)b2.wx());
        b b3 = b2.aqY();
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_19.USE_ITEM_ON, (UserConnection)userConnection);
            packetWrapper.write((Type)Types.VAR_INT, (Object)0);
            packetWrapper.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition(b3.wt(), b3.wu(), b3.wx()));
            packetWrapper.write((Type)Types.VAR_INT, (Object)ao2.ordinal());
            packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(f2));
            packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(f3));
            packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(f4));
            packetWrapper.write((Type)Types.BOOLEAN, (Object)false);
            packetWrapper.write((Type)Types.VAR_INT, (Object)GrimMode.aER.bgu.Ho());
            packetWrapper.sendToServer(Protocol1_19To1_18_2.class);
        } else {
            GrimMode.aER.bgK.bkd.u(new k(b3, ao2.OY(), GrimMode.aER.bgK.Vk(), f2, f3, f4));
        }
        this.tO.add(b3);
    };

    public GrimMode(String string, Velocity velocity) {
        super(string, velocity);
    }

    @Override
    public void onDisable() {
        dk = false;
        tQ = false;
        this.tT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.tT.clear();
        dj = false;
    }

    @Override
    public void onEnable() {
        dk = false;
        tQ = false;
        this.tT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
        this.tT.clear();
        dj = false;
        this.tP = false;
        this.tO.clear();
    }

    static {
        dj = false;
        tQ = false;
    }
}

