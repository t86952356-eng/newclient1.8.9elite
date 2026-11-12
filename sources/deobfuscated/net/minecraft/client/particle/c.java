/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.particle;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ab;
import net.minecraft.client.particle.ad;
import net.minecraft.client.particle.ae;
import net.minecraft.client.particle.ag;
import net.minecraft.client.particle.ai;
import net.minecraft.client.particle.al;
import net.minecraft.client.particle.an;
import net.minecraft.client.particle.ap;
import net.minecraft.client.particle.ar;
import net.minecraft.client.particle.as;
import net.minecraft.client.particle.au;
import net.minecraft.client.particle.aw;
import net.minecraft.client.particle.ay;
import net.minecraft.client.particle.b;
import net.minecraft.client.particle.ba;
import net.minecraft.client.particle.bb;
import net.minecraft.client.particle.be;
import net.minecraft.client.particle.bg;
import net.minecraft.client.particle.bi;
import net.minecraft.client.particle.bk;
import net.minecraft.client.particle.bm;
import net.minecraft.client.particle.bo;
import net.minecraft.client.particle.bp;
import net.minecraft.client.particle.bq;
import net.minecraft.client.particle.br;
import net.minecraft.client.particle.bs;
import net.minecraft.client.particle.bu;
import net.minecraft.client.particle.bw;
import net.minecraft.client.particle.bx;
import net.minecraft.client.particle.bz;
import net.minecraft.client.particle.e;
import net.minecraft.client.particle.f;
import net.minecraft.client.particle.h;
import net.minecraft.client.particle.j;
import net.minecraft.client.particle.k;
import net.minecraft.client.particle.l;
import net.minecraft.client.particle.n;
import net.minecraft.client.particle.p;
import net.minecraft.client.particle.r;
import net.minecraft.client.particle.s;
import net.minecraft.client.particle.u;
import net.minecraft.client.particle.v;
import net.minecraft.client.particle.w;
import net.minecraft.client.particle.y;
import net.minecraft.client.particle.z;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.bt;
import net.minecraft.util.ce;
import net.minecraft.util.cm;
import net.optifine.reflect.g;

public class c {
    private static final cm bFI = new cm("textures/particle/particles.png");
    protected net.minecraft.world.w baU;
    private List<ae>[][] bFJ = new List[4][];
    private final List<bb> bFK = Lists.newArrayList();
    private final TextureManager bFL;
    private final Random bFM = new Random();
    private final Map<Integer, bx> bFN = Maps.newHashMap();

    public c(net.minecraft.world.w w2, TextureManager textureManager) {
        this.baU = w2;
        this.bFL = textureManager;
        for (int i2 = 0; i2 < 4; ++i2) {
            this.bFJ[i2] = new List[2];
            for (int i3 = 0; i3 < 2; ++i3) {
                this.bFJ[i2][i3] = Lists.newArrayList();
            }
        }
        this.Is();
    }

