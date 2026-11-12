/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.b;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class n
extends h {
    public n() {
        super(b.class, "boat", 0.5f);
    }

    @Override
    public d aCn() {
        return new net.minecraft.client.model.h();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof net.minecraft.client.model.h)) {
            return null;
        }
        net.minecraft.client.model.h h2 = (net.minecraft.client.model.h)d2;
        return string.equals("bottom") ? h2.byM[0] : (string.equals("back") ? h2.byM[1] : (string.equals("front") ? h2.byM[2] : (string.equals("right") ? h2.byM[3] : (string.equals("left") ? h2.byM[4] : null))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"bottom", "back", "front", "right", "left"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderBoat renderBoat = new RenderBoat(renderManager);
        if (!net.optifine.reflect.g.esv.aDA()) {
            a.warn("Field not found: RenderBoat.modelBoat");
            return null;
        }
        net.optifine.reflect.g.a((Object)renderBoat, net.optifine.reflect.g.esv, (Object)d2);
        renderBoat.bUm = f2;
        return renderBoat;
    }
}

