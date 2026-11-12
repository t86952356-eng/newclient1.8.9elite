/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ae;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.optifine.entity.model.h;

public abstract class ap
extends h {
    public ap(Class clazz, String string, float f2) {
        super(clazz, string, f2);
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof ae)) {
            return null;
        }
        ae ae2 = (ae)d2;
        return string.equals("head") ? ae2.bzg : (string.equals("body") ? ae2.bzh : (string.equals("leg1") ? ae2.bzp : (string.equals("leg2") ? ae2.bzq : (string.equals("leg3") ? ae2.bzr : (string.equals("leg4") ? ae2.bzs : null)))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4"};
    }
}

