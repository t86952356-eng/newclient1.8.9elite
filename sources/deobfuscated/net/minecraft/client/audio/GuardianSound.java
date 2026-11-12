/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.ISound$AttenuationType;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.entity.monster.r;
import net.minecraft.util.cm;

public class GuardianSound
extends MovingSound {
    private final r bic;

    public GuardianSound(r r2) {
        super(new cm("minecraft:mob.guardian.attack"));
        this.bic = r2;
        this.biG = ISound$AttenuationType.bid;
        this.biE = true;
        this.biF = 0;
    }

    @Override
    public void jA() {
        if (!this.bic.csb && this.bic.Zq()) {
            this.biB = (float)this.bic.gW;
            this.biC = (float)this.bic.gX;
            this.biD = (float)this.bic.gY;
            float f2 = this.bic.bi(0.0f);
            this.volume = 0.0f + 1.0f * f2 * f2;
            this.pitch = 0.7f + 0.5f * f2;
        } else {
            this.bih = true;
        }
    }
}

