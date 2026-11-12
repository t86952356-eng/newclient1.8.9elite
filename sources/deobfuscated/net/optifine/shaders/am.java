/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
package net.optifine.shaders;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.client.resources.data.AnimationMetadataSectionSerializer;
import net.minecraft.client.resources.data.FontMetadataSection;
import net.minecraft.client.resources.data.FontMetadataSectionSerializer;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.client.resources.data.LanguageMetadataSection;
import net.minecraft.client.resources.data.LanguageMetadataSectionSerializer;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.client.resources.data.PackMetadataSectionSerializer;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.client.resources.data.TextureMetadataSectionSerializer;
import net.optifine.shaders.ah;
import net.optifine.shaders.w;
import org.apache.commons.io.IOUtils;

public class am
extends AbstractTexture {
    private final String eFC;
    private static final IMetadataSerializer eFD = am.aHn();

    public am(String string) {
        this.eFC = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(IResourceManager iResourceManager) {
        this.NJ();
        InputStream inputStream = ah.iW(this.eFC);
        if (inputStream == null) {
            throw new FileNotFoundException("Shader texture not found: " + this.eFC);
        }
        try {
            BufferedImage bufferedImage = TextureUtil.d(inputStream);
            TextureMetadataSection textureMetadataSection = this.aHm();
            TextureUtil.a(this.Ll(), bufferedImage, textureMetadataSection.Qh(), textureMetadataSection.Qi());
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private TextureMetadataSection aHm() {
        String string = this.eFC + ".mcmeta";
        String string2 = "texture";
        InputStream inputStream = ah.iW(string);
        if (inputStream != null) {
            TextureMetadataSection textureMetadataSection;
            TextureMetadataSection textureMetadataSection2;
            IMetadataSerializer iMetadataSerializer = eFD;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                JsonObject jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
                textureMetadataSection2 = (TextureMetadataSection)iMetadataSerializer.a("texture", jsonObject);
                if (textureMetadataSection2 == null) {
                    TextureMetadataSection textureMetadataSection3 = new TextureMetadataSection(false, false, new ArrayList<Integer>());
                    return textureMetadataSection3;
                }
                textureMetadataSection = textureMetadataSection2;
            }
            catch (RuntimeException runtimeException) {
                w.iH("Error reading metadata: " + string);
                w.iH(runtimeException.getClass().getName() + ": " + runtimeException.getMessage());
                textureMetadataSection2 = new TextureMetadataSection(false, false, new ArrayList<Integer>());
                return textureMetadataSection2;
            }
            finally {
                IOUtils.closeQuietly((Reader)bufferedReader);
                IOUtils.closeQuietly((InputStream)inputStream);
            }
            return textureMetadataSection;
        }
        return new TextureMetadataSection(false, false, new ArrayList<Integer>());
    }

    private static IMetadataSerializer aHn() {
        IMetadataSerializer iMetadataSerializer = new IMetadataSerializer();
        iMetadataSerializer.a(new TextureMetadataSectionSerializer(), TextureMetadataSection.class);
        iMetadataSerializer.a(new FontMetadataSectionSerializer(), FontMetadataSection.class);
        iMetadataSerializer.a(new AnimationMetadataSectionSerializer(), AnimationMetadataSection.class);
        iMetadataSerializer.a(new PackMetadataSectionSerializer(), PackMetadataSection.class);
        iMetadataSerializer.a(new LanguageMetadataSectionSerializer(), LanguageMetadataSection.class);
        return iMetadataSerializer;
    }
}

