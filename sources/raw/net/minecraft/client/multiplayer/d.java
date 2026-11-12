/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.protocol.v1_19_1to1_19.Protocol1_19_1To1_19
 *  com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.Protocol1_19_3To1_19_1
 *  com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.Protocol1_19_4To1_19_3
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2
 *  com.viaversion.viabackwards.protocol.v1_20to1_19_4.Protocol1_20To1_19_4
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocol.packet.PacketWrapperImpl
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1
 */
package net.minecraft.client.multiplayer;

import com.viaversion.viabackwards.protocol.v1_19_1to1_19.Protocol1_19_1To1_19;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.Protocol1_19_3To1_19_1;
import com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.Protocol1_19_4To1_19_3;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2;
import com.viaversion.viabackwards.protocol.v1_20to1_19_4.Protocol1_20To1_19_4;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocol.packet.PacketWrapperImpl;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.vialoadingbase.netty.handler.VLBViaDecodeHandler;
import hackclient.rise.a;
import hackclient.rise.aea;
import hackclient.rise.bu;
import hackclient.rise.eb;
import hackclient.rise.et;
import hackclient.rise.eu;
import hackclient.rise.tr;
import hackclient.rise.uf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.entity.c;
import net.minecraft.client.gui.inventory.m;
import net.minecraft.client.gui.inventory.p;
import net.minecraft.client.gui.inventory.q;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.network.h;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.player.g;
import net.minecraft.item.af;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.l;
import net.minecraft.network.play.client.r;
import net.minecraft.network.play.client.t;
import net.minecraft.network.play.client.u;
import net.minecraft.util.b;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.cm;
import net.minecraft.util.da;
import net.minecraft.world.ao;
import net.minecraft.world.w;

