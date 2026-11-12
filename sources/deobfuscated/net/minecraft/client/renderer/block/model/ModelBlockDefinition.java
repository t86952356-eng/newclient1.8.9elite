/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package net.minecraft.client.renderer.block.model;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Deserializer;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$MissingVariantException;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant$Deserializer;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variants;

public class ModelBlockDefinition {
    static final Gson bRY = new GsonBuilder().registerTypeAdapter(ModelBlockDefinition.class, (Object)new ModelBlockDefinition$Deserializer()).registerTypeAdapter(ModelBlockDefinition$Variant.class, (Object)new ModelBlockDefinition$Variant$Deserializer()).create();
    private final Map<String, ModelBlockDefinition$Variants> bRZ = Maps.newHashMap();

    public static ModelBlockDefinition b(Reader reader) {
        return (ModelBlockDefinition)bRY.fromJson(reader, ModelBlockDefinition.class);
    }

    public ModelBlockDefinition(Collection<ModelBlockDefinition$Variants> collection) {
        for (ModelBlockDefinition$Variants modelBlockDefinition$Variants : collection) {
            this.bRZ.put(modelBlockDefinition$Variants.bSf, modelBlockDefinition$Variants);
        }
    }

    public ModelBlockDefinition(List<ModelBlockDefinition> list) {
        for (ModelBlockDefinition modelBlockDefinition : list) {
            this.bRZ.putAll(modelBlockDefinition.bRZ);
        }
    }

    public ModelBlockDefinition$Variants dl(String string) {
        ModelBlockDefinition$Variants modelBlockDefinition$Variants = this.bRZ.get(string);
        if (modelBlockDefinition$Variants == null) {
            throw new ModelBlockDefinition$MissingVariantException(this);
        }
        return modelBlockDefinition$Variants;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ModelBlockDefinition) {
            ModelBlockDefinition modelBlockDefinition = (ModelBlockDefinition)object;
            return this.bRZ.equals(modelBlockDefinition.bRZ);
        }
        return false;
    }

    public int hashCode() {
        return this.bRZ.hashCode();
    }
}

