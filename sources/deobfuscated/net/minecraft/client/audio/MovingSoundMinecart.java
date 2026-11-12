/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.MovingSound;
import net.minecraft.entity.item.k;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class MovingSoundMinecart
extends MovingSound {
    private final k bii;
    private float cY = 0.0f;

    public MovingSoundMinecart(k k2) {
        super(new cm("minecraft:minecart.base"));
        this.bii = k2;
        this.biE = true;
        this.biF = 0;
    }

    @Override
    public void jA() {
        if (this.bii.csb) {
            this.bih = true;
        } else {
            this.biB = (float)this.bii.gW;
            this.biC = (float)this.bii.gX;
            this.biD = (float)this.bii.gY;
            float f2 = bt.aD(this.bii.ud * this.bii.ud + this.bii.uf * this.bii.uf);
            if ((double)f2 >= 0.01) {
                this.cY = bt.I(this.cY + 0.0025f, 0.0f, 1.0f);
                this.volume = 0.0f + bt.I(f2, 0.0f, 0.5f) * 0.7f;
            } else {
                this.cY = 0.0f;
                this.volume = 0.0f;
            }
        }
    }
}

