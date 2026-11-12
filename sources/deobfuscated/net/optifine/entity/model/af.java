/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.w;
import net.minecraft.client.renderer.entity.RenderIronGolem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class af
extends h {
    public af() {
        super(net.minecraft.entity.monster.w.class, "iron_golem", 0.5f);
    }

    @Override
    public d aCn() {
        return new w();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof w)) {
            return null;
        }
        w w2 = (w)d2;
        return string.equals("head") ? w2.bAH : (string.equals("body") ? w2.bAI : (string.equals("left_arm") ? w2.bAK : (string.equals("right_arm") ? w2.bAJ : (string.equals("left_leg") ? w2.bAL : (string.equals("right_leg") ? w2.bAM : null)))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "body", "right_arm", "left_arm", "left_leg", "right_leg"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderIronGolem renderIronGolem = new RenderIronGolem(renderManager);
        renderIronGolem.bWL = d2;
        renderIronGolem.bUm = f2;
        return renderIronGolem;
    }
}

