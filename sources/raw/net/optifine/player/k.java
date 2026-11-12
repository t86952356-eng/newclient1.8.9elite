/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.player;

import java.util.Map;
import java.util.Set;
import net.minecraft.client.model.ad;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.r;
import net.minecraft.src.a;
import net.optifine.player.g;

public class k
implements LayerRenderer {
    private RenderPlayer enb = null;

    public k(RenderPlayer renderPlayer) {
        this.enb = renderPlayer;
    }

    public void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.c(r2, f8, f4);
    }

    protected void c(r r2, float f2, float f3) {
        if (a.aoz() && r2 instanceof net.minecraft.client.entity.a) {
            net.minecraft.client.entity.a a2 = (net.minecraft.client.entity.a)r2;
            GlStateManager.e(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.JT();
            GlStateManager.JH();
            ad ad2 = this.enb.Nz();
            g.a(ad2, a2, f2, f3);
            GlStateManager.JI();
        }
    }

    @Override
    public boolean NH() {
        return false;
    }

    public static void t(Map map) {
        Set set = map.keySet();
        boolean bl2 = false;
        for (Object k2 : set) {
            Object v2 = map.get(k2);
            if (!(v2 instanceof RenderPlayer)) continue;
            RenderPlayer renderPlayer = (RenderPlayer)v2;
            renderPlayer.a(new k(renderPlayer));
            bl2 = true;
        }
        if (!bl2) {
            a.warn("PlayerItemsLayer not registered");
        }
    }
}

