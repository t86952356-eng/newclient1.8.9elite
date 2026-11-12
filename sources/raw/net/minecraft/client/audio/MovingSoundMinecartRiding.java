/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.ISound$AttenuationType;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.entity.item.k;
import net.minecraft.entity.player.a;
import net.minecraft.util.bt;
import net.minecraft.util.cm;

public class MovingSoundMinecartRiding
extends MovingSound {
    private final a bij;
    private final k bik;

    public MovingSoundMinecartRiding(a a2, k k2) {
        super(new cm("minecraft:minecart.inside"));
        this.bij = a2;
        this.bik = k2;
        this.biG = ISound$AttenuationType.bid;
        this.biE = true;
        this.biF = 0;
    }

    @Override
    public void jA() {
        if (!this.bik.csb && this.bij.isRiding() && this.bij.crC == this.bik) {
            float f2 = bt.aD(this.bik.ud * this.bik.ud + this.bik.uf * this.bik.uf);
            this.aSO = (double)f2 >= 0.01 ? 0.0f + bt.I(f2, 0.0f, 1.0f) * 0.75f : 0.0f;
        } else {
            this.bih = true;
        }
    }
}

