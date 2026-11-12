/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.multiplayer;

import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.audio.MovingSoundMinecart;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.multiplayer.a;
import net.minecraft.client.multiplayer.d;
import net.minecraft.client.multiplayer.k;
import net.minecraft.client.multiplayer.l;
import net.minecraft.client.multiplayer.m;
import net.minecraft.client.multiplayer.n;
import net.minecraft.client.network.h;
import net.minecraft.client.particle.aj;
import net.minecraft.entity.c;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.scoreboard.i;
import net.minecraft.util.as;
import net.minecraft.util.b;
import net.minecraft.util.cm;
import net.minecraft.util.g;
import net.minecraft.util.s;
import net.minecraft.world.an;
import net.minecraft.world.ao;
import net.minecraft.world.f;
import net.minecraft.world.storage.o;
import net.minecraft.world.w;
import net.optifine.ac;

public class j
extends w {
    private final h bEg;
    private a bEh;
    private final Set<c> bEi = Sets.newHashSet();
    private final Set<c> bEj = Sets.newHashSet();
    private final net.minecraft.client.d bEk = net.minecraft.client.d.AZ();
    private final Set<net.minecraft.world.b> bEl = Sets.newHashSet();
    private boolean bEm = false;
    private int bDw;

    public j(h h2, an an2, int n2, f f2, net.minecraft.profiler.d d2) {
        super(new net.minecraft.world.storage.m(), new o(an2, "MpServer"), net.minecraft.world.ac.ig(n2), d2, true);
        this.bEg = h2;
        this.avH().c(f2);
        this.dDl.p(this);
        this.bd(new b(8, 64, 8));
        this.dDn = this.HN();
        this.dDr = new net.minecraft.world.storage.i();
        this.avx();
        this.avy();
        net.optifine.reflect.g.a(net.optifine.reflect.g.eqS, this);
        if (this.bEk.bgu != null && this.bEk.bgu.getClass() == d.class) {
            this.bEk.bgu = new net.optifine.override.b(this.bEk, h2);
            ac.a((net.optifine.override.b)this.bEk.bgu);
        }
    }

    @Override
    public void tick() {
        super.tick();
        this.I(this.getTotalWorldTime() + 1L);
        if (this.Si().gw("doDaylightCycle")) {
            this.o(this.getWorldTime() + 1L);
        }
        this.dDt.eY("reEntryProcessing");
        for (int i2 = 0; i2 < 10 && !this.bEj.isEmpty(); ++i2) {
            c c2 = this.bEj.iterator().next();
            this.bEj.remove(c2);
            if (this.dCS.contains(c2)) continue;
            this.G(c2);
        }
        this.dDt.fa("chunkCache");
        this.bEh.Hk();
        this.dDt.fa("blocks");
        this.HO();
        this.dDt.ajv();
    }

    public void d(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    protected net.minecraft.world.chunk.h HN() {
        this.bEh = new a(this);
        return this.bEh;
    }

    @Override
    protected void HO() {
        super.HO();
        this.bEl.retainAll(this.dDx);
        if (this.bEl.size() == this.dDx.size()) {
            this.bEl.clear();
        }
        int n2 = 0;
        for (net.minecraft.world.b b2 : this.dDx) {
            if (this.bEl.contains(b2)) continue;
            int n3 = b2.dBK * 16;
            int n4 = b2.dBL * 16;
            this.dDt.eY("getChunk");
            net.minecraft.world.chunk.a a2 = this.aL(b2.dBK, b2.dBL);
            this.a(n3, n4, a2);
            this.dDt.ajv();
            this.bEl.add(b2);
            if (++n2 < 10) continue;
            return;
        }
    }

    public void b(int n2, int n3, boolean bl2) {
        if (bl2) {
            this.bEh.G(n2, n3);
        } else {
            this.bEh.F(n2, n3);
        }
        if (!bl2) {
            this.f(n2 * 16, 0, n3 * 16, n2 * 16 + 15, 256, n3 * 16 + 15);
        }
    }

    public int Ho() {
        return ++this.bDw;
    }

    @Override
    public boolean G(c c2) {
        boolean bl2 = super.G(c2);
        this.bEi.add(c2);
        if (!bl2) {
            this.bEj.add(c2);
        } else if (c2 instanceof net.minecraft.entity.item.k) {
            this.bEk.Bx().a(new MovingSoundMinecart((net.minecraft.entity.item.k)c2));
        }
        return bl2;
    }

    @Override
    public void H(c c2) {
        super.H(c2);
        this.bEi.remove(c2);
    }

    @Override
    protected void I(c c2) {
        super.I(c2);
        this.bEj.remove(c2);
    }

    @Override
    protected void J(c c2) {
        super.J(c2);
        boolean bl2 = false;
        if (this.bEi.contains(c2)) {
            if (c2.TS()) {
                this.bEj.add(c2);
                bl2 = true;
            } else {
                this.bEi.remove(c2);
            }
        }
    }

    public void a(int n2, c c2) {
        c c3 = this.cn(n2);
        if (c3 != null) {
            this.H(c3);
        }
        this.bEi.add(c2);
        c2.eu(n2);
        if (!this.G(c2)) {
            this.bEj.add(c2);
        }
        this.dDa.c(n2, c2);
    }

    @Override
    public c cn(int n2) {
        return n2 == this.bEk.bgK.getEntityId() ? this.bEk.bgK : super.cn(n2);
    }

    public c co(int n2) {
        c c2 = (c)this.dDa.hI(n2);
        if (c2 != null) {
            this.bEi.remove(c2);
            this.H(c2);
        }
        return c2;
    }

    public boolean a(b b2, IBlockState iBlockState) {
        int n2 = b2.wt();
        int n3 = b2.wu();
        int n4 = b2.wx();
        this.d(n2, n3, n4, n2, n3, n4);
        return super.a(b2, iBlockState, 3);
    }

    @Override
    public void HP() {
        this.bEg.dr().i(new s("Quitting"));
    }

    @Override
    protected void HQ() {
    }

    @Override
    protected int HR() {
        return this.bEk.aIY.bOt;
    }

    public void q(int n2, int n3, int n4) {
        int n5 = 16;
        Random random = new Random();
        co co2 = this.bEk.bgK.Vk();
        boolean bl2 = this.bEk.bgu.HA() == ao.dEy && co2 != null && Block.f(co2.bP()) == Blocks.cOx;
        g g2 = new g();
        for (int i2 = 0; i2 < 1000; ++i2) {
            int n6 = n2 + this.dDk.nextInt(16) - this.dDk.nextInt(16);
            int n7 = n3 + this.dDk.nextInt(16) - this.dDk.nextInt(16);
            int n8 = n4 + this.dDk.nextInt(16) - this.dDk.nextInt(16);
            g2.E(n6, n7, n8);
            IBlockState iBlockState = this.L(g2);
            iBlockState.df().c(this, g2, iBlockState, random);
            if (!bl2 || iBlockState.df() != Blocks.cOx) continue;
            this.a(as.dxF, (float)n6 + 0.5f, (double)((float)n7 + 0.5f), (double)((float)n8 + 0.5f), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    public void HS() {
        int n2;
        int n3;
        int n4;
        this.dCS.removeAll(this.dCT);
        for (n4 = 0; n4 < this.dCT.size(); ++n4) {
            c c2 = (c)this.dCT.get(n4);
            n3 = c2.csH;
            n2 = c2.csJ;
            if (!c2.csG || !this.e(n3, n2, true)) continue;
            this.aL(n3, n2).H(c2);
        }
        for (n4 = 0; n4 < this.dCT.size(); ++n4) {
            this.J((c)this.dCT.get(n4));
        }
        this.dCT.clear();
        for (c c2 : this.dCS) {
            if (c2.crC != null) {
                if (!c2.crC.csb && c2.crC.crA == c2) continue;
                c2.crC.crA = null;
                c2.crC = null;
            }
            if (!c2.csb) continue;
            n3 = c2.csH;
            n2 = c2.csJ;
            if (c2.csG && this.e(n3, n2, true)) {
                this.aL(n3, n2).H(c2);
            }
            this.dCS.remove(c2);
            this.J(c2);
        }
    }

    @Override
    public net.minecraft.crash.i d(net.minecraft.crash.a a2) {
        net.minecraft.crash.i i2 = super.d(a2);
        i2.a("Forced entities", new k(this));
        i2.a("Retry entities", new l(this));
        i2.a("Server brand", new m(this));
        i2.a("Server type", new n(this));
        return i2;
    }

    public void a(b b2, String string, float f2, float f3, boolean bl2) {
        this.a((double)b2.wt() + 0.5, (double)b2.wu() + 0.5, (double)b2.wx() + 0.5, string, f2, f3, bl2);
    }

    @Override
    public void a(double d2, double d3, double d4, String string, float f2, float f3, boolean bl2) {
        double d5 = this.bEk.BC().M(d2, d3, d4);
        PositionedSoundRecord positionedSoundRecord = new PositionedSoundRecord(new cm(string), f2, f3, (float)d2, (float)d3, (float)d4);
        if (bl2 && d5 > 100.0) {
            double d6 = Math.sqrt(d5) / 40.0;
            this.bEk.Bx().a(positionedSoundRecord, (int)(d6 * 20.0));
        } else {
            this.bEk.Bx().a(positionedSoundRecord);
        }
    }

    @Override
    public void a(double d2, double d3, double d4, double d5, double d6, double d7, net.minecraft.nbt.n n2) {
        this.bEk.bgN.a(new aj(this, d2, d3, d4, d5, d6, d7, this.bEk.bgN, n2));
    }

    public void b(i i2) {
        this.dDv = i2;
    }

    @Override
    public void o(long l2) {
        if (l2 < 0L) {
            l2 = -l2;
            this.Si().Y("doDaylightCycle", "false");
        } else {
            this.Si().Y("doDaylightCycle", "true");
        }
        super.o(l2);
    }

    @Override
    public int b(b b2, int n2) {
        int n3 = super.b(b2, n2);
        if (net.minecraft.src.a.apa()) {
            n3 = net.optifine.ao.b(b2, n3);
        }
        return n3;
    }

    @Override
    public boolean a(b b2, IBlockState iBlockState, int n2) {
        this.bEm = this.HT();
        boolean bl2 = super.a(b2, iBlockState, n2);
        this.bEm = false;
        return bl2;
    }

    private boolean HT() {
        if (this.bEk.bgu instanceof net.optifine.override.b) {
            net.optifine.override.b b2 = (net.optifine.override.b)this.bEk.bgu;
            return b2.aDp();
        }
        return false;
    }

    public boolean HU() {
        return this.bEm;
    }
}

