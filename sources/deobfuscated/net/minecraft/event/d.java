/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.event;

import com.google.common.collect.Maps;
import java.util.Map;

public final class d
extends Enum<d> {
    public static final /* enum */ d cKU = new d("show_text", true);
    public static final /* enum */ d cKV = new d("show_achievement", true);
    public static final /* enum */ d cKW = new d("show_item", true);
    public static final /* enum */ d cKX = new d("show_entity", true);
    private static final Map<String, d> cKY;
    private final boolean cKZ;
    private final String cLa;
    private static final /* synthetic */ d[] cLb;

    public static d[] values() {
        return (d[])cLb.clone();
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    private d(String string2, boolean bl2) {
        this.cLa = string2;
        this.cKZ = bl2;
    }

    public boolean acT() {
        return this.cKZ;
    }

    public String acU() {
        return this.cLa;
    }

    public static d en(String string) {
        return cKY.get(string);
    }

    private static /* synthetic */ d[] acY() {
        return new d[]{cKU, cKV, cKW, cKX};
    }

    static {
        cLb = d.acY();
        cKY = Maps.newHashMap();
        for (d d2 : d.values()) {
            cKY.put(d2.acU(), d2);
        }
    }
}

