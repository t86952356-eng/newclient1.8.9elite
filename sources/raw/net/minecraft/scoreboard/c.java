/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.scoreboard;

import com.google.common.collect.Maps;
import java.util.Map;

public final class c
extends Enum<c> {
    public static final /* enum */ c djy = new c("integer");
    public static final /* enum */ c djz = new c("hearts");
    private static final Map<String, c> djA;
    private final String djB;
    private static final /* synthetic */ c[] djC;

    public static c[] values() {
        return (c[])djC.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    private c(String string2) {
        this.djB = string2;
    }

    public String akj() {
        return this.djB;
    }

    public static c fj(String string) {
        c c2 = djA.get(string);
        return c2 == null ? djy : c2;
    }

    private static /* synthetic */ c[] akk() {
        return new c[]{djy, djz};
    }

    static {
        djC = c.akk();
        djA = Maps.newHashMap();
        for (c c2 : c.values()) {
            djA.put(c2.akj(), c2);
        }
    }
}

