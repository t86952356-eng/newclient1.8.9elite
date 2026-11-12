/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.k;
import net.minecraft.client.model.x;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.src.a;
import net.minecraft.tileentity.m;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class r
extends h {
    public r() {
        super(m.class, "chest_large", 0.0f);
    }

    @Override
    public d aCn() {
        return new x();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof k)) {
            return null;
        }
        k k2 = (k)d2;
        return string.equals("lid") ? k2.bzd : (string.equals("base") ? k2.bze : (string.equals("knob") ? k2.bzf : null));
    }

    @Override
    public String[] aCo() {
        return new String[]{"lid", "base", "knob"};
    }

    @Override
    public g a(d d2, float f2) {
        TileEntityRendererDispatcher tileEntityRendererDispatcher = TileEntityRendererDispatcher.caV;
        TileEntityChestRenderer tileEntityChestRenderer = tileEntityRendererDispatcher.h(m.class);
        if (!(tileEntityChestRenderer instanceof TileEntityChestRenderer)) {
            return null;
        }
        if (tileEntityChestRenderer.Np() == null) {
            tileEntityChestRenderer = new TileEntityChestRenderer();
            tileEntityChestRenderer.a(tileEntityRendererDispatcher);
        }
        if (!net.optifine.reflect.g.esI.aDA()) {
            a.warn("Field not found: TileEntityChestRenderer.largeChest");
            return null;
        }
        net.optifine.reflect.g.a((Object)tileEntityChestRenderer, net.optifine.reflect.g.esI, (Object)d2);
        return tileEntityChestRenderer;
    }
}

