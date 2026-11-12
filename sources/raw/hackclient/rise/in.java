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
package hackclient.rise;

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
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.akd;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bm;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ed;
import hackclient.rise.eo;
import hackclient.rise.ez;
import hackclient.rise.fe;
import hackclient.rise.fh;
import hackclient.rise.hf;
import hackclient.rise.mh;
import hackclient.rise.ot;
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

public final class in
extends akg<hf> {
    private final aki tL = new aki("Smart Combat (for High Ping)", (akg<?>)this, (Boolean)false);
    private final aki tM = new aki("Rotate", (akg<?>)this, (Boolean)true);
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
    @dm
    public final dk<fh> uh = fh2 -> {
        aj<a> aj2;
        boolean bl2;
        mh mh2 = this.e(mh.class);
        boolean bl3 = bl2 = mh2.isEnabled() && mh2.hl().wD() instanceof ot && (Boolean)((ot)mh2.hl().wD()).PL.wD() != false;
        if (tt || in.aER.bgK.Zz < 7 || in.aER.bgK.crZ || bl2) {
            return;
        }
        aj<?> aj3 = fh2.dq();
        if (aj3 instanceof t && ((t)(aj2 = (t)aj3)).getEntityID() == in.aER.bgK.getEntityId()) {
            if (!in.aER.bgK.aO) {
                this.tT.add(aj2);
                dj = true;
            } else {
                this.tP = true;
            }
            fh2.cF();
        }
        if ((aj3 = fh2.dq()) instanceof bc) {
            aj2 = (bc)aj3;
            if (dj) {
                this.tT.add(aj2);
                fh2.cF();
            }
        }
        if ((aj3 = fh2.dq()) instanceof z) {
            aj2 = (z)aj3;
            if (dj) {
                this.tT.add(aj2);
                fh2.cF();
            }
        }
        if ((aj3 = fh2.dq()) instanceof v) {
            aj2 = (v)aj3;
            if (dj) {
                this.tT.add(aj2);
                fh2.cF();
            }
        }
        if ((aj3 = fh2.dq()) instanceof ad) {
            aj2 = (ad)aj3;
            if (dj) {
                this.tT.add(aj2);
                fh2.cF();
            }
        }
        if ((aj3 = fh2.dq()) instanceof i) {
            aj2 = (i)aj3;
            if (dj) {
                this.tT.add(aj2);
                fh2.cF();
            }
        }
        if ((aj3 = fh2.dq()) instanceof an && this.tO.remove(aj3 = ((an)(aj2 = (an)aj3)).ahk()) && this.tO.isEmpty()) {
            this.tP = false;
            this.ug = 0;
        }
    };
    @dm
    public final dk<ez> ui = ez2 -> {
        boolean bl2;
        mh mh2 = this.e(mh.class);
        boolean bl3 = bl2 = mh2.isEnabled() && mh2.hl().wD() instanceof ot && (Boolean)((ot)mh2.hl().wD()).PL.wD() != false;
        if ((in.aER.bgK.Zz < 7 || in.aER.bgK.crZ || bl2) && in.aER.bgK.aO) {
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
            ez2.cF();
        }
        if (in.aER.bgK.tR > 25 && dj) {
            dj = false;
            tt = true;
            this.tT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.tT.clear();
            tt = false;
        }
    };
    @dm
    public final dk<eo> uj = eo2 -> {
        boolean bl2;
        mh mh2 = this.e(mh.class);
        boolean bl3 = bl2 = mh2.isEnabled() && mh2.hl().wD() instanceof ot && (Boolean)((ot)mh2.hl().wD()).PL.wD() != false;
        if (in.aER.bgK.Zz < 7 || in.aER.bgK.crZ) {
            return;
        }
        if (in.aER.bgK.crx > 3 && in.aER.bgK.aO && dj) {
            in.aER.bgK.jump();
        }
        if (this.tP) {
            if (!this.uc) {
                this.ud = in.aER.bgK.ud;
                this.ue = in.aER.bgK.ue;
                this.uf = in.aER.bgK.uf;
                this.uc = true;
            }
        } else if (this.uc) {
            in.aER.bgK.ud = this.ud;
            in.aER.bgK.ue = this.ue;
            in.aER.bgK.uf = this.uf;
            this.uc = false;
        }
    };
    @dm
    public final dk<ed> uk = ed2 -> {
        boolean bl2;
        mh mh2 = this.e(mh.class);
        boolean bl3 = bl2 = mh2.isEnabled() && mh2.hl().wD() instanceof ot && (Boolean)((ot)mh2.hl().wD()).PL.wD() != false;
        if (in.aER.bgK.Zz < 7 || in.aER.bgK.crZ || bl2) {
            return;
        }
        if (in.aER.bgK.aO && dj) {
            this.tP = true;
            dj = false;
            tt = true;
            bm.dispatch();
            aka aka2 = new aka(in.aER.bgK.ud, in.aER.bgK.uf);
            double d2 = in.aER.bgK.ue;
            this.tT.forEach((Consumer<aj<?>>)((Consumer<aj>)ahn::q));
            this.tT.clear();
            in.aER.bgK.ud = aka2.getX();
            in.aER.bgK.uf = aka2.getY();
            in.aER.bgK.ue = d2;
            tt = false;
        }
    };
    @dm
    public final dk<fe> ul = fe2 -> {
        boolean bl2;
        mh mh2 = this.e(mh.class);
        boolean bl3 = bl2 = mh2.isEnabled() && mh2.hl().wD() instanceof ot && (Boolean)((ot)mh2.hl().wD()).PL.wD() != false;
        if (!this.tP || bl2) {
            tQ = false;
            return;
        }
        b b2 = new b(in.aER.bgK);
        if (((Boolean)this.tM.wD()).booleanValue()) {
            tQ = true;
            if (!((Boolean)this.tL.wD()).booleanValue()) {
                bs.d(false);
                bs.a(new akb(in.aER.bgK.pl, (float)(90.0 - Math.random() * 0.1)), 10.0, cb.gH);
            }
        } else {
            tQ = false;
        }
        ao ao2 = ao.dwr;
        float f2 = (float)(in.aER.bgK.gW - (double)b2.wt());
        float f3 = 1.0f;
        float f4 = (float)(in.aER.bgK.gY - (double)b2.wx());
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
            packetWrapper.write((Type)Types.VAR_INT, (Object)in.aER.bgu.Ho());
            packetWrapper.sendToServer(Protocol1_19To1_18_2.class);
        } else {
            in.aER.bgK.bkd.u(new k(b3, ao2.OY(), in.aER.bgK.Vk(), f2, f3, f4));
        }
        this.tO.add(b3);
    };

    public in(String string, hf hf2) {
        super(string, hf2);
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

