/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.z;
import net.minecraft.client.renderer.entity.RenderMagmaCube;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ah
extends h {
    public ah() {
        super(net.minecraft.entity.monster.z.class, "magma_cube", 0.5f);
    }

    @Override
    public d aCn() {
        return new z();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof z)) {
            return null;
        }
        z z2 = (z)d2;
        if (string.equals("core")) {
            return (ag)net.optifine.reflect.g.a(z2, net.optifine.reflect.g.erU);
        }
        String string2 = "segment";
        if (string.startsWith("segment")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(z2, net.optifine.reflect.g.erV);
            if (agArray == null) {
                return null;
            }
            String string3 = string.substring("segment".length());
            int n2 = a.x(string3, -1);
            return --n2 >= 0 && n2 < agArray.length ? agArray[n2] : null;
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"core", "segment1", "segment2", "segment3", "segment4", "segment5", "segment6", "segment7", "segment8"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderMagmaCube renderMagmaCube = new RenderMagmaCube(renderManager);
        renderMagmaCube.bWL = d2;
        renderMagmaCube.bUm = f2;
        return renderMagmaCube;
    }
}

