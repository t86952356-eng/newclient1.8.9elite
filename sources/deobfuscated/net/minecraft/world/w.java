/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package net.minecraft.world;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.viamcp.fixes.FixedSoundEngine;
import hackclient.rise.aei;
import hackclient.rise.afl;
import hackclient.rise.ahd;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab$EnumBlockHalf;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStairs$EnumHalf;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.p;
import net.minecraft.init.Blocks;
import net.minecraft.item.co;
import net.minecraft.nbt.n;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ao;
import net.minecraft.util.ar;
import net.minecraft.util.as;
import net.minecraft.util.bi;
import net.minecraft.util.bj;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cf;
import net.minecraft.util.cl;
import net.minecraft.util.da;
import net.minecraft.world.aa;
import net.minecraft.world.ac;
import net.minecraft.world.ah;
import net.minecraft.world.an;
import net.minecraft.world.ap;
import net.minecraft.world.b;
import net.minecraft.world.biome.aj;
import net.minecraft.world.biome.j;
import net.minecraft.world.border.c;
import net.minecraft.world.chunk.a;
import net.minecraft.world.e;
import net.minecraft.world.f;
import net.minecraft.world.g;
import net.minecraft.world.i;
import net.minecraft.world.l;
import net.minecraft.world.s;
import net.minecraft.world.storage.d;
import net.minecraft.world.storage.h;
import net.minecraft.world.storage.o;
import net.minecraft.world.x;
import net.minecraft.world.y;
import net.minecraft.world.z;
import rise.module.impl.render.FullBright;
import rise.util.InstanceAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class w
implements InstanceAccess,
ahd,
Serializable,
l {
    private int dCQ = 63;
    protected boolean dCR;
    public final ConcurrentLinkedQueue<net.minecraft.entity.c> dCS = new ConcurrentLinkedQueue();
    protected final List<net.minecraft.entity.c> dCT = Lists.newArrayList();
    public final List<net.minecraft.tileentity.d> dCU = Lists.newArrayList();
    public final List<net.minecraft.tileentity.d> dCV = Lists.newArrayList();
    private final List<net.minecraft.tileentity.d> dCW = Lists.newArrayList();
    private final List<net.minecraft.tileentity.d> dCX = Lists.newArrayList();
    public final List<net.minecraft.entity.player.a> dCY = Lists.newArrayList();
    public final List<net.minecraft.entity.c> dCZ = Lists.newArrayList();
    protected final bj<net.minecraft.entity.c> dDa = new bj();
    private final long dDb = 0xFFFFFFL;
    private int dDc;
    protected int dDd = new Random().nextInt();
    protected final int dDe = 1013904223;
    protected float dDf;
    protected float dDg;
    protected float dDh;
    protected float dDi;
    private int dDj;
    public final Random dDk = new Random();
    public final ac dDl;
    protected List<net.minecraft.world.o> dDm = Lists.newArrayList();
    protected net.minecraft.world.chunk.h dDn;
    protected final d dDo;
    protected o dDp;
    protected boolean dDq;
    protected h dDr;
    protected net.minecraft.village.e dDs;
    public final net.minecraft.profiler.d dDt;
    private final Calendar dDu = Calendar.getInstance();
    protected net.minecraft.scoreboard.i dDv = new net.minecraft.scoreboard.i();
    public final boolean dDw;
    protected Set<b> dDx = Sets.newHashSet();
    private int dDy = this.dDk.nextInt(12000);
    protected boolean dDz = true;
    protected boolean dDA = true;
    private boolean dDB;
    private final c dDC;
    int[] dDD = new int[32768];

    protected w(d d2, o o2, ac ac2, net.minecraft.profiler.d d3, boolean bl2) {
        this.dDo = d2;
        this.dDt = d3;
        this.dDp = o2;
        this.dDl = ac2;
        this.dDw = bl2;
        this.dDC = ac2.Sv();
    }

    public w avo() {
        return this;
    }

    @Override
    public j aF(net.minecraft.util.b b2) {
        if (this.aJ(b2)) {
            a a2 = this.aK(b2);
            try {
                return a2.a(b2, this.dDl.avp());
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a3 = net.minecraft.crash.a.a(throwable, "Getting biome");
                net.minecraft.crash.i i2 = a3.dY("Coordinates of biome request");
                i2.a("Location", new x(this, b2));
                throw new cl(a3);
            }
        }
        return this.dDl.avp().b(b2, j.dGg);
    }

    public aj avp() {
        return this.dDl.avp();
    }

    protected abstract net.minecraft.world.chunk.h HN();

    public void a(an an2) {
        this.dDp.cI(true);
    }

    public void avq() {
        this.bd(new net.minecraft.util.b(8, 64, 8));
    }

    public Block aH(net.minecraft.util.b b2) {
        net.minecraft.util.b b3 = new net.minecraft.util.b(b2.wt(), this.avB(), b2.wx());
        while (!this.aG(b3.aqX())) {
            b3 = b3.aqX();
        }
        return this.L(b3).df();
    }

    private boolean aI(net.minecraft.util.b b2) {
        if (b2 == null) {
            return false;
        }
        return b2.wt() >= -30000000 && b2.wx() >= -30000000 && b2.wt() < 30000000 && b2.wx() < 30000000 && b2.wu() >= 0 && b2.wu() < 256;
    }

    @Override
    public boolean aG(net.minecraft.util.b b2) {
        return this.L(b2).df().xb() == Material.beo;
    }

    public boolean aJ(net.minecraft.util.b b2) {
        return this.b(b2, true);
    }

    public boolean b(net.minecraft.util.b b2, boolean bl2) {
        return this.aI(b2) && this.e(b2.wt() >> 4, b2.wx() >> 4, bl2);
    }

    public boolean f(net.minecraft.util.b b2, int n2) {
        return this.a(b2, n2, true);
    }

    public boolean a(net.minecraft.util.b b2, int n2, boolean bl2) {
        return this.a(b2.wt() - n2, b2.wu() - n2, b2.wx() - n2, b2.wt() + n2, b2.wu() + n2, b2.wx() + n2, bl2);
    }

    public boolean e(net.minecraft.util.b b2, net.minecraft.util.b b3) {
        return this.a(b2, b3, true);
    }

    public boolean a(net.minecraft.util.b b2, net.minecraft.util.b b3, boolean bl2) {
        return this.a(b2.wt(), b2.wu(), b2.wx(), b3.wt(), b3.wu(), b3.wx(), bl2);
    }

    public boolean a(net.minecraft.world.gen.structure.w w2) {
        return this.a(w2, true);
    }

    public boolean a(net.minecraft.world.gen.structure.w w2, boolean bl2) {
        return this.a(w2.dQB, w2.dQC, w2.dQD, w2.dQE, w2.dQF, w2.dQG, bl2);
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        if (n6 >= 0 && n3 < 256) {
            n4 >>= 4;
            n5 >>= 4;
            n7 >>= 4;
            for (int i2 = n2 >>= 4; i2 <= n5; ++i2) {
                for (int i3 = n4; i3 <= n7; ++i3) {
                    if (this.e(i2, i3, bl2)) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean e(int n2, int n3, boolean bl2) {
        return this.dDn.E(n2, n3) && (bl2 || !this.dDn.H(n2, n3).isEmpty());
    }

    public a aK(net.minecraft.util.b b2) {
        return this.aL(b2.wt() >> 4, b2.wx() >> 4);
    }

    public a aL(int n2, int n3) {
        return this.dDn.H(n2, n3);
    }

    public boolean a(net.minecraft.util.b b2, IBlockState iBlockState, int n2) {
        if (!this.aI(b2)) {
            return false;
        }
        if (!this.dDw && this.dDp.awC() == ap.dEI) {
            return false;
        }
        a a2 = this.aK(b2);
        Block block = iBlockState.df();
        IBlockState iBlockState2 = a2.e(b2, iBlockState);
        if (iBlockState2 == null) {
            return false;
        }
        Block block2 = iBlockState2.df();
        if (block.wX() != block2.wX() || block.wZ() != block2.wZ()) {
            this.dDt.eY("checkLight");
            this.aZ(b2);
            this.dDt.ajv();
        }
        if ((n2 & 2) != 0 && (!this.dDw || (n2 & 4) == 0) && a2.axB()) {
            this.P(b2);
        }
        if (!this.dDw && (n2 & 1) != 0) {
            this.b(b2, iBlockState2.df());
            if (block.xJ()) {
                this.f(b2, block);
            }
        }
        return true;
    }

    public boolean aL(net.minecraft.util.b b2) {
        return this.a(b2, Blocks.cLc.xM(), 3);
    }

    public boolean c(net.minecraft.util.b b2, boolean bl2) {
        return FixedSoundEngine.destroyBlock(this, b2, bl2);
    }

    public boolean d(net.minecraft.util.b b2, IBlockState iBlockState) {
        return this.a(b2, iBlockState, 3);
    }

    public void P(net.minecraft.util.b b2) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).P(b2);
        }
    }

    public void b(net.minecraft.util.b b2, Block block) {
        if (this.dDp.awC() != ap.dEI) {
            this.c(b2, block);
        }
    }

    public void x(int n2, int n3, int n4, int n5) {
        int n6;
        if (n4 > n5) {
            n6 = n5;
            n5 = n4;
            n4 = n6;
        }
        if (!this.dDl.awf()) {
            for (n6 = n4; n6 <= n5; ++n6) {
                this.d(g.dBZ, new net.minecraft.util.b(n2, n6, n3));
            }
        }
        this.f(n2, n4, n3, n2, n5, n3);
    }

    public void f(net.minecraft.util.b b2, net.minecraft.util.b b3) {
        this.f(b2.wt(), b2.wu(), b2.wx(), b3.wt(), b3.wu(), b3.wx());
    }

    public void f(int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).f(n2, n3, n4, n5, n6, n7);
        }
    }

    public void c(net.minecraft.util.b b2, Block block) {
        this.d(b2.arb(), block);
        this.d(b2.arc(), block);
        this.d(b2.aqY(), block);
        this.d(b2.aqX(), block);
        this.d(b2.aqZ(), block);
        this.d(b2.ara(), block);
    }

    public void a(net.minecraft.util.b b2, Block block, ao ao2) {
        if (ao2 != ao.dwu) {
            this.d(b2.arb(), block);
        }
        if (ao2 != ao.dwv) {
            this.d(b2.arc(), block);
        }
        if (ao2 != ao.dwq) {
            this.d(b2.aqY(), block);
        }
        if (ao2 != ao.dwr) {
            this.d(b2.aqX(), block);
        }
        if (ao2 != ao.dws) {
            this.d(b2.aqZ(), block);
        }
        if (ao2 != ao.dwt) {
            this.d(b2.ara(), block);
        }
    }

    public void d(net.minecraft.util.b b2, Block block) {
        if (!this.dDw) {
            IBlockState iBlockState = this.L(b2);
            try {
                iBlockState.df().a(this, b2, iBlockState, block);
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Exception while updating neighbours");
                net.minecraft.crash.i i2 = a2.dY("Block being updated");
                i2.a("Source block type", new y(this, block));
                net.minecraft.crash.i.a(i2, b2, iBlockState);
                throw new cl(a2);
            }
        }
    }

    public boolean e(net.minecraft.util.b b2, Block block) {
        return false;
    }

    public boolean aM(net.minecraft.util.b b2) {
        return this.aK(b2).aM(b2);
    }

    public boolean aN(net.minecraft.util.b b2) {
        if (b2.wu() >= this.avB()) {
            return this.aM(b2);
        }
        net.minecraft.util.b b3 = new net.minecraft.util.b(b2.wt(), this.avB(), b2.wx());
        if (!this.aM(b3)) {
            return false;
        }
        b3 = b3.aqY();
        while (b3.wu() > b2.wu()) {
            Block block = this.L(b3).df();
            if (block.wX() > 0 && !block.xb().zv()) {
                return false;
            }
            b3 = b3.aqY();
        }
        return true;
    }

    public int aO(net.minecraft.util.b b2) {
        if (b2.wu() < 0) {
            return 0;
        }
        if (b2.wu() >= 256) {
            b2 = new net.minecraft.util.b(b2.wt(), 255, b2.wx());
        }
        return this.aK(b2).g(b2, 0);
    }

    public int aP(net.minecraft.util.b b2) {
        return this.d(b2, true);
    }

    public int d(net.minecraft.util.b b2, boolean bl2) {
        if (b2.wt() >= -30000000 && b2.wx() >= -30000000 && b2.wt() < 30000000 && b2.wx() < 30000000) {
            if (bl2 && this.L(b2).df().xa()) {
                int n2 = this.d(b2.aqX(), false);
                int n3 = this.d(b2.arc(), false);
                int n4 = this.d(b2.arb(), false);
                int n5 = this.d(b2.ara(), false);
                int n6 = this.d(b2.aqZ(), false);
                if (n3 > n2) {
                    n2 = n3;
                }
                if (n4 > n2) {
                    n2 = n4;
                }
                if (n5 > n2) {
                    n2 = n5;
                }
                if (n6 > n2) {
                    n2 = n6;
                }
                return n2;
            }
            if (b2.wu() < 0) {
                return 0;
            }
            if (b2.wu() >= 256) {
                b2 = new net.minecraft.util.b(b2.wt(), 255, b2.wx());
            }
            a a2 = this.aK(b2);
            return a2.g(b2, this.dDc);
        }
        return 15;
    }

    public net.minecraft.util.b aQ(net.minecraft.util.b b2) {
        int n2 = b2.wt() >= -30000000 && b2.wx() >= -30000000 && b2.wt() < 30000000 && b2.wx() < 30000000 ? (this.e(b2.wt() >> 4, b2.wx() >> 4, true) ? this.aL(b2.wt() >> 4, b2.wx() >> 4).aU(b2.wt() & 0xF, b2.wx() & 0xF) : 0) : this.avB() + 1;
        return new net.minecraft.util.b(b2.wt(), n2, b2.wx());
    }

    public int aM(int n2, int n3) {
        if (n2 >= -30000000 && n3 >= -30000000 && n2 < 30000000 && n3 < 30000000) {
            if (!this.e(n2 >> 4, n3 >> 4, true)) {
                return 0;
            }
            a a2 = this.aL(n2 >> 4, n3 >> 4);
            return a2.axN();
        }
        return this.avB() + 1;
    }

    public int c(g g2, net.minecraft.util.b b2) {
        if (this.dDl.awf() && g2 == g.dBZ) {
            return 0;
        }
        if (b2.wu() < 0) {
            b2 = new net.minecraft.util.b(b2.wt(), 0, b2.wx());
        }
        if (!this.aI(b2)) {
            return g2.dCb;
        }
        if (!this.aJ(b2)) {
            return g2.dCb;
        }
        if (this.L(b2).df().xa()) {
            int n2 = this.b(g2, b2.aqX());
            int n3 = this.b(g2, b2.arc());
            int n4 = this.b(g2, b2.arb());
            int n5 = this.b(g2, b2.ara());
            int n6 = this.b(g2, b2.aqZ());
            if (n3 > n2) {
                n2 = n3;
            }
            if (n4 > n2) {
                n2 = n4;
            }
            if (n5 > n2) {
                n2 = n5;
            }
            if (n6 > n2) {
                n2 = n6;
            }
            return n2;
        }
        a a2 = this.aK(b2);
        return a2.b(g2, b2);
    }

    public int b(g g2, net.minecraft.util.b b2) {
        if (b2.wu() < 0) {
            b2 = new net.minecraft.util.b(b2.wt(), 0, b2.wx());
        }
        if (!this.aI(b2)) {
            return g2.dCb;
        }
        if (!this.aJ(b2)) {
            return g2.dCb;
        }
        a a2 = this.aK(b2);
        return a2.b(g2, b2);
    }

    public void a(g g2, net.minecraft.util.b b2, int n2) {
        if (this.aI(b2) && this.aJ(b2)) {
            a a2 = this.aK(b2);
            a2.a(g2, b2, n2);
            this.Q(b2);
        }
    }

    public void Q(net.minecraft.util.b b2) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).Q(b2);
        }
    }

    @Override
    public int b(net.minecraft.util.b b2, int n2) {
        int n3 = this.c(g.dBZ, b2);
        int n4 = this.c(g.dCa, b2);
        if (n4 < n2) {
            n4 = n2;
        }
        return n3 << 20 | n4 << 4;
    }

    public float aR(net.minecraft.util.b b2) {
        return this.dDl.awg()[this.aP(b2)];
    }

    @Override
    public IBlockState L(net.minecraft.util.b b2) {
        if (!this.aI(b2)) {
            return Blocks.cLc.xM();
        }
        a a2 = this.aK(b2);
        return a2.L(b2);
    }

    public boolean avr() {
        return this.dDc < 4;
    }

    public ce d(da da2, da da3) {
        return this.a(da2, da3, false, false, false);
    }

    public ce a(da da2, da da3, boolean bl2) {
        return this.a(da2, da3, bl2, false, false);
    }

    public ce a(da da2, da da3, boolean bl2, boolean bl3, boolean bl4) {
        if (!(Double.isNaN(da2.dAG) || Double.isNaN(da2.dAH) || Double.isNaN(da2.dAI))) {
            if (!(Double.isNaN(da3.dAG) || Double.isNaN(da3.dAH) || Double.isNaN(da3.dAI))) {
                ce ce2;
                int n2 = bt.aF(da3.dAG);
                int n3 = bt.aF(da3.dAH);
                int n4 = bt.aF(da3.dAI);
                int n5 = bt.aF(da2.dAG);
                int n6 = bt.aF(da2.dAH);
                int n7 = bt.aF(da2.dAI);
                net.minecraft.util.b b2 = new net.minecraft.util.b(n5, n6, n7);
                IBlockState iBlockState = this.L(b2);
                Block block = iBlockState.df();
                if ((!bl3 || block.a(this, b2, iBlockState) != null) && block.a(iBlockState, bl2) && (ce2 = block.a(this, b2, da2, da3)) != null) {
                    return ce2;
                }
                ce2 = null;
                int n8 = 200;
                while (n8-- >= 0) {
                    ao ao2;
                    if (Double.isNaN(da2.dAG) || Double.isNaN(da2.dAH) || Double.isNaN(da2.dAI)) {
                        return null;
                    }
                    if (n5 == n2 && n6 == n3 && n7 == n4) {
                        return bl4 ? ce2 : null;
                    }
                    boolean bl5 = true;
                    boolean bl6 = true;
                    boolean bl7 = true;
                    double d2 = 999.0;
                    double d3 = 999.0;
                    double d4 = 999.0;
                    if (n2 > n5) {
                        d2 = (double)n5 + 1.0;
                    } else if (n2 < n5) {
                        d2 = (double)n5 + 0.0;
                    } else {
                        bl5 = false;
                    }
                    if (n3 > n6) {
                        d3 = (double)n6 + 1.0;
                    } else if (n3 < n6) {
                        d3 = (double)n6 + 0.0;
                    } else {
                        bl6 = false;
                    }
                    if (n4 > n7) {
                        d4 = (double)n7 + 1.0;
                    } else if (n4 < n7) {
                        d4 = (double)n7 + 0.0;
                    } else {
                        bl7 = false;
                    }
                    double d5 = 999.0;
                    double d6 = 999.0;
                    double d7 = 999.0;
                    double d8 = da3.dAG - da2.dAG;
                    double d9 = da3.dAH - da2.dAH;
                    double d10 = da3.dAI - da2.dAI;
                    if (bl5) {
                        d5 = (d2 - da2.dAG) / d8;
                    }
                    if (bl6) {
                        d6 = (d3 - da2.dAH) / d9;
                    }
                    if (bl7) {
                        d7 = (d4 - da2.dAI) / d10;
                    }
                    if (d5 == -0.0) {
                        d5 = -1.0E-4;
                    }
                    if (d6 == -0.0) {
                        d6 = -1.0E-4;
                    }
                    if (d7 == -0.0) {
                        d7 = -1.0E-4;
                    }
                    if (d5 < d6 && d5 < d7) {
                        ao2 = n2 > n5 ? ao.dwu : ao.dwv;
                        da2 = new da(d2, da2.dAH + d9 * d5, da2.dAI + d10 * d5);
                    } else if (d6 < d7) {
                        ao2 = n3 > n6 ? ao.dwq : ao.dwr;
                        da2 = new da(da2.dAG + d8 * d6, d3, da2.dAI + d10 * d6);
                    } else {
                        ao2 = n4 > n7 ? ao.dws : ao.dwt;
                        da2 = new da(da2.dAG + d8 * d7, da2.dAH + d9 * d7, d4);
                    }
                    n5 = bt.aF(da2.dAG) - (ao2 == ao.dwv ? 1 : 0);
                    n6 = bt.aF(da2.dAH) - (ao2 == ao.dwr ? 1 : 0);
                    n7 = bt.aF(da2.dAI) - (ao2 == ao.dwt ? 1 : 0);
                    b2 = new net.minecraft.util.b(n5, n6, n7);
                    IBlockState iBlockState2 = this.L(b2);
                    Block block2 = iBlockState2.df();
                    if (bl3 && block2.a(this, b2, iBlockState2) == null) continue;
                    if (block2.a(iBlockState2, bl2)) {
                        ce ce3 = block2.a(this, b2, da2, da3);
                        if (ce3 == null) continue;
                        return ce3;
                    }
                    ce2 = new ce(cf.dzx, da2, ao2, b2);
                }
                return bl4 ? ce2 : null;
            }
            return null;
        }
        return null;
    }

    public void a(net.minecraft.entity.c c2, String string, float f2, float f3) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).a(string, c2.gW, c2.gX, c2.gY, f2, f3);
        }
    }

    public void a(net.minecraft.entity.player.a a2, String string, float f2, float f3) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).a(a2, string, a2.gW, a2.gX, a2.gY, f2, f3);
        }
    }

    public void a(double d2, double d3, double d4, String string, float f2, float f3) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).a(string, d2, d3, d4, f2, f3);
        }
    }

    public void a(double d2, double d3, double d4, String string, float f2, float f3, boolean bl2) {
    }

    public void a(net.minecraft.util.b b2, String string) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).a(string, b2);
        }
    }

    public void a(as as2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        this.a(as2.asY(), as2.ata(), d2, d3, d4, d5, d6, d7, nArray);
    }

    public void a(as as2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        this.a(as2.asY(), as2.ata() | bl2, d2, d3, d4, d5, d6, d7, nArray);
    }

    private void a(int n2, boolean bl2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).a(n2, bl2, d2, d3, d4, d5, d6, d7, nArray);
        }
    }

    public boolean ay(net.minecraft.entity.c c2) {
        this.dCZ.add(c2);
        return true;
    }

    public boolean G(net.minecraft.entity.c c2) {
        int n2 = bt.aF(c2.gW / 16.0);
        int n3 = bt.aF(c2.gY / 16.0);
        boolean bl2 = c2.crD;
        if (c2 instanceof net.minecraft.entity.player.a) {
            bl2 = true;
        }
        if (!bl2 && !this.e(n2, n3, true)) {
            return false;
        }
        if (c2 instanceof net.minecraft.entity.player.a) {
            net.minecraft.entity.player.a a2 = (net.minecraft.entity.player.a)c2;
            this.dCY.add(a2);
            this.avI();
        }
        this.aL(n2, n3).aE(c2);
        this.dCS.add(c2);
        this.I(c2);
        return true;
    }

    protected void I(net.minecraft.entity.c c2) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).I(c2);
        }
    }

    protected void J(net.minecraft.entity.c c2) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).J(c2);
        }
    }

    public void H(net.minecraft.entity.c c2) {
        if (c2.crA != null) {
            c2.crA.D(null);
        }
        if (c2.crC != null) {
            c2.D(null);
        }
        c2.Tt();
        if (c2 instanceof net.minecraft.entity.player.a) {
            this.dCY.remove(c2);
            this.avI();
            this.J(c2);
        }
    }

    public void az(net.minecraft.entity.c c2) {
        c2.Tt();
        if (c2 instanceof net.minecraft.entity.player.a) {
            this.dCY.remove(c2);
            this.avI();
        }
        int n2 = c2.csH;
        int n3 = c2.csJ;
        if (c2.csG && this.e(n2, n3, true)) {
            this.aL(n2, n3).H(c2);
        }
        this.dCS.remove(c2);
        this.J(c2);
    }

    public void a(net.minecraft.world.o o2) {
        this.dDm.add(o2);
    }

    public void b(net.minecraft.world.o o2) {
        this.dDm.remove(o2);
    }

    public List<net.minecraft.util.a> a(net.minecraft.entity.c c2, net.minecraft.util.a a2) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = bt.aF(a2.dtH);
        int n3 = bt.aF(a2.dtK + 1.0);
        int n4 = bt.aF(a2.dtI);
        int n5 = bt.aF(a2.dtL + 1.0);
        int n6 = bt.aF(a2.dtJ);
        int n7 = bt.aF(a2.dtM + 1.0);
        c c3 = this.Sv();
        boolean bl2 = c2.Ut();
        boolean bl3 = this.a(c3, c2);
        IBlockState iBlockState = Blocks.cLd.xM();
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n6; i3 < n7; ++i3) {
                if (!this.aJ(g2.E(i2, 64, i3))) continue;
                for (int i4 = n4 - 1; i4 < n5; ++i4) {
                    g2.E(i2, i4, i3);
                    if (bl2 && bl3) {
                        c2.aG(false);
                    } else if (!bl2 && !bl3) {
                        c2.aG(true);
                    }
                    IBlockState iBlockState2 = iBlockState;
                    if (c3.bm(g2) || !bl3) {
                        iBlockState2 = this.L(g2);
                    }
                    iBlockState2.df().a(this, g2, iBlockState2, a2, arrayList, c2);
                }
            }
        }
        double d2 = 0.25;
        if (c2 == w.aER.bgK) {
            List<net.minecraft.entity.c> list = this.b(c2, a2.ad(0.25, 0.25, 0.25));
            for (int i5 = 0; i5 < list.size(); ++i5) {
                if (c2.crA == list || c2.crC == list) continue;
                net.minecraft.util.a a3 = list.get(i5).ID();
                if (a3 != null && a3.q(a2)) {
                    arrayList.add(a3);
                }
                if ((a3 = c2.V(list.get(i5))) == null || !a3.q(a2)) continue;
                arrayList.add(a3);
            }
        }
        return arrayList;
    }

    public boolean a(c c2, net.minecraft.entity.c c3) {
        double d2 = c2.axm();
        double d3 = c2.axn();
        double d4 = c2.axo();
        double d5 = c2.axp();
        if (c3.Ut()) {
            d2 += 1.0;
            d3 += 1.0;
            d4 -= 1.0;
            d5 -= 1.0;
        } else {
            d2 -= 1.0;
            d3 -= 1.0;
            d4 += 1.0;
            d5 += 1.0;
        }
        return c3.gW > d2 && c3.gW < d4 && c3.gY > d3 && c3.gY < d5;
    }

    public List<net.minecraft.util.a> r(net.minecraft.util.a a2) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = bt.aF(a2.dtH);
        int n3 = bt.aF(a2.dtK + 1.0);
        int n4 = bt.aF(a2.dtI);
        int n5 = bt.aF(a2.dtL + 1.0);
        int n6 = bt.aF(a2.dtJ);
        int n7 = bt.aF(a2.dtM + 1.0);
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n6; i3 < n7; ++i3) {
                if (!this.aJ(g2.E(i2, 64, i3))) continue;
                for (int i4 = n4 - 1; i4 < n5; ++i4) {
                    g2.E(i2, i4, i3);
                    IBlockState iBlockState = i2 >= -30000000 && i2 < 30000000 && i3 >= -30000000 && i3 < 30000000 ? this.L(g2) : Blocks.cLj.xM();
                    iBlockState.df().a(this, g2, iBlockState, a2, arrayList, null);
                }
            }
        }
        return arrayList;
    }

    public int bR(float f2) {
        float f3 = this.bT(f2);
        float f4 = 1.0f - (bt.bB(f3 * (float)Math.PI * 2.0f) * 2.0f + 0.5f);
        f4 = bt.I(f4, 0.0f, 1.0f);
        f4 = 1.0f - f4;
        f4 = (float)((double)f4 * (1.0 - (double)(this.ca(f2) * 5.0f) / 16.0));
        f4 = (float)((double)f4 * (1.0 - (double)(this.bY(f2) * 5.0f) / 16.0));
        f4 = 1.0f - f4;
        return (int)(f4 * 11.0f);
    }

    public float bS(float f2) {
        float f3 = this.bT(f2);
        float f4 = 1.0f - (bt.bB(f3 * (float)Math.PI * 2.0f) * 2.0f + 0.2f);
        f4 = bt.I(f4, 0.0f, 1.0f);
        f4 = 1.0f - f4;
        f4 = (float)((double)f4 * (1.0 - (double)(this.ca(f2) * 5.0f) / 16.0));
        f4 = (float)((double)f4 * (1.0 - (double)(this.bY(f2) * 5.0f) / 16.0));
        return f4 * 0.8f + 0.2f;
    }

    public da i(net.minecraft.entity.c c2, float f2) {
        float f3;
        float f4;
        float f5 = this.bT(f2);
        float f6 = bt.bB(f5 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f6 = bt.I(f6, 0.0f, 1.0f);
        int n2 = bt.aF(c2.gW);
        int n3 = bt.aF(c2.gX + (double)c2.getEyeHeight());
        int n4 = bt.aF(c2.gY);
        net.minecraft.util.b b2 = new net.minecraft.util.b(n2, n3, n4);
        j j2 = this.aF(b2);
        float f7 = j2.bi(b2);
        int n5 = j2.cc(f7);
        float f8 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f9 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f10 = (float)(n5 & 0xFF) / 255.0f;
        f8 *= f6;
        f9 *= f6;
        f10 *= f6;
        float f11 = this.ca(f2);
        if (f11 > 0.0f) {
            f4 = (f8 * 0.3f + f9 * 0.59f + f10 * 0.11f) * 0.6f;
            f3 = 1.0f - f11 * 0.75f;
            f8 = f8 * f3 + f4 * (1.0f - f3);
            f9 = f9 * f3 + f4 * (1.0f - f3);
            f10 = f10 * f3 + f4 * (1.0f - f3);
        }
        if ((f4 = this.bY(f2)) > 0.0f) {
            f3 = (f8 * 0.3f + f9 * 0.59f + f10 * 0.11f) * 0.2f;
            float f12 = 1.0f - f4 * 0.75f;
            f8 = f8 * f12 + f3 * (1.0f - f12);
            f9 = f9 * f12 + f3 * (1.0f - f12);
            f10 = f10 * f12 + f3 * (1.0f - f12);
        }
        if (this.dDj > 0) {
            f3 = (float)this.dDj - f2;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            f8 = f8 * (1.0f - (f3 *= 0.45f)) + 0.8f * f3;
            f9 = f9 * (1.0f - f3) + 0.8f * f3;
            f10 = f10 * (1.0f - f3) + 1.0f * f3;
        }
        return new da(f8, f9, f10);
    }

    public float bT(float f2) {
        return this.dDl.a(this.dDp.getWorldTime(), f2);
    }

    public int avs() {
        return this.dDl.J(this.dDp.getWorldTime());
    }

    public float avt() {
        return ac.dDK[this.dDl.J(this.dDp.getWorldTime())];
    }

    public float bU(float f2) {
        float f3 = this.bT(f2);
        return f3 * (float)Math.PI * 2.0f;
    }

    public da bV(float f2) {
        float f3;
        float f4;
        float f5 = this.bT(f2);
        float f6 = bt.bB(f5 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        f6 = bt.I(f6, 0.0f, 1.0f);
        float f7 = (float)(this.dDb >> 16 & 0xFFL) / 255.0f;
        float f8 = (float)(this.dDb >> 8 & 0xFFL) / 255.0f;
        float f9 = (float)(this.dDb & 0xFFL) / 255.0f;
        float f10 = this.ca(f2);
        if (f10 > 0.0f) {
            f4 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.6f;
            f3 = 1.0f - f10 * 0.95f;
            f7 = f7 * f3 + f4 * (1.0f - f3);
            f8 = f8 * f3 + f4 * (1.0f - f3);
            f9 = f9 * f3 + f4 * (1.0f - f3);
        }
        f7 *= f6 * 0.9f + 0.1f;
        f8 *= f6 * 0.9f + 0.1f;
        f9 *= f6 * 0.85f + 0.15f;
        f4 = this.bY(f2);
        if (f4 > 0.0f) {
            f3 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.2f;
            float f11 = 1.0f - f4 * 0.95f;
            f7 = f7 * f11 + f3 * (1.0f - f11);
            f8 = f8 * f11 + f3 * (1.0f - f11);
            f9 = f9 * f11 + f3 * (1.0f - f11);
        }
        return new da(f7, f8, f9);
    }

    public da bW(float f2) {
        float f3 = this.bT(f2);
        return this.dDl.A(f3, f2);
    }

    public net.minecraft.util.b aS(net.minecraft.util.b b2) {
        return this.aK(b2).aS(b2);
    }

    public net.minecraft.util.b aT(net.minecraft.util.b b2) {
        net.minecraft.util.b b3;
        Material material;
        a a2 = this.aK(b2);
        net.minecraft.util.b b4 = new net.minecraft.util.b(b2.wt(), a2.axv() + 16, b2.wx());
        while (!(b4.wu() < 0 || (material = a2.bp(b3 = b4.aqY()).xb()).zy() && material != Material.bex)) {
            b4 = b3;
        }
        return b4;
    }

    public float bX(float f2) {
        float f3 = this.bT(f2);
        float f4 = 1.0f - (bt.bB(f3 * (float)Math.PI * 2.0f) * 2.0f + 0.25f);
        f4 = bt.I(f4, 0.0f, 1.0f);
        return f4 * f4 * 0.5f;
    }

    public void a(net.minecraft.util.b b2, Block block, int n2) {
    }

    public void a(net.minecraft.util.b b2, Block block, int n2, int n3) {
    }

    public void b(net.minecraft.util.b b2, Block block, int n2, int n3) {
    }

    public void avu() {
        this.dDt.eY("entities");
        FullBright fullBright = this.e(FullBright.class);
        if (fullBright == null || !fullBright.isEnabled()) {
            this.dDj = Math.max(0, this.dDj - 1);
        }
        this.dDt.eY("global");
        for (int i2 = 0; i2 < this.dCZ.size(); ++i2) {
            net.minecraft.entity.c object2 = this.dCZ.get(i2);
            try {
                ++object2.aRg;
                ++object2.ae;
                ++object2.aY;
                ++object2.css;
                ++object2.Zz;
                object2.Dm();
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Ticking entity");
                net.minecraft.crash.i i3 = a2.dY("Entity being ticked");
                if (object2 == null) {
                    i3.b("Entity", "~~NULL~~");
                } else {
                    object2.a(i3);
                }
                throw new cl(a2);
            }
            if (!object2.csb) continue;
            this.dCZ.remove(i2--);
        }
        this.dDt.fa("remove");
        this.dCS.removeAll(this.dCT);
        for (net.minecraft.entity.c c2 : this.dCT) {
            if (c2 == null) continue;
            int n2 = c2.csH;
            int n3 = c2.csJ;
            if (!c2.csG || !this.e(n2, n3, true)) continue;
            this.aL(n2, n3).H(c2);
        }
        for (net.minecraft.entity.c c3 : this.dCT) {
            this.J(c3);
        }
        this.dCT.clear();
        this.dDt.fa("regular");
        for (net.minecraft.entity.c c4 : this.dCS) {
            if (c4 == null || w.aER.bgK == null) continue;
            this.aC(c4);
        }
        this.dDt.fa("blockEntities");
        this.dDB = true;
        Iterator<Object> iterator = this.dCV.iterator();
        for (net.minecraft.entity.c c5 : this.dCS) {
            if (c5 == null || w.aER.bgK == null) continue;
            if (c5 instanceof net.minecraft.entity.item.i) {
                c5.crT = true;
                continue;
            }
            if (c5 == w.aER.bgK || c5.isInvisible()) {
                c5.crT = false;
                continue;
            }
            c5.crT = aei.t(c5);
            c5.csn = w.aER.bgK.T(c5);
            if (c5.crT) {
                c5.crU = 0;
                continue;
            }
            ++c5.crU;
        }
        while (iterator.hasNext()) {
            net.minecraft.util.b b2;
            net.minecraft.tileentity.d d2 = (net.minecraft.tileentity.d)iterator.next();
            if (!d2.apR() && d2.apO() && this.aJ(b2 = d2.Ab()) && this.dDC.bm(b2)) {
                try {
                    ((bi)((Object)d2)).jA();
                }
                catch (Throwable throwable) {
                    net.minecraft.crash.a a3 = net.minecraft.crash.a.a(throwable, "Ticking block entity");
                    net.minecraft.crash.i i4 = a3.dY("Block entity being ticked");
                    d2.b(i4);
                    throw new cl(a3);
                }
            }
            if (!d2.apR()) continue;
            iterator.remove();
            this.dCU.remove(d2);
            if (!this.aJ(d2.Ab())) continue;
            this.aK(d2.Ab()).aU(d2.Ab());
        }
        this.dDB = false;
        if (!this.dCX.isEmpty()) {
            this.dCV.removeAll(this.dCX);
            this.dCU.removeAll(this.dCX);
            this.dCX.clear();
        }
        this.dDt.fa("pendingBlockEntities");
        if (!this.dCW.isEmpty()) {
            for (net.minecraft.tileentity.d d3 : this.dCW) {
                if (d3.apR()) continue;
                if (!this.dCU.contains(d3)) {
                    this.f(d3);
                }
                if (this.aJ(d3.Ab())) {
                    this.aK(d3.Ab()).c(d3.Ab(), d3);
                }
                this.P(d3.Ab());
            }
            this.dCW.clear();
        }
        this.dDt.ajv();
        this.dDt.ajv();
    }

    public boolean f(net.minecraft.tileentity.d d2) {
        boolean bl2 = this.dCU.add(d2);
        if (bl2 && d2 instanceof bi) {
            this.dCV.add(d2);
        }
        return bl2;
    }

    public void g(Collection<net.minecraft.tileentity.d> collection) {
        if (this.dDB) {
            this.dCW.addAll(collection);
        } else {
            for (net.minecraft.tileentity.d d2 : collection) {
                this.dCU.add(d2);
                if (!(d2 instanceof bi)) continue;
                this.dCV.add(d2);
            }
        }
    }

    public void aA(net.minecraft.entity.c c2) {
        this.d(c2, true);
    }

    public void d(net.minecraft.entity.c c2, boolean bl2) {
        int n2 = bt.aF(c2.gW);
        int n3 = bt.aF(c2.gY);
        int n4 = 32;
        if (!bl2 || this.a(n2 - 32, 0, n3 - 32, n2 + 32, 0, n3 + 32, true)) {
            c2.csk = c2.csh;
            c2.csl = c2.csi;
            c2.csm = c2.csj;
            c2.csh = c2.gW;
            c2.csi = c2.gX;
            c2.csj = c2.gY;
            c2.crM = c2.pl;
            c2.crO = c2.pm;
            if (bl2 && c2.csG) {
                ++c2.ae;
                ++c2.aRg;
                ++c2.csr;
                ++c2.css;
                ++c2.Zz;
                ++c2.aY;
                ++c2.cst;
                if (c2.aiN.T(60L)) {
                    c2.fX = true;
                    c2.aiN.aX();
                }
                if (c2.ctb.T(60L)) {
                    c2.crQ = true;
                    c2.ctb.aX();
                }
                if (c2.crC != null) {
                    c2.TU();
                } else {
                    c2.Dm();
                }
            }
            this.dDt.eY("chunkCheck");
            if (Double.isNaN(c2.gW) || Double.isInfinite(c2.gW)) {
                c2.gW = c2.csh;
            }
            if (Double.isNaN(c2.gX) || Double.isInfinite(c2.gX)) {
                c2.gX = c2.csi;
            }
            if (Double.isNaN(c2.gY) || Double.isInfinite(c2.gY)) {
                c2.gY = c2.csj;
            }
            if (Double.isNaN(c2.pm) || Double.isInfinite(c2.pm)) {
                c2.pm = c2.crO;
            }
            if (Double.isNaN(c2.pl) || Double.isInfinite(c2.pl)) {
                c2.pl = c2.crM;
            }
            int n5 = bt.aF(c2.gW / 16.0);
            int n6 = bt.aF(c2.gX / 16.0);
            int n7 = bt.aF(c2.gY / 16.0);
            if (!c2.csG || c2.csH != n5 || c2.csI != n6 || c2.csJ != n7) {
                if (c2.csG && this.e(c2.csH, c2.csJ, true)) {
                    this.aL(c2.csH, c2.csJ).e(c2, c2.csI);
                }
                if (this.e(n5, n7, true)) {
                    c2.csG = true;
                    this.aL(n5, n7).aE(c2);
                } else {
                    c2.csG = false;
                }
            }
            this.dDt.ajv();
            if (bl2 && c2.csG && c2.crA != null) {
                if (!c2.crA.csb && c2.crA.crC == c2) {
                    this.aA(c2.crA);
                } else {
                    c2.crA.crC = null;
                    c2.crA = null;
                }
            }
        }
    }

    public boolean s(net.minecraft.util.a a2) {
        return this.a(a2, null);
    }

    public boolean a(net.minecraft.util.a a2, net.minecraft.entity.c c2) {
        List<net.minecraft.entity.c> list = this.b((net.minecraft.entity.c)null, a2);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            net.minecraft.entity.c c3 = list.get(i2);
            if (c3.csb || !c3.crz || c3 == c2 || c2 != null && (c2.crC == c3 || c2.crA == c3)) continue;
            return false;
        }
        return true;
    }

    public boolean t(net.minecraft.util.a a2) {
        int n2 = bt.aF(a2.dtH);
        int n3 = bt.aF(a2.dtK);
        int n4 = bt.aF(a2.dtI);
        int n5 = bt.aF(a2.dtL);
        int n6 = bt.aF(a2.dtJ);
        int n7 = bt.aF(a2.dtM);
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                for (int i4 = n6; i4 <= n7; ++i4) {
                    Block block = this.L(g2.E(i2, i3, i4)).df();
                    if (block.xb() == Material.beo) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean u(net.minecraft.util.a a2) {
        int n2 = bt.aF(a2.dtH);
        int n3 = bt.aF(a2.dtK);
        int n4 = bt.aF(a2.dtI);
        int n5 = bt.aF(a2.dtL);
        int n6 = bt.aF(a2.dtJ);
        int n7 = bt.aF(a2.dtM);
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                for (int i4 = n6; i4 <= n7; ++i4) {
                    Block block = this.L(g2.E(i2, i3, i4)).df();
                    if (!block.xb().zv()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean v(net.minecraft.util.a a2) {
        int n2;
        int n3 = bt.aF(a2.dtH);
        int n4 = bt.aF(a2.dtK + 1.0);
        int n5 = bt.aF(a2.dtI);
        int n6 = bt.aF(a2.dtL + 1.0);
        int n7 = bt.aF(a2.dtJ);
        if (this.a(n3, n5, n7, n4, n6, n2 = bt.aF(a2.dtM + 1.0), true)) {
            net.minecraft.util.g g2 = new net.minecraft.util.g();
            for (int i2 = n3; i2 < n4; ++i2) {
                for (int i3 = n5; i3 < n6; ++i3) {
                    for (int i4 = n7; i4 < n2; ++i4) {
                        Block block = this.L(g2.E(i2, i3, i4)).df();
                        if (block != Blocks.cMd && block != Blocks.cLm && block != Blocks.cLn) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static int a(boolean bl2, double d2) {
        return bl2 ? bt.aI(d2) : bt.aF(d2 + 1.0);
    }

    private static da d(da da2, double d2) {
        return new da(da2.dAG * d2, da2.dAH * d2, da2.dAI * d2);
    }

    public boolean a(net.minecraft.util.a a2, Material material, net.minecraft.entity.c c2, double d2) {
        int n2;
        boolean bl2 = ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_13);
        int n3 = bt.aF(a2.dtH);
        int n4 = w.a(bl2, a2.dtK);
        int n5 = bt.aF(a2.dtI);
        int n6 = w.a(bl2, a2.dtL);
        int n7 = bt.aF(a2.dtJ);
        if (!this.a(n3, n5, n7, n4, n6, n2 = w.a(bl2, a2.dtM), true)) {
            return false;
        }
        boolean bl3 = false;
        double d3 = 0.0;
        int n8 = 0;
        da da2 = new da(0.0, 0.0, 0.0);
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        for (int i2 = n3; i2 < n4; ++i2) {
            for (int i3 = n5; i3 < n6; ++i3) {
                for (int i4 = n7; i4 < n2; ++i4) {
                    g2.E(i2, i3, i4);
                    IBlockState iBlockState = this.L(g2);
                    Block block = iBlockState.df();
                    if (block.xb() != material) continue;
                    double d4 = (float)(i3 + 1) - BlockLiquid.bb(iBlockState.b(BlockLiquid.aWV));
                    if (!(bl2 ? d4 >= a2.dtI : (double)n6 >= d4)) continue;
                    bl3 = true;
                    d3 = Math.max(d4 - a2.dtI, d3);
                    da da3 = ((BlockLiquid)block).n(this, g2);
                    if (bl2 && d3 < 0.4) {
                        da3 = w.d(da3, d3);
                    }
                    da2 = da2.w(da3);
                    ++n8;
                }
            }
        }
        double d5 = bl2 ? Math.sqrt(da2.t(da2)) : da2.atS();
        if (d5 > 0.0 && c2.Um()) {
            if (bl2 && n8 > 0) {
                double d6 = 1.0 / (double)n8;
                da2 = w.d(da2, d6);
            }
            if (!bl2) {
                da2 = da2.atR();
            }
            da2 = w.d(da2, d2);
            if (bl2) {
                double d7 = 0.003;
                double d8 = d7 * 1.5;
                if (Math.abs(c2.ud) < d7 && Math.abs(c2.uf) < d7 && Math.sqrt(da2.t(da2)) < d8) {
                    da2 = w.d(da2.atR(), d8);
                }
            }
            c2.ud += da2.dAG;
            c2.ue += da2.dAH;
            c2.uf += da2.dAI;
        }
        if (material == Material.bev) {
            c2.ctc = d3;
        }
        if (material == Material.bew) {
            c2.ctd = d3;
        }
        return bl3;
    }

    public boolean b(net.minecraft.util.a a2, Material material) {
        int n2 = bt.aF(a2.dtH);
        int n3 = bt.aF(a2.dtK + 1.0);
        int n4 = bt.aF(a2.dtI);
        int n5 = bt.aF(a2.dtL + 1.0);
        int n6 = bt.aF(a2.dtJ);
        int n7 = bt.aF(a2.dtM + 1.0);
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    if (this.L(g2.E(i2, i3, i4)).df().xb() != material) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean c(net.minecraft.util.a a2, Material material) {
        int n2 = bt.aF(a2.dtH);
        int n3 = bt.aF(a2.dtK + 1.0);
        int n4 = bt.aF(a2.dtI);
        int n5 = bt.aF(a2.dtL + 1.0);
        int n6 = bt.aF(a2.dtJ);
        int n7 = bt.aF(a2.dtM + 1.0);
        net.minecraft.util.g g2 = new net.minecraft.util.g();
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    IBlockState iBlockState = this.L(g2.E(i2, i3, i4));
                    Block block = iBlockState.df();
                    if (block.xb() != material) continue;
                    int n8 = iBlockState.b(BlockLiquid.aWV);
                    double d2 = i3 + 1;
                    if (n8 < 8) {
                        d2 = (double)(i3 + 1) - (double)n8 / 8.0;
                    }
                    if (!(d2 >= a2.dtI)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public net.minecraft.world.h a(net.minecraft.entity.c c2, double d2, double d3, double d4, float f2, boolean bl2) {
        return this.a(c2, d2, d3, d4, f2, false, bl2);
    }

    public net.minecraft.world.h a(net.minecraft.entity.c c2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        net.minecraft.world.h h2 = new net.minecraft.world.h(this, c2, d2, d3, d4, f2, bl2, bl3);
        h2.avd();
        h2.cs(true);
        return h2;
    }

    public float b(da da2, net.minecraft.util.a a2) {
        double d2 = 1.0 / ((a2.dtK - a2.dtH) * 2.0 + 1.0);
        double d3 = 1.0 / ((a2.dtL - a2.dtI) * 2.0 + 1.0);
        double d4 = 1.0 / ((a2.dtM - a2.dtJ) * 2.0 + 1.0);
        double d5 = (1.0 - Math.floor(1.0 / d2) * d2) / 2.0;
        double d6 = (1.0 - Math.floor(1.0 / d4) * d4) / 2.0;
        if (d2 >= 0.0 && d3 >= 0.0 && d4 >= 0.0) {
            int n2 = 0;
            int n3 = 0;
            float f2 = 0.0f;
            while (f2 <= 1.0f) {
                float f3 = 0.0f;
                while (f3 <= 1.0f) {
                    float f4 = 0.0f;
                    while (f4 <= 1.0f) {
                        double d7 = a2.dtH + (a2.dtK - a2.dtH) * (double)f2;
                        double d8 = a2.dtI + (a2.dtL - a2.dtI) * (double)f3;
                        double d9 = a2.dtJ + (a2.dtM - a2.dtJ) * (double)f4;
                        if (this.d(new da(d7 + d5, d8, d9 + d6), da2) == null) {
                            ++n2;
                        }
                        ++n3;
                        f4 = (float)((double)f4 + d4);
                    }
                    f3 = (float)((double)f3 + d3);
                }
                f2 = (float)((double)f2 + d2);
            }
            return (float)n2 / (float)n3;
        }
        return 0.0f;
    }

    public boolean a(net.minecraft.entity.player.a a2, net.minecraft.util.b b2, ao ao2) {
        if (this.L(b2 = b2.x(ao2)).df() == Blocks.cMd) {
            this.b(a2, 1004, b2, 0);
            this.aL(b2);
            return true;
        }
        return false;
    }

    public String avv() {
        return "All: " + this.dCS.size();
    }

    public String avw() {
        return this.dDn.Hm();
    }

    @Override
    public net.minecraft.tileentity.d K(net.minecraft.util.b b2) {
        net.minecraft.tileentity.d d2;
        int n2;
        if (!this.aI(b2)) {
            return null;
        }
        net.minecraft.tileentity.d d3 = null;
        if (this.dDB) {
            for (n2 = 0; n2 < this.dCW.size(); ++n2) {
                d2 = this.dCW.get(n2);
                if (d2.apR() || !d2.Ab().equals(b2)) continue;
                d3 = d2;
                break;
            }
        }
        if (d3 == null) {
            d3 = this.aK(b2).a(b2, net.minecraft.world.chunk.e.dJf);
        }
        if (d3 == null) {
            for (n2 = 0; n2 < this.dCW.size(); ++n2) {
                d2 = this.dCW.get(n2);
                if (d2.apR() || !d2.Ab().equals(b2)) continue;
                d3 = d2;
                break;
            }
        }
        return d3;
    }

    public void a(net.minecraft.util.b b2, net.minecraft.tileentity.d d2) {
        if (d2 != null && !d2.apR()) {
            if (this.dDB) {
                d2.ap(b2);
                Iterator<net.minecraft.tileentity.d> iterator = this.dCW.iterator();
                while (iterator.hasNext()) {
                    try {
                        net.minecraft.tileentity.d d3 = iterator.next();
                        if (!d3.Ab().equals(b2)) continue;
                        d3.apS();
                        iterator.remove();
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
                this.dCW.add(d2);
            } else {
                this.f(d2);
                this.aK(b2).c(b2, d2);
            }
        }
    }

    public void aU(net.minecraft.util.b b2) {
        net.minecraft.tileentity.d d2 = this.K(b2);
        if (d2 != null && this.dDB) {
            d2.apS();
            this.dCW.remove(d2);
        } else {
            if (d2 != null) {
                this.dCW.remove(d2);
                this.dCU.remove(d2);
                this.dCV.remove(d2);
            }
            this.aK(b2).aU(b2);
        }
    }

    public void g(net.minecraft.tileentity.d d2) {
        this.dCX.add(d2);
    }

    public boolean aV(net.minecraft.util.b b2) {
        IBlockState iBlockState = this.L(b2);
        net.minecraft.util.a a2 = iBlockState.df().a(this, b2, iBlockState);
        return a2 != null && a2.aqV() >= 1.0;
    }

    public static boolean v(l l2, net.minecraft.util.b b2) {
        IBlockState iBlockState = l2.L(b2);
        Block block = iBlockState.df();
        return block.xb().isOpaque() && block.xf() || (block instanceof BlockStairs ? iBlockState.b(BlockStairs.bba) == BlockStairs$EnumHalf.bbh : (block instanceof BlockSlab ? iBlockState.b(BlockSlab.baO) == BlockSlab$EnumBlockHalf.baP : block instanceof BlockHopper || block instanceof BlockSnow && iBlockState.b(BlockSnow.baT) == 7));
    }

    public boolean e(net.minecraft.util.b b2, boolean bl2) {
        if (!this.aI(b2)) {
            return bl2;
        }
        a a2 = this.dDn.H(b2);
        if (a2.isEmpty()) {
            return bl2;
        }
        Block block = this.L(b2).df();
        return block.xb().isOpaque() && block.xf();
    }

    public void avx() {
        int n2 = this.bR(1.0f);
        if (n2 != this.dDc) {
            this.dDc = n2;
        }
    }

    public void j(boolean bl2, boolean bl3) {
        this.dDz = bl2;
        this.dDA = bl3;
    }

    public void tick() {
        this.HQ();
    }

    protected void avy() {
        if (this.dDp.avK()) {
            this.dDg = 1.0f;
            if (this.dDp.avJ()) {
                this.dDi = 1.0f;
            }
        }
    }

    protected void HQ() {
        if (!this.dDl.awf() && !this.dDw) {
            int n2;
            int n3 = this.dDp.azL();
            if (n3 > 0) {
                this.dDp.iS(--n3);
                this.dDp.iQ(this.dDp.avJ() ? 1 : 2);
                this.dDp.iR(this.dDp.avK() ? 1 : 2);
            }
            if ((n2 = this.dDp.azt()) <= 0) {
                if (this.dDp.avJ()) {
                    this.dDp.iQ(this.dDk.nextInt(12000) + 3600);
                } else {
                    this.dDp.iQ(this.dDk.nextInt(168000) + 12000);
                }
            } else {
                this.dDp.iQ(--n2);
                if (n2 <= 0) {
                    this.dDp.cF(!this.dDp.avJ());
                }
            }
            this.dDh = this.dDi;
            this.dDi = this.dDp.avJ() ? (float)((double)this.dDi + 0.01) : (float)((double)this.dDi - 0.01);
            this.dDi = bt.I(this.dDi, 0.0f, 1.0f);
            int n4 = this.dDp.azu();
            if (n4 <= 0) {
                if (this.dDp.avK()) {
                    this.dDp.iR(this.dDk.nextInt(12000) + 12000);
                } else {
                    this.dDp.iR(this.dDk.nextInt(168000) + 12000);
                }
            } else {
                this.dDp.iR(--n4);
                if (n4 <= 0) {
                    this.dDp.cG(!this.dDp.avK());
                }
            }
            this.dDf = this.dDg;
            this.dDg = this.dDp.avK() ? (float)((double)this.dDg + 0.01) : (float)((double)this.dDg - 0.01);
            this.dDg = bt.I(this.dDg, 0.0f, 1.0f);
        }
    }

    protected void avz() {
        int n2;
        int n3;
        int n4;
        net.minecraft.entity.player.a a2;
        int n5;
        this.dDx.clear();
        this.dDt.eY("buildList");
        for (n5 = 0; n5 < this.dCY.size(); ++n5) {
            a2 = this.dCY.get(n5);
            n4 = bt.aF(a2.gW / 16.0);
            n3 = bt.aF(a2.gY / 16.0);
            n2 = this.HR();
            for (int i2 = -n2; i2 <= n2; ++i2) {
                for (int i3 = -n2; i3 <= n2; ++i3) {
                    this.dDx.add(new b(i2 + n4, i3 + n3));
                }
            }
        }
        this.dDt.ajv();
        if (this.dDy > 0) {
            --this.dDy;
        }
        this.dDt.eY("playerCheckLight");
        if (!this.dCY.isEmpty()) {
            n5 = this.dDk.nextInt(this.dCY.size());
            a2 = this.dCY.get(n5);
            n4 = bt.aF(a2.gW) + this.dDk.nextInt(11) - 5;
            n3 = bt.aF(a2.gX) + this.dDk.nextInt(11) - 5;
            n2 = bt.aF(a2.gY) + this.dDk.nextInt(11) - 5;
            this.aZ(new net.minecraft.util.b(n4, n3, n2));
        }
        this.dDt.ajv();
    }

    protected abstract int HR();

    protected void a(int n2, int n3, a a2) {
        this.dDt.fa("moodSound");
        if (this.dDy == 0 && !this.dDw) {
            net.minecraft.entity.player.a a3;
            this.dDd = this.dDd * 3 + 1013904223;
            int n4 = this.dDd >> 2;
            int n5 = n4 & 0xF;
            int n6 = n4 >> 8 & 0xF;
            int n7 = n4 >> 16 & 0xFF;
            net.minecraft.util.b b2 = new net.minecraft.util.b(n5, n7, n6);
            Block block = a2.bp(b2);
            if (block.xb() == Material.beo && this.aO(b2) <= this.dDk.nextInt(8) && this.b(g.dBZ, b2) <= 0 && (a3 = this.o((double)(n5 += n2) + 0.5, (double)n7 + 0.5, (double)(n6 += n3) + 0.5, 8.0)) != null && a3.M((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5) > 4.0) {
                this.a((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5, "ambient.cave.cave", 0.7f, 0.8f + this.dDk.nextFloat() * 0.2f);
                this.dDy = this.dDk.nextInt(12000) + 6000;
            }
        }
        this.dDt.fa("checkLight");
        a2.axF();
    }

    protected void HO() {
        this.avz();
    }

    public void a(Block block, net.minecraft.util.b b2, Random random) {
        this.dCR = true;
        block.b(this, b2, this.L(b2), random);
        this.dCR = false;
    }

    public boolean aW(net.minecraft.util.b b2) {
        return this.f(b2, false);
    }

    public boolean aX(net.minecraft.util.b b2) {
        return this.f(b2, true);
    }

    public boolean f(net.minecraft.util.b b2, boolean bl2) {
        IBlockState iBlockState;
        Block block;
        j j2 = this.aF(b2);
        float f2 = j2.bi(b2);
        if (f2 > 0.15f) {
            return false;
        }
        if (b2.wu() >= 0 && b2.wu() < 256 && this.b(g.dCa, b2) < 10 && ((block = (iBlockState = this.L(b2)).df()) == Blocks.cLl || block == Blocks.cLk) && iBlockState.b(BlockLiquid.aWV) == 0) {
            if (!bl2) {
                return true;
            }
            boolean bl3 = this.aY(b2.arb()) && this.aY(b2.arc()) && this.aY(b2.aqZ()) && this.aY(b2.ara());
            return !bl3;
        }
        return false;
    }

    private boolean aY(net.minecraft.util.b b2) {
        return this.L(b2).df().xb() == Material.bev;
    }

    public boolean g(net.minecraft.util.b b2, boolean bl2) {
        j j2 = this.aF(b2);
        float f2 = j2.bi(b2);
        if (f2 > 0.15f) {
            return false;
        }
        if (!bl2) {
            return true;
        }
        if (b2.wu() >= 0 && b2.wu() < 256 && this.b(g.dCa, b2) < 10) {
            Block block = this.L(b2).df();
            return block.xb() == Material.beo && Blocks.cMJ.d(this, b2);
        }
        return false;
    }

    public boolean aZ(net.minecraft.util.b b2) {
        boolean bl2 = false;
        if (!this.dDl.awf()) {
            bl2 |= this.d(g.dBZ, b2);
        }
        return bl2 |= this.d(g.dCa, b2);
    }

    private int a(net.minecraft.util.b b2, g g2) {
        if (g2 == g.dBZ && this.aM(b2)) {
            return 15;
        }
        Block block = this.L(b2).df();
        int n2 = g2 == g.dBZ ? 0 : block.wZ();
        int n3 = block.wX();
        if (n3 >= 15 && block.wZ() > 0) {
            n3 = 1;
        }
        if (n3 < 1) {
            n3 = 1;
        }
        if (n3 >= 15) {
            return 0;
        }
        if (n2 >= 14) {
            return n2;
        }
        for (ao ao2 : ao.values()) {
            net.minecraft.util.b b3 = b2.x(ao2);
            int n4 = this.b(g2, b3) - n3;
            if (n4 > n2) {
                n2 = n4;
            }
            if (n2 < 14) continue;
            return n2;
        }
        return n2;
    }

    public boolean d(g g2, net.minecraft.util.b b2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        if (!this.a(b2, 17, false)) {
            return false;
        }
        int n10 = 0;
        int n11 = 0;
        this.dDt.eY("getBrightness");
        int n12 = this.b(g2, b2);
        int n13 = this.a(b2, g2);
        int n14 = b2.wt();
        int n15 = b2.wu();
        int n16 = b2.wx();
        if (n13 > n12) {
            this.dDD[n11++] = 133152;
        } else if (n13 < n12) {
            this.dDD[n11++] = 0x20820 | n12 << 18;
            while (n10 < n11) {
                n9 = this.dDD[n10++];
                n8 = (n9 & 0x3F) - 32 + n14;
                n7 = (n9 >> 6 & 0x3F) - 32 + n15;
                n6 = (n9 >> 12 & 0x3F) - 32 + n16;
                int n17 = n9 >> 18 & 0xF;
                net.minecraft.util.b b3 = new net.minecraft.util.b(n8, n7, n6);
                n5 = this.b(g2, b3);
                if (n5 != n17) continue;
                this.a(g2, b3, 0);
                if (n17 <= 0 || (n4 = bt.hN(n8 - n14)) + (n3 = bt.hN(n7 - n15)) + (n2 = bt.hN(n6 - n16)) >= 17) continue;
                net.minecraft.util.g g3 = new net.minecraft.util.g();
                for (ao ao2 : ao.values()) {
                    int n18 = n8 + ao2.asH();
                    int n19 = n7 + ao2.asI();
                    int n20 = n6 + ao2.asJ();
                    g3.E(n18, n19, n20);
                    int n21 = Math.max(1, this.L(g3).df().wX());
                    n5 = this.b(g2, (net.minecraft.util.b)g3);
                    if (n5 != n17 - n21 || n11 >= this.dDD.length) continue;
                    this.dDD[n11++] = n18 - n14 + 32 | n19 - n15 + 32 << 6 | n20 - n16 + 32 << 12 | n17 - n21 << 18;
                }
            }
            n10 = 0;
        }
        this.dDt.ajv();
        this.dDt.eY("checkedPosition < toCheckCount");
        while (n10 < n11) {
            boolean bl2;
            n9 = this.dDD[n10++];
            n8 = (n9 & 0x3F) - 32 + n14;
            n7 = (n9 >> 6 & 0x3F) - 32 + n15;
            n6 = (n9 >> 12 & 0x3F) - 32 + n16;
            net.minecraft.util.b b4 = new net.minecraft.util.b(n8, n7, n6);
            int n22 = this.b(g2, b4);
            n5 = this.a(b4, g2);
            if (n5 == n22) continue;
            this.a(g2, b4, n5);
            if (n5 <= n22) continue;
            n4 = Math.abs(n8 - n14);
            n3 = Math.abs(n7 - n15);
            n2 = Math.abs(n6 - n16);
            boolean bl3 = bl2 = n11 < this.dDD.length - 6;
            if (n4 + n3 + n2 >= 17 || !bl2) continue;
            if (this.b(g2, b4.arb()) < n5) {
                this.dDD[n11++] = n8 - 1 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(g2, b4.arc()) < n5) {
                this.dDD[n11++] = n8 + 1 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(g2, b4.aqY()) < n5) {
                this.dDD[n11++] = n8 - n14 + 32 + (n7 - 1 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(g2, b4.aqX()) < n5) {
                this.dDD[n11++] = n8 - n14 + 32 + (n7 + 1 - n15 + 32 << 6) + (n6 - n16 + 32 << 12);
            }
            if (this.b(g2, b4.aqZ()) < n5) {
                this.dDD[n11++] = n8 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 - 1 - n16 + 32 << 12);
            }
            if (this.b(g2, b4.ara()) >= n5) continue;
            this.dDD[n11++] = n8 - n14 + 32 + (n7 - n15 + 32 << 6) + (n6 + 1 - n16 + 32 << 12);
        }
        this.dDt.ajv();
        return true;
    }

    public boolean ct(boolean bl2) {
        return false;
    }

    public List<s> a(a a2, boolean bl2) {
        return null;
    }

    public List<s> b(net.minecraft.world.gen.structure.w w2, boolean bl2) {
        return null;
    }

    public List<net.minecraft.entity.c> b(net.minecraft.entity.c c2, net.minecraft.util.a a2) {
        return this.a(c2, a2, net.minecraft.util.ah.dvJ);
    }

    public List<net.minecraft.entity.c> a(net.minecraft.entity.c c2, net.minecraft.util.a a2, Predicate<? super net.minecraft.entity.c> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = bt.aF((a2.dtH - 2.0) / 16.0);
        int n3 = bt.aF((a2.dtK + 2.0) / 16.0);
        int n4 = bt.aF((a2.dtJ - 2.0) / 16.0);
        int n5 = bt.aF((a2.dtM + 2.0) / 16.0);
        try {
            for (int i2 = n2; i2 <= n3; ++i2) {
                for (int i3 = n4; i3 <= n5; ++i3) {
                    if (!this.e(i2, i3, true)) continue;
                    this.aL(i2, i3).a(c2, a2, arrayList, predicate);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return arrayList;
        }
        return arrayList;
    }

    public <T extends net.minecraft.entity.c> List<T> a(Class<? extends T> clazz, Predicate<? super T> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        for (net.minecraft.entity.c c2 : this.dCS) {
            if (!clazz.isAssignableFrom(c2.getClass()) || !predicate.apply((Object)c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    public <T extends net.minecraft.entity.c> List<T> b(Class<? extends T> clazz, Predicate<? super T> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        for (net.minecraft.entity.c c2 : this.dCY) {
            if (!clazz.isAssignableFrom(c2.getClass()) || !predicate.apply((Object)c2)) continue;
            arrayList.add(c2);
        }
        return arrayList;
    }

    public <T extends net.minecraft.entity.c> List<T> a(Class<? extends T> clazz, net.minecraft.util.a a2) {
        return this.a(clazz, a2, (T)net.minecraft.util.ah.dvJ);
    }

    public <T extends net.minecraft.entity.c> List<T> a(Class<? extends T> clazz, net.minecraft.util.a a2, Predicate<? super T> predicate) {
        int n2 = bt.aF((a2.dtH - 2.0) / 16.0);
        int n3 = bt.aF((a2.dtK + 2.0) / 16.0);
        int n4 = bt.aF((a2.dtJ - 2.0) / 16.0);
        int n5 = bt.aF((a2.dtM + 2.0) / 16.0);
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                if (!this.e(i2, i3, true)) continue;
                this.aL(i2, i3).a(clazz, a2, arrayList, predicate);
            }
        }
        return arrayList;
    }

    public <T extends net.minecraft.entity.c> T a(Class<? extends T> clazz, net.minecraft.util.a a2, T t2) {
        List<T> list = this.a(clazz, a2);
        net.minecraft.entity.c c2 = null;
        double d2 = Double.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            net.minecraft.entity.c c3 = (net.minecraft.entity.c)list.get(i2);
            if (c3 == t2 || !net.minecraft.util.ah.dvJ.apply((Object)c3) || !((d3 = t2.T(c3)) <= d2)) continue;
            c2 = c3;
            d2 = d3;
        }
        return (T)c2;
    }

    public net.minecraft.entity.c cn(int n2) {
        return this.dDa.hE(n2);
    }

    public ConcurrentLinkedQueue<net.minecraft.entity.c> avA() {
        return this.dCS;
    }

    public void b(net.minecraft.util.b b2, net.minecraft.tileentity.d d2) {
        if (this.aJ(b2)) {
            this.aK(b2).axA();
        }
    }

    public int r(Class<?> clazz) {
        int n2 = 0;
        for (net.minecraft.entity.c c2 : this.dCS) {
            if (c2 instanceof p && ((p)c2).Vo() || !clazz.isAssignableFrom(c2.getClass())) continue;
            ++n2;
        }
        return n2;
    }

    public void h(Collection<net.minecraft.entity.c> collection) {
        this.dCS.addAll(collection);
        for (net.minecraft.entity.c c2 : collection) {
            this.I(c2);
        }
    }

    public void i(Collection<net.minecraft.entity.c> collection) {
        this.dCT.addAll(collection);
    }

    public boolean a(Block block, net.minecraft.util.b b2, boolean bl2, ao ao2, net.minecraft.entity.c c2, co co2) {
        Block block2 = this.L(b2).df();
        net.minecraft.util.a a2 = bl2 ? null : block.a(this, b2, block.xM());
        return (a2 == null || Minecraft.getMinecraft().bgK.csp || this.a(a2, c2)) && (block2.xb() == Material.beE && block == Blocks.cOh || block2.xb().zE() && block.a(this, b2, ao2, co2));
    }

    public int avB() {
        return this.dCQ;
    }

    public void id(int n2) {
        this.dCQ = n2;
    }

    @Override
    public int i(net.minecraft.util.b b2, ao ao2) {
        IBlockState iBlockState = this.L(b2);
        return iBlockState.df().b((l)this, b2, iBlockState, ao2);
    }

    @Override
    public ap agn() {
        return this.dDp.awC();
    }

    public int ba(net.minecraft.util.b b2) {
        int n2 = 0;
        if ((n2 = Math.max(n2, this.i(b2.aqY(), ao.dwq))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.i(b2.aqX(), ao.dwr))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.i(b2.aqZ(), ao.dws))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.i(b2.ara(), ao.dwt))) >= 15) {
            return n2;
        }
        if ((n2 = Math.max(n2, this.i(b2.arb(), ao.dwu))) >= 15) {
            return n2;
        }
        n2 = Math.max(n2, this.i(b2.arc(), ao.dwv));
        return n2;
    }

    public boolean j(net.minecraft.util.b b2, ao ao2) {
        return this.k(b2, ao2) > 0;
    }

    public int k(net.minecraft.util.b b2, ao ao2) {
        IBlockState iBlockState = this.L(b2);
        Block block = iBlockState.df();
        return block.xd() ? this.ba(b2) : block.a((l)this, b2, iBlockState, ao2);
    }

    public boolean bb(net.minecraft.util.b b2) {
        return this.k(b2.aqY(), ao.dwq) > 0 || this.k(b2.aqX(), ao.dwr) > 0 || this.k(b2.aqZ(), ao.dws) > 0 || this.k(b2.ara(), ao.dwt) > 0 || this.k(b2.arb(), ao.dwu) > 0 || this.k(b2.arc(), ao.dwv) > 0;
    }

    public int bc(net.minecraft.util.b b2) {
        int n2 = 0;
        for (ao ao2 : ao.values()) {
            int n3 = this.k(b2.x(ao2), ao2);
            if (n3 >= 15) {
                return 15;
            }
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    public net.minecraft.entity.player.a f(net.minecraft.entity.c c2, double d2) {
        return this.o(c2.gW, c2.gX, c2.gY, d2);
    }

    public net.minecraft.entity.player.a o(double d2, double d3, double d4, double d5) {
        double d6 = -1.0;
        net.minecraft.entity.player.a a2 = null;
        for (int i2 = 0; i2 < this.dCY.size(); ++i2) {
            net.minecraft.entity.player.a a3 = this.dCY.get(i2);
            if (!net.minecraft.util.ah.dvJ.apply((Object)a3)) continue;
            double d7 = a3.M(d2, d3, d4);
            if (!(d5 < 0.0) && !(d7 < d5 * d5) || d6 != -1.0 && !(d7 < d6)) continue;
            d6 = d7;
            a2 = a3;
        }
        return a2;
    }

    public boolean p(double d2, double d3, double d4, double d5) {
        for (int i2 = 0; i2 < this.dCY.size(); ++i2) {
            net.minecraft.entity.player.a a2 = this.dCY.get(i2);
            if (!net.minecraft.util.ah.dvJ.apply((Object)a2)) continue;
            double d6 = a2.M(d2, d3, d4);
            if (!(d5 < 0.0) && !(d6 < d5 * d5)) continue;
            return true;
        }
        return false;
    }

    public net.minecraft.entity.player.a gz(String string) {
        for (int i2 = 0; i2 < this.dCY.size(); ++i2) {
            net.minecraft.entity.player.a a2 = this.dCY.get(i2);
            if (!string.equals(a2.xU())) continue;
            return a2;
        }
        return null;
    }

    public net.minecraft.entity.player.a n(UUID uUID) {
        for (int i2 = 0; i2 < this.dCY.size(); ++i2) {
            net.minecraft.entity.player.a a2 = this.dCY.get(i2);
            if (!uUID.equals(a2.Ul())) continue;
            return a2;
        }
        return null;
    }

    public void HP() {
    }

    public void avC() {
        this.dDo.avC();
    }

    public void I(long l2) {
        this.dDp.P(l2);
    }

    public long avD() {
        return this.dDp.avD();
    }

    public long getTotalWorldTime() {
        return this.dDp.azq();
    }

    public long getWorldTime() {
        return this.dDp.getWorldTime();
    }

    public void o(long l2) {
        this.dDp.o(l2);
    }

    public net.minecraft.util.b avE() {
        net.minecraft.util.b b2 = new net.minecraft.util.b(this.dDp.azn(), this.dDp.azo(), this.dDp.azp());
        if (!this.Sv().bm(b2)) {
            b2 = this.aQ(new net.minecraft.util.b(this.Sv().getCenterX(), 0.0, this.Sv().getCenterZ()));
        }
        return b2;
    }

    public void bd(net.minecraft.util.b b2) {
        this.dDp.bx(b2);
    }

    public void aB(net.minecraft.entity.c c2) {
        int n2 = bt.aF(c2.gW / 16.0);
        int n3 = bt.aF(c2.gY / 16.0);
        int n4 = 2;
        for (int i2 = n2 - 2; i2 <= n2 + 2; ++i2) {
            for (int i3 = n3 - 2; i3 <= n3 + 2; ++i3) {
                this.aL(i2, i3);
            }
        }
        if (!this.dCS.contains(c2)) {
            this.dCS.add(c2);
        }
    }

    public boolean a(net.minecraft.entity.player.a a2, net.minecraft.util.b b2) {
        return true;
    }

    public void a(net.minecraft.entity.c c2, byte by2) {
    }

    public net.minecraft.world.chunk.h avF() {
        return this.dDn;
    }

    public void c(net.minecraft.util.b b2, Block block, int n2, int n3) {
        block.a(this, b2, this.L(b2), n2, n3);
    }

    public d avG() {
        return this.dDo;
    }

    public o avH() {
        return this.dDp;
    }

    public i Si() {
        return this.dDp.azw();
    }

    public void avI() {
    }

    public float bY(float f2) {
        return (this.dDh + (this.dDi - this.dDh) * f2) * this.ca(f2);
    }

    public void bZ(float f2) {
        this.dDh = f2;
        this.dDi = f2;
    }

    public float ca(float f2) {
        return this.dDf + (this.dDg - this.dDf) * f2;
    }

    public void cb(float f2) {
        this.dDf = f2;
        this.dDg = f2;
    }

    public boolean avJ() {
        return (double)this.bY(1.0f) > 0.9;
    }

    public boolean avK() {
        return (double)this.ca(1.0f) > 0.2;
    }

    public boolean be(net.minecraft.util.b b2) {
        if (!this.avK()) {
            return false;
        }
        if (!this.aM(b2)) {
            return false;
        }
        if (this.aS(b2).wu() > b2.wu()) {
            return false;
        }
        j j2 = this.aF(b2);
        return !j2.awW() && !this.g(b2, false) && j2.awX();
    }

    public boolean bf(net.minecraft.util.b b2) {
        j j2 = this.aF(b2);
        return j2.awY();
    }

    public h avL() {
        return this.dDr;
    }

    public void a(String string, ah ah2) {
        this.dDr.b(string, ah2);
    }

    public ah b(Class<? extends ah> clazz, String string) {
        return this.dDr.e(clazz, string);
    }

    public int gA(String string) {
        return this.dDr.gA(string);
    }

    public void d(int n2, net.minecraft.util.b b2, int n3) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            this.dDm.get(i2).a(n2, b2, n3);
        }
    }

    public void e(int n2, net.minecraft.util.b b2, int n3) {
        this.b(null, n2, b2, n3);
    }

    public void b(net.minecraft.entity.player.a a2, int n2, net.minecraft.util.b b2, int n3) {
        try {
            for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
                this.dDm.get(i2).a(a2, n2, b2, n3);
            }
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a3 = net.minecraft.crash.a.a(throwable, "Playing level event");
            net.minecraft.crash.i i3 = a3.dY("Level event being played");
            i3.b("Block coordinates", net.minecraft.crash.i.Z(b2));
            i3.b("Event source", a2);
            i3.b("Event type", n2);
            i3.b("Event data", n3);
            throw new cl(a3);
        }
    }

    public int getHeight() {
        return 256;
    }

    public int avM() {
        return this.dDl.awf() ? 128 : 256;
    }

    public Random K(int n2, int n3, int n4) {
        long l2 = (long)n2 * 341873128712L + (long)n3 * 132897987541L + this.avH().avD() + (long)n4;
        this.dDk.setSeed(l2);
        return this.dDk;
    }

    public net.minecraft.util.b b(String string, net.minecraft.util.b b2) {
        return this.avF().a(this, string, b2);
    }

    @Override
    public boolean auN() {
        return false;
    }

    public double avN() {
        return 0.0;
    }

    public net.minecraft.crash.i d(net.minecraft.crash.a a2) {
        net.minecraft.crash.i i2 = a2.y("Affected level", 1);
        i2.b("Level name", this.dDp == null ? "????" : this.dDp.aln());
        i2.a("All players", new z(this));
        i2.a("Chunk stats", new aa(this));
        try {
            this.dDp.c(i2);
        }
        catch (Throwable throwable) {
            i2.a("Level Data Unobtainable", throwable);
        }
        return i2;
    }

    public void b(int n2, net.minecraft.util.b b2, int n3) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            net.minecraft.world.o o2 = this.dDm.get(i2);
            o2.b(n2, b2, n3);
        }
    }

    public void c(int n2, net.minecraft.util.b b2, int n3) {
        for (int i2 = 0; i2 < this.dDm.size(); ++i2) {
            net.minecraft.world.o o2 = this.dDm.get(i2);
            o2.c(n2, b2, n3);
        }
    }

    public Calendar avO() {
        if (this.getTotalWorldTime() % 600L == 0L) {
            this.dDu.setTimeInMillis(MinecraftServer.alN());
        }
        return this.dDu;
    }

    public void a(double d2, double d3, double d4, double d5, double d6, double d7, n n2) {
    }

    public net.minecraft.scoreboard.i SD() {
        return this.dDv;
    }

    public void f(net.minecraft.util.b b2, Block block) {
        for (ao ao2 : ar.dwT) {
            net.minecraft.util.b b3 = b2.x(ao2);
            if (!this.aJ(b3)) continue;
            IBlockState iBlockState = this.L(b3);
            if (Blocks.cOl.s(iBlockState.df())) {
                iBlockState.df().a(this, b3, iBlockState, block);
                continue;
            }
            if (!iBlockState.df().xd() || !Blocks.cOl.s((iBlockState = this.L(b3 = b3.x(ao2))).df())) continue;
            iBlockState.df().a(this, b3, iBlockState, block);
        }
    }

    public e bg(net.minecraft.util.b b2) {
        long l2 = 0L;
        float f2 = 0.0f;
        if (this.aJ(b2)) {
            f2 = this.avt();
            l2 = this.aK(b2).axO();
        }
        return new e(this.agm(), this.getWorldTime(), l2, f2);
    }

    public f agm() {
        return this.avH().agm();
    }

    public int avP() {
        return this.dDc;
    }

    public void ie(int n2) {
        this.dDc = n2;
    }

    public int avQ() {
        return this.dDj;
    }

    public void j_if(int n2) {
        this.dDj = n2;
    }

    public boolean avR() {
        return this.dDq;
    }

    public net.minecraft.village.e avS() {
        return this.dDs;
    }

    public c Sv() {
        return this.dDC;
    }

    public boolean aN(int n2, int n3) {
        net.minecraft.util.b b2 = this.avE();
        int n4 = n2 * 16 + 8 - b2.wt();
        int n5 = n3 * 16 + 8 - b2.wx();
        int n6 = 128;
        return n4 >= -128 && n4 <= 128 && n5 >= -128 && n5 <= 128;
    }

    public void aC(net.minecraft.entity.c c2) {
        if (c2.crC != null) {
            if (!c2.crC.csb && c2.crC.crA == c2) {
                return;
            }
            c2.crC.crA = null;
            c2.crC = null;
        }
        this.dDt.eY("tick");
        if (!c2.csb) {
            try {
                this.aA(c2);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                afl.c("Exception when updating entity", new Object[0]);
            }
        }
        this.dDt.ajv();
        this.dDt.eY("remove");
        if (c2.csb) {
            int n2 = c2.csH;
            int n3 = c2.csJ;
            if (c2.csG && this.e(n2, n3, true)) {
                this.aL(n2, n3).H(c2);
            }
            this.dCS.remove(c2);
            this.J(c2);
        }
    }
}

