/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.ArmorStandRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.l;

public class i
extends l {
    public i() {
        super(a.class, "armor_stand", 0.0f);
    }

    @Override
    public d aCn() {
        return new net.minecraft.client.model.a();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof net.minecraft.client.model.a)) {
            return null;
        }
        net.minecraft.client.model.a a2 = (net.minecraft.client.model.a)d2;
        return string.equals("right") ? a2.byh : (string.equals("left") ? a2.byi : (string.equals("waist") ? a2.byj : (string.equals("base") ? a2.byk : super.a((d)a2, string))));
    }

    @Override
    public String[] aCo() {
        Object[] objectArray = super.aCo();
        objectArray = (String[])net.minecraft.src.a.a(objectArray, new String[]{"right", "left", "waist", "base"});
        return objectArray;
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        ArmorStandRenderer armorStandRenderer = new ArmorStandRenderer(renderManager);
        armorStandRenderer.bWL = d2;
        armorStandRenderer.bUm = f2;
        return armorStandRenderer;
    }
}

