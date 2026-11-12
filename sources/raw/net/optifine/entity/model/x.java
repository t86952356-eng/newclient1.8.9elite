/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.p;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.RenderEnderCrystal;
import net.minecraft.entity.item.c;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class x
extends h {
    public x() {
        this("end_crystal");
    }

    protected x(String string) {
        super(c.class, string, 0.5f);
    }

    @Override
    public d aCn() {
        return new p(0.0f, true);
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof p)) {
            return null;
        }
        p p2 = (p)d2;
        return string.equals("cube") ? (ag)net.optifine.reflect.g.a((Object)p2, net.optifine.reflect.g.erC, 0) : (string.equals("glass") ? (ag)net.optifine.reflect.g.a((Object)p2, net.optifine.reflect.g.erC, 1) : (string.equals("base") ? (ag)net.optifine.reflect.g.a((Object)p2, net.optifine.reflect.g.erC, 2) : null));
    }

    @Override
    public String[] aCo() {
        return new String[]{"cube", "glass", "base"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        Render render = renderManager.Nx().get(c.class);
        if (!(render instanceof RenderEnderCrystal)) {
            a.warn("Not an instance of RenderEnderCrystal: " + String.valueOf(render));
            return null;
        }
        RenderEnderCrystal renderEnderCrystal = (RenderEnderCrystal)render;
        if (!net.optifine.reflect.g.erE.aDA()) {
            a.warn("Field not found: RenderEnderCrystal.modelEnderCrystal");
            return null;
        }
        net.optifine.reflect.g.a((Object)renderEnderCrystal, net.optifine.reflect.g.erE, (Object)d2);
        renderEnderCrystal.bUm = f2;
        return renderEnderCrystal;
    }
}