public class d
implements aea {
    private final net.minecraft.client.d bDs;
    private final h bDt;
    private b bDu = new b(-1, -1, -1);
    private co bDv;
    private int bDw;
    public float bDx;
    private float bDy;
    public int bDz;
    public boolean bDA;
    private ao bDB = ao.dEx;
    public int bDC;
    public int bDD;

    public d(net.minecraft.client.d d2, h h2) {
        this.bDs = d2;
        this.bDt = h2;
    }

    public static void a(net.minecraft.client.d d2, d d3, b b2, net.minecraft.util.ao ao2) {
        if (!d2.bgF.a(d2.bgK, b2, ao2)) {
            d3.d(b2, ao2);
        }
    }

    public void j(net.minecraft.entity.player.a a2) {
        this.bDB.a(a2.cIt);
    }

    public int Ho() {
        return ++this.bDw;
    }

    public boolean CZ() {
        return this.bDB == ao.dEA;
    }

    public void a(ao ao2) {
        this.bDB = ao2;
        this.bDB.a(this.bDs.bgK.cIt);
    }

    public void k(net.minecraft.entity.player.a a2) {
        a2.pl = -180.0f;
    }

    public boolean Hp() {
        return this.bDB.awG();
    }

    public boolean d(b b2, net.minecraft.util.ao ao2) {
        Object object;
        Object object2;
        et et2 = new et(b2);
        a.a.e().d(et2);
        if (et2.isCancelled()) {
            return false;
        }
        if (this.bDB.awF()) {
            if (this.bDB == ao.dEA) {
                return false;
            }
            if (!this.bDs.bgK.aca()) {
                object2 = this.bDs.bgF.L(b2).df();
                this.d(bu.class);
                object = bu.bO();
                if (object == null) {
                    return false;
                }
                if (!((co)object).K((Block)object2)) {
                    return false;
                }
            }
        }
        if (this.bDB.amh() && this.bDs.bgK.Vk() != null && this.bDs.bgK.Vk().bP() instanceof cp) {
            return false;
        }
        object2 = this.bDs.bgF;
        object = ((w)object2).L(b2);
        Block block = object.df();
        if (block.xb() == Material.beo) {
            return false;
        }
        ((w)object2).e(2001, b2, Block.a((IBlockState)object));
        boolean bl2 = ((w)object2).aL(b2);
        if (bl2) {
            block.b((w)object2, b2, (IBlockState)object);
        }
        this.bDu = new b(this.bDu.wt(), -1, this.bDu.wx());
        if (!this.bDB.amh()) {
            co co2;
            if (this.bDs.bgK.cHV.cJG) {
                this.d(bu.class);
                v0 = bu.bO();
            } else {
                v0 = co2 = this.bDs.bgK.Vk();
            }
            if (co2 != null) {
                co2.a((w)object2, block, b2, this.bDs.bgK);
                if (co2.cWZ == 0) {
                    this.bDs.bgK.abP();
                }
            }
        }
        return bl2;
    }

    public boolean e(b b2, net.minecraft.util.ao ao2) {
        co co2;
        Block block;
        if (this.bDB.awF()) {
            if (this.bDB == ao.dEA) {
                return false;
            }
            if (!this.bDs.bgK.aca()) {
                block = this.bDs.bgF.L(b2).df();
                if (this.bDs.bgK.cHV.cJG) {
                    this.d(bu.class);
                    v0 = bu.bO();
                } else {
                    v0 = co2 = this.bDs.bgK.Vk();
                }
                if (co2 == null) {
                    return false;
                }
                if (!co2.K(block)) {
                    return false;
                }
            }
        }
        if (!this.bDs.bgF.Sv().bm(b2)) {
            return false;
        }
        if (this.bDB.amh()) {
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
                block = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                co2 = PacketWrapper.create((PacketType)ServerboundPackets1_19.PLAYER_ACTION, (UserConnection)block);
                co2.write((Type)Types.VAR_INT, net.minecraft.network.play.client.j.daZ.ordinal());
                co2.write(Types.BLOCK_POSITION1_14, new BlockPosition(b2.wt(), b2.wu(), b2.wx()));
                co2.write((Type)Types.BYTE, (byte)ao2.OY());
                co2.write((Type)Types.VAR_INT, this.Ho());
                co2.sendToServer(Protocol1_19To1_18_2.class);
            } else {
                this.bDt.u(new i(net.minecraft.network.play.client.j.daZ, b2, ao2));
            }
            d.a(this.bDs, this, b2, ao2);
            this.bDz = 5;
        } else if (!this.bDA || !this.I(b2)) {
            boolean bl2;
            if (this.bDA) {
                this.bDt.u(new i(net.minecraft.network.play.client.j.dba, this.bDu, ao2));
            }
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
                block = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                co2 = PacketWrapper.create((PacketType)ServerboundPackets1_19.PLAYER_ACTION, (UserConnection)block);
                co2.write((Type)Types.VAR_INT, net.minecraft.network.play.client.j.daZ.ordinal());
                co2.write(Types.BLOCK_POSITION1_14, new BlockPosition(b2.wt(), b2.wu(), b2.wx()));
                co2.write((Type)Types.BYTE, (byte)ao2.OY());
                co2.write((Type)Types.VAR_INT, this.Ho());
                co2.sendToServer(Protocol1_19To1_18_2.class);
            } else {
                this.bDt.u(new i(net.minecraft.network.play.client.j.daZ, b2, ao2));
            }
            block = this.bDs.bgF.L(b2).df();
            boolean bl3 = bl2 = block.xb() != Material.beo;
            if (bl2 && this.bDx == 0.0f) {
                block.a((w)this.bDs.bgF, b2, this.bDs.bgK);
            }
            if (this.bDs.bhc != null && this.bDs.bhc.dzu.equals((Object)cf.dzy) && this.bDs.bhc.dg().equals(b2)) {
                eu eu2 = new eu(this.bDs.bgK, this.bDs.bgK.baU, b2);
                a.a.e().d(eu2);
            }
            if (bl2 && block.a(this.bDs.bgK, this.bDs.bgK.baU, b2) >= 1.0f) {
                this.d(b2, ao2);
            } else {
                co co3;
                this.bDA = true;
                this.bDu = b2;
                if (this.bDs.bgK.cHV.cJG) {
                    this.d(bu.class);
                    co3 = bu.bO();
                } else {
                    co3 = this.bDs.bgK.Vk();
                }
                this.bDv = co3;
                this.bDx = 0.0f;
                this.bDy = 0.0f;
                this.bDs.bgF.b(this.bDs.bgK.getEntityId(), this.bDu, (int)(this.bDx * 10.0f) - 1);
            }
        }
        return true;
    }

    public void Hq() {
        if (this.bDA) {
            this.bDt.u(new i(net.minecraft.network.play.client.j.dba, this.bDu, net.minecraft.util.ao.dwq));
            this.bDA = false;
            this.bDx = 0.0f;
            this.bDs.bgF.b(this.bDs.bgK.getEntityId(), this.bDu, -1);
        }
    }

    public boolean f(b b2, net.minecraft.util.ao ao2) {
        this.Ht();
        if (this.bDz > 0) {
            --this.bDz;
            return true;
        }
        if (this.bDB.amh() && this.bDs.bgF.Sv().bm(b2)) {
            this.bDz = 5;
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
                UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_19.PLAYER_ACTION, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.VAR_INT, (Object)net.minecraft.network.play.client.j.daZ.ordinal());
                packetWrapper.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition(b2.wt(), b2.wu(), b2.wx()));
                packetWrapper.write((Type)Types.BYTE, (Object)((byte)ao2.OY()));
                packetWrapper.write((Type)Types.VAR_INT, (Object)this.Ho());
                packetWrapper.sendToServer(Protocol1_19To1_18_2.class);
            } else {
                this.bDt.u(new i(net.minecraft.network.play.client.j.daZ, b2, ao2));
            }
            d.a(this.bDs, this, b2, ao2);
            return true;
        }
        if (this.I(b2)) {
            Block block = this.bDs.bgF.L(b2).df();
            if (block.xb() == Material.beo) {
                this.bDA = false;
                return false;
            }
            this.bDx += block.a(this.bDs.bgK, this.bDs.bgK.baU, b2);
            if (this.bDy % 4.0f == 0.0f) {
                this.bDs.Bx().a(new PositionedSoundRecord(new cm(block.aSB.xR()), (block.aSB.getVolume() + 1.0f) / 8.0f, block.aSB.xT() * 0.5f, (float)b2.wt() + 0.5f, (float)b2.wu() + 0.5f, (float)b2.wx() + 0.5f));
            }
            this.bDy += 1.0f;
            if (this.bDx >= 1.0f) {
                this.bDA = false;
                if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
                    UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                    PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_19.PLAYER_ACTION, (UserConnection)userConnection);
                    packetWrapper.write((Type)Types.VAR_INT, (Object)net.minecraft.network.play.client.j.dbb.ordinal());
                    packetWrapper.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition(b2.wt(), b2.wu(), b2.wx()));
                    packetWrapper.write((Type)Types.BYTE, (Object)((byte)ao2.OY()));
                    packetWrapper.write((Type)Types.VAR_INT, (Object)this.Ho());
                    packetWrapper.sendToServer(Protocol1_19To1_18_2.class);
                } else {
                    this.bDt.u(new i(net.minecraft.network.play.client.j.dbb, b2, ao2));
                }
                this.d(b2, ao2);
                this.bDx = 0.0f;
                this.bDy = 0.0f;
                this.bDz = 5;
            }
            this.bDs.bgF.b(this.bDs.bgK.getEntityId(), this.bDu, (int)(this.bDx * 10.0f) - 1);
            return true;
        }
        return this.e(b2, ao2);
    }

    public float Hr() {
        return this.bDB.amh() ? 5.0f : 4.5f;
    }

    public void Hs() {
        this.Ht();
        if (this.bDt.dr().afe()) {
            this.bDt.dr().afa();
        } else {
            this.bDt.dr().afj();
        }
    }

    private boolean I(b b2) {
        boolean bl2;
        co co2;
        if (this.bDs.bgK.cHV.cJG) {
            this.d(bu.class);
            co2 = bu.bO();
        } else {
            co2 = this.bDs.bgK.Vk();
        }
        co co3 = co2;
        boolean bl3 = bl2 = this.bDv == null && co3 == null;
        if (this.bDv != null && co3 != null) {
            bl2 = co3.bP() == this.bDv.bP() && co.c(co3, this.bDv) && (co3.aed() || co3.yc() == this.bDv.yc());
        }
        return b2.equals(this.bDu) && bl2;
    }

    public void Ht() {
        g g2 = this.bDs.bgK.cHV;
        int n2 = g2.cJE;
        eb eb2 = new eb(n2);
        a.a.e().d(eb2);
        n2 = eb2.cX();
        if (n2 != this.bDC) {
            this.bDD = this.bDC;
            this.bDC = n2;
            this.bDt.u(new l(this.bDC));
        }
    }

    public boolean a(c c2, j j2, co co2, b b2, net.minecraft.util.ao ao2, da da2) {
        Object object;
        IBlockState iBlockState;
        this.Ht();
        float f2 = (float)(da2.dAG - (double)b2.wt());
        float f3 = (float)(da2.dAH - (double)b2.wu());
        float f4 = (float)(da2.dAI - (double)b2.wx());
        boolean bl2 = false;
        if (!this.bDs.bgF.Sv().bm(b2)) {
            return false;
        }
        if (this.bDB != ao.dEA) {
            iBlockState = j2.L(b2);
            if ((!c2.isSneaking() || c2.Vk() == null) && iBlockState.df().a((w)j2, b2, iBlockState, c2, ao2, f2, f3, f4)) {
                bl2 = true;
            }
            if (!bl2 && co2 != null && co2.bP() instanceof af) {
                object = (af)co2.bP();
                if (!((af)object).a(j2, b2, ao2, c2, co2)) {
                    return false;
                }
                co2.cXb = 0;
                --co2.cXa;
            }
        }
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
            iBlockState = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            object = PacketWrapper.create((PacketType)ServerboundPackets1_19.USE_ITEM_ON, (UserConnection)iBlockState);
            object.write((Type)Types.VAR_INT, (Object)0);
            object.write(Types.BLOCK_POSITION1_14, (Object)new BlockPosition(b2.wt(), b2.wu(), b2.wx()));
            object.write((Type)Types.VAR_INT, (Object)ao2.ordinal());
            object.write((Type)Types.FLOAT, (Object)Float.valueOf(f2));
            object.write((Type)Types.FLOAT, (Object)Float.valueOf(f3));
            object.write((Type)Types.FLOAT, (Object)Float.valueOf(f4));
            object.write((Type)Types.BOOLEAN, (Object)false);
            object.write((Type)Types.VAR_INT, (Object)this.Ho());
            object.sendToServer(Protocol1_19To1_18_2.class);
        } else {
            this.bDt.u(new k(b2, ao2.OY(), c2.cHV.acE(), f2, f3, f4));
        }
        if (!bl2 && this.bDB != ao.dEA) {
            if (co2 == null) {
                return false;
            }
            if (this.bDB.amh()) {
                int n2 = co2.yc();
                int n3 = co2.cWZ;
                boolean bl3 = co2.a(c2, j2, b2, ao2, f2, f3, f4);
                co2.gf(n2);
                co2.cWZ = n3;
                return bl3;
            }
            return co2.a(c2, j2, b2, ao2, f2, f3, f4);
        }
        return true;
    }

    public float Hu() {
        return this.bDx;
    }

    public void ae(float f2) {
        this.bDx = f2;
    }

    public boolean a(net.minecraft.entity.player.a a2, w w2, co co2) {
        Object object;
        if (this.bDB == ao.dEA) {
            return false;
        }
        this.Ht();
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19)) {
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            object = PacketWrapper.create((PacketType)ServerboundPackets1_19.USE_ITEM, (UserConnection)userConnection);
            object.write((Type)Types.VAR_INT, (Object)0);
            object.write((Type)Types.VAR_INT, (Object)this.Ho());
            object.sendToServer(Protocol1_19To1_18_2.class);
        } else {
            this.bDt.u(new k(a2.cHV.acE()));
        }
        int n2 = co2.cWZ;
        object = co2.a(w2, a2);
        if (object != co2 || object != null && object.cWZ != n2) {
            co[] coArray = a2.cHV.cJC;
            this.d(bu.class);
            coArray[bu.bQ()] = object;
            if (object.cWZ == 0) {
                co[] coArray2 = a2.cHV.cJC;
                this.d(bu.class);
                coArray2[bu.bQ()] = null;
            }
            return true;
        }
        return false;
    }

    public c a(w w2, net.minecraft.stats.m m2) {
        return new c(this.bDs, w2, this.bDt, m2);
    }

    public void a(net.minecraft.entity.player.a a2, net.minecraft.entity.c c2) {
        this.Ht();
        this.bDt.u(new net.minecraft.network.play.client.c(c2, net.minecraft.network.play.client.d.daU));
        if (this.bDB != ao.dEA) {
            a2.ar(c2);
        }
    }

    public boolean b(net.minecraft.entity.player.a a2, net.minecraft.entity.c c2) {
        this.Ht();
        this.bDt.u(new net.minecraft.network.play.client.c(c2, net.minecraft.network.play.client.d.daT));
        return this.bDB != ao.dEA && a2.aq(c2);
    }

    public boolean a(net.minecraft.entity.player.a a2, net.minecraft.entity.c c2, ce ce2) {
        this.Ht();
        da da2 = new da(ce2.daS.dAG - c2.gW, ce2.daS.dAH - c2.gX, ce2.daS.dAI - c2.gY);
        this.bDt.u(new net.minecraft.network.play.client.c(c2, da2));
        return this.bDB != ao.dEA && c2.a(a2, da2);
    }

    public co a(int n2, int n3, int n4, int n5, net.minecraft.entity.player.a a2) {
        short s2 = a2.cHY.b(a2.cHV);
        co co2 = a2.cHY.a(n3, n4, n5, a2);
        co co3 = ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_12) ? this.bDs.bgK.cHV.bO() : co2;
        if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19) && ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_20_2) & (!this.e(tr.class).jY() || this.e(tr.class).kq() || this.e(uf.class).kN() > 0 || n5 < 5 && n5 > 0 || !(this.bDs.bgR instanceof m) && !(this.bDs.bgR instanceof q) && !(this.bDs.bgR instanceof net.minecraft.client.gui.inventory.h) && !(this.bDs.bgR instanceof p))) {
            UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
            ProtocolInfo protocolInfo = userConnection.getProtocolInfo();
            Class<Protocol1_20To1_19_4> clazz = null;
            ProtocolVersion protocolVersion = ViaLoadingBase.getInstance().getTargetVersion();
            PacketWrapperImpl packetWrapperImpl = null;
            if (protocolVersion == ProtocolVersion.v1_20) {
                packetWrapperImpl = (PacketWrapperImpl)PacketWrapper.create((PacketType)ServerboundPackets1_19_4.CONTAINER_CLICK, (UserConnection)userConnection);
                clazz = Protocol1_20To1_19_4.class;
            } else if (protocolVersion == ProtocolVersion.v1_19_4) {
                packetWrapperImpl = (PacketWrapperImpl)PacketWrapper.create((PacketType)ServerboundPackets1_19_4.CONTAINER_CLICK, (UserConnection)userConnection);
                clazz = Protocol1_19_4To1_19_3.class;
            } else if (protocolVersion == ProtocolVersion.v1_19_3) {
                packetWrapperImpl = (PacketWrapperImpl)PacketWrapper.create((PacketType)ServerboundPackets1_19_3.CONTAINER_CLICK, (UserConnection)userConnection);
                clazz = Protocol1_19_3To1_19_1.class;
            } else if (protocolVersion == ProtocolVersion.v1_19_1) {
                packetWrapperImpl = (PacketWrapperImpl)PacketWrapper.create((PacketType)ServerboundPackets1_19_1.CONTAINER_CLICK, (UserConnection)userConnection);
                clazz = Protocol1_19_1To1_19.class;
            } else if (protocolVersion == ProtocolVersion.v1_19) {
                packetWrapperImpl = (PacketWrapperImpl)PacketWrapper.create((PacketType)ServerboundPackets1_19.CONTAINER_CLICK, (UserConnection)userConnection);
                clazz = Protocol1_19To1_18_2.class;
            }
            int n6 = VLBViaDecodeHandler.stateId;
            assert (packetWrapperImpl != null);
            packetWrapperImpl.write((Type)Types.BYTE, (Object)((byte)n2));
            packetWrapperImpl.write((Type)Types.VAR_INT, (Object)n6);
            packetWrapperImpl.write((Type)Types.SHORT, (Object)((short)n3));
            packetWrapperImpl.write((Type)Types.BYTE, (Object)((byte)n4));
            packetWrapperImpl.write((Type)Types.VAR_INT, (Object)n5);
            packetWrapperImpl.write((Type)Types.VAR_INT, (Object)0);
            packetWrapperImpl.write((Type)Types.BYTE, (Object)0);
            if (protocolInfo.getPipeline().contains(clazz)) {
                packetWrapperImpl.sendToServer(clazz);
            }
        } else {
            this.bDt.u(new r(n2, n3, n4, n5, co3, s2));
        }
        return co2;
    }

    public void I(int n2, int n3) {
        this.bDt.u(new u(n2, n3));
    }

    public void a(co co2, int n2) {
        if (this.bDB.amh()) {
            this.bDt.u(new t(n2, co2));
        }
    }

    public void K(co co2) {
        if (this.bDB.amh() && co2 != null) {
            this.bDt.u(new t(-1, co2));
        }
    }

    public void l(net.minecraft.entity.player.a a2) {
        this.Ht();
        this.bDt.u(new i(net.minecraft.network.play.client.j.dbe, b.dtN, net.minecraft.util.ao.dwq));
        a2.abI();
    }

    public boolean Hv() {
        return this.bDB.awG();
    }

    public boolean Hw() {
        return !this.bDB.amh();
    }

    public boolean Hx() {
        return this.bDB.amh();
    }

    public boolean Hy() {
        return this.bDB.amh();
    }

    public boolean Dz() {
        return this.bDs.bgK.isRiding() && this.bDs.bgK.crC instanceof f;
    }

    public boolean Hz() {
        return this.bDB == ao.dEA;
    }

    public ao HA() {
        return this.bDB;
    }

    public boolean HB() {
        return this.bDA;
    }
}

