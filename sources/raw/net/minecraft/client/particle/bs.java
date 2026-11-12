/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.particle.bn;
import net.minecraft.client.particle.bx;
import net.minecraft.world.w;

public class bs
implements bx {
    @Override
    public ae a(int n2, w w2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        bn bn2 = new bn(w2, d2, d3, d4, d5, d6, d7);
        bn2.cw(144);
        float f2 = w2.dDk.nextFloat() * 0.5f + 0.35f;
        bn2.h(1.0f * f2, 0.0f * f2, 1.0f * f2);
        return bn2;
    }
}

