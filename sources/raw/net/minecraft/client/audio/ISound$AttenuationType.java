/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

public final class ISound$AttenuationType
extends Enum<ISound$AttenuationType> {
    public static final /* enum */ ISound$AttenuationType bid = new ISound$AttenuationType(0);
    public static final /* enum */ ISound$AttenuationType bie = new ISound$AttenuationType(2);
    private final int bif;
    private static final /* synthetic */ ISound$AttenuationType[] big;

    public static ISound$AttenuationType[] values() {
        return (ISound$AttenuationType[])big.clone();
    }

    public static ISound$AttenuationType valueOf(String string) {
        return Enum.valueOf(ISound$AttenuationType.class, string);
    }

    private ISound$AttenuationType(int n3) {
        this.bif = n3;
    }

    public int Cj() {
        return this.bif;
    }

    private static /* synthetic */ ISound$AttenuationType[] Ck() {
        return new ISound$AttenuationType[]{bid, bie};
    }

    static {
        big = ISound$AttenuationType.Ck();
    }
}

