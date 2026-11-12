/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.ISound$AttenuationType;
import net.minecraft.util.cm;

public abstract class PositionedSound
implements ISound {
    protected final cm biA;
    protected float volume = 1.0f;
    protected float pitch = 1.0f;
    protected float biB;
    protected float biC;
    protected float biD;
    protected boolean biE = false;
    protected int biF = 0;
    protected ISound$AttenuationType biG = ISound$AttenuationType.bie;

    protected PositionedSound(cm cm2) {
        this.biA = cm2;
    }

    @Override
    public cm Cc() {
        return this.biA;
    }

    @Override
    public boolean Cd() {
        return this.biE;
    }

    @Override
    public int Ce() {
        return this.biF;
    }

    @Override
    public float getVolume() {
        return this.volume;
    }

    @Override
    public float getPitch() {
        return this.pitch;
    }

    @Override
    public float Cf() {
        return this.biB;
    }

    @Override
    public float Cg() {
        return this.biC;
    }

    @Override
    public float Ch() {
        return this.biD;
    }

    @Override
    public ISound$AttenuationType Ci() {
        return this.biG;
    }
}

