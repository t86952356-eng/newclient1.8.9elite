/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.Set;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.util.cm;

public interface IResourcePack {
    public InputStream r(cm var1);

    public boolean s(cm var1);

    public Set<String> Ph();

    public <T extends IMetadataSection> T a(IMetadataSerializer var1, String var2);

    public BufferedImage Pe();

    public String Pf();
}

