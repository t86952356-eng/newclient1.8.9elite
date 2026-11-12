/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import java.io.InputStream;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.util.cm;

public interface IResource {
    public cm Pk();

    public InputStream getInputStream();

    public boolean Pl();

    public <T extends IMetadataSection> T dx(String var1);

    public String Pm();
}

