/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.aj;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.src.a;
import net.minecraft.tileentity.ag;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class at
extends h {
    public at() {
        super(ag.class, "sign", 0.0f);
    }

    @Override
    public d aCn() {
        return new aj();
    }

    @Override
    public net.minecraft.client.model.ag a(d d2, String string) {
        if (!(d2 instanceof aj)) {
            return null;
        }
        aj aj2 = (aj)d2;
        return string.equals("board") ? aj2.bCe : (string.equals("stick") ? aj2.bCf : null);
    }

    @Override
    public String[] aCo() {
        return new String[]{"board", "stick"};
    }

    @Override
    public g a(d d2, float f2) {
        TileEntityRendererDispatcher tileEntityRendererDispatcher = TileEntityRendererDispatcher.caV;
        TileEntitySignRenderer tileEntitySignRenderer = tileEntityRendererDispatcher.h(ag.class);
        if (!(tileEntitySignRenderer instanceof TileEntitySignRenderer)) {
            return null;
        }
        if (tileEntitySignRenderer.Np() == null) {
            tileEntitySignRenderer = new TileEntitySignRenderer();
            tileEntitySignRenderer.a(tileEntityRendererDispatcher);
        }
        if (!net.optifine.reflect.g.esS.aDA()) {
            a.warn("Field not found: TileEntitySignRenderer.model");
            return null;
        }
        net.optifine.reflect.g.a((Object)tileEntitySignRenderer, net.optifine.reflect.g.esS, (Object)d2);
        return tileEntitySignRenderer;
    }
}

