/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.aq;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSquid;
import net.minecraft.entity.passive.w;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class az
extends h {
    public az() {
        super(w.class, "squid", 0.7f);
    }

    @Override
    public d aCn() {
        return new aq();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof aq)) {
            return null;
        }
        aq aq2 = (aq)d2;
        if (string.equals("body")) {
            return (ag)net.optifine.reflect.g.a(aq2, net.optifine.reflect.g.esg);
        }
        String string2 = "tentacle";
        if (string.startsWith("tentacle")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(aq2, net.optifine.reflect.g.esh);
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
        return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderSquid renderSquid = new RenderSquid(renderManager, d2, f2);
        return renderSquid;
    }
}