    private void Is() {
        this.a(net.minecraft.util.as.dwW.asY(), new ad());
        this.a(net.minecraft.util.as.dxa.asY(), new n());
        this.a(net.minecraft.util.as.dxb.asY(), new bu());
        this.a(net.minecraft.util.as.dxc.asY(), new al());
        this.a(net.minecraft.util.as.dxJ.asY(), new bg());
        this.a(net.minecraft.util.as.dxd.asY(), new bw());
        this.a(net.minecraft.util.as.dxe.asY(), new e());
        this.a(net.minecraft.util.as.dxf.asY(), new r());
        this.a(net.minecraft.util.as.dxg.asY(), new s());
        this.a(net.minecraft.util.as.dxh.asY(), new bk());
        this.a(net.minecraft.util.as.dxi.asY(), new u());
        this.a(net.minecraft.util.as.dxj.asY(), new bp());
        this.a(net.minecraft.util.as.dxk.asY(), new bq());
        this.a(net.minecraft.util.as.dxl.asY(), new br());
        this.a(net.minecraft.util.as.dxm.asY(), new bo());
        this.a(net.minecraft.util.as.dxn.asY(), new bs());
        this.a(net.minecraft.util.as.dxo.asY(), new z());
        this.a(net.minecraft.util.as.dxp.asY(), new y());
        this.a(net.minecraft.util.as.dxq.asY(), new ar());
        this.a(net.minecraft.util.as.dxr.asY(), new f());
        this.a(net.minecraft.util.as.dxs.asY(), new e());
        this.a(net.minecraft.util.as.dxt.asY(), new ba());
        this.a(net.minecraft.util.as.dxu.asY(), new be());
        this.a(net.minecraft.util.as.dxv.asY(), new ab());
        this.a(net.minecraft.util.as.dxw.asY(), new an());
        this.a(net.minecraft.util.as.dxx.asY(), new ay());
        this.a(net.minecraft.util.as.dxy.asY(), new ap());
        this.a(net.minecraft.util.as.dxz.asY(), new p());
        this.a(net.minecraft.util.as.dxA.asY(), new bi());
        this.a(net.minecraft.util.as.dxB.asY(), new l());
        this.a(net.minecraft.util.as.dxC.asY(), new bm());
        this.a(net.minecraft.util.as.dxD.asY(), new k());
        this.a(net.minecraft.util.as.dxE.asY(), new as());
        this.a(net.minecraft.util.as.dxF.asY(), new b());
        this.a(net.minecraft.util.as.dxG.asY(), new j());
        this.a(net.minecraft.util.as.dxH.asY(), new w());
        this.a(net.minecraft.util.as.dxI.asY(), new h());
        this.a(net.minecraft.util.as.dwY.asY(), new au());
        this.a(net.minecraft.util.as.dwX.asY(), new aw());
        this.a(net.minecraft.util.as.dwZ.asY(), new ag());
        this.a(net.minecraft.util.as.dxL.asY(), new bz());
    }

    public void a(int n2, bx bx2) {
        this.bFN.put(n2, bx2);
    }

    public void a(net.minecraft.entity.c c2, net.minecraft.util.as as2) {
        this.bFK.add(new bb(this.baU, c2, as2));
    }

    public ae a(int n2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        ae ae2;
        bx bx2 = this.bFN.get(n2);
        if (bx2 != null && (ae2 = bx2.a(n2, this.baU, d2, d3, d4, d5, d6, d7, nArray)) != null) {
            this.a(ae2);
            return ae2;
        }
        return null;
    }

    public void a(ae ae2) {
        if (ae2 != null && (!(ae2 instanceof ai) || a.anM())) {
            int n2;
            int n3 = ae2.Ir();
            int n4 = n2 = ae2.mt() != 1.0f ? 0 : 1;
            if (this.bFJ[n3][n2].size() >= 4000) {
                try {
                    this.bFJ[n3][n2].remove(0);
                }
                catch (NullPointerException nullPointerException) {
                    System.out.println("Effectrenderer 140");
                }
            }
            this.bFJ[n3][n2].add(ae2);
        }
    }

    public void It() {
        try {
            for (int i2 = 0; i2 < 4; ++i2) {
                this.cs(i2);
            }
            ArrayList arrayList = Lists.newArrayList();
            for (bb bb2 : this.bFK) {
                bb2.Dm();
                if (!bb2.csb) continue;
                arrayList.add(bb2);
            }
            this.bFK.removeAll(arrayList);
        }
        catch (Exception exception) {
            this.bFK.clear();
            this.bFJ = new List[4][];
            for (int i3 = 0; i3 < 4; ++i3) {
                this.bFJ[i3] = new List[2];
                for (int i4 = 0; i4 < 2; ++i4) {
                    this.bFJ[i3][i4] = Lists.newArrayList();
                }
            }
            this.Is();
        }
    }

    private void cs(int n2) {
        for (int i2 = 0; i2 < 2; ++i2) {
            this.r(this.bFJ[n2][i2]);
        }
    }

