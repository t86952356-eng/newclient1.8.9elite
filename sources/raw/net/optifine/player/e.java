/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
package net.optifine.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.imageio.ImageIO;
import net.minecraft.src.a;
import net.minecraft.util.cm;
import net.optifine.http.l;
import net.optifine.player.d;
import net.optifine.player.h;
import net.optifine.player.i;
import net.optifine.util.r;

public class e {
    private String elX = null;
    public static final String elY = "items";
    public static final String elZ = "type";
    public static final String ema = "active";

    public e(String string) {
        this.elX = string;
    }

    public d h(JsonElement jsonElement) {
        if (jsonElement == null) {
            throw new JsonParseException("JSON object is null, player: " + this.elX);
        }
        JsonObject jsonObject = (JsonObject)jsonElement;
        d d2 = new d();
        JsonArray jsonArray = (JsonArray)jsonObject.get(elY);
        if (jsonArray != null) {
            for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
                h h2;
                JsonObject jsonObject2 = (JsonObject)jsonArray.get(i2);
                boolean bl2 = r.a(jsonObject2, ema, true);
                if (!bl2) continue;
                String string = r.m(jsonObject2, elZ);
                if (string == null) {
                    a.warn("Item type is null, player: " + this.elX);
                    continue;
                }
                Object object = r.m(jsonObject2, "model");
                if (object == null) {
                    object = "items/" + string + "/model.cfg";
                }
                if ((h2 = this.ir((String)object)) == null) continue;
                if (!h2.aDw()) {
                    BufferedImage bufferedImage;
                    Object object2 = r.m(jsonObject2, "texture");
                    if (object2 == null) {
                        object2 = "items/" + string + "/users/" + this.elX + ".png";
                    }
                    if ((bufferedImage = this.iq((String)object2)) == null) continue;
                    h2.g(bufferedImage);
                    cm cm2 = new cm("optifine.net", (String)object2);
                    h2.g(cm2);
                }
                d2.a(h2);
            }
        }
        return d2;
    }

    private BufferedImage iq(String string) {
        String string2 = l.aDg() + "/" + string;
        try {
            byte[] byArray = net.optifine.http.d.b(string2, net.minecraft.client.d.AZ().Bp());
            BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(byArray));
            return bufferedImage;
        }
        catch (IOException iOException) {
            a.warn("Error loading item texture " + string + ": " + iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    private h ir(String string) {
        String string2 = l.aDg() + "/" + string;
        try {
            byte[] byArray = net.optifine.http.d.b(string2, net.minecraft.client.d.AZ().Bp());
            String string3 = new String(byArray, StandardCharsets.US_ASCII);
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject)jsonParser.parse(string3);
            h h2 = i.D(jsonObject);
            return h2;
        }
        catch (Exception exception) {
            a.warn("Error loading item model " + string + ": " + exception.getClass().getName() + ": " + exception.getMessage());
            return null;
        }
    }
}

