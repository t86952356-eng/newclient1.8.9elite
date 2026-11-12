/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net.minecraft.world.gen;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.util.bn;
import net.minecraft.world.biome.j;
import net.minecraft.world.gen.h;

public class i
implements JsonDeserializer<h>,
JsonSerializer<h> {
    public h v(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        h h2 = new h();
        try {
            h2.dLN = bn.a(jsonObject, "coordinateScale", h2.dLN);
            h2.dLO = bn.a(jsonObject, "heightScale", h2.dLO);
            h2.dLQ = bn.a(jsonObject, "lowerLimitScale", h2.dLQ);
            h2.dLP = bn.a(jsonObject, "upperLimitScale", h2.dLP);
            h2.dLR = bn.a(jsonObject, "depthNoiseScaleX", h2.dLR);
            h2.dLS = bn.a(jsonObject, "depthNoiseScaleZ", h2.dLS);
            h2.dLT = bn.a(jsonObject, "depthNoiseScaleExponent", h2.dLT);
            h2.dLU = bn.a(jsonObject, "mainNoiseScaleX", h2.dLU);
            h2.dLV = bn.a(jsonObject, "mainNoiseScaleY", h2.dLV);
            h2.dLW = bn.a(jsonObject, "mainNoiseScaleZ", h2.dLW);
            h2.dLX = bn.a(jsonObject, "baseSize", h2.dLX);
            h2.dLY = bn.a(jsonObject, "stretchY", h2.dLY);
            h2.dLZ = bn.a(jsonObject, "biomeDepthWeight", h2.dLZ);
            h2.dNo = bn.a(jsonObject, "biomeDepthOffset", h2.dNo);
            h2.dMb = bn.a(jsonObject, "biomeScaleWeight", h2.dMb);
            h2.dMc = bn.a(jsonObject, "biomeScaleOffset", h2.dMc);
            h2.dMd = bn.a(jsonObject, "seaLevel", h2.dMd);
            h2.dMe = bn.a(jsonObject, "useCaves", h2.dMe);
            h2.dMf = bn.a(jsonObject, "useDungeons", h2.dMf);
            h2.dMg = bn.a(jsonObject, "dungeonChance", h2.dMg);
            h2.dMh = bn.a(jsonObject, "useStrongholds", h2.dMh);
            h2.dMi = bn.a(jsonObject, "useVillages", h2.dMi);
            h2.dMj = bn.a(jsonObject, "useMineShafts", h2.dMj);
            h2.dMk = bn.a(jsonObject, "useTemples", h2.dMk);
            h2.dMl = bn.a(jsonObject, "useMonuments", h2.dMl);
            h2.dMm = bn.a(jsonObject, "useRavines", h2.dMm);
            h2.dMn = bn.a(jsonObject, "useWaterLakes", h2.dMn);
            h2.dMo = bn.a(jsonObject, "waterLakeChance", h2.dMo);
            h2.dMp = bn.a(jsonObject, "useLavaLakes", h2.dMp);
            h2.dMq = bn.a(jsonObject, "lavaLakeChance", h2.dMq);
            h2.dMr = bn.a(jsonObject, "useLavaOceans", h2.dMr);
            h2.dMs = bn.a(jsonObject, "fixedBiome", h2.dMs);
            if (h2.dMs < 38 && h2.dMs >= -1) {
                if (h2.dMs >= j.dGn.dHo) {
                    h2.dMs += 2;
                }
            } else {
                h2.dMs = -1;
            }
            h2.dMt = bn.a(jsonObject, "biomeSize", h2.dMt);
            h2.dMu = bn.a(jsonObject, "riverSize", h2.dMu);
            h2.dMv = bn.a(jsonObject, "dirtSize", h2.dMv);
            h2.dMw = bn.a(jsonObject, "dirtCount", h2.dMw);
            h2.dMx = bn.a(jsonObject, "dirtMinHeight", h2.dMx);
            h2.dMy = bn.a(jsonObject, "dirtMaxHeight", h2.dMy);
            h2.dMz = bn.a(jsonObject, "gravelSize", h2.dMz);
            h2.dMA = bn.a(jsonObject, "gravelCount", h2.dMA);
            h2.dMB = bn.a(jsonObject, "gravelMinHeight", h2.dMB);
            h2.dMC = bn.a(jsonObject, "gravelMaxHeight", h2.dMC);
            h2.dMD = bn.a(jsonObject, "graniteSize", h2.dMD);
            h2.dME = bn.a(jsonObject, "graniteCount", h2.dME);
            h2.dMF = bn.a(jsonObject, "graniteMinHeight", h2.dMF);
            h2.dMG = bn.a(jsonObject, "graniteMaxHeight", h2.dMG);
            h2.dMH = bn.a(jsonObject, "dioriteSize", h2.dMH);
            h2.dMI = bn.a(jsonObject, "dioriteCount", h2.dMI);
            h2.dMJ = bn.a(jsonObject, "dioriteMinHeight", h2.dMJ);
            h2.dMK = bn.a(jsonObject, "dioriteMaxHeight", h2.dMK);
            h2.dML = bn.a(jsonObject, "andesiteSize", h2.dML);
            h2.dMM = bn.a(jsonObject, "andesiteCount", h2.dMM);
            h2.dMN = bn.a(jsonObject, "andesiteMinHeight", h2.dMN);
            h2.dMO = bn.a(jsonObject, "andesiteMaxHeight", h2.dMO);
            h2.dMP = bn.a(jsonObject, "coalSize", h2.dMP);
            h2.dMQ = bn.a(jsonObject, "coalCount", h2.dMQ);
            h2.dMR = bn.a(jsonObject, "coalMinHeight", h2.dMR);
            h2.dMS = bn.a(jsonObject, "coalMaxHeight", h2.dMS);
            h2.dMT = bn.a(jsonObject, "ironSize", h2.dMT);
            h2.dMU = bn.a(jsonObject, "ironCount", h2.dMU);
            h2.dMV = bn.a(jsonObject, "ironMinHeight", h2.dMV);
            h2.dMW = bn.a(jsonObject, "ironMaxHeight", h2.dMW);
            h2.dMX = bn.a(jsonObject, "goldSize", h2.dMX);
            h2.dMY = bn.a(jsonObject, "goldCount", h2.dMY);
            h2.dMZ = bn.a(jsonObject, "goldMinHeight", h2.dMZ);
            h2.dNa = bn.a(jsonObject, "goldMaxHeight", h2.dNa);
            h2.dNb = bn.a(jsonObject, "redstoneSize", h2.dNb);
            h2.dNc = bn.a(jsonObject, "redstoneCount", h2.dNc);
            h2.dNd = bn.a(jsonObject, "redstoneMinHeight", h2.dNd);
            h2.dNe = bn.a(jsonObject, "redstoneMaxHeight", h2.dNe);
            h2.dNf = bn.a(jsonObject, "diamondSize", h2.dNf);
            h2.dNg = bn.a(jsonObject, "diamondCount", h2.dNg);
            h2.dNh = bn.a(jsonObject, "diamondMinHeight", h2.dNh);
            h2.dNi = bn.a(jsonObject, "diamondMaxHeight", h2.dNi);
            h2.dNj = bn.a(jsonObject, "lapisSize", h2.dNj);
            h2.dNk = bn.a(jsonObject, "lapisCount", h2.dNk);
            h2.dNl = bn.a(jsonObject, "lapisCenterHeight", h2.dNl);
            h2.dNm = bn.a(jsonObject, "lapisSpread", h2.dNm);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return h2;
    }

    public JsonElement a(h h2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("coordinateScale", (Number)Float.valueOf(h2.dLN));
        jsonObject.addProperty("heightScale", (Number)Float.valueOf(h2.dLO));
        jsonObject.addProperty("lowerLimitScale", (Number)Float.valueOf(h2.dLQ));
        jsonObject.addProperty("upperLimitScale", (Number)Float.valueOf(h2.dLP));
        jsonObject.addProperty("depthNoiseScaleX", (Number)Float.valueOf(h2.dLR));
        jsonObject.addProperty("depthNoiseScaleZ", (Number)Float.valueOf(h2.dLS));
        jsonObject.addProperty("depthNoiseScaleExponent", (Number)Float.valueOf(h2.dLT));
        jsonObject.addProperty("mainNoiseScaleX", (Number)Float.valueOf(h2.dLU));
        jsonObject.addProperty("mainNoiseScaleY", (Number)Float.valueOf(h2.dLV));
        jsonObject.addProperty("mainNoiseScaleZ", (Number)Float.valueOf(h2.dLW));
        jsonObject.addProperty("baseSize", (Number)Float.valueOf(h2.dLX));
        jsonObject.addProperty("stretchY", (Number)Float.valueOf(h2.dLY));
        jsonObject.addProperty("biomeDepthWeight", (Number)Float.valueOf(h2.dLZ));
        jsonObject.addProperty("biomeDepthOffset", (Number)Float.valueOf(h2.dNo));
        jsonObject.addProperty("biomeScaleWeight", (Number)Float.valueOf(h2.dMb));
        jsonObject.addProperty("biomeScaleOffset", (Number)Float.valueOf(h2.dMc));
        jsonObject.addProperty("seaLevel", (Number)h2.dMd);
        jsonObject.addProperty("useCaves", Boolean.valueOf(h2.dMe));
        jsonObject.addProperty("useDungeons", Boolean.valueOf(h2.dMf));
        jsonObject.addProperty("dungeonChance", (Number)h2.dMg);
        jsonObject.addProperty("useStrongholds", Boolean.valueOf(h2.dMh));
        jsonObject.addProperty("useVillages", Boolean.valueOf(h2.dMi));
        jsonObject.addProperty("useMineShafts", Boolean.valueOf(h2.dMj));
        jsonObject.addProperty("useTemples", Boolean.valueOf(h2.dMk));
        jsonObject.addProperty("useMonuments", Boolean.valueOf(h2.dMl));
        jsonObject.addProperty("useRavines", Boolean.valueOf(h2.dMm));
        jsonObject.addProperty("useWaterLakes", Boolean.valueOf(h2.dMn));
        jsonObject.addProperty("waterLakeChance", (Number)h2.dMo);
        jsonObject.addProperty("useLavaLakes", Boolean.valueOf(h2.dMp));
        jsonObject.addProperty("lavaLakeChance", (Number)h2.dMq);
        jsonObject.addProperty("useLavaOceans", Boolean.valueOf(h2.dMr));
        jsonObject.addProperty("fixedBiome", (Number)h2.dMs);
        jsonObject.addProperty("biomeSize", (Number)h2.dMt);
        jsonObject.addProperty("riverSize", (Number)h2.dMu);
        jsonObject.addProperty("dirtSize", (Number)h2.dMv);
        jsonObject.addProperty("dirtCount", (Number)h2.dMw);
        jsonObject.addProperty("dirtMinHeight", (Number)h2.dMx);
        jsonObject.addProperty("dirtMaxHeight", (Number)h2.dMy);
        jsonObject.addProperty("gravelSize", (Number)h2.dMz);
        jsonObject.addProperty("gravelCount", (Number)h2.dMA);
        jsonObject.addProperty("gravelMinHeight", (Number)h2.dMB);
        jsonObject.addProperty("gravelMaxHeight", (Number)h2.dMC);
        jsonObject.addProperty("graniteSize", (Number)h2.dMD);
        jsonObject.addProperty("graniteCount", (Number)h2.dME);
        jsonObject.addProperty("graniteMinHeight", (Number)h2.dMF);
        jsonObject.addProperty("graniteMaxHeight", (Number)h2.dMG);
        jsonObject.addProperty("dioriteSize", (Number)h2.dMH);
        jsonObject.addProperty("dioriteCount", (Number)h2.dMI);
        jsonObject.addProperty("dioriteMinHeight", (Number)h2.dMJ);
        jsonObject.addProperty("dioriteMaxHeight", (Number)h2.dMK);
        jsonObject.addProperty("andesiteSize", (Number)h2.dML);
        jsonObject.addProperty("andesiteCount", (Number)h2.dMM);
        jsonObject.addProperty("andesiteMinHeight", (Number)h2.dMN);
        jsonObject.addProperty("andesiteMaxHeight", (Number)h2.dMO);
        jsonObject.addProperty("coalSize", (Number)h2.dMP);
        jsonObject.addProperty("coalCount", (Number)h2.dMQ);
        jsonObject.addProperty("coalMinHeight", (Number)h2.dMR);
        jsonObject.addProperty("coalMaxHeight", (Number)h2.dMS);
        jsonObject.addProperty("ironSize", (Number)h2.dMT);
        jsonObject.addProperty("ironCount", (Number)h2.dMU);
        jsonObject.addProperty("ironMinHeight", (Number)h2.dMV);
        jsonObject.addProperty("ironMaxHeight", (Number)h2.dMW);
        jsonObject.addProperty("goldSize", (Number)h2.dMX);
        jsonObject.addProperty("goldCount", (Number)h2.dMY);
        jsonObject.addProperty("goldMinHeight", (Number)h2.dMZ);
        jsonObject.addProperty("goldMaxHeight", (Number)h2.dNa);
        jsonObject.addProperty("redstoneSize", (Number)h2.dNb);
        jsonObject.addProperty("redstoneCount", (Number)h2.dNc);
        jsonObject.addProperty("redstoneMinHeight", (Number)h2.dNd);
        jsonObject.addProperty("redstoneMaxHeight", (Number)h2.dNe);
        jsonObject.addProperty("diamondSize", (Number)h2.dNf);
        jsonObject.addProperty("diamondCount", (Number)h2.dNg);
        jsonObject.addProperty("diamondMinHeight", (Number)h2.dNh);
        jsonObject.addProperty("diamondMaxHeight", (Number)h2.dNi);
        jsonObject.addProperty("lapisSize", (Number)h2.dNj);
        jsonObject.addProperty("lapisCount", (Number)h2.dNk);
        jsonObject.addProperty("lapisCenterHeight", (Number)h2.dNl);
        jsonObject.addProperty("lapisSpread", (Number)h2.dNm);
        return jsonObject;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.v(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((h)object, type, jsonSerializationContext);
    }
}

