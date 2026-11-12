/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.bt;

public class TextureClock
extends TextureAtlasSprite {
    private double bZr;
    private double bZs;

    public TextureClock(String string) {
        super(string);
    }

    @Override
    public void Od() {
        if (!this.bYR.isEmpty()) {
            double d2;
            Minecraft minecraft = Minecraft.getMinecraft();
            double d3 = 0.0;
            if (minecraft.bgF != null && minecraft.bgK != null) {
                d3 = minecraft.bgF.bT(1.0f);
                if (!minecraft.bgF.dDl.avW()) {
                    d3 = Math.random();
                }
            }
            for (d2 = d3 - this.bZr; d2 < -0.5; d2 += 1.0) {
            }
            while (d2 >= 0.5) {
                d2 -= 1.0;
            }
            d2 = bt.ah(d2, -1.0, 1.0);
            this.bZs += d2 * 0.1;
            this.bZs *= 0.8;
            this.bZr += this.bZs;
            int n2 = (int)((this.bZr + 1.0) * (double)this.bYR.size()) % this.bYR.size();
            while (n2 < 0) {
                n2 = (n2 + this.bYR.size()) % this.bYR.size();
            }
            if (n2 != this.bYY) {
                this.bYY = n2;
                TextureUtil.a((int[][])this.bYR.get(this.bYY), this.width, this.height, this.bYL, this.bYM, false, false);
            }
        }
    }
}

