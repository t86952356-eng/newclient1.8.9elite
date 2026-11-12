/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.model.ah;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderSheep;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.passive.u;
import net.minecraft.entity.r;
import net.minecraft.item.b;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.s;

public class LayerSheepWool
implements LayerRenderer<u> {
    private static final cm bXQ = new cm("textures/entity/sheep/sheep_fur.png");
    private final RenderSheep bXR;
    public ah bXS = new ah();

    public LayerSheepWool(RenderSheep renderSheep) {
        this.bXR = renderSheep;
    }

    public void a(u u2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!u2.abj() && !u2.isInvisible()) {
            this.bXR.a(bXQ);
            if (u2.xV() && "jeb_".equals(u2.Un())) {
                int n2 = 25;
                int n3 = u2.aRg / 25 + u2.getEntityId();
                int n4 = b.values().length;
                int n5 = n3 % n4;
                int n6 = (n3 + 1) % n4;
                float f9 = ((float)(u2.aRg % 25) + f4) / 25.0f;
                float[] fArray = u.a(b.fS(n5));
                float[] fArray2 = u.a(b.fS(n6));
                if (a.aow()) {
                    fArray = s.b(b.fS(n5), fArray);
                    fArray2 = s.b(b.fS(n6), fArray2);
                }
                GlStateManager.k(fArray[0] * (1.0f - f9) + fArray2[0] * f9, fArray[1] * (1.0f - f9) + fArray2[1] * f9, fArray[2] * (1.0f - f9) + fArray2[2] * f9);
            } else {
                float[] fArray = u.a(u2.abi());
                if (a.aow()) {
                    fArray = s.b(u2.abi(), fArray);
                }
                GlStateManager.k(fArray[0], fArray[1], fArray[2]);
            }
            this.bXS.a(this.bXR.Nk());
            this.bXS.a(u2, f2, f3, f4);
            this.bXS.a(u2, f2, f3, f5, f6, f7, f8);
        }
    }

    @Override
    public boolean NH() {
        return true;
    }

    @Override
    public /* synthetic */ void d(r r2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a((u)r2, f2, f3, f4, f5, f6, f7, f8);
    }
}

