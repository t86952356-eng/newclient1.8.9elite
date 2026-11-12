/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.d;
import net.minecraft.client.model.y;
import net.minecraft.client.renderer.entity.RenderLeashKnot;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.m;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ag
extends h {
    public ag() {
        super(m.class, "lead_knot", 0.0f);
    }

    @Override
    public d aCn() {
        return new y();
    }

    @Override
    public net.minecraft.client.model.ag a(d d2, String string) {
        if (!(d2 instanceof y)) {
            return null;
        }
        y y2 = (y)d2;
        return string.equals("knot") ? y2.bAN : null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"knot"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderLeashKnot renderLeashKnot = new RenderLeashKnot(renderManager);
        if (!net.optifine.reflect.g.erS.aDA()) {
            a.warn("Field not found: RenderLeashKnot.leashKnotModel");
            return null;
        }
        net.optifine.reflect.g.a((Object)renderLeashKnot, net.optifine.reflect.g.erS, (Object)d2);
        renderLeashKnot.bUm = f2;
        return renderLeashKnot;
    }
}

