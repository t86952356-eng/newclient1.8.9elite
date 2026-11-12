/*
 * Decompiled with CFR 0.152.
 */
package net.optifine;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.src.a;
import net.minecraft.util.b;
import net.minecraft.util.cm;
import net.optifine.ba;
import net.optifine.j;
import net.optifine.util.ak;

public class bb {
    private static ba[] edH = new ba[0];

    public static void jA() {
        edH = new ba[0];
        if (a.aoB()) {
            String string = "optifine/natural.properties";
            try {
                cm cm2 = new cm("optifine/natural.properties");
                if (!a.F(cm2)) {
                    a.fN("NaturalTextures: configuration \"optifine/natural.properties\" not found");
                    return;
                }
                boolean bl2 = a.G(cm2);
                InputStream inputStream = a.u(cm2);
                ArrayList<ba> arrayList = new ArrayList<ba>(256);
                String string2 = a.h(inputStream);
                inputStream.close();
                String[] stringArray = a.V(string2, "\n\r");
                if (bl2) {
                    a.fN("Natural Textures: Parsing default configuration \"optifine/natural.properties\"");
                    a.fN("Natural Textures: Valid only for textures from default resource pack");
                } else {
                    a.fN("Natural Textures: Parsing configuration \"optifine/natural.properties\"");
                }
                TextureMap textureMap = ak.Bu();
                for (int i2 = 0; i2 < stringArray.length; ++i2) {
                    String string3 = stringArray[i2].trim();
                    if (string3.startsWith("#")) continue;
                    String[] stringArray2 = a.V(string3, "=");
                    if (stringArray2.length != 2) {
                        a.warn("Natural Textures: Invalid \"optifine/natural.properties\" line: " + string3);
                        continue;
                    }
                    String string4 = stringArray2[0].trim();
                    String string5 = stringArray2[1].trim();
                    TextureAtlasSprite textureAtlasSprite = textureMap.dt("minecraft:blocks/" + string4);
                    if (textureAtlasSprite == null) {
                        a.warn("Natural Textures: Texture not found: \"optifine/natural.properties\" line: " + string3);
                        continue;
                    }
                    int n2 = textureAtlasSprite.Oj();
                    if (n2 < 0) {
                        a.warn("Natural Textures: Invalid \"optifine/natural.properties\" line: " + string3);
                        continue;
                    }
                    if (bl2 && !a.G(new cm("textures/blocks/" + string4 + ".png"))) {
                        return;
                    }
                    ba ba2 = new ba(string5);
                    if (!ba2.ln()) continue;
                    while (arrayList.size() <= n2) {
                        arrayList.add(null);
                    }
                    arrayList.set(n2, ba2);
                    a.fN("NaturalTextures: " + string4 + " = " + string5);
                }
                edH = arrayList.toArray(new ba[arrayList.size()]);
            }
            catch (FileNotFoundException fileNotFoundException) {
                a.warn("NaturalTextures: configuration \"optifine/natural.properties\" not found");
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static BakedQuad a(b b2, BakedQuad bakedQuad) {
        TextureAtlasSprite textureAtlasSprite = bakedQuad.LO();
        if (textureAtlasSprite == null) {
            return bakedQuad;
        }
        ba ba2 = bb.k(textureAtlasSprite);
        if (ba2 == null) {
            return bakedQuad;
        }
        int n2 = j.B(bakedQuad.LS());
        int n3 = a.d(b2, n2);
        int n4 = 0;
        boolean bl2 = false;
        if (ba2.bQz > 1) {
            n4 = n3 & 3;
        }
        if (ba2.bQz == 2) {
            n4 = n4 / 2 * 2;
        }
        if (ba2.edF) {
            bl2 = (n3 & 4) != 0;
        }
        return ba2.a(bakedQuad, n4, bl2);
    }

    public static ba k(TextureAtlasSprite textureAtlasSprite) {
        if (!(textureAtlasSprite instanceof TextureAtlasSprite)) {
            return null;
        }
        int n2 = textureAtlasSprite.Oj();
        if (n2 >= 0 && n2 < edH.length) {
            ba ba2 = edH[n2];
            return ba2;
        }
        return null;
    }
}

