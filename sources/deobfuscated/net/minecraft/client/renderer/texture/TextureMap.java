/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.renderer.texture;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.IIconCreator;
import net.minecraft.client.renderer.texture.ITickableTextureObject;
import net.minecraft.client.renderer.texture.Stitcher;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureClock;
import net.minecraft.client.renderer.texture.TextureCompass;
import net.minecraft.client.renderer.texture.TextureMap$1;
import net.minecraft.client.renderer.texture.TextureMap$2;
import net.minecraft.client.renderer.texture.TextureMap$3;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.crash.i;
import net.minecraft.util.bt;
import net.minecraft.util.cl;
import net.minecraft.util.cm;
import net.optifine.a;
import net.optifine.ae;
import net.optifine.aq;
import net.optifine.bi;
import net.optifine.j;
import net.optifine.reflect.g;
import net.optifine.reflect.l;
import net.optifine.shaders.ak;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rise.util.InstanceAccess;

public class TextureMap
extends AbstractTexture
implements InstanceAccess,
ITickableTextureObject {
    private static final boolean bZB = Boolean.parseBoolean(System.getProperty("fml.skipFirstTextureLoad", "true"));
    private static final Logger bZC = LogManager.getLogger();
    public static final cm bZD = new cm("missingno");
    public static final cm bZE = new cm("textures/atlas/blocks.png");
    private final List<TextureAtlasSprite> bZF;
    private final Map<String, TextureAtlasSprite> bZG;
    private final Map<String, TextureAtlasSprite> bZH;
    private final String bZI;
    private final IIconCreator bZJ;
    private int bZj;
    private final TextureAtlasSprite bZK;
    private boolean bZL = false;
    private TextureAtlasSprite[] bZM = null;
    private int bZN = -1;
    private int bZO = -1;
    private int bZP = -1;
    private double bZQ = -1.0;
    private double bZR = -1.0;
    private final net.optifine.util.i bZS = new net.optifine.util.i(0);
    public int bZT = 0;
    public int bZU = 0;
    private int bZV;
    private int bZW;

    public TextureMap(String string) {
        this(string, null);
    }

    public TextureMap(String string, boolean bl2) {
        this(string, null, bl2);
    }

    public TextureMap(String string, IIconCreator iIconCreator) {
        this(string, iIconCreator, false);
    }

    public TextureMap(String string, IIconCreator iIconCreator, boolean bl2) {
        this.bZF = Lists.newArrayList();
        this.bZG = Maps.newHashMap();
        this.bZH = Maps.newHashMap();
        this.bZK = new TextureAtlasSprite("missingno");
        this.bZI = string;
        this.bZJ = iIconCreator;
        this.bZL = bl2 && bZB;
    }

    private void Os() {
        int n2 = this.Oy();
        int[] nArray = this.dL(n2);
        this.bZK.dE(n2);
        this.bZK.dF(n2);
        int[][] nArrayArray = new int[this.bZj + 1][];
        nArrayArray[0] = nArray;
        this.bZK.u(Lists.newArrayList((Object[])new int[][][]{nArrayArray}));
        this.bZK.dI(this.bZS.aJd());
    }

    @Override
    public void b(IResourceManager iResourceManager) {
        ak.eFB = iResourceManager;
        if (this.bZJ != null) {
            this.a(iResourceManager, this.bZJ);
        }
    }

    public void a(IResourceManager iResourceManager, IIconCreator iIconCreator) {
        this.bZG.clear();
        this.bZS.aX();
        iIconCreator.a(this);
        if (this.bZj >= 4) {
            this.bZj = this.a(this.bZG, iResourceManager);
            net.minecraft.src.a.fO("Mipmap levels: " + this.bZj);
        }
        this.Os();
        this.NJ();
        this.c(iResourceManager);
    }

    public void c(IResourceManager iResourceManager) {
        int n2;
        int n3;
        Object object;
        Object object2;
        Object object3;
        int n4;
        ak.eFB = iResourceManager;
        net.minecraft.src.a.fN("Multitexture: " + net.minecraft.src.a.LE());
        if (net.minecraft.src.a.LE()) {
            for (TextureAtlasSprite object42 : this.bZH.values()) {
                object42.On();
            }
        }
        j.b(this);
        ae.b(this);
        a.b(this);
        int n5 = net.optifine.util.ak.Bc();
        Stitcher stitcher = new Stitcher(n5, n5, true, 0, this.bZj);
        this.bZH.clear();
        this.bZF.clear();
        int n6 = Integer.MAX_VALUE;
        g.a(g.epi, this);
        this.bZN = n4 = this.Oy();
        int n7 = 1 << this.bZj;
        int n8 = 0;
        int n9 = 0;
        for (Map.Entry<String, TextureAtlasSprite> n22 : this.bZG.entrySet()) {
            if (this.bZL) break;
            TextureAtlasSprite n32 = n22.getValue();
            object3 = new cm(n32.Oc());
            cm n18 = this.a((cm)object3, 0);
            n32.a(this.bZS);
            if (n32.a(iResourceManager, (cm)object3)) {
                if (!n32.b(iResourceManager, (cm)object3)) {
                    n6 = Math.min(n6, Math.min(n32.NW(), n32.NX()));
                    stitcher.e(n32);
                    net.minecraft.src.a.fM("Custom loader (skipped): " + String.valueOf(n32));
                    ++n9;
                }
                net.minecraft.src.a.fM("Custom loader: " + String.valueOf(n32));
                ++n8;
                continue;
            }
            try {
                IResource textureAtlasSprite = iResourceManager.v(n18);
                object2 = new BufferedImage[1 + this.bZj];
                object2[0] = TextureUtil.d(textureAtlasSprite.getInputStream());
                int n10 = object2[0].getWidth();
                int n11 = object2[0].getHeight();
                if (n10 < 1 || n11 < 1) {
                    net.minecraft.src.a.warn("Invalid sprite size: " + String.valueOf(n32));
                    continue;
                }
                if (n10 < n4 || this.bZj > 0) {
                    int n12;
                    int n13 = n12 = this.bZj > 0 ? net.optifine.util.ak.ca(n10, n4) : net.optifine.util.ak.cb(n10, n4);
                    if (n12 != n10) {
                        if (!net.optifine.util.ak.hP(n10)) {
                            net.minecraft.src.a.fO("Scaled non power of 2: " + n32.Oc() + ", " + n10 + " -> " + n12);
                        } else {
                            net.minecraft.src.a.fO("Scaled too small texture: " + n32.Oc() + ", " + n10 + " -> " + n12);
                        }
                        int n14 = n11 * n12 / n10;
                        object2[0] = net.optifine.util.ak.a(object2[0], n12);
                    }
                }
                if ((object = (TextureMetadataSection)textureAtlasSprite.dx("texture")) != null) {
                    List<Integer> list = ((TextureMetadataSection)object).Qj();
                    if (!list.isEmpty()) {
                        int n15 = object2[0].getWidth();
                        int n16 = object2[0].getHeight();
                        if (bt.hO(n15) != n15 || bt.hO(n16) != n16) {
                            throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
                        }
                    }
                    for (int n16 : list) {
                        if (n16 <= 0 || n16 >= ((BufferedImage[])object2).length - 1 || object2[n16] != null) continue;
                        cm cm2 = this.a((cm)object3, n16);
                        try {
                            object2[n16] = TextureUtil.d(iResourceManager.v(cm2).getInputStream());
                        }
                        catch (IOException iOException) {
                            bZC.error("Unable to load miplevel {} from: {}", new Object[]{n16, cm2, iOException});
                        }
                    }
                }
                AnimationMetadataSection animationMetadataSection = (AnimationMetadataSection)textureAtlasSprite.dx("animation");
                n32.a((BufferedImage[])object2, animationMetadataSection);
            }
            catch (RuntimeException textureAtlasSprite) {
                bZC.error("Unable to parse metadata from " + String.valueOf(n18), (Throwable)textureAtlasSprite);
                l.c(n18, textureAtlasSprite.getMessage());
                continue;
            }
            catch (IOException n19) {
                bZC.error("Using missing texture, unable to load " + String.valueOf(n18) + ", " + n19.getClass().getName());
                l.O(n18);
                continue;
            }
            n6 = Math.min(n6, Math.min(n32.NW(), n32.NX()));
            int n17 = Math.min(Integer.lowestOneBit(n32.NW()), Integer.lowestOneBit(n32.NX()));
            if (n17 < n7) {
                bZC.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{n18, n32.NW(), n32.NX(), bt.hR(n7), bt.hR(n17)});
                n7 = n17;
            }
            stitcher.e(n32);
        }
        if (n8 > 0) {
            net.minecraft.src.a.fN("Custom loader sprites: " + n8);
        }
        if (n9 > 0) {
            net.minecraft.src.a.fN("Custom loader sprites (skipped): " + n9);
        }
        if ((n3 = bt.hR(n2 = Math.min(n6, n7))) < 0) {
            n3 = 0;
        }
        if (n3 < this.bZj) {
            bZC.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.bZI, this.bZj, n3, n2});
            this.bZj = n3;
        }
        for (TextureAtlasSprite textureAtlasSprite : this.bZG.values()) {
            if (this.bZL) break;
            try {
                textureAtlasSprite.dG(this.bZj);
            }
            catch (Throwable throwable) {
                object2 = net.minecraft.crash.a.a(throwable, "Applying mipmap");
                i i2 = ((net.minecraft.crash.a)object2).dY("Sprite being mipmapped");
                i2.a("Sprite name", new TextureMap$1(this, textureAtlasSprite));
                i2.a("Sprite size", new TextureMap$2(this, textureAtlasSprite));
                i2.a("Sprite frames", new TextureMap$3(this, textureAtlasSprite));
                i2.b("Mipmap levels", this.bZj);
                throw new cl((net.minecraft.crash.a)object2);
            }
        }
        this.bZK.dG(this.bZj);
        stitcher.e(this.bZK);
        this.bZL = false;
        stitcher.NP();
        bZC.info("Created: {}x{} {}-atlas", new Object[]{stitcher.NN(), stitcher.NO(), this.bZI});
        if (net.minecraft.src.a.aoG()) {
            ak.a(this.Ll(), this.bZj, stitcher.NN(), stitcher.NO(), stitcher, this);
        } else {
            TextureUtil.t(this.Ll(), this.bZj, stitcher.NN(), stitcher.NO());
        }
        object3 = Maps.newHashMap(this.bZG);
        for (TextureAtlasSprite textureAtlasSprite : stitcher.NQ()) {
            if (net.minecraft.src.a.aoG()) {
                ak.iY(ak.l(textureAtlasSprite).Oc());
            }
            object2 = textureAtlasSprite.Oc();
            object3.remove(object2);
            this.bZH.put((String)object2, textureAtlasSprite);
            try {
                if (net.minecraft.src.a.aoG()) {
                    ak.b(textureAtlasSprite.dD(0), textureAtlasSprite.NW(), textureAtlasSprite.NX(), textureAtlasSprite.NU(), textureAtlasSprite.NV(), false, false);
                } else {
                    TextureUtil.a(textureAtlasSprite.dD(0), textureAtlasSprite.NW(), textureAtlasSprite.NX(), textureAtlasSprite.NU(), textureAtlasSprite.NV(), false, false);
                }
            }
            catch (Throwable throwable) {
                net.minecraft.crash.a a2 = net.minecraft.crash.a.a(throwable, "Stitching texture atlas");
                object = a2.dY("Texture being stitched together");
                ((i)object).b("Atlas path", this.bZI);
                ((i)object).b("Sprite", textureAtlasSprite);
                throw new cl(a2);
            }
            if (!textureAtlasSprite.Oh()) continue;
            textureAtlasSprite.dJ(this.bZF.size());
            this.bZF.add(textureAtlasSprite);
        }
        for (TextureAtlasSprite textureAtlasSprite : object3.values()) {
            textureAtlasSprite.f(this.bZK);
        }
        net.minecraft.src.a.fO("Animated sprites: " + this.bZF.size());
        net.optifine.util.ak.jA();
        if (net.minecraft.src.a.LE()) {
            int n18 = stitcher.NN();
            int n19 = stitcher.NO();
            for (TextureAtlasSprite textureAtlasSprite : stitcher.NQ()) {
                textureAtlasSprite.bZe = n18;
                textureAtlasSprite.bZf = n19;
                textureAtlasSprite.bZj = this.bZj;
                TextureAtlasSprite textureAtlasSprite2 = textureAtlasSprite.bZh;
                if (textureAtlasSprite2 == null) continue;
                if (textureAtlasSprite2.NW() <= 0) {
                    textureAtlasSprite2.dE(textureAtlasSprite.NW());
                    textureAtlasSprite2.dF(textureAtlasSprite.NX());
                    textureAtlasSprite2.a(textureAtlasSprite.NW(), textureAtlasSprite.NX(), 0, 0, false);
                    textureAtlasSprite2.Og();
                    List<int[][]> list = textureAtlasSprite.Oo();
                    textureAtlasSprite2.u(list);
                    textureAtlasSprite2.a(textureAtlasSprite.Op());
                }
                textureAtlasSprite2.bZe = n18;
                textureAtlasSprite2.bZf = n19;
                textureAtlasSprite2.bZj = this.bZj;
                textureAtlasSprite2.dJ(textureAtlasSprite.Ok());
                textureAtlasSprite.Om();
                boolean bl2 = false;
                boolean bl3 = true;
                try {
                    TextureUtil.a(textureAtlasSprite2.dD(0), textureAtlasSprite2.NW(), textureAtlasSprite2.NX(), textureAtlasSprite2.NU(), textureAtlasSprite2.NV(), false, true);
                }
                catch (Exception exception) {
                    net.minecraft.src.a.fN("Error uploading sprite single: " + String.valueOf(textureAtlasSprite2) + ", parent: " + String.valueOf(textureAtlasSprite));
                    exception.printStackTrace();
                }
            }
            net.minecraft.src.a.AZ().Bq().a(bZE);
        }
        g.a(g.epj, this);
        this.ae(stitcher.NN(), stitcher.NO());
        if (net.minecraft.src.a.a((Object)System.getProperty("saveTextureMap"), (Object)"true")) {
            net.minecraft.src.a.fN("Exporting texture map: " + this.bZI);
            net.optifine.util.ak.b("debug/" + this.bZI.replaceAll("/", "_"), this.Ll(), this.bZj, stitcher.NN(), stitcher.NO());
        }
    }

    public cm m(cm cm2) {
        return this.a(cm2, 0);
    }

    public cm a(cm cm2, int n2) {
        return this.o(cm2) ? new cm(cm2.atB(), cm2.atA() + ".png") : (n2 == 0 ? new cm(cm2.atB(), String.format("%s/%s%s", this.bZI, cm2.atA(), ".png")) : new cm(cm2.atB(), String.format("%s/mipmaps/%s.%d%s", this.bZI, cm2.atA(), n2, ".png")));
    }

    public TextureAtlasSprite dq(String string) {
        TextureAtlasSprite textureAtlasSprite = this.bZH.get(string);
        if (textureAtlasSprite == null) {
            textureAtlasSprite = this.bZK;
        }
        return textureAtlasSprite;
    }

    public void Ot() {
        int n2;
        if (net.minecraft.src.a.aoG()) {
            ak.eFy = this.NK();
        }
        TextureUtil.ap(this.Ll());
        boolean bl2 = false;
        boolean bl3 = false;
        int n3 = 0;
        for (TextureAtlasSprite textureAtlasSprite : this.bZF) {
            if (!this.h(textureAtlasSprite)) continue;
            textureAtlasSprite.Od();
            if (textureAtlasSprite.Ol()) {
                ++n3;
            }
            if (textureAtlasSprite.bZk != null) {
                bl2 = true;
            }
            if (textureAtlasSprite.bZl == null) continue;
            bl3 = true;
        }
        if (net.minecraft.src.a.LE()) {
            for (TextureAtlasSprite textureAtlasSprite : this.bZF) {
                TextureAtlasSprite textureAtlasSprite2;
                if (!this.h(textureAtlasSprite) || (textureAtlasSprite2 = textureAtlasSprite.bZh) == null) continue;
                if (textureAtlasSprite == net.optifine.util.ak.eOX || textureAtlasSprite == net.optifine.util.ak.eOW) {
                    textureAtlasSprite2.bYY = textureAtlasSprite.bYY;
                }
                textureAtlasSprite.Om();
                textureAtlasSprite2.Od();
                if (!textureAtlasSprite2.Ol()) continue;
                ++n3;
            }
            TextureUtil.ap(this.Ll());
        }
        if (net.minecraft.src.a.aoG()) {
            if (bl2) {
                TextureUtil.ap(this.NK().evw);
                for (TextureAtlasSprite textureAtlasSprite : this.bZF) {
                    if (textureAtlasSprite.bZk == null || !this.h(textureAtlasSprite)) continue;
                    if (textureAtlasSprite == net.optifine.util.ak.eOX || textureAtlasSprite == net.optifine.util.ak.eOW) {
                        textureAtlasSprite.bZk.bYY = textureAtlasSprite.bYY;
                    }
                    textureAtlasSprite.bZk.Od();
                    if (!textureAtlasSprite.bZk.Ol()) continue;
                    ++n3;
                }
            }
            if (bl3) {
                TextureUtil.ap(this.NK().evx);
                for (TextureAtlasSprite textureAtlasSprite : this.bZF) {
                    if (textureAtlasSprite.bZl == null || !this.h(textureAtlasSprite)) continue;
                    if (textureAtlasSprite == net.optifine.util.ak.eOX || textureAtlasSprite == net.optifine.util.ak.eOW) {
                        textureAtlasSprite.bZk.bYY = textureAtlasSprite.bYY;
                    }
                    textureAtlasSprite.bZl.Od();
                    if (!textureAtlasSprite.bZl.Ol()) continue;
                    ++n3;
                }
            }
            if (bl2 || bl3) {
                TextureUtil.ap(this.Ll());
            }
        }
        if ((n2 = net.minecraft.src.a.AZ().bgT.asz) != this.bZW) {
            this.bZV = n3;
            this.bZW = n2;
        }
        if (bi.bd()) {
            bi.aBK();
        }
        if (net.minecraft.src.a.aoG()) {
            ak.eFy = null;
        }
    }

    public TextureAtlasSprite n(cm cm2) {
        if (cm2 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        TextureAtlasSprite textureAtlasSprite = this.bZG.get(cm2.toString());
        if (textureAtlasSprite == null) {
            textureAtlasSprite = TextureAtlasSprite.j(cm2);
            this.bZG.put(cm2.toString(), textureAtlasSprite);
            textureAtlasSprite.a(this.bZS);
            if (net.minecraft.src.a.aoC()) {
                this.a(cm2, textureAtlasSprite);
            }
        }
        return textureAtlasSprite;
    }

    @Override
    public void tick() {
        this.Ot();
    }

    public void dK(int n2) {
        this.bZj = n2;
    }

    public TextureAtlasSprite Ou() {
        return this.bZK;
    }

    public TextureAtlasSprite dr(String string) {
        return this.bZG.get(string);
    }

    public boolean a(String string, TextureAtlasSprite textureAtlasSprite) {
        if (!this.bZG.containsKey(string)) {
            this.bZG.put(string, textureAtlasSprite);
            textureAtlasSprite.a(this.bZS);
            return true;
        }
        return false;
    }

    public boolean g(TextureAtlasSprite textureAtlasSprite) {
        return this.a(textureAtlasSprite.Oc(), textureAtlasSprite);
    }

    public String Ov() {
        return this.bZI;
    }

    public int Ow() {
        return this.bZj;
    }

    private boolean o(cm cm2) {
        String string = cm2.atA();
        return this.ds(string);
    }

    private boolean ds(String string) {
        String string2 = string.toLowerCase();
        return string2.startsWith("mcpatcher/") || string2.startsWith("optifine/");
    }

    public TextureAtlasSprite dt(String string) {
        cm cm2 = new cm(string);
        return this.bZG.get(cm2.toString());
    }

    public TextureAtlasSprite p(cm cm2) {
        return this.bZG.get(cm2.toString());
    }

    private boolean h(TextureAtlasSprite textureAtlasSprite) {
        if (textureAtlasSprite instanceof TextureCompass || textureAtlasSprite instanceof TextureClock) {
            return net.minecraft.src.a.aos();
        }
        return textureAtlasSprite != net.optifine.util.ak.eON && textureAtlasSprite != net.optifine.util.ak.eOO ? (textureAtlasSprite != net.optifine.util.ak.eOP && textureAtlasSprite != net.optifine.util.ak.eOQ ? (textureAtlasSprite != net.optifine.util.ak.eOS && textureAtlasSprite != net.optifine.util.ak.eOT ? (textureAtlasSprite == net.optifine.util.ak.eOR ? net.minecraft.src.a.anz() : textureAtlasSprite == net.optifine.util.ak.eOX || textureAtlasSprite == net.optifine.util.ak.eOW || net.minecraft.src.a.aor()) : net.minecraft.src.a.anC()) : net.minecraft.src.a.anA()) : net.minecraft.src.a.anx();
    }

    public int Ox() {
        return this.bZS.aHt();
    }

    private int a(Map map, IResourceManager iResourceManager) {
        int n2;
        int n3 = this.a(map, iResourceManager, 20);
        if (n3 < 16) {
            n3 = 16;
        }
        if ((n3 = bt.hO(n3)) > 16) {
            net.minecraft.src.a.fO("Sprite size: " + n3);
        }
        if ((n2 = bt.hR(n3)) < 4) {
            n2 = 4;
        }
        return n2;
    }

    private int a(Map map, IResourceManager iResourceManager, int n2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            object3 = object4 = iterator.next();
            TextureAtlasSprite textureAtlasSprite = (TextureAtlasSprite)object3.getValue();
            object2 = new cm(textureAtlasSprite.Oc());
            cm cm2 = this.m((cm)object2);
            if (textureAtlasSprite.a(iResourceManager, (cm)object2)) continue;
            try {
                Dimension dimension;
                InputStream inputStream;
                object = iResourceManager.v(cm2);
                if (object == null || (inputStream = object.getInputStream()) == null || (dimension = net.optifine.util.ak.d(inputStream, "png")) == null) continue;
                int n3 = dimension.width;
                int n4 = bt.hO(n3);
                if (!hashMap.containsKey(n4)) {
                    hashMap.put(n4, 1);
                    continue;
                }
                int n5 = (Integer)hashMap.get(n4);
                hashMap.put(n4, n5 + 1);
            }
            catch (Exception exception) {}
        }
        int n6 = 0;
        object4 = hashMap.keySet();
        object3 = new TreeSet(object4);
        object2 = object3.iterator();
        while (object2.hasNext()) {
            int n7 = (Integer)object2.next();
            int n8 = (Integer)hashMap.get(n7);
            n6 += n8;
        }
        int n9 = 16;
        int n10 = 0;
        int n11 = n6 * n2 / 100;
        object = object3.iterator();
        while (object.hasNext()) {
            int n12 = (Integer)object.next();
            int n13 = (Integer)hashMap.get(n12);
            n10 += n13;
            if (n12 > n9) {
                n9 = n12;
            }
            if (n10 <= n11) continue;
            return n9;
        }
        return n9;
    }

    private int Oy() {
        int n2 = 1 << this.bZj;
        if (n2 < 8) {
            n2 = 8;
        }
        return n2;
    }

    private int[] dL(int n2) {
        BufferedImage bufferedImage = new BufferedImage(16, 16, 2);
        bufferedImage.setRGB(0, 0, 16, 16, TextureUtil.cad, 0, 16);
        BufferedImage bufferedImage2 = net.optifine.util.ak.a(bufferedImage, n2);
        int[] nArray = new int[n2 * n2];
        bufferedImage2.getRGB(0, 0, n2, n2, nArray, 0, n2);
        return nArray;
    }

    public boolean Oz() {
        int n2;
        int n3 = GlStateManager.Kc();
        return n3 == (n2 = this.Ll());
    }

    private void ae(int n2, int n3) {
        this.bZO = -1;
        this.bZP = -1;
        this.bZM = null;
        if (this.bZN > 0) {
            this.bZO = n2 / this.bZN;
            this.bZP = n3 / this.bZN;
            this.bZM = new TextureAtlasSprite[this.bZO * this.bZP];
            this.bZQ = 1.0 / (double)this.bZO;
            this.bZR = 1.0 / (double)this.bZP;
            for (TextureAtlasSprite textureAtlasSprite : this.bZH.values()) {
                double d2 = 0.5 / (double)n2;
                double d3 = 0.5 / (double)n3;
                double d4 = (double)Math.min(textureAtlasSprite.NY(), textureAtlasSprite.NZ()) + d2;
                double d5 = (double)Math.min(textureAtlasSprite.Oa(), textureAtlasSprite.Ob()) + d3;
                double d6 = (double)Math.max(textureAtlasSprite.NY(), textureAtlasSprite.NZ()) - d2;
                double d7 = (double)Math.max(textureAtlasSprite.Oa(), textureAtlasSprite.Ob()) - d3;
                int n4 = (int)(d4 / this.bZQ);
                int n5 = (int)(d5 / this.bZR);
                int n6 = (int)(d6 / this.bZQ);
                int n7 = (int)(d7 / this.bZR);
                for (int i2 = n4; i2 <= n6; ++i2) {
                    if (i2 >= 0 && i2 < this.bZO) {
                        for (int i3 = n5; i3 <= n7; ++i3) {
                            if (i3 >= 0 && i3 < this.bZO) {
                                int n8 = i3 * this.bZO + i2;
                                this.bZM[n8] = textureAtlasSprite;
                                continue;
                            }
                            net.minecraft.src.a.warn("Invalid grid V: " + i3 + ", icon: " + textureAtlasSprite.Oc());
                        }
                        continue;
                    }
                    net.minecraft.src.a.warn("Invalid grid U: " + i2 + ", icon: " + textureAtlasSprite.Oc());
                }
            }
        }
    }

    public TextureAtlasSprite s(double d2, double d3) {
        if (this.bZM == null) {
            return null;
        }
        int n2 = (int)(d3 / this.bZR);
        int n3 = (int)(d2 / this.bZQ);
        int n4 = n2 * this.bZO + n3;
        return n4 >= 0 && n4 <= this.bZM.length ? this.bZM[n4] : null;
    }

    private void a(cm cm2, TextureAtlasSprite textureAtlasSprite) {
        cm cm3;
        cm cm4;
        String string = aq.aBl();
        if (string != null && !cm2.atA().endsWith(string) && net.minecraft.src.a.F(cm4 = this.m(cm3 = new cm(cm2.atB(), cm2.atA() + string)))) {
            TextureAtlasSprite textureAtlasSprite2 = this.n(cm3);
            textureAtlasSprite2.bYv = true;
            textureAtlasSprite.bZn = textureAtlasSprite2;
        }
    }

    public int OA() {
        return this.bZF.size();
    }

    public int OB() {
        return this.bZV;
    }
}

