/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public final class cf
extends Enum<cf> {
    public static final /* enum */ cf dzx = new cf();
    public static final /* enum */ cf dzy = new cf();
    public static final /* enum */ cf dzz = new cf();
    private static final /* synthetic */ cf[] dzA;

    public static cf[] values() {
        return (cf[])dzA.clone();
    }

    public static cf valueOf(String string) {
        return Enum.valueOf(cf.class, string);
    }

    private static /* synthetic */ cf[] atw() {
        return new cf[]{dzx, dzy, dzz};
    }

    static {
        dzA = cf.atw();
    }
}

