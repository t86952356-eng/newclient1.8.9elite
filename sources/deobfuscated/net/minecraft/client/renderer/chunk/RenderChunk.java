/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.renderer.chunk;

import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RegionRenderCache;
import net.minecraft.client.renderer.RegionRenderCacheBuilder;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderGlobal$ContainerLocalRenderInformation;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status;
import net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.b;
import net.minecraft.world.w;
import net.optifine.d;
import net.optifine.p;
import net.optifine.reflect.l;
import net.optifine.render.a;
import net.optifine.render.g;
import net.optifine.shaders.z;

public class RenderChunk {
    private final w bTn;
    private final RenderGlobal bTo;
    public static int bTp;
    private b aca;
    public CompiledChunk bSt = CompiledChunk.bTe;
    private final ReentrantLock bTq = new ReentrantLock();
    private final ReentrantLock bTr = new ReentrantLock();
    private ChunkCompileTaskGenerator bTs = null;
    private final Set<net.minecraft.tileentity.d> bTt = Sets.newHashSet();
    private final int bTu;
    private final FloatBuffer bTv = GLAllocation.cG(16);
    private final VertexBuffer[] bTw = new VertexBuffer[av.values().length];
    public net.minecraft.util.a jJ;
    private int bTx = -1;
    private boolean bPW = true;
    private final EnumMap<ao, b> bTy = null;
    private final b[] bTz = new b[ao.dwD.length];
    public static final av[] bTA;
    private final av[] bTB = new av[1];
    private final boolean bTC = net.minecraft.src.a.and();
    private final boolean bTD = !net.optifine.reflect.g.eni.aDA();
    private boolean bEm = false;
    public int bTE;
    public int bTF;
    private final RenderChunk[] bTG = new RenderChunk[6];
    private boolean bTH = false;
    private net.minecraft.world.chunk.a bTI;
    private final RenderChunk[] bTJ = new RenderChunk[ao.dwD.length];
    private final RenderChunk[] bTK = new RenderChunk[ao.dwD.length];
    private boolean bTL = false;
    private final RenderGlobal$ContainerLocalRenderInformation bTM = new RenderGlobal$ContainerLocalRenderInformation(this, null, 0);
    public a bTN;

    public RenderChunk(w w2, RenderGlobal renderGlobal, b b2, int n2) {
        this.bTn = w2;
        this.bTo = renderGlobal;
        this.bTu = n2;
        if (!b2.equals(this.yl())) {
            this.S(b2);
        }
        if (OpenGlHelper.Kv()) {
            for (int i2 = 0; i2 < av.values().length; ++i2) {
                this.bTw[i2] = new VertexBuffer(DefaultVertexFormats.cbv);
            }
        }
    }

    public boolean dt(int n2) {
        if (this.bTx == n2) {
            return false;
        }
        this.bTx = n2;
        return true;
    }

    public VertexBuffer du(int n2) {
        return this.bTw[n2];
    }

    public void S(b b2) {
        int n2;
        this.MZ();
        this.aca = b2;
        int n3 = 8;
        this.bTE = b2.wt() >> 8 << 8;
        this.bTF = b2.wx() >> 8 << 8;
        this.jJ = new net.minecraft.util.a(b2, b2.C(16, 16, 16));
        this.MX();
        for (n2 = 0; n2 < this.bTz.length; ++n2) {
            this.bTz[n2] = null;
        }
        this.bTH = false;
        this.bTL = false;
        for (n2 = 0; n2 < this.bTJ.length; ++n2) {
            RenderChunk renderChunk = this.bTJ[n2];
            if (renderChunk == null) continue;
            renderChunk.bTL = false;
        }
        this.bTI = null;
        this.bTN = null;
    }

