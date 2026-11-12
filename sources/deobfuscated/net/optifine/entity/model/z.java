/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.q;
import net.minecraft.client.renderer.entity.RenderEndermite;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.j;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class z
extends h {
    public z() {
        super(j.class, "endermite", 0.3f);
    }

    @Override
    public d aCn() {
        return new q();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof q)) {
            return null;
        }
        q q2 = (q)d2;
        String string2 = "body";
        if (string.startsWith("body")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(q2, net.optifine.reflect.g.erG);
            if (agArray == null) {
                return null;
            }
            String string3 = string.substring("body".length());
            int n2 = a.x(string3, -1);
            return --n2 >= 0 && n2 < agArray.length ? agArray[n2] : null;
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"body1", "body2", "body3", "body4"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = Minecraft.getMinecraft().BF();
        RenderEndermite renderEndermite = new RenderEndermite(renderManager);
        renderEndermite.bWL = d2;
        renderEndermite.bUm = f2;
        return renderEndermite;
    }
}

