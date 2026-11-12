/*
 * Decompiled with CFR 0.152.
 */
package rise.module.impl.render;

import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.bv;
import java.awt.Color;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.c;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.Render3DEvent;
import rise.module.Category;
import rise.module.Module;
import rise.module.ModuleInfo;

@ModuleInfo(aliases={"module.render.tracers.name"}, description="module.render.tracers.description", category=Category.RENDER)
public final class Tracers
extends Module {
    @EventLink
    public final Listener<Render3DEvent> aqD = render3DEvent -> {
        if (Tracers.aER.aIY.chO) {
            return;
        }
        GlStateManager.JV();
        GlStateManager.JU();
        Tracers.aER.bgT.ao(Tracers.aER.bgC.bWY);
        for (c c2 : bv.b(true, true, false, false, false)) {
            if (c2 == Tracers.aER.bgK || c2.csb || Client.a.x().a(c2)) continue;
            double d2 = c2.csh + (c2.gW - c2.csh) * (double)render3DEvent.getPartialTicks();
            double d3 = c2.csi + (c2.gX - c2.csi) * (double)render3DEvent.getPartialTicks() + (double)1.62f;
            double d4 = c2.csj + (c2.gY - c2.csj) * (double)render3DEvent.getPartialTicks();
            Color color = ais.d(ais.a(this.rP().rR(), this.rP().rQ(), Math.min(1.0f, Tracers.aER.bgK.S(c2) / 50.0f)), 128);
            aER.BF();
            aER.BF();
            double d5 = RenderManager.bVB + (double)Tracers.aER.bgK.getEyeHeight();
            aER.BF();
            ait.a(RenderManager.bVA, d5, RenderManager.bVC, d2, d3, d4, color, 1.5f);
        }
        GlStateManager.JX();
        GlStateManager.JW();
    };
}

