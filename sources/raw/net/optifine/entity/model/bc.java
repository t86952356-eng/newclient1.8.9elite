/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.at;
import net.minecraft.client.model.d;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderWither;
import net.minecraft.src.a;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class bc
extends h {
    public bc() {
        super(net.minecraft.entity.boss.d.class, "wither", 0.5f);
    }

    @Override
    public d aCn() {
        return new at(0.0f);
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof at)) {
            return null;
        }
        at at2 = (at)d2;
        String string2 = "body";
        if (string.startsWith("body")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(at2, net.optifine.reflect.g.esm);
            if (agArray == null) {
                return null;
            }
            String string3 = string.substring("body".length());
            int n2 = a.x(string3, -1);
            return --n2 >= 0 && n2 < agArray.length ? agArray[n2] : null;
        }
        String string4 = "head";
        if (string.startsWith("head")) {
            ag[] agArray = (ag[])net.optifine.reflect.g.a(at2, net.optifine.reflect.g.esn);
            if (agArray == null) {
                return null;
            }
            String string5 = string.substring("head".length());
            int n3 = a.x(string5, -1);
            return --n3 >= 0 && n3 < agArray.length ? agArray[n3] : null;
        }
        return null;
    }

    @Override
    public String[] aCo() {
        return new String[]{"body1", "body2", "body3", "head1", "head2", "head3"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderWither renderWither = new RenderWither(renderManager);
        renderWither.bWL = d2;
        renderWither.bUm = f2;
        return renderWither;
    }
}

