/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.Unpooled
 */
package net.minecraft.entity.player;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.crash.i;
import net.minecraft.entity.ae;
import net.minecraft.entity.n;
import net.minecraft.entity.o;
import net.minecraft.entity.passive.f;
import net.minecraft.entity.player.a;
import net.minecraft.entity.player.c;
import net.minecraft.entity.player.d;
import net.minecraft.init.Items;
import net.minecraft.inventory.ab;
import net.minecraft.inventory.aj;
import net.minecraft.inventory.al;
import net.minecraft.inventory.h;
import net.minecraft.inventory.p;
import net.minecraft.inventory.s;
import net.minecraft.inventory.z;
import net.minecraft.item.bp;
import net.minecraft.item.co;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.y;
import net.minecraft.network.play.server.ac;
import net.minecraft.network.play.server.aq;
import net.minecraft.network.play.server.at;
import net.minecraft.network.play.server.av;
import net.minecraft.network.play.server.ax;
import net.minecraft.network.play.server.ay;
import net.minecraft.network.play.server.az;
import net.minecraft.network.play.server.bb;
import net.minecraft.network.play.server.bg;
import net.minecraft.network.play.server.bl;
import net.minecraft.network.play.server.bs;
import net.minecraft.network.play.server.bv;
import net.minecraft.network.play.server.bw;
import net.minecraft.network.play.server.bx;
import net.minecraft.network.play.server.ce;
import net.minecraft.network.play.server.u;
import net.minecraft.scoreboard.b;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.l;
import net.minecraft.scoreboard.m;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ItemInWorldManager;
import net.minecraft.server.management.UserListOpsEntry;
import net.minecraft.tileentity.ag;
import net.minecraft.util.ad;
import net.minecraft.util.af;
import net.minecraft.util.ba;
import net.minecraft.util.bm;
import net.minecraft.util.bt;
import net.minecraft.util.cl;
import net.minecraft.util.t;
import net.minecraft.world.ai;
import net.minecraft.world.ao;
import net.minecraft.world.biome.j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class e
extends a
implements z {
    private static final Logger cIV = LogManager.getLogger();
    private String cIW = "en_US";
    public net.minecraft.network.h cIX;
    public final MinecraftServer cIY;
    public final ItemInWorldManager cIZ;
    public double cJa;
    public double cJb;
    public final List<net.minecraft.world.b> cJc = Lists.newLinkedList();
    private final List<Integer> cJd = Lists.newLinkedList();
    private final net.minecraft.stats.o cJe;
    private float cJf = Float.MIN_VALUE;
    private float cJg = -1.0E8f;
    private int cJh = -99999999;
    private boolean cJi = true;
    private int cJj = -99999999;
    private int cJk = 60;
    private c cgz;
    private boolean cgA = true;
    private long cJl = System.currentTimeMillis();
    private net.minecraft.entity.c cJm = null;
    private int cJn;
    public boolean cJo;
    public int aW;
    public boolean cJp;

    public e(MinecraftServer minecraftServer, ai ai2, GameProfile gameProfile, ItemInWorldManager itemInWorldManager) {
        super(ai2, gameProfile);
        itemInWorldManager.dlK = this;
        this.cIZ = itemInWorldManager;
        net.minecraft.util.b b2 = ai2.avE();
        if (!ai2.dDl.awf() && ai2.avH().If() != net.minecraft.world.ao.dEz) {
            int n2 = Math.max(5, minecraftServer.alK() - 6);
            int n3 = bt.aF(ai2.Sv().B(b2.wt(), b2.wx()));
            if (n3 < n2) {
                n2 = n3;
            }
            if (n3 <= 1) {
                n2 = 1;
            }
            b2 = ai2.aT(b2.C(this.ta.nextInt(n2 * 2) - n2, 0, this.ta.nextInt(n2 * 2) - n2));
        }
        this.cIY = minecraftServer;
        this.cJe = minecraftServer.alE().H(this);
        this.cso = 0.0f;
        this.a(b2, 0.0f, 0.0f);
        while (!ai2.a((net.minecraft.entity.c)this, this.Us()).isEmpty() && this.gX < 255.0) {
            this.setPosition(this.gW, this.gX + 1.0, this.gY);
        }
    }

    @Override
    public void e(net.minecraft.nbt.n n2) {
        super.e(n2);
        if (n2.C("playerGameType", 99)) {
            if (MinecraftServer.afs().alL()) {
                this.cIZ.a(MinecraftServer.afs().If());
            } else {
                this.cIZ.a(net.minecraft.world.ao.ii(n2.eG("playerGameType")));
            }
        }
    }

    @Override
    public void d(net.minecraft.nbt.n n2) {
        super.d(n2);
        n2.B("playerGameType", this.cIZ.If().awE());
    }

    @Override
    public void fG(int n2) {
        super.fG(n2);
        this.cJj = -1;
    }

    @Override
    public void fF(int n2) {
        super.fF(n2);
        this.cJj = -1;
    }

    public void aci() {
        this.cHY.a(this);
    }

    @Override
    public void Wj() {
        super.Wj();
        this.cIX.B(new bv(this.VR(), bw.dfj));
    }

    @Override
    public void Wk() {
        super.Wk();
        this.cIX.B(new bv(this.VR(), bw.dfk));
    }

    @Override
    public void Dm() {
        net.minecraft.entity.c c2;
        Object object;
        Object object2;
        this.cIZ.ami();
        --this.cJk;
        if (this.csA > 0) {
            --this.csA;
        }
        this.cHY.adc();
        if (!this.baU.dDw && !this.cHY.i(this)) {
            this.Dq();
            this.cHY = this.cHX;
        }
        while (!this.cJd.isEmpty()) {
            int n2 = Math.min(this.cJd.size(), Integer.MAX_VALUE);
            object2 = new int[n2];
            object = this.cJd.iterator();
            int n3 = 0;
            while (object.hasNext() && n3 < n2) {
                object2[n3++] = (Integer)object.next();
                object.remove();
            }
            this.cIX.B(new u((int[])object2));
        }
        if (!this.cJc.isEmpty()) {
            Object object32;
            ArrayList arrayList = Lists.newArrayList();
            object2 = this.cJc.iterator();
            object = Lists.newArrayList();
            while (object2.hasNext() && arrayList.size() < 10) {
                net.minecraft.world.b b2 = (net.minecraft.world.b)object2.next();
                if (b2 != null) {
                    if (!this.baU.aJ(new net.minecraft.util.b(b2.dBK << 4, 0, b2.dBL << 4)) || !((net.minecraft.world.chunk.a)(object32 = this.baU.aL(b2.dBK, b2.dBL))).axB()) continue;
                    arrayList.add(object32);
                    object.addAll(((ai)this.baU).h(b2.dBK * 16, 0, b2.dBL * 16, b2.dBK * 16 + 16, 256, b2.dBL * 16 + 16));
                    object2.remove();
                    continue;
                }
                object2.remove();
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.cIX.B(new net.minecraft.network.play.server.aj((net.minecraft.world.chunk.a)arrayList.get(0), true, 65535));
                } else {
                    this.cIX.B(new aq(arrayList));
                }
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    object32 = (net.minecraft.tileentity.d)iterator.next();
                    this.c((net.minecraft.tileentity.d)object32);
                }
                for (Object object32 : arrayList) {
                    this.acr().awu().a(this, (net.minecraft.world.chunk.a)object32);
                }
            }
        }
        if ((c2 = this.acw()) != this) {
            if (!c2.TS()) {
                this.as(this);
            } else {
                this.a(c2.gW, c2.gX, c2.gY, c2.pl, c2.pm);
                this.cIY.alE().r(this);
                if (this.isSneaking()) {
                    this.as(this);
                }
            }
        }
    }

    public void acj() {
        try {
            super.Dm();
            for (int i2 = 0; i2 < this.cHV.YI(); ++i2) {
                net.minecraft.network.aj aj2;
                co object = this.cHV.fi(i2);
                if (object == null || !object.bP().adB() || (aj2 = ((bp)object.bP()).e(object, this.baU, this)) == null) continue;
                this.cIX.B(aj2);
            }
            if (this.getHealth() != this.cJg || this.cJh != this.cHZ.getFoodLevel() || this.cHZ.getSaturationLevel() == 0.0f != this.cJi) {
                this.cIX.B(new net.minecraft.network.play.server.g(this.getHealth(), this.cHZ.getFoodLevel(), this.cHZ.getSaturationLevel()));
                this.cJg = this.getHealth();
                this.cJh = this.cHZ.getFoodLevel();
                boolean bl2 = this.cJi = this.cHZ.getSaturationLevel() == 0.0f;
            }
            if (this.getHealth() + this.Wi() != this.cJf) {
                this.cJf = this.getHealth() + this.Wi();
                for (g g2 : this.acc().a(b.djv)) {
                    this.acc().b(this.xU(), g2).I(Arrays.asList(this));
                }
            }
            if (this.cIv != this.cJj) {
                this.cJj = this.cIv;
                this.cIX.B(new net.minecraft.network.play.server.ag(this.cIw, this.cIv, this.cIu));
            }
            if (this.aRg % 20 * 5 == 0 && !this.acv().d(net.minecraft.stats.b.dpk)) {
                this.ack();
            }
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Ticking player");
            i i2 = a2.dY("Player being ticked");
            this.a(i2);
            throw new cl(a2);
        }
    }

    protected void ack() {
        j j2 = this.baU.aF(new net.minecraft.util.b(bt.aF(this.gW), 0, bt.aF(this.gY)));
        String string = j2.dGX;
        bm bm2 = (bm)this.acv().d((net.minecraft.stats.f)net.minecraft.stats.b.dpk);
        if (bm2 == null) {
            bm2 = this.acv().a(net.minecraft.stats.b.dpk, new bm());
        }
        bm2.add(string);
        if (this.acv().e(net.minecraft.stats.b.dpk) && bm2.size() >= j.dGd.size()) {
            HashSet hashSet = Sets.newHashSet(j.dGd);
            Iterator iterator = bm2.iterator();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                Iterator iterator2 = hashSet.iterator();
                while (iterator2.hasNext()) {
                    j j3 = (j)iterator2.next();
                    if (!j3.dGX.equals(string2)) continue;
                    iterator2.remove();
                }
                if (!hashSet.isEmpty()) continue;
                break;
            }
            if (hashSet.isEmpty()) {
                this.a(net.minecraft.stats.b.dpk);
            }
        }
    }

    @Override
    public void b(ad ad2) {
        Object object;
        if (this.baU.Si().gw("showDeathMessages")) {
            object = this.Vw();
            if (object != null && ((l)object).akx() != m.dkm) {
                if (((l)object).akx() == m.dko) {
                    this.cIY.alE().a((a)this, this.VR().arP());
                } else if (((l)object).akx() == m.dkp) {
                    this.cIY.alE().b((a)this, this.VR().arP());
                }
            } else {
                this.cIY.alE().m(this.VR().arP());
            }
        }
        if (!this.baU.Si().gw("keepInventory")) {
            this.cHV.acJ();
        }
        for (g object2 : this.baU.SD().a(b.djs)) {
            net.minecraft.scoreboard.d d2 = this.acc().b(this.xU(), object2);
            d2.akl();
        }
        object = this.VS();
        if (object != null) {
            o o2 = n.ctF.get(n.ac((net.minecraft.entity.c)object));
            if (o2 != null) {
                this.a(o2.ctK);
            }
            ((net.minecraft.entity.c)object).b(this, this.cuS);
        }
        this.a(net.minecraft.stats.n.dpZ);
        this.b(net.minecraft.stats.n.dpI);
        this.VR().aX();
    }

    @Override
    public boolean a(ad ad2, float f2) {
        boolean bl2;
        if (this.a(ad2)) {
            return false;
        }
        boolean bl3 = bl2 = this.cIY.alt() && this.acl() && "fall".equals(ad2.dvz);
        if (!bl2 && this.cJk > 0 && ad2 != ad.dvk) {
            return false;
        }
        if (ad2 instanceof af) {
            net.minecraft.entity.c c2 = ad2.dk();
            if (c2 instanceof a && !this.D((a)c2)) {
                return false;
            }
            if (c2 instanceof net.minecraft.entity.projectile.a) {
                net.minecraft.entity.projectile.a a2 = (net.minecraft.entity.projectile.a)c2;
                if (a2.cJY instanceof a && !this.D((a)a2.cJY)) {
                    return false;
                }
            }
        }
        return super.a(ad2, f2);
    }

    @Override
    public boolean D(a a2) {
        return this.acl() && super.D(a2);
    }

    private boolean acl() {
        return this.cIY.aly();
    }

    @Override
    public void ez(int n2) {
        if (this.csP == 1 && n2 == 1) {
            this.a(net.minecraft.stats.b.dpc);
            this.baU.H(this);
            this.cJp = true;
            this.cIX.B(new av(4, 0.0f));
        } else {
            if (this.csP == 0 && n2 == 1) {
                this.a(net.minecraft.stats.b.dpb);
                net.minecraft.util.b b2 = this.cIY.ha(n2).awa();
                if (b2 != null) {
                    this.cIX.f(b2.wt(), b2.wu(), b2.wx(), 0.0f, 0.0f);
                }
                n2 = 1;
            } else {
                this.a(net.minecraft.stats.b.doX);
            }
            this.cIY.alE().a(this, n2);
            this.cJj = -1;
            this.cJg = -1.0f;
            this.cJh = -1;
        }
    }

    @Override
    public boolean a(e e2) {
        return e2.CZ() ? this.acw() == this : !this.CZ() && super.a(e2);
    }

    private void c(net.minecraft.tileentity.d d2) {
        net.minecraft.network.aj aj2;
        if (d2 != null && (aj2 = d2.apQ()) != null) {
            this.cIX.B(aj2);
        }
    }

    @Override
    public void c(net.minecraft.entity.c c2, int n2) {
        super.c(c2, n2);
        this.cHY.adc();
    }

    @Override
    public d aj(net.minecraft.util.b b2) {
        d d2 = super.aj(b2);
        if (d2 == d.cIO) {
            net.minecraft.network.play.server.l l2 = new net.minecraft.network.play.server.l(this, b2);
            this.acr().awu().a((net.minecraft.entity.c)this, l2);
            this.cIX.f(this.gW, this.gX, this.gY, this.pl, this.pm);
            this.cIX.B(l2);
        }
        return d2;
    }

    @Override
    public void a(boolean bl2, boolean bl3, boolean bl4) {
        if (this.Wg()) {
            this.acr().awu().b(this, new net.minecraft.network.play.server.m(this, 2));
        }
        super.a(bl2, bl3, bl4);
        if (this.cIX != null) {
            this.cIX.f(this.gW, this.gX, this.gY, this.pl, this.pm);
        }
    }

    @Override
    public void D(net.minecraft.entity.c c2) {
        net.minecraft.entity.c c3 = this.crC;
        super.D(c2);
        if (c2 != c3) {
            this.cIX.B(new ac(0, this, this.crC));
            this.cIX.f(this.gW, this.gX, this.gY, this.pl, this.pm);
        }
    }

    @Override
    protected void a(double d2, boolean bl2, Block block, net.minecraft.util.b b2) {
    }

    public void c(double d2, boolean bl2) {
        Block block;
        int n2;
        int n3;
        int n4 = bt.aF(this.gW);
        net.minecraft.util.b b2 = new net.minecraft.util.b(n4, n3 = bt.aF(this.gX - (double)0.2f), n2 = bt.aF(this.gY));
        Block block2 = this.baU.L(b2).df();
        if (block2.xb() == Material.beo && ((block = this.baU.L(b2.aqY()).df()) instanceof BlockFence || block instanceof BlockWall || block instanceof BlockFenceGate)) {
            b2 = b2.aqY();
            block2 = this.baU.L(b2).df();
        }
        super.a(d2, bl2, block2, b2);
    }

    @Override
    public void a(ag ag2) {
        ag2.J(this);
        this.cIX.B(new bg(ag2.Ab()));
    }

    private void acm() {
        this.cJn = this.cJn % 100 + 1;
    }

    @Override
    public void a(net.minecraft.world.m m2) {
        this.acm();
        this.cIX.B(new ax(this.cJn, m2.xX(), m2.xW()));
        this.cHY = m2.a(this.cHV, this);
        this.cHY.cSL = this.cJn;
        this.cHY.a(this);
    }

    @Override
    public void a(ab ab2) {
        net.minecraft.world.n n2;
        if (this.cHY != this.cHX) {
            this.Dq();
        }
        if (ab2 instanceof net.minecraft.world.n && (n2 = (net.minecraft.world.n)ab2).IH() && !this.b(n2.II()) && !this.CZ()) {
            this.cIX.B(new net.minecraft.network.play.server.c(new t("container.isLocked", ab2.xW()), 2));
            this.cIX.B(new at("random.door_close", this.gW, this.gX, this.gY, 1.0f, 1.0f));
            return;
        }
        this.acm();
        if (ab2 instanceof net.minecraft.world.m) {
            this.cIX.B(new ax(this.cJn, ((net.minecraft.world.m)((Object)ab2)).xX(), ab2.xW(), ab2.YI()));
            this.cHY = ((net.minecraft.world.m)((Object)ab2)).a(this.cHV, this);
        } else {
            this.cIX.B(new ax(this.cJn, "minecraft:container", ab2.xW(), ab2.YI()));
            this.cHY = new h(this.cHV, ab2, this);
        }
        this.cHY.cSL = this.cJn;
        this.cHY.a(this);
    }

    @Override
    public void a(ae ae2) {
        this.acm();
        this.cHY = new s(this.cHV, ae2, this.baU);
        this.cHY.cSL = this.cJn;
        this.cHY.a(this);
        aj aj2 = ((s)this.cHY).adi();
        ba ba2 = ae2.xW();
        this.cIX.B(new ax(this.cJn, "minecraft:villager", ba2, aj2.YI()));
        net.minecraft.village.b b2 = ae2.t(this);
        if (b2 != null) {
            ak ak2 = new ak(Unpooled.buffer());
            ak2.writeInt(this.cJn);
            b2.f(ak2);
            this.cIX.B(new bs("MC|TrList", ak2));
        }
    }

    @Override
    public void a(f f2, ab ab2) {
        if (this.cHY != this.cHX) {
            this.Dq();
        }
        this.acm();
        this.cIX.B(new ax(this.cJn, "EntityHorse", ab2.xW(), ab2.YI(), f2.getEntityId()));
        this.cHY = new p(this.cHV, ab2, f2, this);
        this.cHY.cSL = this.cJn;
        this.cHY.a(this);
    }

    @Override
    public void G(co co2) {
        net.minecraft.item.d d2 = co2.bP();
        if (d2 == Items.cRR) {
            this.cIX.B(new bs("MC|BOpen", new ak(Unpooled.buffer())));
        }
    }

    @Override
    public void a(net.minecraft.inventory.b b2, int n2, co co2) {
        if (!(b2.fM(n2) instanceof al) && !this.cJo) {
            this.cIX.B(new az(b2.cSL, n2, co2));
        }
    }

    public void d(net.minecraft.inventory.b b2) {
        this.a(b2, b2.adb());
    }

    @Override
    public void a(net.minecraft.inventory.b b2, List<co> list) {
        this.cIX.B(new net.minecraft.network.play.server.ba(b2.cSL, list));
        this.cIX.B(new az(-1, -1, this.cHV.bO()));
    }

    @Override
    public void a(net.minecraft.inventory.b b2, int n2, int n3) {
        this.cIX.B(new bb(b2.cSL, n2, n3));
    }

    @Override
    public void a(net.minecraft.inventory.b b2, ab ab2) {
        for (int i2 = 0; i2 < ab2.IG(); ++i2) {
            this.cIX.B(new bb(b2.cSL, i2, ab2.cx(i2)));
        }
    }

    @Override
    public void Dq() {
        this.cIX.B(new ay(this.cHY.cSL));
        this.aco();
    }

    public void acn() {
        if (!this.cJo) {
            this.cIX.B(new az(-1, -1, this.cHV.bO()));
        }
    }

    public void aco() {
        this.cHY.E(this);
        this.cHY = this.cHX;
    }

    public void b(float f2, float f3, boolean bl2, boolean bl3) {
        if (this.crC != null) {
            if (f2 >= -1.0f && f2 <= 1.0f) {
                this.cuV = f2;
            }
            if (f3 >= -1.0f && f3 <= 1.0f) {
                this.cuW = f3;
            }
            this.cuU = bl2;
            this.setSneaking(bl3);
        }
    }

    @Override
    public void a(net.minecraft.stats.f f2, int n2) {
        if (f2 != null) {
            this.cJe.a(this, f2, n2);
            for (g g2 : this.acc().a(f2.apu())) {
                this.acc().b(this.xU(), g2).gU(n2);
            }
            if (this.cJe.apF()) {
                this.cJe.u(this);
            }
        }
    }

    @Override
    public void b(net.minecraft.stats.f f2) {
        if (f2 != null) {
            this.cJe.b(this, f2, 0);
            for (g g2 : this.acc().a(f2.apu())) {
                this.acc().b(this.xU(), g2).gW(0);
            }
            if (this.cJe.apF()) {
                this.cJe.u(this);
            }
        }
    }

    public void acp() {
        if (this.crA != null) {
            this.crA.D(this);
        }
        if (this.cIk) {
            this.a(true, false, false);
        }
    }

    public void acq() {
        this.cJg = -1.0E8f;
    }

    @Override
    public void b(ba ba2) {
        this.cIX.B(new net.minecraft.network.play.server.c(ba2));
    }

    @Override
    protected void abL() {
        this.cIX.B(new net.minecraft.network.play.server.ab(this, 9));
        super.abL();
    }

    @Override
    public void c(co co2, int n2) {
        super.c(co2, n2);
        if (co2 != null && co2.bP() != null && co2.bP().ap(co2) == net.minecraft.item.a.cUx) {
            this.acr().awu().b(this, new net.minecraft.network.play.server.m(this, 3));
        }
    }

    @Override
    public void b(a a2, boolean bl2) {
        super.b(a2, bl2);
        this.cJj = -1;
        this.cJg = -1.0f;
        this.cJh = -1;
        this.cJd.addAll(((e)a2).cJd);
    }

    @Override
    protected void d(net.minecraft.potion.d d2) {
        super.d(d2);
        this.cIX.B(new net.minecraft.network.play.server.ae(this.getEntityId(), d2));
    }

    @Override
    protected void a(net.minecraft.potion.d d2, boolean bl2) {
        super.a(d2, bl2);
        this.cIX.B(new net.minecraft.network.play.server.ae(this.getEntityId(), d2));
    }

    @Override
    protected void e(net.minecraft.potion.d d2) {
        super.e(d2);
        this.cIX.B(new net.minecraft.network.play.server.af(this.getEntityId(), d2));
    }

    @Override
    public void Q(double d2, double d3, double d4) {
        this.cIX.f(d2, d3, d4, this.pl, this.pm);
    }

    @Override
    public void E(net.minecraft.entity.c c2) {
        this.acr().awu().b(this, new net.minecraft.network.play.server.m(c2, 4));
    }

    @Override
    public void F(net.minecraft.entity.c c2) {
        this.acr().awu().b(this, new net.minecraft.network.play.server.m(c2, 5));
    }

    @Override
    public void Ds() {
        if (this.cIX != null) {
            this.cIX.B(new bl(this.cIt));
            this.VI();
        }
    }

    public ai acr() {
        return (ai)this.baU;
    }

    @Override
    public void a(ao ao2) {
        this.cIZ.a(ao2);
        this.cIX.B(new av(3, ao2.awE()));
        if (ao2 == net.minecraft.world.ao.dEA) {
            this.D((net.minecraft.entity.c)null);
        } else {
            this.as(this);
        }
        this.Ds();
        this.Wl();
    }

    @Override
    public boolean CZ() {
        return this.cIZ.If() == net.minecraft.world.ao.dEA;
    }

    @Override
    public void a(ba ba2) {
        this.cIX.B(new net.minecraft.network.play.server.c(ba2));
    }

    @Override
    public boolean c(int n2, String string) {
        if ("seed".equals(string) && !this.cIY.alt()) {
            return true;
        }
        if (!("tell".equals(string) || "help".equals(string) || "me".equals(string) || "trigger".equals(string))) {
            if (this.cIY.alE().k(this.Ie())) {
                UserListOpsEntry userListOpsEntry = (UserListOpsEntry)this.cIY.alE().amv().r(this.Ie());
                return userListOpsEntry != null ? userListOpsEntry.amH() >= n2 : this.cIY.akR() >= n2;
            }
            return false;
        }
        return true;
    }

    public String acs() {
        String string = this.cIX.cYU.afb().toString();
        string = string.substring(string.indexOf("/") + 1);
        string = string.substring(0, string.indexOf(":"));
        return string;
    }

    public void a(y y2) {
        this.cIW = y2.agg();
        this.cgz = y2.act();
        this.cgA = y2.isColorsEnabled();
        this.Tp().b(10, (byte)y2.getModelPartFlags());
    }

    public c act() {
        return this.cgz;
    }

    public void P(String string, String string2) {
        this.cIX.B(new ce(string, string2));
    }

    @Override
    public net.minecraft.util.b yl() {
        return new net.minecraft.util.b(this.gW, this.gX + 0.5, this.gY);
    }

    public void acu() {
        this.cJl = MinecraftServer.alN();
    }

    public net.minecraft.stats.o acv() {
        return this.cJe;
    }

    public void H(net.minecraft.entity.c c2) {
        if (c2 instanceof a) {
            this.cIX.B(new u(c2.getEntityId()));
        } else {
            this.cJd.add(c2.getEntityId());
        }
    }

    @Override
    protected void VI() {
        if (this.CZ()) {
            this.VJ();
            this.ak(true);
        } else {
            super.VI();
        }
        this.acr().awu().b(this);
    }

    public net.minecraft.entity.c acw() {
        return this.cJm == null ? this : this.cJm;
    }

    public void as(net.minecraft.entity.c c2) {
        net.minecraft.entity.c c3 = this.acw();
        net.minecraft.entity.c c4 = this.cJm = c2 == null ? this : c2;
        if (c3 != this.cJm) {
            this.cIX.B(new bx(this.cJm));
            this.Q(this.cJm.gW, this.cJm.gX, this.cJm.gY);
        }
    }

    @Override
    public void ar(net.minecraft.entity.c c2) {
        if (this.cIZ.If() == net.minecraft.world.ao.dEA) {
            this.as(c2);
        } else {
            super.ar(c2);
        }
    }

    public long acx() {
        return this.cJl;
    }

    public ba acy() {
        return null;
    }
}

