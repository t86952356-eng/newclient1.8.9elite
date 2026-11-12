/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ft;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;

@gl(aliases={"module.render.tracers.name"}, description="module.render.tracers.description", category=gj.RENDER)
public final class ya
extends gi {
    @dm
    public final dk<ft> aqD = ft2 -> {
        if (ya.aER.aIY.chO) {
            return;
        }
        GlStateManager.JV();
        GlStateManager.JU();
        ya.aER.bgT.ao(ya.aER.bgC.bWY);
        for (c c2 : bv.b(true, true, false, false, false)) {
            if (c2 == ya.aER.bgK || c2.csb || a.a.x().a(c2)) continue;
            double d2 = c2.csh + (c2.gW - c2.csh) * (double)ft2.getPartialTicks();
            double d3 = c2.csi + (c2.gX - c2.csi) * (double)ft2.getPartialTicks() + (double)1.62f;
            double d4 = c2.csj + (c2.gY - c2.csj) * (double)ft2.getPartialTicks();
            Color color = ais.d(ais.a(this.rP().rR(), this.rP().rQ(), Math.min(1.0f, ya.aER.bgK.S(c2) / 50.0f)), 128);
            aER.BF();
            aER.BF();
            double d5 = RenderManager.bVB + (double)ya.aER.bgK.getEyeHeight();
            aER.BF();
            ait.a(RenderManager.bVA, d5, RenderManager.bVC, d2, d3, d4, color, 1.5f);
        }
        GlStateManager.JX();
        GlStateManager.JW();
    };
}

