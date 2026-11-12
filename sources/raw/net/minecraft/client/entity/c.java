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
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 */
package net.minecraft.client.entity;

import com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import hackclient.rise.aea;
import hackclient.rise.akb;
import hackclient.rise.dq;
import hackclient.rise.eg;
import hackclient.rise.ei;
import hackclient.rise.ej;
import hackclient.rise.ek;
import hackclient.rise.em;
import hackclient.rise.en;
import hackclient.rise.ez;
import net.minecraft.client.audio.MovingSoundMinecartRiding;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.entity.a;
import net.minecraft.client.entity.d;
import net.minecraft.client.gui.bl;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.bs;
import net.minecraft.client.gui.inventory.b;
import net.minecraft.client.gui.inventory.g;
import net.minecraft.client.gui.inventory.m;
import net.minecraft.client.gui.inventory.n;
import net.minecraft.client.gui.inventory.o;
import net.minecraft.client.gui.inventory.p;
import net.minecraft.client.gui.inventory.r;
import net.minecraft.client.gui.s;
import net.minecraft.client.gui.y;
import net.minecraft.client.network.h;
import net.minecraft.command.server.e;
import net.minecraft.entity.ae;
import net.minecraft.entity.item.k;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.item.co;
import net.minecraft.network.play.client.aa;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.j;
import net.minecraft.network.play.client.q;
import net.minecraft.network.play.client.w;
import net.minecraft.network.play.client.z;
import net.minecraft.stats.f;
import net.minecraft.tileentity.ag;
import net.minecraft.util.ad;
import net.minecraft.util.ao;
import net.minecraft.util.as;
import net.minecraft.util.ba;
import net.minecraft.util.bt;
import net.minecraft.util.cc;
import net.minecraft.util.cm;
import net.minecraft.util.da;

