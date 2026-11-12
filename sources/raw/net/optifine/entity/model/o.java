/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.i;
import net.minecraft.client.renderer.tileentity.TileEntityEnchantmentTableRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.src.a;
import net.minecraft.tileentity.u;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class o
extends h {
    public o() {
        super(u.class, "book", 0.0f);
    }

    @Override
    public d aCn() {
        return new i();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof i)) {
            return null;
        }
        i i2 = (i)d2;
        return string.equals("cover_right") ? i2.byN : (string.equals("cover_left") ? i2.byO : (string.equals("pages_right") ? i2.byP : (string.equals("pages_left") ? i2.byQ : (string.equals("flipping_page_right") ? i2.byR : (string.equals("flipping_page_left") ? i2.byS : (string.equals("book_spine") ? i2.byT : null))))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"cover_right", "cover_left", "pages_right", "pages_left", "flipping_page_right", "flipping_page_left", "book_spine"};
    }

    @Override
    public g a(d d2, float f2) {
        TileEntityRendererDispatcher tileEntityRendererDispatcher = TileEntityRendererDispatcher.caV;
        TileEntityEnchantmentTableRenderer tileEntityEnchantmentTableRenderer = tileEntityRendererDispatcher.h(u.class);
        if (!(tileEntityEnchantmentTableRenderer instanceof TileEntityEnchantmentTableRenderer)) {
            return null;
        }
        if (tileEntityEnchantmentTableRenderer.Np() == null) {
            tileEntityEnchantmentTableRenderer = new TileEntityEnchantmentTableRenderer();
            tileEntityEnchantmentTableRenderer.a(tileEntityRendererDispatcher);
        }
        if (!net.optifine.reflect.g.esM.aDA()) {
            a.warn("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
            return null;
        }
        net.optifine.reflect.g.a((Object)tileEntityEnchantmentTableRenderer, net.optifine.reflect.g.esM, (Object)d2);
        return tileEntityEnchantmentTableRenderer;
    }
}

