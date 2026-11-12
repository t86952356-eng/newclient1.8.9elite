/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import hackclient.rise.bf;
import hackclient.rise.by;
import hackclient.rise.ce;
import net.minecraft.client.entity.a;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.r;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class LayerCape
implements LayerRenderer<a> {
    private final RenderPlayer bXq;
    private final cm bXr = new cm("rise/cape/RiseCapeBlue.png");
    private final cm bXs = new cm("rise/cape/RiseCapeRed.png");
    private final cm bXt = new cm("rise/cape/RiseCapeGreen.png");
    private final cm bXu = new cm("rise/cape/RiseCapeGato.png");

    public LayerCape(RenderPlayer renderPlayer) {
        this.bXq = renderPlayer;
    }

    public void a(a a2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        by by2 = bf.dc.get(a2.xU());
        if (a2.Da() && !a2.isInvisible() && by2 != null) {
            if (!by2.bT()) {
                switch (by2.bV()) {
                    case gy: {
                        this.bXq.a(this.bXs);
                        break;
                    }
                    case gx: {
                        this.bXq.a(this.bXt);
                        break;
                    }
                    case gz: {
                        this.bXq.a(this.bXu);
                        break;
                    }
                    default: {
                        this.bXq.a(this.bXr);
                        break;
                    }
                }
            } else if (!by2.ca()) {
                ce.hb.put(by2.bX(), by2.bY());
            } else {
                this.bXq.a(by2.bS());
            }
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JV();
            GlStateManager.j(0.0f, 0.0f, 0.125f);
            double d2 = a2.cIe + (a2.cIh - a2.cIe) * (double)f4 - (a2.crF + (a2.gW - a2.crF) * (double)f4);
            double d3 = a2.cIf + (a2.cIi - a2.cIf) * (double)f4 - (a2.crG + (a2.gX - a2.crG) * (double)f4);
            double d4 = a2.cIg + (a2.cIj - a2.cIg) * (double)f4 - (a2.crH + (a2.gY - a2.crH) * (double)f4);
            float f9 = a2.crM + (a2.pl - a2.crM) * f4;
            double d5 = bt.bx(f9 * (float)Math.PI / 180.0f);
            double d6 = -bt.bB(f9 * (float)Math.PI / 180.0f);
            float f10 = (float)d3 * 10.0f;
            f10 = bt.I(f10, -6.0f, 32.0f);
            float f11 = (float)(d2 * d5 + d4 * d6) * 100.0f;
            float f12 = (float)(d2 * d6 - d4 * d5) * 100.0f;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 > 165.0f) {
                f11 = 165.0f;
            }
            if (f10 < -5.0f) {
                f10 = -5.0f;
            }
            float f13 = a2.cIb + (a2.cIc - a2.cIb) * f4;
            f10 += bt.bx((a2.csc + (a2.csd - a2.csc) * f4) * 6.0f) * 32.0f * f13;
            if (a2.isSneaking()) {
                f10 += 25.0f;
                GlStateManager.j(0.0f, 0.142f, -0.0178f);
            }
            GlStateManager.d(6.0f + f11 / 2.0f + f10, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(f12 / 2.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.d(-f12 / 2.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.d(180.0f, 0.0f, 1.0f, 0.0f);
            this.bXq.Nz().Z(0.0625f);
            GlStateManager.JW();
        }
    }

    @Override
    public boolean NH() {
        return false;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((a)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

