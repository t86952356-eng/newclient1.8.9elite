/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import java.util.Random;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MusicTicker$MusicType;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.d;
import net.minecraft.util.bi;
import net.minecraft.util.bt;

public class MusicTicker
implements bi {
    private final Random bil = new Random();
    private final d bim;
    private ISound bin;
    private int bio = 100;

    public MusicTicker(d d2) {
        this.bim = d2;
    }

    @Override
    public void jA() {
        MusicTicker$MusicType musicTicker$MusicType = this.bim.By();
        if (this.bin != null) {
            if (!musicTicker$MusicType.Cp().equals(this.bin.Cc())) {
                this.bim.Bx().b(this.bin);
                this.bio = bt.b(this.bil, 0, musicTicker$MusicType.Cq() / 2);
            }
            if (!this.bim.Bx().c(this.bin)) {
                this.bin = null;
                this.bio = Math.min(bt.b(this.bil, musicTicker$MusicType.Cq(), musicTicker$MusicType.Cr()), this.bio);
            }
        }
        if (this.bin == null && this.bio-- <= 0) {
            this.a(musicTicker$MusicType);
        }
    }

    public void a(MusicTicker$MusicType musicTicker$MusicType) {
        this.bin = PositionedSoundRecord.c(musicTicker$MusicType.Cp());
        this.bim.Bx().a(this.bin);
        this.bio = Integer.MAX_VALUE;
    }

    public void Co() {
        if (this.bin != null) {
            this.bim.Bx().b(this.bin);
            this.bin = null;
            this.bio = 0;
        }
    }
}

