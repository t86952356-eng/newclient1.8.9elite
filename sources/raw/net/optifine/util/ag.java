/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.util;

import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.bt;
import net.minecraft.world.chunk.storage.g;

public class ag {
    public static int f(RenderChunk renderChunk) {
        g[] gArray = renderChunk.Nc().axw();
        if (gArray == null) {
            return 0;
        }
        int n2 = renderChunk.yl().wu() >> 4;
        g g2 = gArray[n2];
        return g2 == null ? 0 : g2.ayc();
    }

    public static double g(RenderChunk renderChunk) {
        int n2 = ag.f(renderChunk);
        double d2 = ag.kz(n2);
        return d2;
    }

    public static double kz(int n2) {
        double d2 = (double)n2 / 4096.0;
        double d3 = (d2 *= 0.995) * 2.0 - 1.0;
        d3 = bt.ah(d3, -1.0, 1.0);
        return bt.aD(1.0 - d3 * d3);
    }
}

