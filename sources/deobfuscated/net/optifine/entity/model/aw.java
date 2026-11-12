/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.an;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSlime;
import net.minecraft.entity.monster.ai;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class aw
extends h {
    public aw() {
        super(ai.class, "slime", 0.25f);
    }

    @Override
    public d aCn() {
        return new an(16);
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof an)) {
            return null;
        }
        an an2 = (an)d2;
        return string.equals("body") ? (ag)net.optifine.reflect.g.a((Object)an2, net.optifine.reflect.g.ese, 0) : (string.equals("left_eye") ? (ag)net.optifine.reflect.g.a((Object)an2, net.optifine.reflect.g.ese, 1) : (string.equals("right_eye") ? (ag)net.optifine.reflect.g.a((Object)an2, net.optifine.reflect.g.ese, 2) : (string.equals("mouth") ? (ag)net.optifine.reflect.g.a((Object)an2, net.optifine.reflect.g.ese, 3) : null)));
    }

    @Override
    public String[] aCo() {
        return new String[]{"body", "left_eye", "right_eye", "mouth"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderSlime renderSlime = new RenderSlime(renderManager, d2, f2);
        return renderSlime;
    }
}

