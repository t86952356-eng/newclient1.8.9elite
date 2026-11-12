/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.audio;

import com.google.common.collect.Maps;
import java.util.Map;

public final class SoundCategory
extends Enum<SoundCategory> {
    public static final /* enum */ SoundCategory biH = new SoundCategory("master", 0);
    public static final /* enum */ SoundCategory biI = new SoundCategory("music", 1);
    public static final /* enum */ SoundCategory biJ = new SoundCategory("record", 2);
    public static final /* enum */ SoundCategory biK = new SoundCategory("weather", 3);
    public static final /* enum */ SoundCategory biL = new SoundCategory("block", 4);
    public static final /* enum */ SoundCategory biM = new SoundCategory("hostile", 5);
    public static final /* enum */ SoundCategory biN = new SoundCategory("neutral", 6);
    public static final /* enum */ SoundCategory biO = new SoundCategory("player", 7);
    public static final /* enum */ SoundCategory biP = new SoundCategory("ambient", 8);
    private static final Map<String, SoundCategory> biQ;
    private static final Map<Integer, SoundCategory> biR;
    private final String biS;
    private final int biT;
    private static final /* synthetic */ SoundCategory[] biU;

    public static SoundCategory[] values() {
        return (SoundCategory[])biU.clone();
    }

    public static SoundCategory valueOf(String string) {
        return Enum.valueOf(SoundCategory.class, string);
    }

    private SoundCategory(String string2, int n3) {
        this.biS = string2;
        this.biT = n3;
    }

    public String Ct() {
        return this.biS;
    }

    public int Cu() {
        return this.biT;
    }

    public static SoundCategory cB(String string) {
        return biQ.get(string);
    }

    private static /* synthetic */ SoundCategory[] Cv() {
        return new SoundCategory[]{biH, biI, biJ, biK, biL, biM, biN, biO, biP};
    }

    static {
        biU = SoundCategory.Cv();
        biQ = Maps.newHashMap();
        biR = Maps.newHashMap();
        for (SoundCategory soundCategory : SoundCategory.values()) {
            if (biQ.containsKey(soundCategory.Ct()) || biR.containsKey(soundCategory.Cu())) {
                throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + String.valueOf((Object)soundCategory));
            }
            biQ.put(soundCategory.Ct(), soundCategory);
            biR.put(soundCategory.Cu(), soundCategory);
        }
    }
}

