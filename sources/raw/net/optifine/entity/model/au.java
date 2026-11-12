/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.ak;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSilverfish;
import net.minecraft.entity.monster.ae;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class au
extends h {
    public au() {
        super(ae.class, "silverfish", 0.3f);
    }

    @Override
    public d aCn() {
        return new ak();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof ak)) {
            return null;
        }
        ak ak2 = (ak)d2;
        String string2 = "body";
        if (string.startsWith("body")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(ak2, net.optifine.reflect.g.esb);
            if (agArray == null) {
                return null;
            }
            String string3 = string.substring("body".length());
            int n2 = a.x(string3, -1);
            return --n2 >= 0 && n2 < agArray.length ? agArray[n2] : null;
        }
        String string4 = "wing";
        if (string.startsWith("wing")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(ak2, net.optifine.reflect.g.esc);
            if (agArray == null) {
                return null;
            }
            String string5 = string.substring("wing".length());
            int n3 = a.x(string5, -1);
            return --n3 >= 0 && n3 < agArray.length ? agArray[n3] : null;
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"body1", "body2", "body3", "body4", "body5", "body6", "body7", "wing1", "wing2", "wing3"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderSilverfish renderSilverfish = new RenderSilverfish(renderManager);
        renderSilverfish.bWL = d2;
        renderSilverfish.bUm = f2;
        return renderSilverfish;
    }
}

