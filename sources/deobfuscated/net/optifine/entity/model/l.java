/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.entity.model;

import net.minecraft.client.model.ag;
import net.minecraft.client.model.d;
import net.minecraft.client.model.f;
import net.optifine.entity.model.h;

public abstract class l
extends h {
    public l(Class clazz, String string, float f2) {
        super(clazz, string, f2);
    }

    @Override
    public ag a(d d2, String string) {
        if (!(d2 instanceof f)) {
            return null;
        }
        f f2 = (f)d2;
        return string.equals("head") ? f2.byA : (string.equals("headwear") ? f2.byB : (string.equals("body") ? f2.byC : (string.equals("left_arm") ? f2.byE : (string.equals("right_arm") ? f2.byD : (string.equals("left_leg") ? f2.byG : (string.equals("right_leg") ? f2.byF : null))))));
    }

    @Override
    public String[] aCo() {
        return new String[]{"head", "headwear", "body", "left_arm", "right_arm", "left_leg", "right_leg"};
    }
}

