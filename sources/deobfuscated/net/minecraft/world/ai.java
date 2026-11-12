/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net.minecraft.world;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEventData;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.crash.i;
import net.minecraft.entity.aa;
import net.minecraft.entity.af;
import net.minecraft.entity.c;
import net.minecraft.entity.passive.ah;
import net.minecraft.entity.player.e;
import net.minecraft.entity.r;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.play.server.ab;
import net.minecraft.network.play.server.ar;
import net.minecraft.network.play.server.au;
import net.minecraft.network.play.server.av;
import net.minecraft.network.play.server.aw;
import net.minecraft.scoreboard.k;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerManager;
import net.minecraft.util.as;
import net.minecraft.util.be;
import net.minecraft.util.bh;
import net.minecraft.util.cl;
import net.minecraft.util.db;
import net.minecraft.util.de;
import net.minecraft.util.dg;
import net.minecraft.world.ac;
import net.minecraft.world.aj;
import net.minecraft.world.ak;
import net.minecraft.world.an;
import net.minecraft.world.ao;
import net.minecraft.world.b;
import net.minecraft.world.biome.j;
import net.minecraft.world.biome.m;
import net.minecraft.world.chunk.a;
import net.minecraft.world.chunk.storage.g;
import net.minecraft.world.gen.f;
import net.minecraft.world.gen.feature.ap;
import net.minecraft.world.gen.structure.w;
import net.minecraft.world.s;
import net.minecraft.world.storage.d;
import net.minecraft.world.storage.h;
import net.minecraft.world.storage.o;
import net.minecraft.world.t;
import net.minecraft.world.u;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ai
extends net.minecraft.world.w
implements bh {
    private static final Logger dDU = LogManager.getLogger();
    private final MinecraftServer dDV;
    private final net.minecraft.entity.w dDW;
    private final PlayerManager dDX;
    private final Set<s> dDY = Sets.newHashSet();
    private final TreeSet<s> dDZ = new TreeSet();
    private final Map<UUID, c> dEa = Maps.newHashMap();
    public f dEb;
    public boolean dEc;
    private boolean dEd;
    private int dEe;
    private final u dEf;
    private final t dEg = new t();
    protected final net.minecraft.village.g dEh = new net.minecraft.village.g(this);
    private final ak[] dEi = new ak[]{new ak(), new ak()};
    private int dEj;
    private static final List<dg> dEk = Lists.newArrayList((Object[])new dg[]{new dg(Items.cPC, 0, 1, 3, 10), new dg(net.minecraft.item.d.I(Blocks.cLh), 0, 1, 3, 10), new dg(net.minecraft.item.d.I(Blocks.cLt), 0, 1, 3, 10), new dg(Items.cPx, 0, 1, 1, 3), new dg(Items.cPt, 0, 1, 1, 5), new dg(Items.cPw, 0, 1, 1, 3), new dg(Items.cPs, 0, 1, 1, 5), new dg(Items.cPi, 0, 2, 3, 5), new dg(Items.cPT, 0, 2, 3, 3), new dg(net.minecraft.item.d.I(Blocks.cLu), 0, 1, 3, 10)});
    private final List<s> dEl = Lists.newArrayList();

    public ai(MinecraftServer minecraftServer, d d2, o o2, int n2, net.minecraft.profiler.d d3) {
        super(d2, o2, ac.ig(n2), d3, false);
        this.dDV = minecraftServer;
        this.dDW = new net.minecraft.entity.w(this);
        this.dDX = new PlayerManager(this);
        this.dDl.p(this);
        this.dDn = this.HN();
        this.dEf = new u(this);
        this.avx();
        this.avy();
        this.Sv().ip(minecraftServer.alV());
    }

    @Override
    public net.minecraft.world.w avo() {
        this.dDr = new h(this.dDo);
        String string = net.minecraft.village.e.a(this.dDl);
        net.minecraft.village.e e2 = (net.minecraft.village.e)this.dDr.e(net.minecraft.village.e.class, string);
        if (e2 == null) {
            this.dDs = new net.minecraft.village.e(this);
            this.dDr.b(string, this.dDs);
        } else {
            this.dDs = e2;
            this.dDs.o(this);
        }
        this.dDv = new k(this.dDV);
        net.minecraft.scoreboard.j j2 = (net.minecraft.scoreboard.j)this.dDr.e(net.minecraft.scoreboard.j.class, "scoreboard");
        if (j2 == null) {
            j2 = new net.minecraft.scoreboard.j();
            this.dDr.b("scoreboard", j2);
        }
        j2.c(this.dDv);
        ((k)this.dDv).a(j2);
        this.Sv().C(this.dDp.azN(), this.dDp.azO());
        this.Sv().aP(this.dDp.azT());
        this.Sv().aO(this.dDp.azS());
        this.Sv().ir(this.dDp.azU());
        this.Sv().iq(this.dDp.azV());
        if (this.dDp.azQ() > 0L) {
            this.Sv().a(this.dDp.azP(), this.dDp.azR(), this.dDp.azQ());
        } else {
            this.Sv().aN(this.dDp.azP());
        }
        return this;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.avH().azv() && this.agm() != net.minecraft.world.f.dBU) {
            this.avH().c(net.minecraft.world.f.dBU);
        }
        this.dDl.avp().ss();
        if (this.awk()) {
            if (this.Si().gw("doDaylightCycle")) {
                long l2 = this.dDp.getWorldTime() + 24000L;
                this.dDp.o(l2 - l2 % 24000L);
            }
            this.awi();
        }
        this.dDt.eY("mobSpawner");
        if (this.Si().gw("doMobSpawning") && this.dDp.awC() != net.minecraft.world.ap.dEI) {
            this.dEg.a(this, this.dDz, this.dDA, this.dDp.azq() % 400L == 0L);
        }
        this.dDt.fa("chunkSource");
        this.dDn.Hk();
        int n2 = this.bR(1.0f);
        if (n2 != this.avP()) {
            this.ie(n2);
        }
        this.dDp.P(this.dDp.azq() + 1L);
        if (this.Si().gw("doDaylightCycle")) {
            this.dDp.o(this.dDp.getWorldTime() + 1L);
        }
        this.dDt.fa("tickPending");
        this.ct(false);
        this.dDt.fa("tickBlocks");
        this.HO();
        this.dDt.fa("chunkMap");
        this.dDX.aml();
        this.dDt.fa("village");
        this.dDs.tick();
        this.dEh.tick();
        this.dDt.fa("portalForcer");
        this.dEf.H(this.getTotalWorldTime());
        this.dDt.ajv();
        this.aws();
    }

    public m b(aa aa2, net.minecraft.util.b b2) {
        List<m> list = this.avF().a(aa2, b2);
        return list != null && !list.isEmpty() ? de.a(this.dDk, list) : null;
    }

    public boolean a(aa aa2, m m2, net.minecraft.util.b b2) {
        List<m> list = this.avF().a(aa2, b2);
        return list != null && !list.isEmpty() && list.contains(m2);
    }

    @Override
    public void avI() {
        this.dEd = false;
        if (!this.dCY.isEmpty()) {
            int n2 = 0;
            int n3 = 0;
            for (net.minecraft.entity.player.a a2 : this.dCY) {
                if (a2.CZ()) {
                    ++n2;
                    continue;
                }
                if (!a2.Wg()) continue;
                ++n3;
            }
            this.dEd = n3 > 0 && n3 >= this.dCY.size() - n2;
        }
    }

    protected void awi() {
        this.dEd = false;
        for (net.minecraft.entity.player.a a2 : this.dCY) {
            if (!a2.Wg()) continue;
            a2.a(false, false, true);
        }
        this.awj();
    }

    private void awj() {
        this.dDp.iR(0);
        this.dDp.cG(false);
        this.dDp.iQ(0);
        this.dDp.cF(false);
    }

    public boolean awk() {
        if (this.dEd && !this.dDw) {
            for (net.minecraft.entity.player.a a2 : this.dCY) {
                if (!a2.CZ() && a2.abS()) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void avq() {
        if (this.dDp.azo() <= 0) {
            this.dDp.iN(this.avB() + 1);
        }
        int n2 = this.dDp.azn();
        int n3 = this.dDp.azp();
        int n4 = 0;
        while (this.aH(new net.minecraft.util.b(n2, 0, n3)).xb() == Material.beo) {
            n2 += this.dDk.nextInt(8) - this.dDk.nextInt(8);
            n3 += this.dDk.nextInt(8) - this.dDk.nextInt(8);
            if (++n4 != 10000) continue;
        }
        this.dDp.iM(n2);
        this.dDp.iO(n3);
    }

    @Override
    protected void HO() {
        super.HO();
        if (this.dDp.awC() == net.minecraft.world.ap.dEI) {
            for (b b2 : this.dDx) {
                this.aL(b2.dBK, b2.dBL).cy(false);
            }
        } else {
            int n2 = 0;
            int n3 = 0;
            for (b b3 : this.dDx) {
                Object object;
                int n4;
                int n5 = b3.dBK * 16;
                int n6 = b3.dBL * 16;
                this.dDt.eY("getChunk");
                a a2 = this.aL(b3.dBK, b3.dBL);
                this.a(n5, n6, a2);
                this.dDt.fa("tickChunk");
                a2.cy(false);
                this.dDt.fa("thunder");
                if (this.dDk.nextInt(100000) == 0 && this.avK() && this.avJ()) {
                    this.dDd = this.dDd * 3 + 1013904223;
                    n4 = this.dDd >> 2;
                    object = this.bh(new net.minecraft.util.b(n5 + (n4 & 0xF), 0, n6 + (n4 >> 8 & 0xF)));
                    if (this.be((net.minecraft.util.b)object)) {
                        this.ay(new net.minecraft.entity.effect.a(this, ((db)object).wt(), ((db)object).wu(), ((db)object).wx()));
                    }
                }
                this.dDt.fa("iceandsnow");
                if (this.dDk.nextInt(16) == 0) {
                    this.dDd = this.dDd * 3 + 1013904223;
                    n4 = this.dDd >> 2;
                    object = this.aS(new net.minecraft.util.b(n5 + (n4 & 0xF), 0, n6 + (n4 >> 8 & 0xF)));
                    net.minecraft.util.b b4 = ((net.minecraft.util.b)object).aqY();
                    if (this.aX(b4)) {
                        this.d(b4, Blocks.cMK.xM());
                    }
                    if (this.avK() && this.g((net.minecraft.util.b)object, true)) {
                        this.d((net.minecraft.util.b)object, Blocks.cMJ.xM());
                    }
                    if (this.avK() && this.aF(b4).awX()) {
                        this.L(b4).df().g(this, b4);
                    }
                }
                this.dDt.fa("tickBlocks");
                n4 = this.Si().gx("randomTickSpeed");
                if (n4 > 0) {
                    for (g g2 : a2.axw()) {
                        if (g2 == null || !g2.axW()) continue;
                        for (int i2 = 0; i2 < n4; ++i2) {
                            this.dDd = this.dDd * 3 + 1013904223;
                            int n7 = this.dDd >> 2;
                            int n8 = n7 & 0xF;
                            int n9 = n7 >> 8 & 0xF;
                            int n10 = n7 >> 16 & 0xF;
                            ++n3;
                            IBlockState iBlockState = g2.V(n8, n10, n9);
                            Block block = iBlockState.df();
                            if (!block.xi()) continue;
                            ++n2;
                            block.a((net.minecraft.world.w)this, new net.minecraft.util.b(n8 + n5, n10 + g2.axX(), n9 + n6), iBlockState, this.dDk);
                        }
                    }
                }
                this.dDt.ajv();
            }
        }
    }

    protected net.minecraft.util.b bh(net.minecraft.util.b b2) {
        net.minecraft.util.b b3 = this.aS(b2);
        net.minecraft.util.a a2 = new net.minecraft.util.a(b3, new net.minecraft.util.b(b3.wt(), this.getHeight(), b3.wx())).ad(3.0, 3.0, 3.0);
        aj aj2 = this.a(r.class, a2, new aj(this));
        return !aj2.isEmpty() ? ((r)aj2.get(this.dDk.nextInt(aj2.size()))).yl() : b3;
    }

    @Override
    public boolean e(net.minecraft.util.b b2, Block block) {
        s s2 = new s(b2, block);
        return this.dEl.contains(s2);
    }

    @Override
    public void a(net.minecraft.util.b b2, Block block, int n2) {
        this.a(b2, block, n2, 0);
    }

    @Override
    public void a(net.minecraft.util.b b2, Block block, int n2, int n3) {
        s s2 = new s(b2, block);
        int n4 = 0;
        if (this.dCR && block.xb() != Material.beo) {
            if (block.xI()) {
                IBlockState iBlockState;
                n4 = 8;
                if (this.e(s2.dCC.C(-n4, -n4, -n4), s2.dCC.C(n4, n4, n4)) && (iBlockState = this.L(s2.dCC)).df().xb() != Material.beo && iBlockState.df() == s2.df()) {
                    iBlockState.df().b(this, s2.dCC, iBlockState, this.dDk);
                }
                return;
            }
            n2 = 1;
        }
        if (this.e(b2.C(-n4, -n4, -n4), b2.C(n4, n4, n4))) {
            if (block.xb() != Material.beo) {
                s2.G((long)n2 + this.dDp.azq());
                s2.ic(n3);
            }
            if (!this.dDY.contains(s2)) {
                this.dDY.add(s2);
                this.dDZ.add(s2);
            }
        }
    }

    @Override
    public void b(net.minecraft.util.b b2, Block block, int n2, int n3) {
        s s2 = new s(b2, block);
        s2.ic(n3);
        if (block.xb() != Material.beo) {
            s2.G((long)n2 + this.dDp.azq());
        }
        if (!this.dDY.contains(s2)) {
            this.dDY.add(s2);
            this.dDZ.add(s2);
        }
    }

    @Override
    public void avu() {
        if (this.dCY.isEmpty()) {
            if (this.dEe++ >= 1200) {
                return;
            }
        } else {
            this.awl();
        }
        super.avu();
    }

    public void awl() {
        this.dEe = 0;
    }

    @Override
    public boolean ct(boolean bl2) {
        s s2;
        if (this.dDp.awC() == net.minecraft.world.ap.dEI) {
            return false;
        }
        int n2 = this.dDZ.size();
        if (n2 != this.dDY.size()) {
            return false;
        }
        if (n2 > 1000) {
            n2 = 1000;
        }
        this.dDt.eY("cleaning");
        for (int i2 = 0; i2 < n2; ++i2) {
            s2 = this.dDZ.first();
            if (!bl2 && s2.dCD > this.dDp.azq()) break;
            this.dDZ.remove(s2);
            this.dDY.remove(s2);
            this.dEl.add(s2);
        }
        this.dDt.ajv();
        this.dDt.eY("ticking");
        Iterator<s> iterator = this.dEl.iterator();
        while (iterator.hasNext()) {
            s2 = iterator.next();
            iterator.remove();
            boolean bl3 = false;
            if (this.e(s2.dCC.C(0, 0, 0), s2.dCC.C(0, 0, 0))) {
                IBlockState iBlockState = this.L(s2.dCC);
                if (iBlockState.df().xb() == Material.beo || !Block.c(iBlockState.df(), s2.df())) continue;
                try {
                    iBlockState.df().b(this, s2.dCC, iBlockState, this.dDk);
                    continue;
                }
                catch (Throwable throwable) {
                    net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Exception while ticking a block");
                    i i3 = a2.dY("Block being ticked");
                    i.a(i3, s2.dCC, iBlockState);
                    throw new cl(a2);
                }
            }
            this.a(s2.dCC, s2.df(), 0);
        }
        this.dDt.ajv();
        this.dEl.clear();
        return !this.dDZ.isEmpty();
    }

    @Override
    public List<s> a(a a2, boolean bl2) {
        b b2 = a2.axC();
        int n2 = (b2.dBK << 4) - 2;
        int n3 = n2 + 16 + 2;
        int n4 = (b2.dBL << 4) - 2;
        int n5 = n4 + 16 + 2;
        return this.b(new w(n2, 0, n4, n3, 256, n5), bl2);
    }

    @Override
    public List<s> b(w w2, boolean bl2) {
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < 2; ++i2) {
            Iterator<s> iterator = i2 == 0 ? this.dDZ.iterator() : this.dEl.iterator();
            while (iterator.hasNext()) {
                s s2 = iterator.next();
                net.minecraft.util.b b2 = s2.dCC;
                if (b2.wt() < w2.dQB || b2.wt() >= w2.dQE || b2.wx() < w2.dQD || b2.wx() >= w2.dQG) continue;
                if (bl2) {
                    this.dDY.remove(s2);
                    iterator.remove();
                }
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                }
                arrayList.add(s2);
            }
        }
        return arrayList;
    }

    @Override
    public void d(c c2, boolean bl2) {
        if (!this.awn() && (c2 instanceof net.minecraft.entity.passive.b || c2 instanceof ah)) {
            c2.Tt();
        }
        if (!this.awm() && c2 instanceof af) {
            c2.Tt();
        }
        super.d(c2, bl2);
    }

    private boolean awm() {
        return this.dDV.alw();
    }

    private boolean awn() {
        return this.dDV.alv();
    }

    @Override
    protected net.minecraft.world.chunk.h HN() {
        net.minecraft.world.chunk.storage.h h2 = this.dDo.b(this.dDl);
        this.dEb = new f(this, h2, this.dDl.avV());
        return this.dEb;
    }

    public List<net.minecraft.tileentity.d> h(int n2, int n3, int n4, int n5, int n6, int n7) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < this.dCU.size(); ++i2) {
            net.minecraft.tileentity.d d2 = (net.minecraft.tileentity.d)this.dCU.get(i2);
            net.minecraft.util.b b2 = d2.Ab();
            if (b2.wt() < n2 || b2.wu() < n3 || b2.wx() < n4 || b2.wt() >= n5 || b2.wu() >= n6 || b2.wx() >= n7) continue;
            arrayList.add(d2);
        }
        return arrayList;
    }

    @Override
    public boolean a(net.minecraft.entity.player.a a2, net.minecraft.util.b b2) {
        return !this.dDV.b(this, b2, a2) && this.Sv().bm(b2);
    }

    @Override
    public void a(an an2) {
        if (!this.dDp.oy()) {
            try {
                this.b(an2);
                if (this.dDp.awC() == net.minecraft.world.ap.dEI) {
                    this.awo();
                }
                super.a(an2);
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Exception initializing level");
                try {
                    this.d(a2);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                throw new cl(a2);
            }
            this.dDp.cI(true);
        }
    }

    private void awo() {
        this.dDp.cK(false);
        this.dDp.cH(true);
        this.dDp.cG(false);
        this.dDp.cF(false);
        this.dDp.iS(1000000000);
        this.dDp.o(6000L);
        this.dDp.a(ao.dEA);
        this.dDp.cL(false);
        this.dDp.c(net.minecraft.world.f.dBR);
        this.dDp.cJ(true);
        this.Si().Y("doDaylightCycle", "false");
    }

    private void b(an an2) {
        if (!this.dDl.avX()) {
            this.dDp.bx(net.minecraft.util.b.dtN.hq(this.dDl.awb()));
        } else if (this.dDp.awC() == net.minecraft.world.ap.dEI) {
            this.dDp.bx(net.minecraft.util.b.dtN.aqX());
        } else {
            this.dDq = true;
            net.minecraft.world.biome.aj aj2 = this.dDl.avp();
            List<j> list = aj2.axj();
            Random random = new Random(this.avD());
            net.minecraft.util.b b2 = aj2.a(0, 0, 256, list, random);
            int n2 = 0;
            int n3 = this.dDl.awb();
            int n4 = 0;
            if (b2 != null) {
                n2 = b2.wt();
                n4 = b2.wx();
            } else {
                dDU.warn("Unable to find spawn biome");
            }
            int n5 = 0;
            while (!this.dDl.aO(n2, n4)) {
                n2 += random.nextInt(64) - random.nextInt(64);
                n4 += random.nextInt(64) - random.nextInt(64);
                if (++n5 != 1000) continue;
            }
            this.dDp.bx(new net.minecraft.util.b(n2, n3, n4));
            this.dDq = false;
            if (an2.awz()) {
                this.awp();
            }
        }
    }

    protected void awp() {
        int n2;
        int n3;
        net.minecraft.util.b b2;
        ap ap2 = new ap(dEk, 10);
        for (int i2 = 0; i2 < 10 && !ap2.b(this, this.dDk, b2 = this.aT(new net.minecraft.util.b(n3 = this.dDp.azn() + this.dDk.nextInt(6) - this.dDk.nextInt(6), 0, n2 = this.dDp.azp() + this.dDk.nextInt(6) - this.dDk.nextInt(6))).aqX()); ++i2) {
        }
    }

    public net.minecraft.util.b awa() {
        return this.dDl.awa();
    }

    public void b(boolean bl2, be be2) {
        if (this.dDn.Hl()) {
            if (be2 != null) {
                be2.cv("Saving level");
            }
            this.awr();
            if (be2 != null) {
                be2.cx("Saving chunks");
            }
            this.dDn.a(bl2, be2);
            for (a a2 : Lists.newArrayList(this.dEb.ayf())) {
                if (a2 == null || this.dDX.aB(a2.dIK, a2.dIL)) continue;
                this.dEb.bf(a2.dIK, a2.dIL);
            }
        }
    }

    public void awq() {
        if (this.dDn.Hl()) {
            this.dDn.Hj();
        }
    }

    protected void awr() {
        this.avC();
        this.dDp.aR(this.Sv().axq());
        this.dDp.aU(this.Sv().getCenterX());
        this.dDp.aT(this.Sv().getCenterZ());
        this.dDp.aV(this.Sv().axs());
        this.dDp.aW(this.Sv().axt());
        this.dDp.iT(this.Sv().getWarningDistance());
        this.dDp.iU(this.Sv().getWarningTime());
        this.dDp.aS(this.Sv().getTargetSize());
        this.dDp.Q(this.Sv().getTimeUntilTarget());
        this.dDo.a(this.dDp, this.dDV.alE().alY());
        this.dDr.azB();
    }

    @Override
    protected void I(c c2) {
        super.I(c2);
        this.dDa.c(c2.getEntityId(), c2);
        this.dEa.put(c2.Ul(), c2);
        c[] cArray = c2.Ue();
        if (cArray != null) {
            for (int i2 = 0; i2 < cArray.length; ++i2) {
                this.dDa.c(cArray[i2].getEntityId(), cArray[i2]);
            }
        }
    }

    @Override
    protected void J(c c2) {
        super.J(c2);
        this.dDa.hI(c2.getEntityId());
        this.dEa.remove(c2.Ul());
        c[] cArray = c2.Ue();
        if (cArray != null) {
            for (int i2 = 0; i2 < cArray.length; ++i2) {
                this.dDa.hI(cArray[i2].getEntityId());
            }
        }
    }

    @Override
    public boolean ay(c c2) {
        if (super.ay(c2)) {
            this.dDV.alE().a(c2.gW, c2.gX, c2.gY, 512.0, this.dDl.getDimensionId(), new aw(c2));
            return true;
        }
        return false;
    }

    @Override
    public void a(c c2, byte by2) {
        this.awu().b(c2, new ab(c2, by2));
    }

    @Override
    public net.minecraft.world.h a(c c2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        net.minecraft.world.h h2 = new net.minecraft.world.h(this, c2, d2, d3, d4, f2, bl2, bl3);
        h2.avd();
        h2.cs(false);
        if (!bl3) {
            h2.avg();
        }
        for (net.minecraft.entity.player.a a2 : this.dCY) {
            if (!(a2.M(d2, d3, d4) < 4096.0)) continue;
            ((e)a2).cIX.B(new ar(d2, d3, d4, f2, h2.ahp(), h2.ave().get(a2)));
        }
        return h2;
    }

    @Override
    public void c(net.minecraft.util.b b2, Block block, int n2, int n3) {
        BlockEventData blockEventData = new BlockEventData(b2, block, n2, n3);
        for (BlockEventData blockEventData2 : this.dEi[this.dEj]) {
            if (!blockEventData2.equals(blockEventData)) continue;
            return;
        }
        this.dEi[this.dEj].add(blockEventData);
    }

    private void aws() {
        while (!this.dEi[this.dEj].isEmpty()) {
            int n2 = this.dEj;
            this.dEj ^= 1;
            for (BlockEventData blockEventData : this.dEi[n2]) {
                if (!this.a(blockEventData)) continue;
                this.dDV.alE().a(blockEventData.yl().wt(), blockEventData.yl().wu(), blockEventData.yl().wx(), 64.0, this.dDl.getDimensionId(), new net.minecraft.network.play.server.ao(blockEventData.yl(), blockEventData.df(), blockEventData.yn(), blockEventData.yo()));
            }
            this.dEi[n2].clear();
        }
    }

    private boolean a(BlockEventData blockEventData) {
        IBlockState iBlockState = this.L(blockEventData.yl());
        return iBlockState.df() == blockEventData.df() && iBlockState.df().a((net.minecraft.world.w)this, blockEventData.yl(), iBlockState, blockEventData.yn(), blockEventData.yo());
    }

    public void bf() {
        this.dDo.bf();
    }

    @Override
    protected void HQ() {
        boolean bl2 = this.avK();
        super.HQ();
        if (this.dDf != this.dDg) {
            this.dDV.alE().a(new av(7, this.dDg), this.dDl.getDimensionId());
        }
        if (this.dDh != this.dDi) {
            this.dDV.alE().a(new av(8, this.dDi), this.dDl.getDimensionId());
        }
        if (bl2 != this.avK()) {
            if (bl2) {
                this.dDV.alE().H(new av(2, 0.0f));
            } else {
                this.dDV.alE().H(new av(1, 0.0f));
            }
            this.dDV.alE().H(new av(7, this.dDg));
            this.dDV.alE().H(new av(8, this.dDi));
        }
    }

    @Override
    protected int HR() {
        return this.dDV.alE().amz();
    }

    public MinecraftServer awt() {
        return this.dDV;
    }

    public net.minecraft.entity.w awu() {
        return this.dDW;
    }

    public PlayerManager awv() {
        return this.dDX;
    }

    public u aww() {
        return this.dEf;
    }

    public void a(as as2, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... nArray) {
        this.a(as2, false, d2, d3, d4, n2, d5, d6, d7, d8, nArray);
    }

    public void a(as as2, boolean bl2, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... nArray) {
        au au2 = new au(as2, bl2, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, n2, nArray);
        for (int i2 = 0; i2 < this.dCY.size(); ++i2) {
            e e2 = (e)this.dCY.get(i2);
            net.minecraft.util.b b2 = e2.yl();
            double d9 = b2.am(d2, d3, d4);
            if (!(d9 <= 256.0) && (!bl2 || !(d9 <= 65536.0))) continue;
            e2.cIX.B(au2);
        }
    }

    public c j(UUID uUID) {
        return this.dEa.get(uUID);
    }

    @Override
    public ListenableFuture<Object> f(Runnable runnable) {
        return this.dDV.f(runnable);
    }

    @Override
    public boolean BD() {
        return this.dDV.BD();
    }
}

