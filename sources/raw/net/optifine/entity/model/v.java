/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.o;
import net.minecraft.client.renderer.entity.RenderDragon;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.boss.b;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class v
extends h {
    public v() {
        super(b.class, "dragon", 0.5f);
    }

    @Override
    public d aCn() {
        return new o(0.0f);
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof o)) {
            return null;
        }
        o o2 = (o)d2;
        return string.equals("head") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 0) : (string.equals("spine") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 1) : (string.equals("jaw") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 2) : (string.equals("body") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 3) : (string.equals("rear_leg") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 4) : (string.equals("front_leg") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 5) : (string.equals("rear_leg_tip") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 6) : (string.equals("front_leg_tip") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 7) : (string.equals("rear_foot") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 8) : (string.equals("front_foot") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 9) : (string.equals("wing") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 10) : (string.equals("wing_tip") ? (ag)net.optifine.reflect.g.a((Object)o2, net.optifine.reflect.g.erA, 11) : null)))))))))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "spine", "jaw", "body", "rear_leg", "front_leg", "rear_leg_tip", "front_leg_tip", "rear_foot", "front_foot", "wing", "wing_tip"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderDragon renderDragon = new RenderDragon(renderManager);
        renderDragon.bWL = d2;
        renderDragon.bUm = f2;
        return renderDragon;
    }
}

