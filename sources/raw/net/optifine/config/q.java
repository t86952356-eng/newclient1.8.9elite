/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.config;

import net.minecraft.world.w;

public final class q
extends Enum<q> {
    public static final /* enum */ q efy = new q();
    public static final /* enum */ q efz = new q();
    public static final /* enum */ q efA = new q();
    private static final /* synthetic */ q[] efB;

    public static q[] values() {
        return (q[])efB.clone();
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    public static q a(w w2, float f2) {
        float f3 = w2.bY(f2);
        if (f3 > 0.5f) {
            return efA;
        }
        float f4 = w2.ca(f2);
        return f4 > 0.5f ? efz : efy;
    }

    private static /* synthetic */ q[] aCc() {
        return new q[]{efy, efz, efA};
    }

    static {
        efB = q.aCc();
    }
}