    private void r(List<ae> list) {
        ArrayList arrayList = Lists.newArrayList();
        long l2 = System.currentTimeMillis();
        int n2 = list.size();
        for (ae object : list) {
            this.b(object);
            if (object.csb) {
                arrayList.add(object);
            }
            --n2;
            if (System.currentTimeMillis() <= l2 + 20L) continue;
            break;
        }
        if (n2 > 0) {
            Iterator<ae> iterator = list.iterator();
            for (int i2 = n2; iterator.hasNext() && i2 > 0; --i2) {
                ae ae2 = iterator.next();
                ae2.Tt();
                iterator.remove();
            }
        }
        list.removeAll(arrayList);
    }

    private void b(ae ae2) {
        ae2.Dm();
    }

    public void b(net.minecraft.entity.c c2, float f2) {
        try {
            float f3 = ActiveRenderInfo.IJ();
            float f4 = ActiveRenderInfo.IL();
            float f5 = ActiveRenderInfo.IM();
            float f6 = ActiveRenderInfo.IN();
            float f7 = ActiveRenderInfo.IK();
            ae.bGl = c2.csh + (c2.gW - c2.csh) * (double)f2;
            ae.bGm = c2.csi + (c2.gX - c2.csi) * (double)f2;
            ae.bGn = c2.csj + (c2.gY - c2.csj) * (double)f2;
            GlStateManager.tQ();
            GlStateManager.P(770, 771);
            GlStateManager.e(516, 0.003921569f);
            for (int i2 = 0; i2 < 3; ++i2) {
                for (int i3 = 0; i3 < 2; ++i3) {
                    if (this.bFJ[i2][i3].isEmpty()) continue;
                    switch (i3) {
                        case 0: {
                            GlStateManager.an(false);
                            break;
                        }
                        case 1: {
                            GlStateManager.an(true);
                        }
                    }
                    switch (i2) {
                        default: {
                            this.bFL.a(bFI);
                            break;
                        }
                        case 1: {
                            this.bFL.a(TextureMap.bZE);
                        }
                    }
                    GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
                    Tessellator tessellator = Tessellator.Li();
                    WorldRenderer worldRenderer = tessellator.Lj();
                    worldRenderer.a(7, DefaultVertexFormats.cbD);
                    for (int i4 = 0; i4 < this.bFJ[i2][i3].size(); ++i4) {
                        ae ae2 = this.bFJ[i2][i3].get(i4);
                        if (ae2 == null) continue;
                        ae2.a(worldRenderer, c2, f2, f3, f7, f4, f5, f6);
                    }
                    tessellator.pZ();
                }
            }
            GlStateManager.an(true);
            GlStateManager.tR();
            GlStateManager.e(516, 0.1f);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void c(net.minecraft.entity.c c2, float f2) {
        float f3 = bt.bB(c2.pl * ((float)Math.PI / 180));
        float f4 = bt.bx(c2.pl * ((float)Math.PI / 180));
        float f5 = -f4 * bt.bx(c2.pm * ((float)Math.PI / 180));
        float f6 = f3 * bt.bx(c2.pm * ((float)Math.PI / 180));
        float f7 = bt.bB(c2.pm * ((float)Math.PI / 180));
        for (int i2 = 0; i2 < 2; ++i2) {
            List<ae> list = this.bFJ[3][i2];
            if (list.isEmpty()) continue;
            Tessellator tessellator = Tessellator.Li();
            WorldRenderer worldRenderer = tessellator.Lj();
            for (ae ae2 : list) {
                ae2.a(worldRenderer, c2, f2, f3, f7, f4, f5, f6);
            }
        }
    }

    public void d(net.minecraft.world.w w2) {
        this.baU = w2;
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 2; ++i3) {
                this.bFJ[i2][i3].clear();
            }
        }
        this.bFK.clear();
    }

