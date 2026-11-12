/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.c;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.tileentity.TileEntityBannerRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class j
extends h {
    public j() {
        super(net.minecraft.tileentity.h.class, "banner", 0.0f);
    }

    @Override
    public d aCn() {
        return new c();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof c)) {
            return null;
        }
        c c2 = (c)d2;
        return string.equals("slate") ? c2.byl : (string.equals("stand") ? c2.bym : (string.equals("top") ? c2.byn : null));
    }

    @Override
    public String[] aCo() {
        return new String[]{"slate", "stand", "top"};
    }

    @Override
    public g a(d d2, float f2) {
        TileEntityRendererDispatcher tileEntityRendererDispatcher = TileEntityRendererDispatcher.caV;
        TileEntityBannerRenderer tileEntityBannerRenderer = tileEntityRendererDispatcher.h(net.minecraft.tileentity.h.class);
        if (!(tileEntityBannerRenderer instanceof TileEntityBannerRenderer)) {
            return null;
        }
        if (tileEntityBannerRenderer.Np() == null) {
            tileEntityBannerRenderer = new TileEntityBannerRenderer();
            tileEntityBannerRenderer.a(tileEntityRendererDispatcher);
        }
        if (!net.optifine.reflect.g.esB.aDA()) {
            a.warn("Field not found: TileEntityBannerRenderer.bannerModel");
            return null;
        }
        net.optifine.reflect.g.a((Object)tileEntityBannerRenderer, net.optifine.reflect.g.esB, (Object)d2);
        return tileEntityBannerRenderer;
    }
}

