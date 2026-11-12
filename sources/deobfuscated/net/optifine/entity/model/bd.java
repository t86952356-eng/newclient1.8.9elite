/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.am;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.RenderWitherSkull;
import net.minecraft.entity.projectile.j;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class bd
extends h {
    public bd() {
        super(j.class, "wither_skull", 0.0f);
    }

    @Override
    public d aCn() {
        return new am();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof am)) {
            return null;
        }
        am am2 = (am)d2;
        return string.equals("head") ? am2.bCl : null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"head"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderWitherSkull renderWitherSkull = new RenderWitherSkull(renderManager);
        if (!net.optifine.reflect.g.esz.aDA()) {
            a.warn("Field not found: RenderWitherSkull_model");
            return null;
        }
        net.optifine.reflect.g.a((Object)renderWitherSkull, net.optifine.reflect.g.esz, (Object)d2);
        renderWitherSkull.bUm = f2;
        return renderWitherSkull;
    }
}

