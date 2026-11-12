/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.renderer.texture;

import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.texture.TextureAtlasSprite$1;
import net.minecraft.client.renderer.texture.TextureClock;
import net.minecraft.client.renderer.texture.TextureCompass;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.AnimationFrame;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.crash.i;
import net.minecraft.src.a;
import net.minecraft.util.cl;
import net.minecraft.util.cm;
import net.optifine.bi;
import net.optifine.shaders.ah;
import net.optifine.util.ak;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TextureAtlasSprite {
    private final String bYQ;
    protected List<int[][]> bYR = Lists.newArrayList();
    protected int[][] bYS;
    private AnimationMetadataSection bYT;
    protected boolean bYJ;
    protected int bYL;
    protected int bYM;
    protected int width;
    protected int height;
    private float bYU;
    private float bYV;
    private float bYW;
    private float bYX;
    protected int bYY;
    protected int qH;
    private static String bYZ = "builtin/clock";
    private static String bZa = "builtin/compass";
    private int bZb = -1;
    public float bZc;
    public float bZd;
    public int bZe;
    public int bZf;
    public int bZg = -1;
    public TextureAtlasSprite bZh = null;
    public boolean bZi = false;
    public int bZj = 0;
    public TextureAtlasSprite bZk = null;
    public TextureAtlasSprite bZl = null;
    public boolean bZm = false;
    public boolean bYv = false;
    public TextureAtlasSprite bZn = null;
    private int bZo = -1;
    private boolean bZp = false;

    private TextureAtlasSprite(String string, boolean bl2) {
        this.bYQ = string;
        this.bZi = bl2;
    }

    public TextureAtlasSprite(String string) {
        this.bYQ = string;
        if (a.LE()) {
            this.bZh = new TextureAtlasSprite(this.Oc() + ".spriteSingle", true);
        }
    }

    protected static TextureAtlasSprite j(cm cm2) {
        String string = cm2.toString();
        return bYZ.equals(string) ? new TextureClock(string) : (bZa.equals(string) ? new TextureCompass(string) : new TextureAtlasSprite(string));
    }

    public static void do(String string) {
        bYZ = string;
    }

    public static void dp(String string) {
        bZa = string;
    }

    public void a(int n2, int n3, int n4, int n5, boolean bl2) {
        this.bYL = n4;
        this.bYM = n5;
        this.bYJ = bl2;
        float f2 = (float)((double)0.01f / (double)n2);
        float f3 = (float)((double)0.01f / (double)n3);
        this.bYU = (float)n4 / (float)((double)n2) + f2;
        this.bYV = (float)(n4 + this.width) / (float)((double)n2) - f2;
        this.bYW = (float)n5 / (float)n3 + f3;
        this.bYX = (float)(n5 + this.height) / (float)n3 - f3;
        this.bZc = Math.min(this.bYU, this.bYV);
        this.bZd = Math.min(this.bYW, this.bYX);
        if (this.bZh != null) {
            this.bZh.a(this.width, this.height, 0, 0, false);
        }
        if (this.bZk != null) {
            this.bZk.f(this);
        }
        if (this.bZl != null) {
            this.bZl.f(this);
        }
    }

    public void f(TextureAtlasSprite textureAtlasSprite) {
        this.bYL = textureAtlasSprite.bYL;
        this.bYM = textureAtlasSprite.bYM;
        this.width = textureAtlasSprite.width;
        this.height = textureAtlasSprite.height;
        this.bYJ = textureAtlasSprite.bYJ;
        this.bYU = textureAtlasSprite.bYU;
        this.bYV = textureAtlasSprite.bYV;
        this.bYW = textureAtlasSprite.bYW;
        this.bYX = textureAtlasSprite.bYX;
        if (textureAtlasSprite != a.QB().Ou()) {
            this.bZb = textureAtlasSprite.bZb;
        }
        this.bZc = textureAtlasSprite.bZc;
        this.bZd = textureAtlasSprite.bZd;
        this.bZe = textureAtlasSprite.bZe;
        this.bZf = textureAtlasSprite.bZf;
        this.bZg = textureAtlasSprite.bZg;
        this.bZj = textureAtlasSprite.bZj;
        if (this.bZh != null) {
            this.bZh.a(this.width, this.height, 0, 0, false);
        }
        this.bZo = textureAtlasSprite.bZo;
    }

    public int NU() {
        return this.bYL;
    }

    public int NV() {
        return this.bYM;
    }

    public int NW() {
        return this.width;
    }

    public int NX() {
        return this.height;
    }

    public float NY() {
        return this.bYU;
    }

    public float NZ() {
        return this.bYV;
    }

    public float al(double d2) {
        float f2 = this.bYV - this.bYU;
        return this.bYU + f2 * (float)d2 / 16.0f;
    }

    public float Oa() {
        return this.bYW;
    }

    public float Ob() {
        return this.bYX;
    }

    public float am(double d2) {
        float f2 = this.bYX - this.bYW;
        return this.bYW + f2 * ((float)d2 / 16.0f);
    }

    public String Oc() {
        return this.bYQ;
    }

    public void Od() {
        if (this.bYT != null) {
            this.bZp = !bi.bd() || bi.jo(this.bZo);
            ++this.qH;
            if (this.qH >= this.bYT.dV(this.bYY)) {
                int n2 = this.bYT.dX(this.bYY);
                int n3 = this.bYT.Of() == 0 ? this.bYR.size() : this.bYT.Of();
                this.bYY = (this.bYY + 1) % n3;
                this.qH = 0;
                int n4 = this.bYT.dX(this.bYY);
                boolean bl2 = false;
                boolean bl3 = this.bZi;
                if (!this.bZp) {
                    return;
                }
                if (n2 != n4 && n4 >= 0 && n4 < this.bYR.size()) {
                    TextureUtil.a(this.bYR.get(n4), this.width, this.height, this.bYL, this.bYM, false, bl3);
                }
            } else if (this.bYT.Qa()) {
                if (!this.bZp) {
                    return;
                }
                this.Oe();
            }
        }
    }

    private void Oe() {
        int n2;
        int n3;
        double d2 = 1.0 - (double)this.qH / (double)this.bYT.dV(this.bYY);
        int n4 = this.bYT.dX(this.bYY);
        if (n4 != (n3 = this.bYT.dX((this.bYY + 1) % (n2 = this.bYT.Of() == 0 ? this.bYR.size() : this.bYT.Of()))) && n3 >= 0 && n3 < this.bYR.size()) {
            int[][] nArray = this.bYR.get(n4);
            int[][] nArray2 = this.bYR.get(n3);
            if (this.bYS == null || this.bYS.length != nArray.length) {
                this.bYS = new int[nArray.length][];
            }
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                if (this.bYS[i2] == null) {
                    this.bYS[i2] = new int[nArray[i2].length];
                }
                if (i2 >= nArray2.length || nArray2[i2].length != nArray[i2].length) continue;
                for (int i3 = 0; i3 < nArray[i2].length; ++i3) {
                    int n5 = nArray[i2][i3];
                    int n6 = nArray2[i2][i3];
                    int n7 = (int)((double)((n5 & 0xFF0000) >> 16) * d2 + (double)((n6 & 0xFF0000) >> 16) * (1.0 - d2));
                    int n8 = (int)((double)((n5 & 0xFF00) >> 8) * d2 + (double)((n6 & 0xFF00) >> 8) * (1.0 - d2));
                    int n9 = (int)((double)(n5 & 0xFF) * d2 + (double)(n6 & 0xFF) * (1.0 - d2));
                    this.bYS[i2][i3] = n5 & 0xFF000000 | n7 << 16 | n8 << 8 | n9;
                }
            }
            TextureUtil.a(this.bYS, this.width, this.height, this.bYL, this.bYM, false, false);
        }
    }

    public int[][] dD(int n2) {
        return this.bYR.get(n2);
    }

    public int Of() {
        return this.bYR.size();
    }

    public void dE(int n2) {
        this.width = n2;
        if (this.bZh != null) {
            this.bZh.dE(this.width);
        }
    }

    public void dF(int n2) {
        this.height = n2;
        if (this.bZh != null) {
            this.bZh.dF(this.height);
        }
    }

    public void a(BufferedImage[] bufferedImageArray, AnimationMetadataSection animationMetadataSection) {
        Object object;
        int n2;
        int n3;
        this.Oi();
        int n4 = bufferedImageArray[0].getWidth();
        int n5 = bufferedImageArray[0].getHeight();
        this.width = n4;
        this.height = n5;
        if (this.bZh != null) {
            this.bZh.width = this.width;
            this.bZh.height = this.height;
        }
        int[][] nArrayArray = new int[bufferedImageArray.length][];
        for (n3 = 0; n3 < bufferedImageArray.length; ++n3) {
            BufferedImage bufferedImage = bufferedImageArray[n3];
            if (bufferedImage == null) continue;
            if (this.width >> n3 != bufferedImage.getWidth()) {
                bufferedImage = ak.a(bufferedImage, this.width >> n3);
            }
            if (n3 > 0 && (bufferedImage.getWidth() != n4 >> n3 || bufferedImage.getHeight() != n5 >> n3)) {
                throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", n3, bufferedImage.getWidth(), bufferedImage.getHeight(), n4 >> n3, n5 >> n3));
            }
            nArrayArray[n3] = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), nArrayArray[n3], 0, bufferedImage.getWidth());
        }
        if (animationMetadataSection == null) {
            if (n5 != n4) {
                throw new RuntimeException("broken aspect ratio and not an animation");
            }
            this.bYR.add(nArrayArray);
        } else {
            n3 = n5 / n4;
            int n6 = n4;
            n2 = n4;
            this.height = this.width;
            if (animationMetadataSection.Of() > 0) {
                object = animationMetadataSection.Qb().iterator();
                while (object.hasNext()) {
                    var10_13 = (Integer)object.next();
                    if (var10_13 >= n3) {
                        throw new RuntimeException("invalid frameindex " + var10_13);
                    }
                    this.dH(var10_13);
                    this.bYR.set(var10_13, TextureAtlasSprite.a(nArrayArray, n6, n2, var10_13));
                }
                this.bYT = animationMetadataSection;
            } else {
                object = Lists.newArrayList();
                for (var10_13 = 0; var10_13 < n3; ++var10_13) {
                    this.bYR.add(TextureAtlasSprite.a(nArrayArray, n6, n2, var10_13));
                    object.add(new AnimationFrame(var10_13, -1));
                }
                this.bYT = new AnimationMetadataSection((List<AnimationFrame>)object, this.width, this.height, animationMetadataSection.PW(), animationMetadataSection.Qa());
            }
        }
        if (!this.bZm) {
            if (a.aoG()) {
                this.Oq();
            }
            for (n3 = 0; n3 < this.bYR.size(); ++n3) {
                int[][] nArray = this.bYR.get(n3);
                if (nArray == null || this.bYQ.startsWith("minecraft:blocks/leaves_")) continue;
                for (n2 = 0; n2 < nArray.length; ++n2) {
                    object = nArray[n2];
                    this.h((int[])object);
                }
            }
            if (this.bZh != null) {
                this.bZh.a(bufferedImageArray, animationMetadataSection);
            }
        }
    }

    public void dG(int n2) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i2 = 0; i2 < this.bYR.size(); ++i2) {
            int[][] nArray = this.bYR.get(i2);
            if (nArray == null) continue;
            try {
                arrayList.add(TextureUtil.a(n2, this.width, nArray));
                continue;
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Generating mipmaps for frame");
                i i3 = a2.dY("Frame being iterated");
                i3.b("Frame index", i2);
                i3.a("Frame sizes", new TextureAtlasSprite$1(this, nArray));
                throw new cl(a2);
            }
        }
        this.u(arrayList);
        if (this.bZh != null) {
            this.bZh.dG(n2);
        }
    }

    private void dH(int n2) {
        if (this.bYR.size() <= n2) {
            for (int i2 = this.bYR.size(); i2 <= n2; ++i2) {
                this.bYR.add(null);
            }
        }
        if (this.bZh != null) {
            this.bZh.dH(n2);
        }
    }

    private static int[][] a(int[][] nArray, int n2, int n3, int n4) {
        int[][] nArrayArray = new int[nArray.length][];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int[] nArray2 = nArray[i2];
            if (nArray2 == null) continue;
            nArrayArray[i2] = new int[(n2 >> i2) * (n3 >> i2)];
            System.arraycopy(nArray2, n4 * nArrayArray[i2].length, nArrayArray[i2], 0, nArrayArray[i2].length);
        }
        return nArrayArray;
    }

    public void Og() {
        this.bYR.clear();
        if (this.bZh != null) {
            this.bZh.Og();
        }
    }

    public boolean Oh() {
        return this.bYT != null;
    }

    public void u(List<int[][]> list) {
        this.bYR = list;
        if (this.bZh != null) {
            this.bZh.u(list);
        }
    }

    private void Oi() {
        this.bYT = null;
        this.u(Lists.newArrayList());
        this.bYY = 0;
        this.qH = 0;
        if (this.bZh != null) {
            this.bZh.Oi();
        }
    }

    public String toString() {
        return "TextureAtlasSprite{name='" + this.bYQ + "', frameCount=" + this.bYR.size() + ", rotated=" + this.bYJ + ", x=" + this.bYL + ", y=" + this.bYM + ", height=" + this.height + ", width=" + this.width + ", u0=" + this.bYU + ", u1=" + this.bYV + ", v0=" + this.bYW + ", v1=" + this.bYX + "}";
    }

    public boolean a(IResourceManager iResourceManager, cm cm2) {
        return false;
    }

    public boolean b(IResourceManager iResourceManager, cm cm2) {
        return true;
    }

    public int Oj() {
        return this.bZb;
    }

    public void dI(int n2) {
        this.bZb = n2;
    }

    public void a(net.optifine.util.i i2) {
        if (this.bZb < 0) {
            this.bZb = i2.aJd();
        }
    }

    public int Ok() {
        return this.bZo;
    }

    public void dJ(int n2) {
        this.bZo = n2;
        if (this.bZk != null) {
            this.bZk.dJ(n2);
        }
        if (this.bZl != null) {
            this.bZl.dJ(n2);
        }
    }

    public boolean Ol() {
        return this.bZp;
    }

    private void h(int[] nArray) {
        if (nArray != null) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            long l2 = 0L;
            long l3 = 0L;
            long l4 = 0L;
            long l5 = 0L;
            for (n7 = 0; n7 < nArray.length; ++n7) {
                n6 = nArray[n7];
                n5 = n6 >> 24 & 0xFF;
                if (n5 < 16) continue;
                n4 = n6 >> 16 & 0xFF;
                n3 = n6 >> 8 & 0xFF;
                n2 = n6 & 0xFF;
                l2 += (long)n4;
                l3 += (long)n3;
                l4 += (long)n2;
                ++l5;
            }
            if (l5 > 0L) {
                n7 = (int)(l2 / l5);
                n6 = (int)(l3 / l5);
                n5 = (int)(l4 / l5);
                n4 = n7 << 16 | n6 << 8 | n5;
                for (n3 = 0; n3 < nArray.length; ++n3) {
                    n2 = nArray[n3];
                    int n8 = n2 >> 24 & 0xFF;
                    if (n8 > 16) continue;
                    nArray[n3] = n4;
                }
            }
        }
    }

    public double aD(float f2) {
        float f3 = this.bYV - this.bYU;
        return (f2 - this.bYU) / f3 * 16.0f;
    }

    public double aE(float f2) {
        float f3 = this.bYX - this.bYW;
        return (f2 - this.bYW) / f3 * 16.0f;
    }

    public void Om() {
        if (this.bZg < 0) {
            this.bZg = TextureUtil.OC();
            TextureUtil.t(this.bZg, this.bZj, this.width, this.height);
            ak.aJy();
        }
        ak.ap(this.bZg);
    }

    public void On() {
        if (this.bZg >= 0) {
            TextureUtil.cO(this.bZg);
            this.bZg = -1;
        }
    }

    public float aF(float f2) {
        f2 -= this.bZc;
        float f3 = (float)this.bZe / (float)this.width;
        return f2 *= f3;
    }

    public float aG(float f2) {
        f2 -= this.bZd;
        float f3 = (float)this.bZf / (float)this.height;
        return f2 *= f3;
    }

    public List<int[][]> Oo() {
        ArrayList<int[][]> arrayList = new ArrayList<int[][]>(this.bYR);
        return arrayList;
    }

    public AnimationMetadataSection Op() {
        return this.bYT;
    }

    public void a(AnimationMetadataSection animationMetadataSection) {
        this.bYT = animationMetadataSection;
    }

    private void Oq() {
        cm cm2;
        String string;
        if (ah.eDe) {
            string = this.bYQ + "_n";
            cm2 = new cm(string);
            cm2 = a.QB().m(cm2);
            if (a.F(cm2)) {
                this.bZk = new TextureAtlasSprite(string);
                this.bZk.bZm = true;
                this.bZk.f(this);
                this.bZk.dG(this.bZj);
            }
        }
        if (ah.eDf) {
            string = this.bYQ + "_s";
            cm2 = new cm(string);
            cm2 = a.QB().m(cm2);
            if (a.F(cm2)) {
                this.bZl = new TextureAtlasSprite(string);
                this.bZl.bZm = true;
                this.bZl.f(this);
                this.bZl.dG(this.bZj);
            }
        }
    }
}