public class c
extends a
implements aea {
    public h bkd;
    private final net.minecraft.stats.m bke;
    public UserConnection user;
    private d bkf = new d(false, false, false, false, false, false, false);
    public double bkg;
    public double bkh;
    public double bki;
    public float bkj;
    public float bkk;
    public boolean bkl;
    public boolean bkm;
    public boolean bkn;
    public int bko;
    private boolean bkp;
    private String bkq;
    public cc bkr;
    protected net.minecraft.client.d P;
    protected int bks;
    public int bkt;
    public float bku;
    public float bkv;
    public float po;
    public float bkw;
    public float bkx;
    public float bky;
    private int bkz;
    private float bkA;
    public float bkB;
    public float bkC;
    public boolean bkD;

    public c(net.minecraft.client.d d2, net.minecraft.world.w w2, h h2, net.minecraft.stats.m m2) {
        super(w2, h2.Ie());
        this.bkd = h2;
        this.bke = m2;
        this.P = d2;
        this.csP = 0;
    }

    @Override
    public boolean a(ad ad2, float f2) {
        return false;
    }

    @Override
    public void P(float f2) {
    }

    @Override
    public void D(net.minecraft.entity.c c2) {
        super.D(c2);
        if (c2 instanceof k) {
            this.P.Bx().a(new MovingSoundMinecartRiding(this, (k)c2));
        }
    }

    @Override
    public void Dm() {
        if (this.baU.aJ(new net.minecraft.util.b(this.gW, 0.0, this.gY))) {
            boolean bl2;
            this.bkw = this.po;
            this.po = this.pm;
            boolean bl3 = bl2 = this == net.minecraft.client.d.AZ().bgK;
            if (bl2) {
                hackclient.rise.a.a.e().d(new ej());
            }
            super.Dm();
            d d2 = new d(this.bkr.cuW > 0.0f, this.bkr.cuW < 0.0f, this.bkr.dzs > 0.0f, this.bkr.dzs < 0.0f, this.bkr.gD, this.bkr.jr, this.P.aIY.chs.Re());
            if (!this.bkf.equals(d2) && ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2)) {
                UserConnection userConnection = (UserConnection)Via.getManager().getConnectionManager().getConnections().iterator().next();
                PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundPackets1_21_2.PLAYER_INPUT, (UserConnection)userConnection);
                packetWrapper.write((Type)Types.BYTE, (Object)d2.DE());
                packetWrapper.sendToServer(Protocol1_21_2To1_21.class);
                this.bkf = d2;
            }
            if (this.isRiding()) {
                this.bkd.u(new net.minecraft.network.play.client.g(this.pl, this.pm, this.aO));
                this.bkd.u(new net.minecraft.network.play.client.p(this.cuV, this.cuW, this.bkr.gD, this.bkr.jr));
            } else {
                this.Do();
            }
            if (bl2) {
                hackclient.rise.a.a.e().d(new eg());
            }
        }
    }

    public void Do() {
        boolean bl2;
        boolean bl3;
        ei ei2 = new ei(this.gW, this.gX, this.gY, this.pl, this.pm, this.aO, this.isSprinting());
        if (this == this.P.bgK) {
            hackclient.rise.a.a.e().d(ei2);
        }
        if ((bl3 = ei2.isSprinting()) != this.bkm) {
            if (bl3) {
                this.bkd.u(new net.minecraft.network.play.client.n(this, net.minecraft.network.play.client.o.dbs));
            } else {
                this.bkd.u(new net.minecraft.network.play.client.n(this, net.minecraft.network.play.client.o.dbt));
            }
            this.bkm = bl3;
        }
        if ((bl2 = this.isSneaking()) != this.bkl) {
            if (bl2) {
                this.bkd.u(new net.minecraft.network.play.client.n(this, net.minecraft.network.play.client.o.dbp));
            } else {
                this.bkd.u(new net.minecraft.network.play.client.n(this, net.minecraft.network.play.client.o.dbq));
            }
            this.bkl = bl2;
        }
        if (ei2.isCancelled()) {
            return;
        }
        if (this.DC()) {
            boolean bl4;
            double d2 = ei2.getPosX() - this.bkg;
            double d3 = ei2.getPosY() - this.bkh;
            double d4 = ei2.getPosZ() - this.bki;
            double d5 = ei2.getYaw() - this.bkj;
            double d6 = ei2.getPitch() - this.bkk;
            if (ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
                ++this.bko;
            }
            boolean bl5 = d2 * d2 + d3 * d3 + d4 * d4 > (ViaLoadingBase.getInstance().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18) ? 9.0E-4 : 4.0E-8) || this.bko >= 20;
            boolean bl6 = d5 != 0.0 || d6 != 0.0;
            boolean bl7 = bl4 = ViaLoadingBase.getInstance().getTargetVersion().getVersion() <= 47;
            if (this.crC == null) {
                if (bl5 && bl6) {
                    this.bkd.u(new net.minecraft.network.play.client.h(ei2.getPosX(), ei2.getPosY(), ei2.getPosZ(), ei2.getYaw(), ei2.getPitch(), ei2.isOnGround()));
                } else if (bl5) {
                    this.bkd.u(new net.minecraft.network.play.client.f(ei2.getPosX(), ei2.getPosY(), ei2.getPosZ(), ei2.isOnGround()));
                } else if (bl6) {
                    this.bkd.u(new net.minecraft.network.play.client.g(ei2.getYaw(), ei2.getPitch(), ei2.isOnGround()));
                } else if (this.bkn != this.aO || bl4) {
                    this.bkd.u(new net.minecraft.network.play.client.e(ei2.isOnGround()));
                }
            } else {
                this.bkd.u(new net.minecraft.network.play.client.h(this.ud, -999.0, this.uf, this.pl, this.pm, this.aO));
                bl5 = false;
            }
            if (!ViaLoadingBase.getInstance().getTargetVersion().newerThan(ProtocolVersion.v1_8)) {
                ++this.bko;
            }
            if (bl5) {
                this.bkg = ei2.getPosX();
                this.bkh = ei2.getPosY();
                this.bki = ei2.getPosZ();
                this.bko = 0;
            }
            if (bl6) {
                this.bkj = ei2.getYaw();
                this.bkk = ei2.getPitch();
            }
            this.bkn = ei2.isOnGround();
        }
    }

    @Override
    public net.minecraft.entity.item.i V(boolean bl2) {
        j j2 = bl2 ? j.dbc : j.dbd;
        this.bkd.u(new i(j2, net.minecraft.util.b.dtN, net.minecraft.util.ao.dwq));
        return null;
    }

    @Override
    protected void a(net.minecraft.entity.item.i i2) {
    }

    public void sendChatMessage(String string) {
        dq dq2 = new dq(string);
        hackclient.rise.a.a.e().d(dq2);
        if (dq2.isCancelled()) {
            return;
        }
        this.bkd.u(new net.minecraft.network.play.client.b(dq2.getMessage()));
    }

    @Override
    public void swingItem() {
        super.swingItem();
        this.bkd.u(new net.minecraft.network.play.client.m());
    }

    @Override
    public void Dp() {
        this.bkd.u(new z(aa.dbP));
    }

    @Override
    protected void b(ad ad2, float f2) {
        if (!this.a(ad2)) {
            this.aY(this.getHealth() - f2);
        }
    }

    @Override
    public void Dq() {
        this.bkd.u(new q(this.cHY.cSL));
        this.Dr();
    }

    public void Dr() {
        this.cHV.e((co)null);
        super.Dq();
        this.P.a((bp)null);
    }

    public void Q(float f2) {
        if (this.bkp) {
            float f3 = this.getHealth() - f2;
            if (f3 <= 0.0f) {
                this.aY(f2);
                if (f3 < 0.0f) {
                    this.csA = this.cuA / 2;
                }
            } else {
                this.cuT = f3;
                this.aY(this.getHealth());
                this.csA = this.cuA;
                this.b(ad.dvl, f3);
                this.cut = 10;
                this.cus = 10;
            }
        } else {
            this.aY(f2);
            this.bkp = true;
        }
    }

    @Override
    public void a(f f2, int n2) {
        if (f2 != null && f2.dpp) {
            super.a(f2, n2);
        }
    }

    @Override
    public void Ds() {
        this.bkd.u(new w(this.cIt));
    }

    @Override
    public boolean Dt() {
        return true;
    }

    protected void Du() {
        this.bkd.u(new net.minecraft.network.play.client.n(this, net.minecraft.network.play.client.o.dbu, (int)(this.DA() * 100.0f)));
    }

    public void Dv() {
        this.bkd.u(new net.minecraft.network.play.client.n(this, net.minecraft.network.play.client.o.dbv));
    }

    public void cF(String string) {
        this.bkq = string;
    }

    public String Dw() {
        return this.bkq;
    }

    public net.minecraft.stats.m Dx() {
        return this.bke;
    }

    @Override
    public void b(ba ba2) {
        this.P.bha.Ey().c(ba2);
    }

    @Override
    protected boolean x(double d2, double d3, double d4) {
        if (this.csp) {
            return false;
        }
        net.minecraft.util.b b2 = new net.minecraft.util.b(d2, d3, d4);
        double d5 = d2 - (double)b2.wt();
        double d6 = d4 - (double)b2.wx();
        if (!this.G(b2)) {
            ek ek2 = new ek();
            hackclient.rise.a.a.e().d(ek2);
            if (ek2.isCancelled()) {
                return false;
            }
            int n2 = -1;
            double d7 = 9999.0;
            if (this.G(b2.arb()) && d5 < d7) {
                d7 = d5;
                n2 = 0;
            }
            if (this.G(b2.arc()) && 1.0 - d5 < d7) {
                d7 = 1.0 - d5;
                n2 = 1;
            }
            if (this.G(b2.aqZ()) && d6 < d7) {
                d7 = d6;
                n2 = 4;
            }
            if (this.G(b2.ara()) && 1.0 - d6 < d7) {
                d7 = 1.0 - d6;
                n2 = 5;
            }
            float f2 = 0.1f;
            if (n2 == 0) {
                this.ud = -0.1f;
            }
            if (n2 == 1) {
                this.ud = 0.1f;
            }
            if (n2 == 4) {
                this.uf = -0.1f;
            }
            if (n2 == 5) {
                this.uf = 0.1f;
            }
        }
        return false;
    }

    private boolean G(net.minecraft.util.b b2) {
        return !this.baU.L(b2).df().xd() && !this.baU.L(b2.aqX()).df().xd();
    }

    @Override
    public void setSprinting(boolean bl2) {
        super.setSprinting(bl2);
        this.bkt = bl2 ? 600 : 0;
    }

    public void a(float f2, int n2, int n3) {
        this.cIw = f2;
        this.cIv = n2;
        this.cIu = n3;
    }

    @Override
    public void a(ba ba2) {
        this.P.bha.Ey().c(ba2);
    }

    @Override
    public boolean c(int n2, String string) {
        return n2 <= 0;
    }

    @Override
    public net.minecraft.util.b yl() {
        return new net.minecraft.util.b(this.gW + 0.5, this.gX + 0.5, this.gY + 0.5);
    }

    @Override
    public void a(String string, float f2, float f3) {
        this.baU.a(this.gW, this.gX, this.gY, string, f2, f3, false);
    }

    @Override
    public boolean Dy() {
        return true;
    }

    public boolean Dz() {
        return this.crC != null && this.crC instanceof net.minecraft.entity.passive.f && ((net.minecraft.entity.passive.f)this.crC).aas();
    }

    public float DA() {
        return this.bkA;
    }

    @Override
    public void a(ag ag2) {
        this.P.a(new o(ag2));
    }

    @Override
    public void a(e e2) {
        this.P.a(new net.minecraft.client.gui.h(e2));
    }

    @Override
    protected boolean l(da da2) {
        float f2 = this.pl * ((float)Math.PI / 180);
        double d2 = bt.bx(f2);
        double d3 = bt.bB(f2);
        double d4 = (double)this.cuV * d3 - (double)this.cuW * d2;
        double d5 = (double)this.cuW * d3 + (double)this.cuV * d2;
        double d6 = d4 * d4 + d5 * d5;
        double d7 = da2.dAG * da2.dAG + da2.dAI * da2.dAI;
        if (d6 < (double)1.0E-5f || d7 < (double)1.0E-5f) {
            return false;
        }
        return Math.acos((d4 * da2.dAG + d5 * da2.dAI) / Math.sqrt(d6 * d7)) < 0.13962633907794952;
    }

    @Override
    public void G(co co2) {
        net.minecraft.item.d d2 = co2.bP();
        if (d2 == Items.cRQ) {
            this.P.a(new bs(this, co2, true));
        }
    }

    @Override
    public void a(ab ab2) {
        String string;
        String string2 = string = ab2 instanceof net.minecraft.world.m ? ((net.minecraft.world.m)((Object)ab2)).xX() : "minecraft:container";
        if ("minecraft:chest".equals(string)) {
            this.P.a(new net.minecraft.client.gui.inventory.h(this.cHV, ab2));
        } else if ("minecraft:hopper".equals(string)) {
            this.P.a(new y(this.cHV, ab2));
        } else if ("minecraft:furnace".equals(string)) {
            this.P.a(new p(this.cHV, ab2));
        } else if ("minecraft:brewing_stand".equals(string)) {
            this.P.a(new g(this.cHV, ab2));
        } else if ("minecraft:beacon".equals(string)) {
            this.P.a(new b(this.cHV, ab2));
        } else if (!"minecraft:dispenser".equals(string) && !"minecraft:dropper".equals(string)) {
            this.P.a(new net.minecraft.client.gui.inventory.h(this.cHV, ab2));
        } else {
            this.P.a(new n(this.cHV, ab2));
        }
    }

    @Override
    public void a(net.minecraft.entity.passive.f f2, ab ab2) {
        this.P.a(new r(this.cHV, ab2, f2));
    }

    @Override
    public void a(net.minecraft.world.m m2) {
        String string = m2.xX();
        if ("minecraft:crafting_table".equals(string)) {
            this.P.a(new m(this.cHV, this.baU));
        } else if ("minecraft:enchanting_table".equals(string)) {
            this.P.a(new s(this.cHV, this.baU, m2));
        } else if ("minecraft:anvil".equals(string)) {
            this.P.a(new bl(this.cHV, this.baU));
        }
    }

    @Override
    public void a(ae ae2) {
        this.P.a(new net.minecraft.client.gui.ao(this.cHV, ae2, this.baU));
    }

    @Override
    public void E(net.minecraft.entity.c c2) {
        this.P.bgN.a(c2, as.dxf);
    }

    @Override
    public void F(net.minecraft.entity.c c2) {
        this.P.bgN.a(c2, as.dxg);
    }

    @Override
    public boolean isSneaking() {
        boolean bl2 = this.bkr != null && this.bkr.jr;
        return bl2 && !this.cIk;
    }

    @Override
    public void DB() {
        super.DB();
        if (this.DC()) {
            this.cuV = this.bkr.dzs;
            this.cuW = this.bkr.cuW;
            this.cuU = this.bkr.gD;
            this.bkx = this.bku;
            this.bky = this.bkv;
            this.bkv = (float)((double)this.bkv + (double)(this.pm - this.bkv) * 0.5);
            this.bku = (float)((double)this.bku + (double)(this.pl - this.bku) * 0.5);
        }
    }

    protected boolean DC() {
        return this.P.BC() == this;
    }

    @Override
    public void Dn() {
        boolean bl2;
        if (this.bkt > 0) {
            --this.bkt;
            if (this.bkt == 0) {
                this.setSprinting(false);
            }
        }
        if (this.bks > 0) {
            --this.bks;
        }
        this.bkC = this.bkB;
        if (this.csN) {
            if (this.P.bgR != null && !this.P.bgR.doesGuiPauseGame()) {
                this.P.a((bp)null);
            }
            if (this.bkB == 0.0f) {
                this.P.Bx().a(PositionedSoundRecord.a(new cm("portal.trigger"), this.ta.nextFloat() * 0.4f + 0.8f));
            }
            this.bkB += 0.0125f;
            if (this.bkB >= 1.0f) {
                this.bkB = 1.0f;
            }
            this.csN = false;
        } else if (this.a(net.minecraft.potion.a.dgE) && this.b(net.minecraft.potion.a.dgE).getDuration() > 60) {
            this.bkB += 0.006666667f;
            if (this.bkB > 1.0f) {
                this.bkB = 1.0f;
            }
        } else {
            if (this.bkB > 0.0f) {
                this.bkB -= 0.05f;
            }
            if (this.bkB < 0.0f) {
                this.bkB = 0.0f;
            }
        }
        if (this.csM > 0) {
            --this.csM;
        }
        boolean bl3 = this.bkr.gD;
        boolean bl4 = this.bkr.jr;
        float f2 = 0.8f;
        boolean bl5 = this.bkr.cuW >= 0.8f;
        this.bkr.atv();
        em em2 = new em(0.2f, 0.2f, this.isUsingItem());
        hackclient.rise.a.a.e().d(em2);
        if (!em2.isCancelled() && em2.db() && !this.isRiding()) {
            this.bkr.dzs *= em2.getStrafeMultiplier();
            this.bkr.cuW *= em2.getForwardMultiplier();
            this.bks = 0;
        }
        this.x(this.gW - (double)this.width * 0.35, this.Us().dtI + 0.5, this.gY + (double)this.width * 0.35);
        this.x(this.gW - (double)this.width * 0.35, this.Us().dtI + 0.5, this.gY - (double)this.width * 0.35);
        this.x(this.gW + (double)this.width * 0.35, this.Us().dtI + 0.5, this.gY - (double)this.width * 0.35);
        this.x(this.gW + (double)this.width * 0.35, this.Us().dtI + 0.5, this.gY + (double)this.width * 0.35);
        boolean bl6 = bl2 = (float)this.abY().getFoodLevel() > 6.0f || this.cIt.cJL;
        if (!(!this.aO || bl4 || bl5 || !this.bkD && !(this.bkr.cuW >= 0.8f) || this.isSprinting() || !bl2 || em2.db() || this.a(net.minecraft.potion.a.dgK))) {
            if (this.bks <= 0 && !this.P.aIY.chs.Re()) {
                this.bks = 7;
            } else {
                this.setSprinting(true);
            }
        }
        if (!this.isSprinting() && (this.bkD || this.bkr.cuW >= 0.8f) && bl2 && (!em2.db() || em2.isCancelled()) && !this.a(net.minecraft.potion.a.dgK) && this.P.aIY.chs.Re()) {
            this.setSprinting(true);
        }
        if (this.isSprinting() && !this.bkD && (this.bkr.cuW < 0.8f || this.crR && (ViaLoadingBase.getInstance().getTargetVersion().olderThan(ProtocolVersion.v1_14) || !this.crB) || !bl2 || this.isInWater())) {
            this.setSprinting(false);
        }
        if (this.cIt.cJL) {
            if (this.P.bgu.Hz()) {
                if (!this.cIt.cJK) {
                    this.cIt.cJK = true;
                    this.Ds();
                }
            } else if (!bl3 && this.bkr.gD) {
                if (this.cIa == 0) {
                    this.cIa = 7;
                } else {
                    this.cIt.cJK = !this.cIt.cJK;
                    this.Ds();
                    this.cIa = 0;
                }
            }
        }
        if (this.cIt.cJK && this.DC()) {
            if (this.bkr.jr) {
                this.ue -= (double)(this.cIt.getFlySpeed() * 3.0f);
            }
            if (this.bkr.gD) {
                this.ue += (double)(this.cIt.getFlySpeed() * 3.0f);
            }
        }
        if (this.Dz()) {
            if (this.bkz < 0) {
                ++this.bkz;
                if (this.bkz == 0) {
                    this.bkA = 0.0f;
                }
            }
            if (bl3 && !this.bkr.gD) {
                this.bkz = -10;
                this.Du();
            } else if (!bl3 && this.bkr.gD) {
                this.bkz = 0;
                this.bkA = 0.0f;
            } else if (bl3) {
                ++this.bkz;
                this.bkA = this.bkz < 10 ? (float)this.bkz * 0.1f : 0.8f + 2.0f / (float)(this.bkz - 9) * 0.1f;
            }
        } else {
            this.bkA = 0.0f;
        }
        hackclient.rise.a.a.e().d(new en());
        super.Dn();
        if (this.aO && this.cIt.cJK && !this.P.bgu.Hz()) {
            this.cIt.cJK = false;
            this.Ds();
        }
    }

    public akb DD() {
        return new akb(this.bkj, this.bkk);
    }

    @Override
    public void y(double d2, double d3, double d4) {
        ez ez2 = new ez(d2, d3, d4);
        if (this == net.minecraft.client.d.AZ().bgK) {
            hackclient.rise.a.a.e().d(ez2);
            if (ez2.isCancelled()) {
                return;
            }
        }
        super.y(ez2.getPosX(), ez2.getPosY(), ez2.getPosZ());
    }

    public void z(double d2, double d3, double d4) {
        super.y(d2, d3, d4);
    }
}

