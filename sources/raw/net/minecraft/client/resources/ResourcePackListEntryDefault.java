/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.resources;

import com.google.gson.JsonParseException;
import java.io.IOException;
import net.minecraft.client.gui.cb;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.util.an;
import net.minecraft.util.cm;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResourcePackListEntryDefault
extends ResourcePackListEntry {
    private static final Logger cdq = LogManager.getLogger();
    private final IResourcePack cdr;
    private final cm cds;

    public ResourcePackListEntryDefault(cb cb2) {
        super(cb2);
        DynamicTexture dynamicTexture;
        this.cdr = this.cdn.Bs().cdx;
        try {
            dynamicTexture = new DynamicTexture(this.cdr.Pe());
        }
        catch (IOException iOException) {
            dynamicTexture = TextureUtil.cac;
        }
        this.cds = this.cdn.Bq().a("texturepackicon", dynamicTexture);
    }

    @Override
    protected int Pv() {
        return 1;
    }

    @Override
    protected String Pw() {
        try {
            PackMetadataSection packMetadataSection = (PackMetadataSection)this.cdr.a(this.cdn.Bs().cdz, "pack");
            if (packMetadataSection != null) {
                return packMetadataSection.Qf().getFormattedText();
            }
        }
        catch (JsonParseException jsonParseException) {
            cdq.error("Couldn't load metadata info", (Throwable)jsonParseException);
        }
        catch (IOException iOException) {
            cdq.error("Couldn't load metadata info", (Throwable)iOException);
        }
        return String.valueOf((Object)an.dvX) + "Missing pack.mcmeta :(";
    }

    @Override
    protected boolean PA() {
        return false;
    }

    @Override
    protected boolean PB() {
        return false;
    }

    @Override
    protected boolean PC() {
        return false;
    }

    @Override
    protected boolean PD() {
        return false;
    }

    @Override
    protected String Px() {
        return "Default";
    }

    @Override
    protected void Py() {
        this.cdn.Bq().a(this.cds);
    }

    @Override
    protected boolean Pz() {
        return false;
    }
}

