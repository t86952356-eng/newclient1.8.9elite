/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.e;
import net.minecraft.client.renderer.entity.RenderBat;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.c;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class k
extends h {
    public k() {
        super(c.class, "bat", 0.25f);
    }

    @Override
    public d aCn() {
        return new e();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof e)) {
            return null;
        }
        e e2 = (e)d2;
        return string.equals("head") ? (ag)net.optifine.reflect.g.a((Object)e2, net.optifine.reflect.g.ers, 0) : (string.equals("body") ? (ag)net.optifine.reflect.g.a((Object)e2, net.optifine.reflect.g.ers, 1) : (string.equals("right_wing") ? (ag)net.optifine.reflect.g.a((Object)e2, net.optifine.reflect.g.ers, 2) : (string.equals("left_wing") ? (ag)net.optifine.reflect.g.a((Object)e2, net.optifine.reflect.g.ers, 3) : (string.equals("outer_right_wing") ? (ag)net.optifine.reflect.g.a((Object)e2, net.optifine.reflect.g.ers, 4) : (string.equals("outer_left_wing") ? (ag)net.optifine.reflect.g.a((Object)e2, net.optifine.reflect.g.ers, 5) : null)))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderBat renderBat = new RenderBat(renderManager);
        renderBat.bWL = d2;
        renderBat.bUm = f2;
        return renderBat;
    }
}

