/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.SoundList$SoundEntry$Type;

class SoundHandler$3 {
    static final /* synthetic */ int[] bjo;

    static {
        bjo = new int[SoundList$SoundEntry$Type.values().length];
        try {
            SoundHandler$3.bjo[SoundList$SoundEntry$Type.bjt.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            SoundHandler$3.bjo[SoundList$SoundEntry$Type.bju.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

