/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.ar;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderVillager;
import net.minecraft.entity.passive.z;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ba
extends h {
    public ba() {
        super(z.class, "villager", 0.5f);
    }

    @Override
    public d aCn() {
        return new ar(0.0f);
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof ar)) {
            return null;
        }
        ar ar2 = (ar)d2;
        return string.equals("head") ? ar2.bCG : (string.equals("body") ? ar2.bCH : (string.equals("arms") ? ar2.bCI : (string.equals("left_leg") ? ar2.bCK : (string.equals("right_leg") ? ar2.bCJ : (string.equals("nose") ? ar2.bCL : null)))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "body", "arms", "right_leg", "left_leg", "nose"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderVillager renderVillager = new RenderVillager(renderManager);
        renderVillager.bWL = d2;
        renderVillager.bUm = f2;
        return renderVillager;
    }
}

