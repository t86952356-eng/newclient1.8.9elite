/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 */
package net.optifine.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.nio.charset.StandardCharsets;
import net.minecraft.src.a;
import net.optifine.http.m;
import net.optifine.player.d;
import net.optifine.player.e;
import net.optifine.player.g;

public class f
implements m {
    private String elX = null;

    public f(String string) {
        this.elX = string;
    }

    @Override
    public void b(String string, byte[] byArray, Throwable throwable) {
        if (byArray != null) {
            try {
                String string2 = new String(byArray, StandardCharsets.US_ASCII);
                JsonParser jsonParser = new JsonParser();
                JsonElement jsonElement = jsonParser.parse(string2);
                e e2 = new e(this.elX);
                d d2 = e2.h(jsonElement);
                if (d2 != null) {
                    d2.cN(true);
                    g.a(this.elX, d2);
                }
            }
            catch (Exception exception) {
                a.fN("Error parsing configuration: " + string + ", " + exception.getClass().getName() + ": " + exception.getMessage());
            }
        }
    }
}

