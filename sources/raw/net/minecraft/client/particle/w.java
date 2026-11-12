/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.particle;

import net.minecraft.block.Block;
import net.minecraft.client.particle.ae;
import net.minecraft.client.particle.bx;
import net.minecraft.client.particle.v;

public class w
implements bx {
    @Override
    public ae a(int n2, net.minecraft.world.w w2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        return new v(w2, d2, d3, d4, d5, d6, d7, Block.aL(nArray[0])).Iv();
    }
}

