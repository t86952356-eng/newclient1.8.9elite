/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderBlaze;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class m
extends h {
    public m() {
        super(net.minecraft.entity.monster.a.class, "blaze", 0.5f);
    }

    @Override
    public d aCn() {
        return new net.minecraft.client.model.g();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof net.minecraft.client.model.g)) {
            return null;
        }
        net.minecraft.client.model.g g2 = (net.minecraft.client.model.g)d2;
        if (string.equals("head")) {
            return (ag)net.optifine.reflect.g.a(g2, net.optifine.reflect.g.eru);
        }
        String string2 = "stick";
        if (string.startsWith("stick")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(g2, net.optifine.reflect.g.erv);
            if (agArray == null) {
                return null;
            }
            String string3 = string.substring("stick".length());
            int n2 = a.x(string3, -1);
            return --n2 >= 0 && n2 < agArray.length ? agArray[n2] : null;
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "stick1", "stick2", "stick3", "stick4", "stick5", "stick6", "stick7", "stick8", "stick9", "stick10", "stick11", "stick12"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderBlaze renderBlaze = new RenderBlaze(renderManager);
        renderBlaze.bWL = d2;
        renderBlaze.bUm = f2;
        return renderBlaze;
    }
}

