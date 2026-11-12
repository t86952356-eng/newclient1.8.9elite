/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.TypeAdapterFactory
 */
package net.minecraft.client.resources.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSectionSerializer;
import net.minecraft.client.resources.data.IMetadataSerializer$Registration;
import net.minecraft.util.at;
import net.minecraft.util.ba;
import net.minecraft.util.bb;
import net.minecraft.util.bf;
import net.minecraft.util.ck;
import net.minecraft.util.v;
import net.minecraft.util.x;

public class IMetadataSerializer {
    private final bf<String, IMetadataSerializer$Registration<? extends IMetadataSection>> ceE = new ck<String, IMetadataSerializer$Registration<? extends IMetadataSection>>();
    private final GsonBuilder ceF = new GsonBuilder();
    private Gson gson;

    public IMetadataSerializer() {
        this.ceF.registerTypeHierarchyAdapter(ba.class, (Object)new bb());
        this.ceF.registerTypeHierarchyAdapter(v.class, (Object)new x());
        this.ceF.registerTypeAdapterFactory((TypeAdapterFactory)new at());
    }

    public <T extends IMetadataSection> void a(IMetadataSectionSerializer<T> iMetadataSectionSerializer, Class<T> clazz) {
        this.ceE.b(iMetadataSectionSerializer.Qc(), new IMetadataSerializer$Registration<T>(this, iMetadataSectionSerializer, clazz));
        this.ceF.registerTypeAdapter(clazz, iMetadataSectionSerializer);
        this.gson = null;
    }

    public <T extends IMetadataSection> T a(String string, JsonObject jsonObject) {
        if (string == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!jsonObject.has(string)) {
            return null;
        }
        if (!jsonObject.get(string).isJsonObject()) {
            throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + String.valueOf(jsonObject.get(string)));
        }
        IMetadataSerializer$Registration<? extends IMetadataSection> iMetadataSerializer$Registration = this.ceE.w(string);
        if (iMetadataSerializer$Registration == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
        }
        return (T)((IMetadataSection)this.Qd().fromJson((JsonElement)jsonObject.getAsJsonObject(string), iMetadataSerializer$Registration.ceH));
    }

    private Gson Qd() {
        if (this.gson == null) {
            this.gson = this.ceF.create();
        }
        return this.gson;
    }
}

