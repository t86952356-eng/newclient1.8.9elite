/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.texture;

import net.minecraft.client.renderer.texture.Stitcher;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class Stitcher$Holder
implements Comparable<Stitcher$Holder> {
    private final TextureAtlasSprite bYF;
    private final int bYG;
    private final int bYH;
    private final int bYI;
    private boolean bYJ;
    private float bYK = 1.0f;

    public Stitcher$Holder(TextureAtlasSprite textureAtlasSprite, int n2) {
        this.bYF = textureAtlasSprite;
        this.bYG = textureAtlasSprite.NW();
        this.bYH = textureAtlasSprite.NX();
        this.bYI = n2;
        this.bYJ = Stitcher.ad(this.bYH, n2) > Stitcher.ad(this.bYG, n2);
    }

    public TextureAtlasSprite NR() {
        return this.bYF;
    }

    public int getWidth() {
        return this.bYJ ? Stitcher.ad((int)((float)this.bYH * this.bYK), this.bYI) : Stitcher.ad((int)((float)this.bYG * this.bYK), this.bYI);
    }

    public int getHeight() {
        return this.bYJ ? Stitcher.ad((int)((float)this.bYG * this.bYK), this.bYI) : Stitcher.ad((int)((float)this.bYH * this.bYK), this.bYI);
    }

    public void jI() {
        this.bYJ = !this.bYJ;
    }

    public boolean NS() {
        return this.bYJ;
    }

    public void dC(int n2) {
        if (this.bYG > n2 && this.bYH > n2) {
            this.bYK = (float)n2 / (float)Math.min(this.bYG, this.bYH);
        }
    }

    public String toString() {
        return "Holder{width=" + this.bYG + ", height=" + this.bYH + "}";
    }

    public int c(Stitcher$Holder stitcher$Holder) {
        int n2;
        if (this.getHeight() == stitcher$Holder.getHeight()) {
            if (this.getWidth() == stitcher$Holder.getWidth()) {
                if (this.bYF.Oc() == null) {
                    return stitcher$Holder.bYF.Oc() == null ? 0 : -1;
                }
                return this.bYF.Oc().compareTo(stitcher$Holder.bYF.Oc());
            }
            n2 = this.getWidth() < stitcher$Holder.getWidth() ? 1 : -1;
        } else {
            n2 = this.getHeight() < stitcher$Holder.getHeight() ? 1 : -1;
        }
        return n2;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.c((Stitcher$Holder)object);
    }
}

