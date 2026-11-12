/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package net.minecraft.client.renderer.block.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.util.ao;
import net.minecraft.util.bn;

class BlockPartFace$Deserializer
implements JsonDeserializer<BlockPartFace> {
    BlockPartFace$Deserializer() {
    }

    public BlockPartFace d(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        ao ao2 = this.o(jsonObject);
        int n2 = this.m(jsonObject);
        String string = this.n(jsonObject);
        BlockFaceUV blockFaceUV = (BlockFaceUV)jsonDeserializationContext.deserialize((JsonElement)jsonObject, BlockFaceUV.class);
        return new BlockPartFace(ao2, n2, string, blockFaceUV);
    }

    protected int m(JsonObject jsonObject) {
        return bn.a(jsonObject, "tintindex", -1);
    }

    private String n(JsonObject jsonObject) {
        return bn.m(jsonObject, "texture");
    }

    private ao o(JsonObject jsonObject) {
        String string = bn.a(jsonObject, "cullface", "");
        return ao.gg(string);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.d(jsonElement, type, jsonDeserializationContext);
    }
}

