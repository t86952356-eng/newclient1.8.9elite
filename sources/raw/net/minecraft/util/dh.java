/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import java.util.Random;
import net.minecraft.enchantment.l;
import net.minecraft.item.co;
import net.minecraft.util.df;

public class dh
extends df {
    private final co dAV;
    private float dAW;
    private boolean dAX;

    public dh(co co2, int n2) {
        super(n2);
        this.dAV = co2;
    }

    public co i(Random random) {
        co co2 = this.dAV.aeg();
        if (this.dAW > 0.0f) {
            int n2 = (int)(this.dAW * (float)this.dAV.adt());
            int n3 = co2.adt() - random.nextInt(random.nextInt(n2) + 1);
            if (n3 > n2) {
                n3 = n2;
            }
            if (n3 < 1) {
                n3 = 1;
            }
            co2.gf(n3);
        }
        if (this.dAX) {
            l.a(random, co2, 30);
        }
        return co2;
    }

    public dh bQ(float f2) {
        this.dAW = f2;
        return this;
    }

    public dh atX() {
        this.dAX = true;
        return this;
    }
}