    public void b(net.minecraft.util.b b2, IBlockState iBlockState) {
        boolean bl2;
        if (g.eog.aDA() && g.eoq.aDA()) {
            Block block = iBlockState.df();
            bl2 = !g.b((Object)block, g.eoq, this.baU, b2) && !g.b((Object)block, g.eog, this.baU, b2, this);
        } else {
            boolean bl3 = bl2 = iBlockState.df().xb() != Material.beo;
        }
        if (bl2) {
            iBlockState = iBlockState.df().a(iBlockState, (net.minecraft.world.l)this.baU, b2);
            int n2 = 4;
            for (int i2 = 0; i2 < 4; ++i2) {
                for (int i3 = 0; i3 < 4; ++i3) {
                    for (int i4 = 0; i4 < 4; ++i4) {
                        double d2 = (double)b2.wt() + ((double)i2 + 0.5) / 4.0;
                        double d3 = (double)b2.wu() + ((double)i3 + 0.5) / 4.0;
                        double d4 = (double)b2.wx() + ((double)i4 + 0.5) / 4.0;
                        this.a(new v(this.baU, d2, d3, d4, d2 - (double)b2.wt() - 0.5, d3 - (double)b2.wu() - 0.5, d4 - (double)b2.wx() - 0.5, iBlockState).J(b2));
                    }
                }
            }
        }
    }

    public void g(net.minecraft.util.b b2, ao ao2) {
        IBlockState iBlockState = this.baU.L(b2);
        Block block = iBlockState.df();
        if (block.xg() != -1) {
            int n2 = b2.wt();
            int n3 = b2.wu();
            int n4 = b2.wx();
            float f2 = 0.1f;
            double d2 = (double)n2 + this.bFM.nextDouble() * (block.xq() - block.xp() - (double)0.2f) + (double)0.1f + block.xp();
            double d3 = (double)n3 + this.bFM.nextDouble() * (block.xs() - block.xr() - (double)0.2f) + (double)0.1f + block.xr();
            double d4 = (double)n4 + this.bFM.nextDouble() * (block.xu() - block.xt() - (double)0.2f) + (double)0.1f + block.xt();
            if (ao2 == ao.dwq) {
                d3 = (double)n3 + block.xr() - (double)0.1f;
            }
            if (ao2 == ao.dwr) {
                d3 = (double)n3 + block.xs() + (double)0.1f;
            }
            if (ao2 == ao.dws) {
                d4 = (double)n4 + block.xt() - (double)0.1f;
            }
            if (ao2 == ao.dwt) {
                d4 = (double)n4 + block.xu() + (double)0.1f;
            }
            if (ao2 == ao.dwu) {
                d2 = (double)n2 + block.xp() - (double)0.1f;
            }
            if (ao2 == ao.dwv) {
                d2 = (double)n2 + block.xq() + (double)0.1f;
            }
            this.a(new v(this.baU, d2, d3, d4, 0.0, 0.0, 0.0, iBlockState).J(b2).ah(0.2f).ai(0.6f));
        }
    }

    public void c(ae ae2) {
        this.a(ae2, 1, 0);
    }

    public void d(ae ae2) {
        this.a(ae2, 0, 1);
    }

    private void a(ae ae2, int n2, int n3) {
        for (int i2 = 0; i2 < 4; ++i2) {
            if (!this.bFJ[i2][n2].contains(ae2)) continue;
            this.bFJ[i2][n2].remove(ae2);
            this.bFJ[i2][n3].add(ae2);
        }
    }

    public String Iu() {
        int n2 = 0;
        try {
            for (int i2 = 0; i2 < 4; ++i2) {
                for (int i3 = 0; i3 < 2; ++i3) {
                    n2 += this.bFJ[i2][i3].size();
                }
            }
        }
        catch (NullPointerException nullPointerException) {
            return "" + n2;
        }
        return "" + n2;
    }

    public void a(net.minecraft.util.b b2, ce ce2) {
        IBlockState iBlockState = this.baU.L(b2);
        if (iBlockState != null) {
            boolean bl2 = g.b((Object)iBlockState.df(), g.eoh, this.baU, ce2, this);
            if (iBlockState != null && !bl2) {
                this.g(b2, ce2.dzv);
            }
        }
    }
}

