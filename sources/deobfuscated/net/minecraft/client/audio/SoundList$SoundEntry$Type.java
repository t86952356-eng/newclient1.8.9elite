/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

public final class SoundList$SoundEntry$Type
extends Enum<SoundList$SoundEntry$Type> {
    public static final /* enum */ SoundList$SoundEntry$Type bjt = new SoundList$SoundEntry$Type("file");
    public static final /* enum */ SoundList$SoundEntry$Type bju = new SoundList$SoundEntry$Type("event");
    private final String bjv;
    private static final /* synthetic */ SoundList$SoundEntry$Type[] bjw;

    public static SoundList$SoundEntry$Type[] values() {
        return (SoundList$SoundEntry$Type[])bjw.clone();
    }

    public static SoundList$SoundEntry$Type valueOf(String string) {
        return Enum.valueOf(SoundList$SoundEntry$Type.class, string);
    }

    private SoundList$SoundEntry$Type(String string2) {
        this.bjv = string2;
    }

    public static SoundList$SoundEntry$Type cD(String string) {
        for (SoundList$SoundEntry$Type soundList$SoundEntry$Type : SoundList$SoundEntry$Type.values()) {
            if (!soundList$SoundEntry$Type.bjv.equals(string)) continue;
            return soundList$SoundEntry$Type;
        }
        return null;
    }

    private static /* synthetic */ SoundList$SoundEntry$Type[] CL() {
        return new SoundList$SoundEntry$Type[]{bjt, bju};
    }

    static {
        bjw = SoundList$SoundEntry$Type.CL();
    }
}

