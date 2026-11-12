/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.au;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.entity.passive.ai;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class be
extends h {
    public be() {
        super(ai.class, "wolf", 0.5f);
    }

    @Override
    public d aCn() {
        return new au();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof au)) {
            return null;
        }
        au au2 = (au)d2;
        return string.equals("head") ? au2.bCR : (string.equals("body") ? au2.bCS : (string.equals("leg1") ? au2.bCT : (string.equals("leg2") ? au2.bCU : (string.equals("leg3") ? au2.bCV : (string.equals("leg4") ? au2.bCW : (string.equals("tail") ? (ag)net.optifine.reflect.g.a(au2, net.optifine.reflect.g.esp) : (string.equals("mane") ? (ag)net.optifine.reflect.g.a(au2, net.optifine.reflect.g.esq) : null)))))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderWolf renderWolf = new RenderWolf(renderManager, d2, f2);
        return renderWolf;
    }
}

