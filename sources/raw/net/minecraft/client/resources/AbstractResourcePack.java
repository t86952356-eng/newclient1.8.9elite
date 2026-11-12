/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.resources;

import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.util.cm;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractResourcePack
implements IResourcePack {
    private static final Logger ccD = LogManager.getLogger();
    public final File ccE;

    public AbstractResourcePack(File file) {
        this.ccE = file;
    }

    private static String q(cm cm2) {
        return String.format("%s/%s/%s", "assets", cm2.atB(), cm2.atA());
    }

    protected static String a(File file, File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }

    @Override
    public InputStream r(cm cm2) {
        return this.du(AbstractResourcePack.q(cm2));
    }

    @Override
    public boolean s(cm cm2) {
        return this.dv(AbstractResourcePack.q(cm2));
    }

    protected abstract InputStream du(String var1);

    protected abstract boolean dv(String var1);

    protected void dw(String string) {
        ccD.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", new Object[]{string, this.ccE});
    }

    @Override
    public <T extends IMetadataSection> T a(IMetadataSerializer iMetadataSerializer, String string) {
        return AbstractResourcePack.a(iMetadataSerializer, this.du("pack.mcmeta"), string);
    }

    static <T extends IMetadataSection> T a(IMetadataSerializer iMetadataSerializer, InputStream inputStream, String string) {
        JsonObject jsonObject = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
            jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
        }
        catch (RuntimeException runtimeException) {
            try {
                throw new JsonParseException((Throwable)runtimeException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(bufferedReader);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
        return iMetadataSerializer.a(string, jsonObject);
    }

    @Override
    public BufferedImage Pe() {
        return TextureUtil.d(this.du("pack.png"));
    }

    @Override
    public String Pf() {
        return this.ccE.getName();
    }
}

