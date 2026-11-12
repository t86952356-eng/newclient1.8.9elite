/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.as;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderWitch;
import net.minecraft.entity.monster.at;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class bb
extends h {
    public bb() {
        super(at.class, "witch", 0.5f);
    }

    @Override
    public d aCn() {
        return new as(0.0f);
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof as)) {
            return null;
        }
        as as2 = (as)d2;
        return string.equals("mole") ? (ag)net.optifine.reflect.g.a(as2, net.optifine.reflect.g.esj) : (string.equals("hat") ? (ag)net.optifine.reflect.g.a(as2, net.optifine.reflect.g.esk) : (string.equals("head") ? as2.bCG : (string.equals("body") ? as2.bCH : (string.equals("arms") ? as2.bCI : (string.equals("left_leg") ? as2.bCK : (string.equals("right_leg") ? as2.bCJ : (string.equals("nose") ? as2.bCL : null)))))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"mole", "head", "body", "arms", "right_leg", "left_leg", "nose"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderWitch renderWitch = new RenderWitch(renderManager);
        renderWitch.bWL = d2;
        renderWitch.bUm = f2;
        return renderWitch;
    }
}

