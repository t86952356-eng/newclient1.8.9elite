/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.l;
import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.d;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class s
extends h {
    public s() {
        super(d.class, "chicken", 0.3f);
    }

    @Override
    public net.minecraft.client.model.d aCn() {
        return new l();
    }

    @Override
    public ag a(net.minecraft.client.model.d d2, String string) {
        if (!(d2 instanceof l)) {
            return null;
        }
        l l2 = (l)d2;
        return string.equals("head") ? l2.bzg : (string.equals("body") ? l2.bzh : (string.equals("right_leg") ? l2.bzi : (string.equals("left_leg") ? l2.bzj : (string.equals("right_wing") ? l2.bzk : (string.equals("left_wing") ? l2.bzl : (string.equals("bill") ? l2.bzm : (string.equals("chin") ? l2.bzn : null)))))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin"};
    }

    @Override
    public g a(net.minecraft.client.model.d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderChicken renderChicken = new RenderChicken(renderManager, d2, f2);
        return renderChicken;
    }
}

