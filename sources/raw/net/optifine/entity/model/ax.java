/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.ao;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowMan;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ax
extends h {
    public ax() {
        super(net.minecraft.entity.monster.ao.class, "snow_golem", 0.5f);
    }

    @Override
    public d aCn() {
        return new ao();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof ao)) {
            return null;
        }
        ao ao2 = (ao)d2;
        return string.equals("body") ? ao2.bzh : (string.equals("body_bottom") ? ao2.bCq : (string.equals("head") ? ao2.bzg : (string.equals("left_hand") ? ao2.bCs : (string.equals("right_hand") ? ao2.bCr : null))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"body", "body_bottom", "head", "right_hand", "left_hand"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderSnowMan renderSnowMan = new RenderSnowMan(renderManager);
        renderSnowMan.bWL = d2;
        renderSnowMan.bUm = f2;
        return renderSnowMan;
    }
}

