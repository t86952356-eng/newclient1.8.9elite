/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 */
package net.minecraft.world.chunk;

import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import hackclient.rise.ahd;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ao;
import net.minecraft.util.aq;
import net.minecraft.util.ar;
import net.minecraft.util.bt;
import net.minecraft.util.cl;
import net.minecraft.util.y;
import net.minecraft.world.ap;
import net.minecraft.world.b;
import net.minecraft.world.biome.aj;
import net.minecraft.world.biome.j;
import net.minecraft.world.chunk.c;
import net.minecraft.world.chunk.d;
import net.minecraft.world.chunk.e;
import net.minecraft.world.chunk.f;
import net.minecraft.world.chunk.h;
import net.minecraft.world.chunk.i;
import net.minecraft.world.g;
import net.minecraft.world.w;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class a
implements ahd {
    private static final Logger dIC = LogManager.getLogger();
    private final net.minecraft.world.chunk.storage.g[] dID = new net.minecraft.world.chunk.storage.g[16];
    private final byte[] dIE = new byte[256];
    private final int[] dIF = new int[256];
    private final boolean[] dIG = new boolean[256];
    private boolean loaded;
    private final w dII;
    private final int[] dIJ;
    public final int dIK;
    public final int dIL;
    private boolean dIM;
    private final Map<net.minecraft.util.b, net.minecraft.tileentity.d> dIN = Maps.newHashMap();
    private final y<net.minecraft.entity.c>[] dIO;
    private boolean dIP;
    private boolean dIQ;
    private boolean dIR;
    private boolean dIS;
    private boolean dIT;
    private long dIU;
    private int dIV;
    private long dIW;
    private int dIX = 4096;
    private final ConcurrentLinkedQueue<net.minecraft.util.b> dIY = Queues.newConcurrentLinkedQueue();

    public a(w w2, int n2, int n3) {
        this.dIO = new y[16];
        this.dII = w2;
        this.dIK = n2;
        this.dIL = n3;
        this.dIJ = new int[256];
        for (int i2 = 0; i2 < this.dIO.length; ++i2) {
            this.dIO[i2] = new y<net.minecraft.entity.c>(net.minecraft.entity.c.class);
        }
        Arrays.fill(this.dIF, -999);
        Arrays.fill(this.dIE, (byte)-1);
    }

    public a(w w2, f f2, int n2, int n3) {
        this(w2, n2, n3);
        int n4 = 256;
        boolean bl2 = !w2.dDl.awf();
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 256; ++i4) {
                    int n5 = i2 * 256 * 16 | i3 * 256 | i4;
                    IBlockState iBlockState = f2.is(n5);
                    if (iBlockState.df().xb() == Material.beo) continue;
                    int n6 = i4 >> 4;
                    if (this.dID[n6] == null) {
                        this.dID[n6] = new net.minecraft.world.chunk.storage.g(n6 << 4, bl2);
                    }
                    this.dID[n6].b(i2, i4 & 0xF, i3, iBlockState);
                }
            }
        }
    }

    public boolean aT(int n2, int n3) {
        return n2 == this.dIK && n3 == this.dIL;
    }

    public int bn(net.minecraft.util.b b2) {
        return this.aU(b2.wt() & 0xF, b2.wx() & 0xF);
    }

    public int aU(int n2, int n3) {
        return this.dIJ[n3 << 4 | n2];
    }

    public int axv() {
        for (int i2 = this.dID.length - 1; i2 >= 0; --i2) {
            if (this.dID[i2] == null) continue;
            return this.dID[i2].axX();
        }
        return 0;
    }

    public net.minecraft.world.chunk.storage.g[] axw() {
        return this.dID;
    }

    protected void axx() {
        int n2 = this.axv();
        this.dIV = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 16; ++i2) {
            block1: for (int i3 = 0; i3 < 16; ++i3) {
                this.dIF[i2 + (i3 << 4)] = -999;
                for (int i4 = n2 + 16; i4 > 0; --i4) {
                    Block block = this.P(i2, i4 - 1, i3);
                    if (block.wX() == 0) continue;
                    this.dIJ[i3 << 4 | i2] = i4;
                    if (i4 >= this.dIV) continue block1;
                    this.dIV = i4;
                    continue block1;
                }
            }
        }
        this.dIS = true;
    }

    public void axy() {
        int n2 = this.axv();
        this.dIV = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n3;
                this.dIF[i2 + (i3 << 4)] = -999;
                for (n3 = n2 + 16; n3 > 0; --n3) {
                    if (this.O(i2, n3 - 1, i3) == 0) continue;
                    this.dIJ[i3 << 4 | i2] = n3;
                    if (n3 >= this.dIV) break;
                    this.dIV = n3;
                    break;
                }
                if (this.dII.dDl.awf()) continue;
                n3 = 15;
                int n4 = n2 + 16 - 1;
                do {
                    net.minecraft.world.chunk.storage.g g2;
                    int n5;
                    if ((n5 = this.O(i2, n4, i3)) == 0 && n3 != 15) {
                        n5 = 1;
                    }
                    if ((n3 -= n5) <= 0 || (g2 = this.dID[n4 >> 4]) == null) continue;
                    g2.z(i2, n4 & 0xF, i3, n3);
                    this.dII.Q(new net.minecraft.util.b((this.dIK << 4) + i2, n4, (this.dIL << 4) + i3));
                } while (--n4 > 0 && n3 > 0);
            }
        }
        this.dIS = true;
    }

    private void aV(int n2, int n3) {
        this.dIG[n2 + n3 * 16] = true;
        this.dIM = true;
    }

    private void cw(boolean bl2) {
        this.dII.dDt.eY("recheckGaps");
        if (this.dII.f(new net.minecraft.util.b(this.dIK * 16 + 8, 0, this.dIL * 16 + 8), 16)) {
            for (int i2 = 0; i2 < 16; ++i2) {
                for (int i3 = 0; i3 < 16; ++i3) {
                    if (!this.dIG[i2 + i3 * 16]) continue;
                    this.dIG[i2 + i3 * 16] = false;
                    int n2 = this.aU(i2, i3);
                    int n3 = this.dIK * 16 + i2;
                    int n4 = this.dIL * 16 + i3;
                    int n5 = Integer.MAX_VALUE;
                    for (ao ao2 : ar.dwT) {
                        n5 = Math.min(n5, this.dII.aM(n3 + ao2.asH(), n4 + ao2.asJ()));
                    }
                    this.M(n3, n4, n5);
                    for (ao ao2 : ar.dwT) {
                        this.M(n3 + ao2.asH(), n4 + ao2.asJ(), n2);
                    }
                    if (!bl2) continue;
                    this.dII.dDt.ajv();
                    return;
                }
            }
            this.dIM = false;
        }
        this.dII.dDt.ajv();
    }

    private void M(int n2, int n3, int n4) {
        int n5 = this.dII.aQ(new net.minecraft.util.b(n2, 0, n3)).wu();
        if (n5 > n4) {
            this.y(n2, n3, n4, n5 + 1);
        } else if (n5 < n4) {
            this.y(n2, n3, n5, n4 + 1);
        }
    }

    private void y(int n2, int n3, int n4, int n5) {
        if (n5 > n4 && this.dII.f(new net.minecraft.util.b(n2, 0, n3), 16)) {
            for (int i2 = n4; i2 < n5; ++i2) {
                this.dII.d(g.dBZ, new net.minecraft.util.b(n2, i2, n3));
            }
            this.dIS = true;
        }
    }

    private void N(int n2, int n3, int n4) {
        int n5;
        int n6 = n5 = this.dIJ[n4 << 4 | n2] & 0xFF;
        if (n3 > n5) {
            n6 = n3;
        }
        while (n6 > 0 && this.O(n2, n6 - 1, n4) == 0) {
            --n6;
        }
        if (n6 != n5) {
            int n7;
            this.dII.x(n2 + this.dIK * 16, n4 + this.dIL * 16, n6, n5);
            this.dIJ[n4 << 4 | n2] = n6;
            int n8 = this.dIK * 16 + n2;
            int n9 = this.dIL * 16 + n4;
            if (!this.dII.dDl.awf()) {
                if (n6 < n5) {
                    for (n7 = n6; n7 < n5; ++n7) {
                        var9_9 = this.dID[n7 >> 4];
                        if (var9_9 == null) continue;
                        var9_9.z(n2, n7 & 0xF, n4, 15);
                        this.dII.Q(new net.minecraft.util.b((this.dIK << 4) + n2, n7, (this.dIL << 4) + n4));
                    }
                } else {
                    for (n7 = n5; n7 < n6; ++n7) {
                        var9_9 = this.dID[n7 >> 4];
                        if (var9_9 == null) continue;
                        var9_9.z(n2, n7 & 0xF, n4, 0);
                        this.dII.Q(new net.minecraft.util.b((this.dIK << 4) + n2, n7, (this.dIL << 4) + n4));
                    }
                }
                n7 = 15;
                while (n6 > 0 && n7 > 0) {
                    net.minecraft.world.chunk.storage.g g2;
                    int n10;
                    if ((n10 = this.O(n2, --n6, n4)) == 0) {
                        n10 = 1;
                    }
                    if ((n7 -= n10) < 0) {
                        n7 = 0;
                    }
                    if ((g2 = this.dID[n6 >> 4]) == null) continue;
                    g2.z(n2, n6 & 0xF, n4, n7);
                }
            }
            n7 = this.dIJ[n4 << 4 | n2];
            int n11 = n5;
            int n12 = n7;
            if (n7 < n5) {
                n11 = n7;
                n12 = n5;
            }
            if (n7 < this.dIV) {
                this.dIV = n7;
            }
            if (!this.dII.dDl.awf()) {
                for (ao ao2 : ar.dwT) {
                    this.y(n8 + ao2.asH(), n9 + ao2.asJ(), n11, n12);
                }
                this.y(n8, n9, n11, n12);
            }
            this.dIS = true;
        }
    }

    public int bo(net.minecraft.util.b b2) {
        return this.bp(b2).wX();
    }

    private int O(int n2, int n3, int n4) {
        return this.P(n2, n3, n4).wX();
    }

    private Block P(int n2, int n3, int n4) {
        net.minecraft.world.chunk.storage.g g2;
        Block block = Blocks.cLc;
        if (n3 >= 0 && n3 >> 4 < this.dID.length && (g2 = this.dID[n3 >> 4]) != null) {
            try {
                block = g2.W(n2, n3 & 0xF, n4);
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Getting block");
                throw new cl(a2);
            }
        }
        return block;
    }

    public Block Q(int n2, int n3, int n4) {
        try {
            return this.P(n2 & 0xF, n3, n4 & 0xF);
        }
        catch (cl cl2) {
            net.minecraft.crash.i i2 = cl2.atz().dY("Block being got");
            i2.a("Location", new net.minecraft.world.chunk.b(this, n2, n3, n4));
            throw cl2;
        }
    }

    public Block bp(net.minecraft.util.b b2) {
        try {
            return this.P(b2.wt() & 0xF, b2.wu(), b2.wx() & 0xF);
        }
        catch (cl cl2) {
            net.minecraft.crash.i i2 = cl2.atz().dY("Block being got");
            i2.a("Location", new c(this, b2));
            throw cl2;
        }
    }

    public IBlockState L(net.minecraft.util.b b2) {
        if (this.dII.agn() == ap.dEI) {
            IBlockState iBlockState = null;
            if (b2.wu() == 60) {
                iBlockState = Blocks.cOx.xM();
            }
            if (b2.wu() == 70) {
                iBlockState = net.minecraft.world.gen.a.be(b2.wt(), b2.wx());
            }
            return iBlockState == null ? Blocks.cLc.xM() : iBlockState;
        }
        try {
            net.minecraft.world.chunk.storage.g g2;
            if (b2.wu() >= 0 && b2.wu() >> 4 < this.dID.length && (g2 = this.dID[b2.wu() >> 4]) != null) {
                int n2 = b2.wt() & 0xF;
                int n3 = b2.wu() & 0xF;
                int n4 = b2.wx() & 0xF;
                return g2.V(n2, n3, n4);
            }
            return Blocks.cLc.xM();
        }
        catch (Throwable throwable) {
            net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Getting block state");
            net.minecraft.crash.i i2 = a2.dY("Block being got");
            i2.a("Location", new d(this, b2));
            throw new cl(a2);
        }
    }

    private int R(int n2, int n3, int n4) {
        if (n3 >> 4 >= this.dID.length) {
            return 0;
        }
        net.minecraft.world.chunk.storage.g g2 = this.dID[n3 >> 4];
        return g2 != null ? g2.X(n2, n3 & 0xF, n4) : 0;
    }

    public int bq(net.minecraft.util.b b2) {
        return this.R(b2.wt() & 0xF, b2.wu(), b2.wx() & 0xF);
    }

    public IBlockState e(net.minecraft.util.b b2, IBlockState iBlockState) {
        net.minecraft.tileentity.d d2;
        int n2;
        int n3;
        int n4 = b2.wt() & 0xF;
        int n5 = b2.wu();
        if (n5 >= this.dIF[n3 = (n2 = b2.wx() & 0xF) << 4 | n4] - 1) {
            this.dIF[n3] = -999;
        }
        int n6 = this.dIJ[n3];
        IBlockState iBlockState2 = this.L(b2);
        if (iBlockState2 == iBlockState) {
            return null;
        }
        Block block = iBlockState.df();
        Block block2 = iBlockState2.df();
        net.minecraft.world.chunk.storage.g g2 = this.dID[n5 >> 4];
        boolean bl2 = false;
        if (g2 == null) {
            if (block == Blocks.cLc) {
                return null;
            }
            net.minecraft.world.chunk.storage.g g3 = new net.minecraft.world.chunk.storage.g(n5 >> 4 << 4, !this.dII.dDl.awf());
            this.dID[n5 >> 4] = g3;
            g2 = g3;
            bl2 = n5 >= n6;
        }
        g2.b(n4, n5 & 0xF, n2, iBlockState);
        if (block2 != block) {
            if (!this.dII.dDw) {
                block2.d(this.dII, b2, iBlockState2);
            } else if (block2 instanceof ITileEntityProvider) {
                this.dII.aU(b2);
            }
        }
        if (g2.W(n4, n5 & 0xF, n2) != block) {
            return null;
        }
        if (bl2) {
            this.axy();
        } else {
            int n7 = block.wX();
            int n8 = block2.wX();
            aNC.execute(() -> {
                if (n7 > 0) {
                    if (n5 >= n6) {
                        this.N(n4, n5 + 1, n2);
                    }
                } else if (n5 == n6 - 1) {
                    this.N(n4, n5, n2);
                }
            });
            if (n7 != n8 && (n7 < n8 || this.b(g.dBZ, b2) > 0 || this.b(g.dCa, b2) > 0)) {
                this.aV(n4, n2);
            }
        }
        if (block2 instanceof ITileEntityProvider && (d2 = this.a(b2, e.dJh)) != null) {
            d2.apU();
        }
        if (!this.dII.dDw && block2 != block) {
            block.c(this.dII, b2, iBlockState);
        }
        if (block instanceof ITileEntityProvider) {
            net.minecraft.tileentity.d d3 = this.a(b2, e.dJh);
            if (d3 == null) {
                d3 = ((ITileEntityProvider)((Object)block)).a(this.dII, block.c(iBlockState));
                this.dII.a(b2, d3);
            }
            if (d3 != null) {
                d3.apU();
            }
        }
        this.dIS = true;
        return iBlockState2;
    }

    public int b(g g2, net.minecraft.util.b b2) {
        int n2 = b2.wt() & 0xF;
        int n3 = b2.wu();
        int n4 = b2.wx() & 0xF;
        net.minecraft.world.chunk.storage.g g3 = this.dID[n3 >> 4];
        return g3 == null ? (this.aM(b2) ? g2.dCb : 0) : (g2 == g.dBZ ? (this.dII.dDl.awf() ? 0 : g3.Y(n2, n3 & 0xF, n4)) : (g2 == g.dCa ? g3.Z(n2, n3 & 0xF, n4) : g2.dCb));
    }

    public void a(g g2, net.minecraft.util.b b2, int n2) {
        int n3 = b2.wt() & 0xF;
        int n4 = b2.wu();
        int n5 = b2.wx() & 0xF;
        net.minecraft.world.chunk.storage.g g3 = this.dID[n4 >> 4];
        if (g3 == null) {
            net.minecraft.world.chunk.storage.g g4 = new net.minecraft.world.chunk.storage.g(n4 >> 4 << 4, !this.dII.dDl.awf());
            this.dID[n4 >> 4] = g4;
            g3 = g4;
            this.axy();
        }
        this.dIS = true;
        if (g2 == g.dBZ) {
            if (!this.dII.dDl.awf()) {
                g3.z(n3, n4 & 0xF, n5, n2);
            }
        } else if (g2 == g.dCa) {
            g3.A(n3, n4 & 0xF, n5, n2);
        }
    }

    public int g(net.minecraft.util.b b2, int n2) {
        int n3 = b2.wt() & 0xF;
        int n4 = b2.wu();
        int n5 = b2.wx() & 0xF;
        net.minecraft.world.chunk.storage.g g2 = this.dID[n4 >> 4];
        if (g2 == null) {
            return !this.dII.dDl.awf() && n2 < g.dBZ.dCb ? g.dBZ.dCb - n2 : 0;
        }
        int n6 = this.dII.dDl.awf() ? 0 : g2.Y(n3, n4 & 0xF, n5);
        int n7 = g2.Z(n3, n4 & 0xF, n5);
        if (n7 > (n6 -= n2)) {
            n6 = n7;
        }
        return n6;
    }

    public void aE(net.minecraft.entity.c c2) {
        int n2;
        this.dIT = true;
        int n3 = bt.aF(c2.gW / 16.0);
        int n4 = bt.aF(c2.gY / 16.0);
        if (n3 != this.dIK || n4 != this.dIL) {
            dIC.warn("Wrong location! (" + n3 + ", " + n4 + ") should be (" + this.dIK + ", " + this.dIL + "), " + String.valueOf(c2), new Object[]{c2});
            c2.Tt();
        }
        if ((n2 = bt.aF(c2.gX / 16.0)) < 0) {
            n2 = 0;
        }
        if (n2 >= this.dIO.length) {
            n2 = this.dIO.length - 1;
        }
        c2.csG = true;
        c2.csH = this.dIK;
        c2.csI = n2;
        c2.csJ = this.dIL;
        this.dIO[n2].add(c2);
    }

    public void H(net.minecraft.entity.c c2) {
        this.e(c2, c2.csI);
    }

    public void e(net.minecraft.entity.c c2, int n2) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= this.dIO.length) {
            n2 = this.dIO.length - 1;
        }
        this.dIO[n2].remove(c2);
    }

    public boolean aM(net.minecraft.util.b b2) {
        int n2;
        int n3 = b2.wt() & 0xF;
        int n4 = b2.wu();
        return n4 >= this.dIJ[(n2 = b2.wx() & 0xF) << 4 | n3];
    }

    private net.minecraft.tileentity.d br(net.minecraft.util.b b2) {
        Block block = this.bp(b2);
        return !block.xj() ? null : ((ITileEntityProvider)((Object)block)).a(this.dII, this.bq(b2));
    }

    public net.minecraft.tileentity.d a(net.minecraft.util.b b2, e e2) {
        net.minecraft.tileentity.d d2 = this.dIN.get(b2);
        if (d2 == null) {
            if (e2 == e.dJf) {
                d2 = this.br(b2);
                this.dII.a(b2, d2);
            } else if (e2 == e.dJg) {
                this.dIY.add(b2);
            }
        } else if (d2.apR()) {
            this.dIN.remove(b2);
            return null;
        }
        return d2;
    }

    public void a(net.minecraft.tileentity.d d2) {
        this.c(d2.Ab(), d2);
        if (this.loaded) {
            this.dII.f(d2);
        }
    }

    public void c(net.minecraft.util.b b2, net.minecraft.tileentity.d d2) {
        d2.n(this.dII);
        d2.ap(b2);
        if (this.bp(b2) instanceof ITileEntityProvider) {
            if (this.dIN.containsKey(b2)) {
                this.dIN.get(b2).apS();
            }
            d2.apT();
            this.dIN.put(b2, d2);
        }
    }

    public void aU(net.minecraft.util.b b2) {
        net.minecraft.tileentity.d d2;
        if (this.loaded && (d2 = this.dIN.remove(b2)) != null) {
            d2.apS();
        }
    }

    public void TR() {
        this.loaded = true;
        this.dII.g(this.dIN.values());
        for (int i2 = 0; i2 < this.dIO.length; ++i2) {
            for (net.minecraft.entity.c c2 : this.dIO[i2]) {
                c2.TR();
            }
            this.dII.h(this.dIO[i2]);
        }
    }

    public void axz() {
        this.loaded = false;
        for (net.minecraft.tileentity.d d2 : this.dIN.values()) {
            this.dII.g(d2);
        }
        for (int i2 = 0; i2 < this.dIO.length; ++i2) {
            this.dII.i(this.dIO[i2]);
        }
    }

    public void axA() {
        this.dIS = true;
    }

    public void a(net.minecraft.entity.c c2, net.minecraft.util.a a2, List<net.minecraft.entity.c> list, Predicate<? super net.minecraft.entity.c> predicate) {
        int n2 = bt.aF((a2.dtI - 2.0) / 16.0);
        int n3 = bt.aF((a2.dtL + 2.0) / 16.0);
        n2 = bt.F(n2, 0, this.dIO.length - 1);
        n3 = bt.F(n3, 0, this.dIO.length - 1);
        try {
            for (int i2 = n2; i2 <= n3; ++i2) {
                if (this.dIO[i2].isEmpty()) continue;
                for (net.minecraft.entity.c c3 : this.dIO[i2]) {
                    net.minecraft.entity.c[] cArray;
                    if (c3 == null || !c3.Us().q(a2) || c3 == c2) continue;
                    if (predicate == null || predicate.apply((Object)c3)) {
                        list.add(c3);
                    }
                    if ((cArray = c3.Ue()) == null) continue;
                    for (net.minecraft.entity.c c4 : cArray) {
                        c3 = c4;
                        if (c3 == c2 || !c3.Us().q(a2) || predicate != null && !predicate.apply((Object)c3)) continue;
                        list.add(c3);
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public <T extends net.minecraft.entity.c> void a(Class<? extends T> clazz, net.minecraft.util.a a2, List<T> list, Predicate<? super T> predicate) {
        int n2 = bt.aF((a2.dtI - 2.0) / 16.0);
        int n3 = bt.aF((a2.dtL + 2.0) / 16.0);
        n2 = bt.F(n2, 0, this.dIO.length - 1);
        n3 = bt.F(n3, 0, this.dIO.length - 1);
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (net.minecraft.entity.c c2 : this.dIO[i2].q(clazz)) {
                if (!c2.Us().q(a2) || predicate != null && !predicate.apply((Object)c2)) continue;
                list.add(c2);
            }
        }
    }

    public boolean cx(boolean bl2) {
        if (bl2 ? this.dIT && this.dII.getTotalWorldTime() != this.dIU || this.dIS : this.dIT && this.dII.getTotalWorldTime() >= this.dIU + 600L) {
            return true;
        }
        return this.dIS;
    }

    public Random L(long l2) {
        return new Random(this.dII.avD() + (long)(this.dIK * this.dIK * 4987142) + (long)(this.dIK * 5947611) + (long)(this.dIL * this.dIL) * 4392871L + (long)(this.dIL * 389711) ^ l2);
    }

    public boolean isEmpty() {
        return false;
    }

    public void a(h h2, h h3, int n2, int n3) {
        a a2;
        boolean bl2 = h2.E(n2, n3 - 1);
        boolean bl3 = h2.E(n2 + 1, n3);
        boolean bl4 = h2.E(n2, n3 + 1);
        boolean bl5 = h2.E(n2 - 1, n3);
        boolean bl6 = h2.E(n2 - 1, n3 - 1);
        boolean bl7 = h2.E(n2 + 1, n3 + 1);
        boolean bl8 = h2.E(n2 - 1, n3 + 1);
        boolean bl9 = h2.E(n2 + 1, n3 - 1);
        if (bl3 && bl4 && bl7) {
            if (!this.dIP) {
                h2.a(h3, n2, n3);
            } else {
                h2.a(h3, this, n2, n3);
            }
        }
        if (bl5 && bl4 && bl8) {
            a2 = h2.H(n2 - 1, n3);
            if (!a2.dIP) {
                h2.a(h3, n2 - 1, n3);
            } else {
                h2.a(h3, a2, n2 - 1, n3);
            }
        }
        if (bl2 && bl3 && bl9) {
            a2 = h2.H(n2, n3 - 1);
            if (!a2.dIP) {
                h2.a(h3, n2, n3 - 1);
            } else {
                h2.a(h3, a2, n2, n3 - 1);
            }
        }
        if (bl6 && bl2 && bl5) {
            a2 = h2.H(n2 - 1, n3 - 1);
            if (!a2.dIP) {
                h2.a(h3, n2 - 1, n3 - 1);
            } else {
                h2.a(h3, a2, n2 - 1, n3 - 1);
            }
        }
    }

    public net.minecraft.util.b aS(net.minecraft.util.b b2) {
        int n2 = b2.wt() & 0xF;
        int n3 = b2.wx() & 0xF;
        int n4 = n2 | n3 << 4;
        net.minecraft.util.b b3 = new net.minecraft.util.b(b2.wt(), this.dIF[n4], b2.wx());
        if (b3.wu() == -999) {
            int n5 = this.axv() + 15;
            b3 = new net.minecraft.util.b(b2.wt(), n5, b2.wx());
            int n6 = -1;
            while (b3.wu() > 0 && n6 == -1) {
                Block block = this.bp(b3);
                Material material = block.xb();
                if (!material.zy() && !material.zv()) {
                    b3 = b3.aqY();
                    continue;
                }
                n6 = b3.wu() + 1;
            }
            this.dIF[n4] = n6;
        }
        return new net.minecraft.util.b(b2.wt(), this.dIF[n4], b2.wx());
    }

    public void cy(boolean bl2) {
        if (this.dIM && !this.dII.dDl.awf() && !bl2) {
            this.cw(this.dII.dDw);
        }
        this.dIR = true;
        if (!this.dIQ && this.dIP) {
            this.axG();
        }
        while (!this.dIY.isEmpty()) {
            net.minecraft.util.b b2 = this.dIY.poll();
            if (this.a(b2, e.dJh) != null || !this.bp(b2).xj()) continue;
            net.minecraft.tileentity.d d2 = this.br(b2);
            this.dII.a(b2, d2);
            this.dII.f(b2, b2);
        }
    }

    public boolean axB() {
        return this.dIR && this.dIP && this.dIQ;
    }

    public b axC() {
        return new b(this.dIK, this.dIL);
    }

    public boolean aW(int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        for (int i2 = n2; i2 <= n3; i2 += 16) {
            net.minecraft.world.chunk.storage.g g2 = this.dID[i2 >> 4];
            if (g2 == null || g2.isEmpty()) continue;
            return false;
        }
        return true;
    }

    public void a(net.minecraft.world.chunk.storage.g[] gArray) {
        if (this.dID.length != gArray.length) {
            dIC.warn("Could not set level chunk sections, array length is " + gArray.length + " instead of " + this.dID.length);
        } else {
            System.arraycopy(gArray, 0, this.dID, 0, this.dID.length);
        }
    }

    public void a(byte[] byArray, int n2, boolean bl2) {
        int n3;
        int n4 = 0;
        boolean bl3 = !this.dII.dDl.awf();
        for (n3 = 0; n3 < this.dID.length; ++n3) {
            if ((n2 & 1 << n3) != 0) {
                if (this.dID[n3] == null) {
                    this.dID[n3] = new net.minecraft.world.chunk.storage.g(n3 << 4, bl3);
                }
                char[] object2 = this.dID[n3].axZ();
                for (int i2 = 0; i2 < object2.length; ++i2) {
                    object2[i2] = (char)((byArray[n4 + 1] & 0xFF) << 8 | byArray[n4] & 0xFF);
                    n4 += 2;
                }
                continue;
            }
            if (!bl2 || this.dID[n3] == null) continue;
            this.dID[n3] = null;
        }
        for (n3 = 0; n3 < this.dID.length; ++n3) {
            if ((n2 & 1 << n3) == 0 || this.dID[n3] == null) continue;
            i i3 = this.dID[n3].aya();
            System.arraycopy(byArray, n4, i3.axQ(), 0, i3.axQ().length);
            n4 += i3.axQ().length;
        }
        if (bl3) {
            for (n3 = 0; n3 < this.dID.length; ++n3) {
                if ((n2 & 1 << n3) == 0 || this.dID[n3] == null) continue;
                i i4 = this.dID[n3].ayb();
                System.arraycopy(byArray, n4, i4.axQ(), 0, i4.axQ().length);
                n4 += i4.axQ().length;
            }
        }
        if (bl2) {
            System.arraycopy(byArray, n4, this.dIE, 0, this.dIE.length);
            n3 = n4 + this.dIE.length;
        }
        for (n3 = 0; n3 < this.dID.length; ++n3) {
            if (this.dID[n3] == null || (n2 & 1 << n3) == 0) continue;
            this.dID[n3].axY();
        }
        this.dIQ = true;
        this.dIP = true;
        this.axx();
        for (net.minecraft.tileentity.d d2 : this.dIN.values()) {
            d2.apU();
        }
    }

    public j a(net.minecraft.util.b b2, aj aj2) {
        j j2;
        int n2 = b2.wt() & 0xF;
        int n3 = b2.wx() & 0xF;
        int n4 = this.dIE[n3 << 4 | n2] & 0xFF;
        if (n4 == 255) {
            j2 = aj2.b(b2, j.dGg);
            n4 = j2.dHo;
            this.dIE[n3 << 4 | n2] = (byte)(n4 & 0xFF);
        }
        return (j2 = j.io(n4)) == null ? j.dGg : j2;
    }

    public byte[] axD() {
        return this.dIE;
    }

    public void m(byte[] byArray) {
        if (this.dIE.length != byArray.length) {
            dIC.warn("Could not set level chunk biomes, array length is " + byArray.length + " instead of " + this.dIE.length);
        } else {
            for (int i2 = 0; i2 < this.dIE.length; ++i2) {
                this.dIE[i2] = byArray[i2];
            }
        }
    }

    public void axE() {
        this.dIX = 0;
    }

    public void axF() {
        net.minecraft.util.b b2 = new net.minecraft.util.b(this.dIK << 4, 0, this.dIL << 4);
        for (int i2 = 0; i2 < 8; ++i2) {
            if (this.dIX >= 4096) {
                return;
            }
            int n2 = this.dIX % 16;
            int n3 = this.dIX / 16 % 16;
            int n4 = this.dIX / 256;
            ++this.dIX;
            for (int i3 = 0; i3 < 16; ++i3) {
                boolean bl2;
                net.minecraft.util.b b3 = b2.C(n3, (n2 << 4) + i3, n4);
                boolean bl3 = bl2 = i3 == 0 || i3 == 15 || n3 == 0 || n3 == 15 || n4 == 0 || n4 == 15;
                if ((this.dID[n2] != null || !bl2) && (this.dID[n2] == null || this.dID[n2].W(n3, i3, n4).xb() != Material.beo)) continue;
                for (ao ao2 : ao.values()) {
                    net.minecraft.util.b b4 = b3.x(ao2);
                    if (this.dII.L(b4).df().wZ() <= 0) continue;
                    this.dII.aZ(b4);
                }
                this.dII.aZ(b3);
            }
        }
    }

    public void axG() {
        this.dIP = true;
        this.dIQ = true;
        net.minecraft.util.b b2 = new net.minecraft.util.b(this.dIK << 4, 0, this.dIL << 4);
        if (!this.dII.dDl.awf()) {
            if (this.dII.e(b2.C(-1, 0, -1), b2.C(16, this.dII.avB(), 16))) {
                block0: for (int i2 = 0; i2 < 16; ++i2) {
                    for (int i3 = 0; i3 < 16; ++i3) {
                        if (this.aX(i2, i3)) continue;
                        this.dIQ = false;
                        break block0;
                    }
                }
                if (this.dIQ) {
                    for (ao ao2 : ar.dwT) {
                        int n2 = ao2.asB() == aq.dwO ? 16 : 1;
                        this.dII.aK(b2.d(ao2, n2)).y(ao2.asC());
                    }
                    this.axH();
                }
            } else {
                this.dIQ = false;
            }
        }
    }

    private void axH() {
        for (int i2 = 0; i2 < this.dIG.length; ++i2) {
            this.dIG[i2] = true;
        }
        this.cw(false);
    }

    private void y(ao ao2) {
        block4: {
            block7: {
                block6: {
                    block5: {
                        if (!this.dIP) break block4;
                        if (ao2 != ao.dwv) break block5;
                        for (int i2 = 0; i2 < 16; ++i2) {
                            this.aX(15, i2);
                        }
                        break block4;
                    }
                    if (ao2 != ao.dwu) break block6;
                    for (int i3 = 0; i3 < 16; ++i3) {
                        this.aX(0, i3);
                    }
                    break block4;
                }
                if (ao2 != ao.dwt) break block7;
                for (int i4 = 0; i4 < 16; ++i4) {
                    this.aX(i4, 15);
                }
                break block4;
            }
            if (ao2 != ao.dws) break block4;
            for (int i5 = 0; i5 < 16; ++i5) {
                this.aX(i5, 0);
            }
        }
    }

    private boolean aX(int n2, int n3) {
        int n4;
        int n5 = this.axv();
        boolean bl2 = false;
        boolean bl3 = false;
        net.minecraft.util.g g2 = new net.minecraft.util.g((this.dIK << 4) + n2, 0, (this.dIL << 4) + n3);
        for (n4 = n5 + 16 - 1; n4 > this.dII.avB() || n4 > 0 && !bl3; --n4) {
            g2.E(g2.wt(), n4, g2.wx());
            int n6 = this.bo(g2);
            if (n6 == 255 && g2.wu() < this.dII.avB()) {
                bl3 = true;
            }
            if (!bl2 && n6 > 0) {
                bl2 = true;
                continue;
            }
            if (!bl2 || n6 != 0 || this.dII.aZ(g2)) continue;
            return false;
        }
        for (n4 = g2.wu(); n4 > 0; --n4) {
            g2.E(g2.wt(), n4, g2.wx());
            if (this.bp(g2).wZ() <= 0) continue;
            this.dII.aZ(g2);
        }
        return true;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public void cz(boolean bl2) {
        this.loaded = bl2;
    }

    public w de() {
        return this.dII;
    }

    public int[] axI() {
        return this.dIJ;
    }

    public void n(int[] nArray) {
        if (this.dIJ.length != nArray.length) {
            dIC.warn("Could not set level chunk heightmap, array length is " + nArray.length + " instead of " + this.dIJ.length);
        } else {
            for (int i2 = 0; i2 < this.dIJ.length; ++i2) {
                this.dIJ[i2] = nArray[i2];
            }
        }
    }

    public Map<net.minecraft.util.b, net.minecraft.tileentity.d> axJ() {
        return this.dIN;
    }

    public y<net.minecraft.entity.c>[] axK() {
        return this.dIO;
    }

    public boolean axL() {
        return this.dIP;
    }

    public void cA(boolean bl2) {
        this.dIP = bl2;
    }

    public boolean axM() {
        return this.dIQ;
    }

    public void cB(boolean bl2) {
        this.dIQ = bl2;
    }

    public void cC(boolean bl2) {
        this.dIS = bl2;
    }

    public void cD(boolean bl2) {
        this.dIT = bl2;
    }

    public void M(long l2) {
        this.dIU = l2;
    }

    public int axN() {
        return this.dIV;
    }

    public long axO() {
        return this.dIW;
    }

    public void N(long l2) {
        this.dIW = l2;
    }
}

