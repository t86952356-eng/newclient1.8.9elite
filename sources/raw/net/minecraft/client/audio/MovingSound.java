/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.ITickableSound;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.util.cm;

public abstract class MovingSound
extends PositionedSound
implements ITickableSound {
    protected boolean bih = false;

    protected MovingSound(cm cm2) {
        super(cm2);
    }

    @Override
    public boolean Cn() {
        return this.bih;
    }
}

