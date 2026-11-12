/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.s;
import net.minecraft.client.renderer.entity.RenderGhast;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.k;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class aa
extends h {
    public aa() {
        super(k.class, "ghast", 0.5f);
    }

    @Override
    public d aCn() {
        return new s();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof s)) {
            return null;
        }
        s s2 = (s)d2;
        if (string.equals("body")) {
            return (ag)net.optifine.reflect.g.a(s2, net.optifine.reflect.g.erI);
        }
        String string2 = "tentacle";
        if (string.startsWith("tentacle")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(s2, net.optifine.reflect.g.erJ);
            if (agArray == null) {
                return null;
            }
            String string3 = string.substring("tentacle".length());
            int n2 = a.x(string3, -1);
            return --n2 >= 0 && n2 < agArray.length ? agArray[n2] : null;
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8", "tentacle9"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderGhast renderGhast = new RenderGhast(renderManager);
        renderGhast.bWL = d2;
        renderGhast.bUm = f2;
        return renderGhast;
    }
}

