/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.src.a;
import net.minecraft.util.ao;
import net.minecraft.util.av;
import net.minecraft.util.bt;
import net.minecraft.world.b;
import net.minecraft.world.w;
import net.optifine.render.i;

public class ViewFrustum {
    protected final RenderGlobal bPI;
    protected final w bPJ;
    protected int bPK;
    protected int bPL;
    protected int bPM;
    public RenderChunk[] bPN;
    private final Map<b, i[]> bPO = new HashMap<b, i[]>();

    public ViewFrustum(w w2, int n2, RenderGlobal renderGlobal, IRenderChunkFactory iRenderChunkFactory) {
        this.bPI = renderGlobal;
        this.bPJ = w2;
        this.dj(n2);
        this.a(iRenderChunkFactory);
    }

    protected void a(IRenderChunkFactory iRenderChunkFactory) {
        net.minecraft.util.b b2;
        int n2;
        int n3;
        int n4 = this.bPL * this.bPK * this.bPM;
        this.bPN = new RenderChunk[n4];
        int n5 = 0;
        for (n3 = 0; n3 < this.bPL; ++n3) {
            for (int i2 = 0; i2 < this.bPK; ++i2) {
                for (n2 = 0; n2 < this.bPM; ++n2) {
                    int n6 = (n2 * this.bPK + i2) * this.bPL + n3;
                    b2 = new net.minecraft.util.b(n3 * 16, i2 * 16, n2 * 16);
                    this.bPN[n6] = iRenderChunkFactory.a(this.bPJ, this.bPI, b2, n5++);
                    if (!a.aph() || !a.apg()) continue;
                    this.b(this.bPN[n6]);
                }
            }
        }
        for (n3 = 0; n3 < this.bPN.length; ++n3) {
            RenderChunk renderChunk = this.bPN[n3];
            for (n2 = 0; n2 < ao.dwD.length; ++n2) {
                ao ao2 = ao.dwD[n2];
                b2 = renderChunk.m(ao2);
                RenderChunk renderChunk2 = this.R(b2);
                renderChunk.a(ao2, renderChunk2);
            }
        }
    }

    public void Ls() {
        for (RenderChunk renderChunk : this.bPN) {
            renderChunk.Ls();
        }
        this.Lt();
    }

    protected void dj(int n2) {
        int n3;
        this.bPL = n3 = n2 * 2 + 1;
        this.bPK = 16;
        this.bPM = n3;
    }

    public void q(double d2, double d3) {
        int n2 = bt.aF(d2) - 8;
        int n3 = bt.aF(d3) - 8;
        int n4 = this.bPL * 16;
        for (int i2 = 0; i2 < this.bPL; ++i2) {
            int n5 = this.v(n2, n4, i2);
            for (int i3 = 0; i3 < this.bPM; ++i3) {
                int n6 = this.v(n3, n4, i3);
                for (int i4 = 0; i4 < this.bPK; ++i4) {
                    net.minecraft.util.b b2;
                    int n7 = i4 * 16;
                    RenderChunk renderChunk = this.bPN[(i3 * this.bPK + i4) * this.bPL + i2];
                    net.minecraft.util.b b3 = renderChunk.yl();
                    if (b3.wt() == n5 && b3.wu() == n7 && b3.wx() == n6 || (b2 = new net.minecraft.util.b(n5, n7, n6)).equals(renderChunk.yl())) continue;
                    renderChunk.S(b2);
                }
            }
        }
    }

    private int v(int n2, int n3, int n4) {
        int n5 = n4 * 16;
        int n6 = n5 - n2 + n3 / 2;
        if (n6 < 0) {
            n6 -= n3 - 1;
        }
        return n5 - n6 / n3 * n3;
    }

    public void e(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = bt.aF(n2, 16);
        int n9 = bt.aF(n3, 16);
        int n10 = bt.aF(n4, 16);
        int n11 = bt.aF(n5, 16);
        int n12 = bt.aF(n6, 16);
        int n13 = bt.aF(n7, 16);
        for (int i2 = n8; i2 <= n11; ++i2) {
            int n14 = i2 % this.bPL;
            if (n14 < 0) {
                n14 += this.bPL;
            }
            for (int i3 = n9; i3 <= n12; ++i3) {
                int n15 = i3 % this.bPK;
                if (n15 < 0) {
                    n15 += this.bPK;
                }
                for (int i4 = n10; i4 <= n13; ++i4) {
                    int n16 = i4 % this.bPM;
                    if (n16 < 0) {
                        n16 += this.bPM;
                    }
                    int n17 = (n16 * this.bPK + n15) * this.bPL + n14;
                    RenderChunk renderChunk = this.bPN[n17];
                    renderChunk.ap(true);
                }
            }
        }
    }

    public RenderChunk R(net.minecraft.util.b b2) {
        int n2 = b2.wt() >> 4;
        int n3 = b2.wu() >> 4;
        int n4 = b2.wx() >> 4;
        if (n3 >= 0 && n3 < this.bPK) {
            if ((n2 %= this.bPL) < 0) {
                n2 += this.bPL;
            }
            if ((n4 %= this.bPM) < 0) {
                n4 += this.bPM;
            }
            int n5 = (n4 * this.bPK + n3) * this.bPL + n2;
            return this.bPN[n5];
        }
        return null;
    }

    private void b(RenderChunk renderChunk) {
        int n2;
        net.minecraft.util.b b2 = renderChunk.yl();
        int n3 = b2.wt() >> 8 << 8;
        int n4 = b2.wx() >> 8 << 8;
        b b3 = new b(n3, n4);
        av[] avArray = RenderChunk.bTA;
        i[] iArray = this.bPO.get(b3);
        if (iArray == null) {
            iArray = new i[avArray.length];
            for (n2 = 0; n2 < avArray.length; ++n2) {
                iArray[n2] = new i(avArray[n2]);
            }
            this.bPO.put(b3, iArray);
        }
        for (n2 = 0; n2 < avArray.length; ++n2) {
            i i2 = iArray[n2];
            if (i2 == null) continue;
            renderChunk.du(n2).a(i2);
        }
    }

    public void Lt() {
        for (b b2 : this.bPO.keySet()) {
            i[] iArray = this.bPO.get(b2);
            for (int i2 = 0; i2 < iArray.length; ++i2) {
                i i3 = iArray[i2];
                if (i3 != null) {
                    i3.OK();
                }
                iArray[i2] = null;
            }
        }
        this.bPO.clear();
    }
}

