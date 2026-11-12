/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.resources;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSerializer;
import net.minecraft.util.cm;
import org.apache.commons.io.IOUtils;

public class SimpleResource
implements IResource {
    private final Map<String, IMetadataSection> cdW = Maps.newHashMap();
    private final String cdX;
    private final cm cdY;
    private final InputStream inputStream;
    private final InputStream cea;
    private final IMetadataSerializer ceb;
    private boolean cec;
    private JsonObject ced;

    public SimpleResource(String string, cm cm2, InputStream inputStream, InputStream inputStream2, IMetadataSerializer iMetadataSerializer) {
        this.cdX = string;
        this.cdY = cm2;
        this.inputStream = inputStream;
        this.cea = inputStream2;
        this.ceb = iMetadataSerializer;
    }

    @Override
    public cm Pk() {
        return this.cdY;
    }

    @Override
    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Override
    public boolean Pl() {
        return this.cea != null;
    }

    @Override
    public <T extends IMetadataSection> T dx(String string) {
        Object object;
        if (!this.Pl()) {
            return null;
        }
        if (this.ced == null && !this.cec) {
            this.cec = true;
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(this.cea));
                this.ced = new JsonParser().parse((Reader)object).getAsJsonObject();
            }
            finally {
                IOUtils.closeQuietly((Reader)object);
            }
        }
        if ((object = this.cdW.get(string)) == null) {
            object = this.ceb.a(string, this.ced);
        }
        return (T)object;
    }

    @Override
    public String Pm() {
        return this.cdX;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SimpleResource)) {
            return false;
        }
        SimpleResource simpleResource = (SimpleResource)object;
        if (this.cdY != null ? !this.cdY.equals(simpleResource.cdY) : simpleResource.cdY != null) {
            return false;
        }
        if (this.cdX != null) {
            return this.cdX.equals(simpleResource.cdX);
        }
        return simpleResource.cdX == null;
    }

    public int hashCode() {
        int n2 = this.cdX != null ? this.cdX.hashCode() : 0;
        n2 = 31 * n2 + (this.cdY != null ? this.cdY.hashCode() : 0);
        return n2;
    }
}