    public void a(float f2, float f3, float f4, ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        CompiledChunk compiledChunk = chunkCompileTaskGenerator.MF();
        if (compiledChunk.MS() != null && !compiledChunk.f(av.dxY)) {
            WorldRenderer worldRenderer = chunkCompileTaskGenerator.MG().b(av.dxY);
            this.a(worldRenderer, this.aca);
            worldRenderer.a(compiledChunk.MS());
            this.a(av.dxY, f2, f3, f4, worldRenderer, compiledChunk);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(float f2, float f3, float f4, ChunkCompileTaskGenerator chunkCompileTaskGenerator) {
        Object object;
        Object object2;
        CompiledChunk compiledChunk = new CompiledChunk();
        boolean bl2 = true;
        b b2 = new b(this.aca);
        b b3 = b2.C(15, 15, 15);
        chunkCompileTaskGenerator.MI().lock();
        try {
            if (chunkCompileTaskGenerator.MD() != ChunkCompileTaskGenerator$Status.bSw) {
                return;
            }
            chunkCompileTaskGenerator.a(compiledChunk);
        }
        finally {
            chunkCompileTaskGenerator.MI().unlock();
        }
        VisGraph visGraph = new VisGraph();
        HashSet hashSet = Sets.newHashSet();
        if (!this.V(b2)) {
            Object object3;
            ++bTp;
            object2 = this.T(b2);
            ((net.optifine.override.a)object2).aDn();
            object = new boolean[bTA.length];
            BlockRendererDispatcher blockRendererDispatcher = Minecraft.getMinecraft().BE();
            boolean bl3 = net.optifine.reflect.g.eoj.aDA();
            boolean bl4 = net.optifine.reflect.g.epo.aDA();
            for (Object t2 : d.c(b2, b3)) {
                Object object4;
                d d2 = (d)t2;
                IBlockState object5 = ((net.optifine.override.a)object2).L(d2);
                object3 = object5.df();
                if (((Block)object3).xk()) {
                    visGraph.W(d2);
                }
                if (l.K(object5)) {
                    object4 = ((net.optifine.override.a)object2).K(new b(d2));
                    TileEntitySpecialRenderer tileEntitySpecialRenderer = TileEntityRendererDispatcher.caV.b((net.minecraft.tileentity.d)object4);
                    if (object4 != null && tileEntitySpecialRenderer != null) {
                        compiledChunk.a((net.minecraft.tileentity.d)object4);
                        if (tileEntitySpecialRenderer.OE()) {
                            hashSet.add(object4);
                        }
                    }
                }
                if (bl3) {
                    object4 = bTA;
                } else {
                    object4 = this.bTB;
                    object4[0] = ((Block)object3).xo();
                }
                for (int i2 = 0; i2 < ((av[])object4).length; ++i2) {
                    int n2;
                    av av2 = object4[i2];
                    if (bl3 && (n2 = net.optifine.reflect.g.b(object3, net.optifine.reflect.g.eoj, new Object[]{av2})) == 0) continue;
                    if (bl4) {
                        net.optifine.reflect.g.a(net.optifine.reflect.g.epo, new Object[]{av2});
                    }
                    av2 = this.a(object5, av2);
                    n2 = av2.ordinal();
                    if (((Block)object3).xg() == -1) continue;
                    WorldRenderer worldRenderer = chunkCompileTaskGenerator.MG().di(n2);
                    worldRenderer.d(av2);
                    g g2 = worldRenderer.b(object5, d2);
                    g2.a(chunkCompileTaskGenerator.MG());
                    if (!compiledChunk.h(av2)) {
                        compiledChunk.g(av2);
                        this.a(worldRenderer, b2);
                    }
                    Object object6 = object;
                    int n3 = n2;
                    object6[n3] = object6[n3] | blockRendererDispatcher.a(object5, (b)d2, (net.minecraft.world.l)object2, worldRenderer);
                    if (!g2.aEg()) continue;
                    this.a(chunkCompileTaskGenerator.MG(), compiledChunk, (boolean[])object);
                    g2.cP(false);
                }
                if (!bl4) continue;
                net.optifine.reflect.g.a(net.optifine.reflect.g.epo, null);
            }
            for (av av3 : bTA) {
                if (object[av3.ordinal()] != false) {
                    compiledChunk.e(av3);
                }
                if (compiledChunk.h(av3)) {
                    if (net.minecraft.src.a.aoG()) {
                        z.j(chunkCompileTaskGenerator.MG().b(av3));
                    }
                    object3 = chunkCompileTaskGenerator.MG().b(av3);
                    this.a(av3, f2, f3, f4, (WorldRenderer)object3, compiledChunk);
                    if (((WorldRenderer)object3).bQj == null) continue;
                    compiledChunk.a(av3, (BitSet)((WorldRenderer)object3).bQj.clone());
                    continue;
                }
                compiledChunk.a(av3, null);
            }
            ((net.optifine.override.a)object2).aDo();
        }
        compiledChunk.a(visGraph.Nh());
        this.bTq.lock();
        try {
            object2 = Sets.newHashSet((Iterable)hashSet);
            object = Sets.newHashSet(this.bTt);
            object2.removeAll(this.bTt);
            object.removeAll(hashSet);
            this.bTt.clear();
            this.bTt.addAll(hashSet);
            this.bTo.a((Collection<net.minecraft.tileentity.d>)object, (Collection<net.minecraft.tileentity.d>)object2);
        }
        finally {
            this.bTq.unlock();
        }
    }

    protected void MT() {
        this.bTq.lock();
        try {
            if (this.bTs != null && this.bTs.MD() != ChunkCompileTaskGenerator$Status.bSy) {
                this.bTs.MH();
                this.bTs = null;
            }
        }
        finally {
            this.bTq.unlock();
        }
    }

    public ReentrantLock MU() {
        return this.bTq;
    }

    public ChunkCompileTaskGenerator MV() {
        ChunkCompileTaskGenerator chunkCompileTaskGenerator;
        this.bTq.lock();
        try {
            this.MT();
            chunkCompileTaskGenerator = this.bTs = new ChunkCompileTaskGenerator(this, ChunkCompileTaskGenerator$Type.bSA);
        }
        finally {
            this.bTq.unlock();
        }
        return chunkCompileTaskGenerator;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ChunkCompileTaskGenerator MW() {
        ChunkCompileTaskGenerator chunkCompileTaskGenerator;
        this.bTq.lock();
        try {
            ChunkCompileTaskGenerator chunkCompileTaskGenerator2;
            if (this.bTs != null && this.bTs.MD() == ChunkCompileTaskGenerator$Status.bSv) {
                ChunkCompileTaskGenerator chunkCompileTaskGenerator3;
                ChunkCompileTaskGenerator chunkCompileTaskGenerator4 = chunkCompileTaskGenerator3 = null;
                return chunkCompileTaskGenerator4;
            }
            if (this.bTs != null && this.bTs.MD() != ChunkCompileTaskGenerator$Status.bSy) {
                this.bTs.MH();
                this.bTs = null;
            }
            this.bTs = new ChunkCompileTaskGenerator(this, ChunkCompileTaskGenerator$Type.bSB);
            this.bTs.a(this.bSt);
            chunkCompileTaskGenerator = chunkCompileTaskGenerator2 = this.bTs;
        }
        finally {
            this.bTq.unlock();
        }
        return chunkCompileTaskGenerator;
    }

    private void a(WorldRenderer worldRenderer, b b2) {
        worldRenderer.a(7, DefaultVertexFormats.cbv);
        if (net.minecraft.src.a.apg()) {
            int n2 = 8;
            int n3 = b2.wt() >> 8 << 8;
            int n4 = b2.wu() >> 8 << 8;
            int n5 = b2.wx() >> 8 << 8;
            n3 = this.bTE;
            n5 = this.bTF;
            worldRenderer.G(-n3, -n4, -n5);
        } else {
            worldRenderer.G(-b2.wt(), -b2.wu(), -b2.wx());
        }
    }

    private void a(av av2, float f2, float f3, float f4, WorldRenderer worldRenderer, CompiledChunk compiledChunk) {
        if (av2 == av.dxY && !compiledChunk.f(av2)) {
            worldRenderer.l(f2, f3, f4);
            compiledChunk.b(worldRenderer.Lu());
        }
        worldRenderer.Lz();
    }

    private void MX() {
        GlStateManager.JV();
        GlStateManager.JU();
        float f2 = 1.000001f;
        GlStateManager.j(-8.0f, -8.0f, -8.0f);
        GlStateManager.i(1.000001f, 1.000001f, 1.000001f);
        GlStateManager.j(8.0f, 8.0f, 8.0f);
        GlStateManager.a(2982, this.bTv);
        GlStateManager.JW();
    }

    public void MY() {
        GlStateManager.a(this.bTv);
    }

    public CompiledChunk MF() {
        return this.bSt;
    }

    public void a(CompiledChunk compiledChunk) {
        this.bTr.lock();
        try {
            this.bSt = compiledChunk;
        }
        finally {
            this.bTr.unlock();
        }
    }

    public void MZ() {
        this.MT();
        this.bSt = CompiledChunk.bTe;
    }

    public void Ls() {
        this.MZ();
        for (int i2 = 0; i2 < av.values().length; ++i2) {
            if (this.bTw[i2] == null) continue;
            this.bTw[i2].OK();
        }
    }

    public b yl() {
        return this.aca;
    }

    public void ap(boolean bl2) {
        this.bPW = bl2;
        if (bl2) {
            if (this.Nb()) {
                this.bEm = true;
            }
        } else {
            this.bEm = false;
        }
    }

    public boolean Na() {
        return this.bPW;
    }

    public b m(ao ao2) {
        return this.n(ao2);
    }

    public b n(ao ao2) {
        int n2 = ao2.OY();
        b b2 = this.bTz[n2];
        if (b2 == null) {
            this.bTz[n2] = b2 = this.yl().d(ao2, 16);
        }
        return b2;
    }

    private boolean Nb() {
        if (this.bTn instanceof j) {
            j j2 = (j)this.bTn;
            return j2.HU();
        }
        return false;
    }

    public boolean HU() {
        return this.bEm;
    }

    protected RegionRenderCache a(w w2, b b2, b b3, int n2) {
        return new RegionRenderCache(w2, b2, b3, n2);
    }

    private av a(IBlockState iBlockState, av av2) {
        Object object;
        if (p.bd() && (object = p.H(iBlockState)) != null) {
            return object;
        }
        if (!this.bTD) {
            return av2;
        }
        if (this.bTC) {
            if (av2 == av.dxX) {
                object = iBlockState.df();
                if (object instanceof BlockRedstoneWire) {
                    return av2;
                }
                if (object instanceof BlockCactus) {
                    return av2;
                }
                return av.dxW;
            }
        } else if (av2 == av.dxW) {
            return av.dxX;
        }
        return av2;
    }

    private void a(RegionRenderCacheBuilder regionRenderCacheBuilder, CompiledChunk compiledChunk, boolean[] blArray) {
        this.a(av.dxX, regionRenderCacheBuilder, compiledChunk, blArray);
        this.a(av.dxW, regionRenderCacheBuilder, compiledChunk, blArray);
        this.a(av.dxY, regionRenderCacheBuilder, compiledChunk, blArray);
    }

    private void a(av av2, RegionRenderCacheBuilder regionRenderCacheBuilder, CompiledChunk compiledChunk, boolean[] blArray) {
        WorldRenderer worldRenderer = regionRenderCacheBuilder.b(av2);
        if (worldRenderer.LH()) {
            compiledChunk.g(av2);
            blArray[av2.ordinal()] = true;
        }
    }

    private net.optifine.override.a T(b b2) {
        b b3 = b2.C(-1, -1, -1);
        b b4 = b2.C(16, 16, 16);
        RegionRenderCache regionRenderCache = this.a(this.bTn, b3, b4, 1);
        if (net.optifine.reflect.g.eqr.aDA()) {
            net.optifine.reflect.g.g(net.optifine.reflect.g.eqr, this.bTn, b2, regionRenderCache);
        }
        net.optifine.override.a a2 = new net.optifine.override.a(regionRenderCache, b3, b4, 1);
        return a2;
    }

    public RenderChunk a(ViewFrustum viewFrustum, ao ao2) {
        if (!this.bTH) {
            for (int i2 = 0; i2 < ao.dwD.length; ++i2) {
                ao ao3 = ao.dwD[i2];
                b b2 = this.m(ao3);
                this.bTG[i2] = viewFrustum.R(b2);
            }
            this.bTH = true;
        }
        return this.bTG[ao2.ordinal()];
    }

    public net.minecraft.world.chunk.a Nc() {
        return this.U(this.aca);
    }

    private net.minecraft.world.chunk.a U(b b2) {
        net.minecraft.world.chunk.a a2 = this.bTI;
        if (a2 != null && a2.isLoaded()) {
            return a2;
        }
        this.bTI = a2 = this.bTn.aK(b2);
        return a2;
    }

    public boolean Nd() {
        return this.V(this.aca);
    }

    private boolean V(b b2) {
        int n2 = b2.wu();
        int n3 = n2 + 15;
        return this.U(b2).aW(n2, n3);
    }

    public void a(ao ao2, RenderChunk renderChunk) {
        this.bTJ[ao2.ordinal()] = renderChunk;
        this.bTK[ao2.ordinal()] = renderChunk;
    }

    public RenderChunk o(ao ao2) {
        if (!this.bTL) {
            this.Nf();
        }
        return this.bTK[ao2.ordinal()];
    }

    public RenderGlobal$ContainerLocalRenderInformation Ne() {
        return this.bTM;
    }

    private void Nf() {
        int n2 = this.yl().wt();
        int n3 = this.yl().wx();
        int n4 = ao.dws.ordinal();
        int n5 = ao.dwt.ordinal();
        int n6 = ao.dwu.ordinal();
        int n7 = ao.dwv.ordinal();
        this.bTK[n4] = this.bTJ[n4].yl().wx() == n3 - 16 ? this.bTJ[n4] : null;
        this.bTK[n5] = this.bTJ[n5].yl().wx() == n3 + 16 ? this.bTJ[n5] : null;
        this.bTK[n6] = this.bTJ[n6].yl().wt() == n2 - 16 ? this.bTJ[n6] : null;
        this.bTK[n7] = this.bTJ[n7].yl().wt() == n2 + 16 ? this.bTJ[n7] : null;
        this.bTL = true;
    }

    public boolean a(ICamera iCamera, int n2) {
        return this.Ng().b(iCamera, n2) || iCamera.k(this.jJ);
    }

    public a Ng() {
        if (this.bTN == null) {
            a a2;
            b b2 = this.yl();
            int n2 = b2.wt();
            int n3 = b2.wu();
            int n4 = b2.wx();
            int n5 = 5;
            int n6 = n2 >> 5 << 5;
            int n7 = n3 >> 5 << 5;
            int n8 = n4 >> 5 << 5;
            if ((n6 != n2 || n7 != n3 || n8 != n4) && (a2 = this.bTo.R(new b(n6, n7, n8)).Ng()) != null && a2.dtH == (double)n6 && a2.dtI == (double)n7 && a2.dtJ == (double)n8) {
                this.bTN = a2;
            }
            if (this.bTN == null) {
                int n9 = 32;
                this.bTN = new a(n6, n7, n8, n6 + 32, n7 + 32, n8 + 32);
            }
        }
        return this.bTN;
    }

    public String toString() {
        return "pos: " + String.valueOf(this.yl()) + ", frameIndex: " + this.bTx;
    }

    static {
        bTA = av.values();
    }
}

