/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.n;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.optifine.entity.model.g;
import net.optifine.entity.model.h;

public class u
extends h {
    public u() {
        super(net.minecraft.entity.monster.d.class, "creeper", 0.5f);
    }

    @Override
    public d aCn() {
        return new n();
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof n)) {
            return null;
        }
        n n2 = (n)d2;
        return string.equals("head") ? n2.bzg : (string.equals("armor") ? n2.bzo : (string.equals("body") ? n2.bzh : (string.equals("leg1") ? n2.bzp : (string.equals("leg2") ? n2.bzq : (string.equals("leg3") ? n2.bzr : (string.equals("leg4") ? n2.bzs : null))))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "armor", "body", "leg1", "leg2", "leg3", "leg4"};
    }

    @Override
    public g a(d d2, float f2) {
        RenderManager renderManager = net.minecraft.client.d.AZ().BF();
        RenderCreeper renderCreeper = new RenderCreeper(renderManager);
        renderCreeper.bWL = d2;
        renderCreeper.bUm = f2;
        return renderCreeper;
    }
}

