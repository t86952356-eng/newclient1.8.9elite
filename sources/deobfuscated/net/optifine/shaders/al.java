/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.multiplayer.j;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.entity.c;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.optifine.shaders.ah;
import net.optifine.shaders.q;

public class al {
    public static Iterator<RenderChunk> a(j j2, double d2, c c2, int n2, ViewFrustum viewFrustum) {
        float f2 = ah.aGM();
        if (f2 > 0.0f && f2 < (float)((n2 - 1) * 16)) {
            int n3 = bt.bM(f2 / 16.0f) + 1;
            float f3 = j2.bU((float)d2);
            float f4 = ah.eEn * bt.dyX;
            float f5 = f3 > bt.dyV && f3 < 3.0f * bt.dyV ? f3 + bt.dyT : f3;
            float f6 = -bt.bx(f5);
            float f7 = bt.bB(f5) * bt.bB(f4);
            float f8 = -bt.bB(f5) * bt.bx(f4);
            b b2 = new b(bt.aF(c2.gW) >> 4, bt.aF(c2.gX) >> 4, bt.aF(c2.gY) >> 4);
            b b3 = b2.ag(-f6 * (float)n3, -f7 * (float)n3, -f8 * (float)n3);
            b b4 = b2.ag(f6 * (float)n2, f7 * (float)n2, f8 * (float)n2);
            q q2 = new q(viewFrustum, b3, b4, n3, n3);
            return q2;
        }
        List<RenderChunk> list = Arrays.asList(viewFrustum.bPN);
        Iterator<RenderChunk> iterator = list.iterator();
        return iterator;
    }
}

