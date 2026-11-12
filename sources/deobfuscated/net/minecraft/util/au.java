/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.JsonWriter
 */
package net.minecraft.util;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map;
import net.minecraft.util.at;

class au
extends TypeAdapter<T> {
    final /* synthetic */ Map dxT;
    final /* synthetic */ at dxU;

    au(at at2, Map map) {
        this.dxU = at2;
        this.dxT = map;
    }

    public void write(JsonWriter jsonWriter, T t2) {
        if (t2 == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.dxU.v(t2));
        }
    }

    public T read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.dxT.get(jsonReader.nextString());
    }
}

