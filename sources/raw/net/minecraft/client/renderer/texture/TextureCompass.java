/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import net.minecraft.client.d;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.b;
import net.minecraft.util.bt;
import net.minecraft.world.w;

public class TextureCompass
extends TextureAtlasSprite {
    public double bZt;
    public double bZu;
    public static String bZv;

    public TextureCompass(String string) {
        super(string);
        bZv = string;
    }

    @Override
    public void Od() {
        d d2 = d.AZ();
        if (d2.bgF != null && d2.bgK != null) {
            this.a(d2.bgF, d2.bgK.gW, d2.bgK.gY, d2.bgK.pl, false, false);
        } else {
            this.a(null, 0.0, 0.0, 0.0, true, false);
        }
    }

    public void a(w w2, double d2, double d3, double d4, boolean bl2, boolean bl3) {
        if (!this.bYR.isEmpty()) {
            double d5 = 0.0;
            if (w2 != null && !bl2) {
                b b2 = w2.avE();
                double d6 = (double)b2.wt() - d2;
                double d7 = (double)b2.wx() - d3;
                d5 = -(((d4 %= 360.0) - 90.0) * Math.PI / 180.0 - Math.atan2(d7, d6));
                if (!w2.dDl.avW()) {
                    d5 = Math.random() * Math.PI * 2.0;
                }
            }
            if (bl3) {
                this.bZt = d5;
            } else {
                double d8;
                for (d8 = d5 - this.bZt; d8 < -Math.PI; d8 += Math.PI * 2) {
                }
                while (d8 >= Math.PI) {
                    d8 -= Math.PI * 2;
                }
                d8 = bt.ah(d8, -1.0, 1.0);
                this.bZu += d8 * 0.1;
                this.bZu *= 0.8;
                this.bZt += this.bZu;
            }
            int n2 = (int)((this.bZt / (Math.PI * 2) + 1.0) * (double)this.bYR.size()) % this.bYR.size();
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

