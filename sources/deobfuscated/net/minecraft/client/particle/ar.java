/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.particle.aq;
import net.minecraft.client.particle.bx;
import net.minecraft.world.w;

public class ar
implements bx {
    @Override
    public ae a(int n2, w w2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        aq aq2 = new aq(w2, d2, d3 + 0.5, d4, d5, d6, d7);
        aq2.ct(81);
        aq2.h(1.0f, 1.0f, 1.0f);
        return aq2;
    }
}

