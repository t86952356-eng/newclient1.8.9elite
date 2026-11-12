/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.aa;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderMinecart;
import net.minecraft.entity.item.k;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ai
extends h {
    public ai() {
        super(k.class, "minecart", 0.5f);
    }

    protected ai(Class clazz, String string, float f2) {
        super(clazz, string, f2);
    }

    @Override
    public d aCn() {
        return new aa();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof aa)) {
            return null;
        }
        aa aa2 = (aa)d2;
        return string.equals("bottom") ? aa2.bAQ[0] : (string.equals("back") ? aa2.bAQ[1] : (string.equals("front") ? aa2.bAQ[2] : (string.equals("right") ? aa2.bAQ[3] : (string.equals("left") ? aa2.bAQ[4] : (string.equals("dirt") ? aa2.bAQ[5] : null)))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"bottom", "back", "front", "right", "left", "dirt"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderMinecart renderMinecart = new RenderMinecart(renderManager);
        if (!net.optifine.reflect.g.esx.aDA()) {
            a.warn("Field not found: RenderMinecart.modelMinecart");
            return null;
        }
        net.optifine.reflect.g.a(renderMinecart, net.optifine.reflect.g.esx, (Object)d2);
        renderMinecart.bUm = f2;
        return renderMinecart;
    }
}

