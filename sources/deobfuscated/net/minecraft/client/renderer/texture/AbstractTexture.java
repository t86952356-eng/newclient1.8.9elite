/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer.texture;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.optifine.shaders.ak;
import net.optifine.shaders.r;
import org.lwjgl.opengl.GL11;

public abstract class AbstractTexture
implements ITextureObject {
    protected int bYd = -1;
    protected boolean bYe;
    protected boolean bYf;
    protected boolean bYg;
    protected boolean bYh;
    public r bYi;

    public void e(boolean bl2, boolean bl3) {
        this.bYe = bl2;
        this.bYf = bl3;
        int n2 = -1;
        int n3 = -1;
        if (bl2) {
            n2 = bl3 ? 9987 : 9729;
            n3 = 9729;
        } else {
            n2 = bl3 ? 9986 : 9728;
            n3 = 9728;
        }
        GlStateManager.ap(this.Ll());
        GL11.glTexParameteri((int)3553, (int)10241, (int)n2);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n3);
    }

    @Override
    public void f(boolean bl2, boolean bl3) {
        this.bYg = this.bYe;
        this.bYh = this.bYf;
        this.e(bl2, bl3);
    }

    @Override
    public void NI() {
        this.e(this.bYg, this.bYh);
    }

    @Override
    public int Ll() {
        if (this.bYd == -1) {
            this.bYd = TextureUtil.OC();
        }
        return this.bYd;
    }

    public void NJ() {
        ak.a(this, this.bYd);
        if (this.bYd != -1) {
            TextureUtil.cO(this.bYd);
            this.bYd = -1;
        }
    }

    @Override
    public r NK() {
        return ak.a(this);
    }
}

