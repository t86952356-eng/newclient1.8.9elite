/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSpider;
import net.minecraft.entity.monster.ap;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class ay
extends h {
    public ay() {
        super(ap.class, "spider", 1.0f);
    }

    protected ay(Class clazz, String string, float f2) {
        super(clazz, string, f2);
    }

    @Override
    public d aCn() {
        return new net.minecraft.client.model.ap();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof net.minecraft.client.model.ap)) {
            return null;
        }
        net.minecraft.client.model.ap ap2 = (net.minecraft.client.model.ap)d2;
        return string.equals("head") ? ap2.bCt : (string.equals("neck") ? ap2.bCu : (string.equals("body") ? ap2.bCv : (string.equals("leg1") ? ap2.bCw : (string.equals("leg2") ? ap2.bCx : (string.equals("leg3") ? ap2.bCy : (string.equals("leg4") ? ap2.bCz : (string.equals("leg5") ? ap2.bCA : (string.equals("leg6") ? ap2.bCB : (string.equals("leg7") ? ap2.bCC : (string.equals("leg8") ? ap2.bCD : null))))))))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "neck", "body", "leg1", "leg2", "leg3", "leg4", "leg5", "leg6", "leg7", "leg8"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderSpider renderSpider = new RenderSpider(renderManager);
        renderSpider.bWL = d2;
        renderSpider.bUm = f2;
        return renderSpider;
    }
}

