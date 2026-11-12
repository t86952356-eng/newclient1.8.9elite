/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import net.minecraft.client.d;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.cm;
import net.optifine.shaders.l;
import net.optifine.shaders.r;

public class e
implements l {
    private int euE = -1;
    private final cm euG;
    private int euH = 0;
    private ITextureObject euF;
    public static final int euI = 0;
    public static final int euJ = 1;
    public static final int euK = 2;

    public e(int n2, cm cm2, int n3) {
        this.euE = n2;
        this.euG = cm2;
        this.euH = n3;
    }

    public ITextureObject aEq() {
        if (this.euF == null) {
            TextureManager textureManager = d.AZ().Bq();
            this.euF = textureManager.k(this.euG);
            if (this.euF == null) {
                this.euF = new SimpleTexture(this.euG);
                textureManager.a(this.euG, this.euF);
                this.euF = textureManager.k(this.euG);
            }
        }
        return this.euF;
    }

    @Override
    public int aEr() {
        ITextureObject iTextureObject = this.aEq();
        if (this.euH != 0 && iTextureObject instanceof AbstractTexture) {
            AbstractTexture abstractTexture = (AbstractTexture)iTextureObject;
            r r2 = abstractTexture.bYi;
            if (r2 != null) {
                if (this.euH == 1) {
                    return r2.evw;
                }
                if (this.euH == 2) {
                    return r2.evx;
                }
            }
        }
        return iTextureObject.Ll();
    }

    @Override
    public int aEp() {
        return this.euE;
    }

    @Override
    public void aEs() {
    }

    @Override
    public int aEt() {
        return 3553;
    }

    public String toString() {
        return "textureUnit: " + this.euE + ", location: " + String.valueOf(this.euG) + ", glTextureId: " + String.valueOf(this.euF != null ? Integer.valueOf(this.euF.Ll()) : "");
    }
}

