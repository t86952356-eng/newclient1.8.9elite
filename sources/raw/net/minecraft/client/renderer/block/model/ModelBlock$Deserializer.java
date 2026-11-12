/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.renderer.block.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.util.bn;
import net.minecraft.util.cm;
import org.apache.commons.lang3.StringUtils;

public class ModelBlock$Deserializer
implements JsonDeserializer<ModelBlock> {
    public ModelBlock g(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List<BlockPart> list = this.c(jsonDeserializationContext, jsonObject);
        String string = this.q(jsonObject);
        boolean bl2 = StringUtils.isEmpty((CharSequence)string);
        boolean bl3 = list.isEmpty();
        if (bl3 && bl2) {
            throw new JsonParseException("BlockModel requires either elements or parent, found neither");
        }
        if (!bl2 && !bl3) {
            throw new JsonParseException("BlockModel requires either elements or parent, found both");
        }
        Map<String, String> map = this.p(jsonObject);
        boolean bl4 = this.r(jsonObject);
        ItemCameraTransforms itemCameraTransforms = ItemCameraTransforms.bQV;
        if (jsonObject.has("display")) {
            JsonObject jsonObject2 = bn.q(jsonObject, "display");
            itemCameraTransforms = (ItemCameraTransforms)jsonDeserializationContext.deserialize((JsonElement)jsonObject2, ItemCameraTransforms.class);
        }
        return bl3 ? new ModelBlock(new cm(string), map, bl4, true, itemCameraTransforms) : new ModelBlock(list, map, bl4, true, itemCameraTransforms);
    }

    private Map<String, String> p(JsonObject jsonObject) {
        HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("textures")) {
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("textures");
            for (Map.Entry entry : jsonObject2.entrySet()) {
                hashMap.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
            }
        }
        return hashMap;
    }

    private String q(JsonObject jsonObject) {
        return bn.a(jsonObject, "parent", "");
    }

    protected boolean r(JsonObject jsonObject) {
        return bn.a(jsonObject, "ambientocclusion", true);
    }

    protected List<BlockPart> c(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("elements")) {
            for (JsonElement jsonElement : bn.r(jsonObject, "elements")) {
                arrayList.add((BlockPart)jsonDeserializationContext.deserialize(jsonElement, BlockPart.class));
            }
        }
        return arrayList;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.g(jsonElement, type, jsonDeserializationContext);
    }
}

