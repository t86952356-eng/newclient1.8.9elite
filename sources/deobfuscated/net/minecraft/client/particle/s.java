/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.client.particle.ae;
import net.minecraft.client.particle.bx;
import net.minecraft.client.particle.q;
import net.minecraft.world.w;

public class s
implements bx {
    @Override
    public ae a(int n2, w w2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        q q2 = new q(w2, d2, d3, d4, d5, d6, d7);
        q2.h(q2.Iw() * 0.3f, q2.Ix() * 0.8f, q2.Iy());
        q2.IB();
        return q2;
    }
}

