/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.ISound$AttenuationType;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.util.cm;

public class PositionedSoundRecord
extends PositionedSound {
    public static PositionedSoundRecord a(cm cm2, float f2) {
        return new PositionedSoundRecord(cm2, 0.25f, f2, false, 0, ISound$AttenuationType.bid, 0.0f, 0.0f, 0.0f);
    }

    public static PositionedSoundRecord c(cm cm2) {
        return new PositionedSoundRecord(cm2, 1.0f, 1.0f, false, 0, ISound$AttenuationType.bid, 0.0f, 0.0f, 0.0f);
    }

    public static PositionedSoundRecord a(cm cm2, float f2, float f3, float f4) {
        return new PositionedSoundRecord(cm2, 4.0f, 1.0f, false, 0, ISound$AttenuationType.bie, f2, f3, f4);
    }

    public PositionedSoundRecord(cm cm2, float f2, float f3, float f4, float f5, float f6) {
        this(cm2, f2, f3, false, 0, ISound$AttenuationType.bie, f4, f5, f6);
    }

    public PositionedSoundRecord(cm cm2, float f2, float f3) {
        this(cm2, f2, f3, false, 0, ISound$AttenuationType.bid, 0.0f, 0.0f, 0.0f);
    }

    private PositionedSoundRecord(cm cm2, float f2, float f3, boolean bl2, int n2, ISound$AttenuationType iSound$AttenuationType, float f4, float f5, float f6) {
        super(cm2);
        this.volume = f2;
        this.pitch = f3;
        this.biB = f4;
        this.biC = f5;
        this.biD = f6;
        this.biE = bl2;
        this.biF = n2;
        this.biG = iSound$AttenuationType;
    }
}

