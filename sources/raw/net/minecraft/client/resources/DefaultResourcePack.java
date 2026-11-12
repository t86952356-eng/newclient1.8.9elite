/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package net.minecraft.client.resources;

import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.util.cm;
import net.optifine.reflect.l;

public class DefaultResourcePack
implements IResourcePack {
    public static final Set<String> ccH = ImmutableSet.of((Object)"minecraft", (Object)"realms");
    private final Map<String, File> ccI;

    public DefaultResourcePack(Map<String, File> map) {
        this.ccI = map;
    }

    @Override
    public InputStream r(cm cm2) {
        InputStream inputStream = this.u(cm2);
        if (inputStream != null) {
            return inputStream;
        }
        InputStream inputStream2 = this.t(cm2);
        if (inputStream2 != null) {
            return inputStream2;
        }
        throw new FileNotFoundException(cm2.atA());
    }

    public InputStream t(cm cm2) {
        File file = this.ccI.get(cm2.toString());
        return file != null && file.isFile() ? new FileInputStream(file) : null;
    }

    private InputStream u(cm cm2) {
        String string = "/assets/" + cm2.atB() + "/" + cm2.atA();
        InputStream inputStream = l.ix(string);
        return inputStream != null ? inputStream : DefaultResourcePack.class.getResourceAsStream(string);
    }

    @Override
    public boolean s(cm cm2) {
        return this.u(cm2) != null || this.ccI.containsKey(cm2.toString());
    }

    @Override
    public Set<String> Ph() {
        return ccH;
    }

    @Override
    public <T extends IMetadataSection> T a(IMetadataSerializer iMetadataSerializer, String string) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.ccI.get("pack.mcmeta"));
            return AbstractResourcePack.a(iMetadataSerializer, fileInputStream, string);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    @Override
    public BufferedImage Pe() {
        return TextureUtil.d(DefaultResourcePack.class.getResourceAsStream("/" + new cm("pack.png").atA()));
    }

    @Override
    public String Pf() {
        return "Default";
    }
}

