/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.v;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.src.a;
import net.minecraft.tileentity.aj;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ac
extends h {
    public ac() {
        super(aj.class, "head_humanoid", 0.0f);
    }

    @Override
    public d aCn() {
        return new v();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof v)) {
            return null;
        }
        v v2 = (v)d2;
        return string.equals("head") ? v2.bCl : (string.equals("head2") ? (!net.optifine.reflect.g.erq.aDA() ? null : (ag)net.optifine.reflect.g.a(v2, net.optifine.reflect.g.erq)) : null);
    }

    @Override
    public String[] aCo() {
        return new String[]{"head"};
    }

    @Override
    public g a(d d2, float f2) {
        TileEntityRendererDispatcher tileEntityRendererDispatcher = TileEntityRendererDispatcher.caV;
        TileEntitySkullRenderer tileEntitySkullRenderer = tileEntityRendererDispatcher.h(aj.class);
        if (!(tileEntitySkullRenderer instanceof TileEntitySkullRenderer)) {
            return null;
        }
        if (tileEntitySkullRenderer.Np() == null) {
            tileEntitySkullRenderer = new TileEntitySkullRenderer();
            ((TileEntitySpecialRenderer)tileEntitySkullRenderer).a(tileEntityRendererDispatcher);
        }
        if (!net.optifine.reflect.g.esV.aDA()) {
            a.warn("Field not found: TileEntitySkullRenderer.humanoidHead");
            return null;
        }
        net.optifine.reflect.g.a((Object)tileEntitySkullRenderer, net.optifine.reflect.g.esV, (Object)d2);
        return tileEntitySkullRenderer;
    }
}

