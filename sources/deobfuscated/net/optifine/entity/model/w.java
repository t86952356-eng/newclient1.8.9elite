/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.k;
import net.minecraft.client.renderer.tileentity.TileEntityEnderChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class w
extends h {
    public w() {
        super(net.minecraft.tileentity.w.class, "ender_chest", 0.0f);
    }

    @Override
    public d aCn() {
        return new k();
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
        TileEntityEnderChestRenderer tileEntityEnderChestRenderer = tileEntityRendererDispatcher.h(net.minecraft.tileentity.w.class);
        if (!(tileEntityEnderChestRenderer instanceof TileEntityEnderChestRenderer)) {
            return null;
        }
        if (tileEntityEnderChestRenderer.Np() == null) {
            tileEntityEnderChestRenderer = new TileEntityEnderChestRenderer();
            tileEntityEnderChestRenderer.a(tileEntityRendererDispatcher);
        }
        if (!net.optifine.reflect.g.esO.aDA()) {
            a.warn("Field not found: TileEntityEnderChestRenderer.modelChest");
            return null;
        }
        net.optifine.reflect.g.a((Object)tileEntityEnderChestRenderer, net.optifine.reflect.g.esO, (Object)d2);
        return tileEntityEnderChestRenderer;
    }
}

