/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.optifine.shaders.l;

public class d
implements l {
    private int euE = -1;
    private String aAT = null;
    private ITextureObject euF = null;

    public d(int n2, String string, ITextureObject iTextureObject) {
        this.euE = n2;
        this.aAT = string;
        this.euF = iTextureObject;
    }

    @Override
    public int aEp() {
        return this.euE;
    }

    public String qW() {
        return this.aAT;
    }

    public ITextureObject aEq() {
        return this.euF;
    }

    @Override
    public int aEr() {
        return this.euF.Ll();
    }

    @Override
    public void aEs() {
        TextureUtil.cO(this.euF.Ll());
    }

    @Override
    public int aEt() {
        return 3553;
    }

    public String toString() {
        return "textureUnit: " + this.euE + ", path: " + this.aAT + ", glTextureId: " + this.aEr();
    }
}

