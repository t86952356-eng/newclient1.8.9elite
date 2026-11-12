/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.player;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import net.minecraft.client.d;
import net.minecraft.client.model.ag;
import net.minecraft.client.model.f;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.player.j;

public class h {
    private Dimension eme = null;
    private boolean emf = false;
    private j[] emg = new j[0];
    private cm bCa = null;
    private BufferedImage emh = null;
    private DynamicTexture emi = null;
    private final cm emj = new cm("textures/blocks/wool_colored_red.png");
    public static final int emk = 0;
    public static final int eml = 1;
    public static final int emm = 2;
    public static final int emn = 3;
    public static final int emo = 4;
    public static final int emp = 5;
    public static final int emq = 6;

    public h(Dimension dimension, boolean bl2, j[] jArray) {
        this.eme = dimension;
        this.emf = bl2;
        this.emg = jArray;
    }

    public void b(f f2, net.minecraft.client.entity.a a2, float f3, float f4) {
        TextureManager textureManager = a.Bq();
        if (this.emf) {
            textureManager.a(a2.Dd());
        } else if (this.bCa != null) {
            if (this.emi == null && this.emh != null) {
                this.emi = new DynamicTexture(this.emh);
                d.AZ().Bq().a(this.bCa, (ITextureObject)this.emi);
            }
            textureManager.a(this.bCa);
        } else {
            textureManager.a(this.emj);
        }
        for (int i2 = 0; i2 < this.emg.length; ++i2) {
            j j2 = this.emg[i2];
            GlStateManager.JV();
            if (a2.isSneaking()) {
                GlStateManager.j(0.0f, 0.2f, 0.0f);
            }
            j2.a(f2, f3);
            GlStateManager.JW();
        }
    }

    public static ag b(f f2, int n2) {
        switch (n2) {
            case 0: {
                return f2.byC;
            }
            case 1: {
                return f2.byA;
            }
            case 2: {
                return f2.byE;
            }
            case 3: {
                return f2.byD;
            }
            case 4: {
                return f2.byG;
            }
            case 5: {
                return f2.byF;
            }
        }
        return null;
    }

    public BufferedImage aDu() {
        return this.emh;
    }

    public void g(BufferedImage bufferedImage) {
        this.emh = bufferedImage;
    }

    public DynamicTexture aDv() {
        return this.emi;
    }

    public cm Hg() {
        return this.bCa;
    }

    public void g(cm cm2) {
        this.bCa = cm2;
    }

    public boolean aDw() {
        return this.emf;
    }
}

