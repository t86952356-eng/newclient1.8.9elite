/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.renderer.block.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant;
import net.minecraft.client.resources.model.ModelRotation;
import net.minecraft.util.bn;
import net.minecraft.util.cm;

public class ModelBlockDefinition$Variant$Deserializer
implements JsonDeserializer<ModelBlockDefinition$Variant> {
    public ModelBlockDefinition$Variant i(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String string = this.u(jsonObject);
        ModelRotation modelRotation = this.t(jsonObject);
        boolean bl2 = this.s(jsonObject);
        int n2 = this.v(jsonObject);
        return new ModelBlockDefinition$Variant(this.dm(string), modelRotation, bl2, n2);
    }

    private cm dm(String string) {
        cm cm2 = new cm(string);
        cm2 = new cm(cm2.atB(), "block/" + cm2.atA());
        return cm2;
    }

    private boolean s(JsonObject jsonObject) {
        return bn.a(jsonObject, "uvlock", false);
    }

    protected ModelRotation t(JsonObject jsonObject) {
        int n2;
        int n3 = bn.a(jsonObject, "x", 0);
        ModelRotation modelRotation = ModelRotation.ag(n3, n2 = bn.a(jsonObject, "y", 0));
        if (modelRotation == null) {
            throw new JsonParseException("Invalid BlockModelRotation x: " + n3 + ", y: " + n2);
        }
        return modelRotation;
    }

    protected String u(JsonObject jsonObject) {
        return bn.m(jsonObject, "model");
    }

    protected int v(JsonObject jsonObject) {
        return bn.a(jsonObject, "weight", 1);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.i(jsonElement, type, jsonDeserializationContext);
    }
}

