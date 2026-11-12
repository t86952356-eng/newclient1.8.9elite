/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.resources;

import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.FileResourcePack;
import net.minecraft.client.resources.FolderResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.util.an;
import net.minecraft.util.cm;
import org.apache.commons.io.IOUtils;

public class ResourcePackRepository$Entry {
    private final File cdK;
    private IResourcePack cdL;
    private PackMetadataSection cdM;
    private BufferedImage cdN;
    private cm cdO;
    final /* synthetic */ ResourcePackRepository cdP;

    private ResourcePackRepository$Entry(ResourcePackRepository resourcePackRepository, File file) {
        this.cdP = resourcePackRepository;
        this.cdK = file;
    }

    public void PO() {
        this.cdL = this.cdK.isDirectory() ? new FolderResourcePack(this.cdK) : new FileResourcePack(this.cdK);
        this.cdM = (PackMetadataSection)this.cdL.a(this.cdP.cdz, "pack");
        try {
            this.cdN = this.cdL.Pe();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (this.cdN == null) {
            this.cdN = this.cdP.cdx.Pe();
        }
        this.PP();
    }

    public void b(TextureManager textureManager) {
        if (this.cdO == null) {
            this.cdO = textureManager.a("texturepackicon", new DynamicTexture(this.cdN));
        }
        textureManager.a(this.cdO);
    }

    public void PP() {
        if (this.cdL instanceof Closeable) {
            IOUtils.closeQuietly((Closeable)((Closeable)((Object)this.cdL)));
        }
    }

    public IResourcePack PQ() {
        return this.cdL;
    }

    public String Pm() {
        return this.cdL.Pf();
    }

    public String PR() {
        return this.cdM == null ? String.valueOf((Object)an.dvX) + "Invalid pack.mcmeta (or missing 'pack' section)" : this.cdM.Qf().getFormattedText();
    }

    public int PS() {
        return this.cdM.Qg();
    }

    public boolean equals(Object object) {
        return this == object || object instanceof ResourcePackRepository$Entry && this.toString().equals(object.toString());
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return String.format("%s:%s:%d", this.cdK.getName(), this.cdK.isDirectory() ? "folder" : "zip", this.cdK.lastModified());
    }
}

