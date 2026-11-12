/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.client.audio;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundList;
import net.minecraft.client.audio.SoundList$SoundEntry;
import net.minecraft.client.audio.SoundList$SoundEntry$Type;
import net.minecraft.util.bn;
import org.apache.commons.lang3.Validate;

public class SoundListSerializer
implements JsonDeserializer<SoundList> {
    public SoundList a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = bn.e(jsonElement, "entry");
        SoundList soundList = new SoundList();
        soundList.S(bn.a(jsonObject, "replace", false));
        SoundCategory soundCategory = SoundCategory.cB(bn.a(jsonObject, "category", SoundCategory.biH.Ct()));
        soundList.a(soundCategory);
        Validate.notNull((Object)((Object)soundCategory), (String)"Invalid category", (Object[])new Object[0]);
        if (jsonObject.has("sounds")) {
            JsonArray jsonArray = bn.r(jsonObject, "sounds");
            for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
                JsonElement jsonElement2 = jsonArray.get(i2);
                SoundList$SoundEntry soundList$SoundEntry = new SoundList$SoundEntry();
                if (bn.f(jsonElement2)) {
                    soundList$SoundEntry.cC(bn.a(jsonElement2, "sound"));
                } else {
                    JsonObject jsonObject2 = bn.e(jsonElement2, "sound");
                    soundList$SoundEntry.cC(bn.m(jsonObject2, "name"));
                    if (jsonObject2.has("type")) {
                        SoundList$SoundEntry$Type soundList$SoundEntry$Type = SoundList$SoundEntry$Type.cD(bn.m(jsonObject2, "type"));
                        Validate.notNull((Object)((Object)soundList$SoundEntry$Type), (String)"Invalid type", (Object[])new Object[0]);
                        soundList$SoundEntry.a(soundList$SoundEntry$Type);
                    }
                    if (jsonObject2.has("volume")) {
                        float f2 = bn.o(jsonObject2, "volume");
                        Validate.isTrue((f2 > 0.0f ? 1 : 0) != 0, (String)"Invalid volume", (Object[])new Object[0]);
                        soundList$SoundEntry.M(f2);
                    }
                    if (jsonObject2.has("pitch")) {
                        float f3 = bn.o(jsonObject2, "pitch");
                        Validate.isTrue((f3 > 0.0f ? 1 : 0) != 0, (String)"Invalid pitch", (Object[])new Object[0]);
                        soundList$SoundEntry.N(f3);
                    }
                    if (jsonObject2.has("weight")) {
                        int n2 = bn.p(jsonObject2, "weight");
                        Validate.isTrue((n2 > 0 ? 1 : 0) != 0, (String)"Invalid weight", (Object[])new Object[0]);
                        soundList$SoundEntry.by(n2);
                    }
                    if (jsonObject2.has("stream")) {
                        soundList$SoundEntry.T(bn.n(jsonObject2, "stream"));
                    }
                }
                soundList.CD().add(soundList$SoundEntry);
            }
        }
        return soundList;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}

