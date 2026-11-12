/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.ISoundEventAccessor;
import net.minecraft.client.audio.SoundPoolEntry;

public class SoundEventAccessor
implements ISoundEventAccessor<SoundPoolEntry> {
    private final SoundPoolEntry biV;
    private final int biW;

    SoundEventAccessor(SoundPoolEntry soundPoolEntry, int n2) {
        this.biV = soundPoolEntry;
        this.biW = n2;
    }

    @Override
    public int Cl() {
        return this.biW;
    }

    public SoundPoolEntry Cw() {
        return new SoundPoolEntry(this.biV);
    }

    @Override
    public /* synthetic */ Object Cm() {
        return this.Cw();
    }
}

