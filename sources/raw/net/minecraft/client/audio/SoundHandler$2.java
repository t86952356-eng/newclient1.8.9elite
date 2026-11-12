/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.ISoundEventAccessor;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundList$SoundEntry;
import net.minecraft.client.audio.SoundPoolEntry;
import net.minecraft.util.cm;

class SoundHandler$2
implements ISoundEventAccessor<SoundPoolEntry> {
    final cm bjk;
    final /* synthetic */ String bjl;
    final /* synthetic */ SoundList$SoundEntry bjm;
    final /* synthetic */ SoundHandler bjn;

    SoundHandler$2() {
        this.bjn = var1_1;
        this.bjl = var2_2;
        this.bjm = var3_3;
        this.bjk = new cm(this.bjl, this.bjm.CF());
    }

    @Override
    public int Cl() {
        SoundEventAccessorComposite soundEventAccessorComposite = (SoundEventAccessorComposite)this.bjn.bjh.w(this.bjk);
        return soundEventAccessorComposite == null ? 0 : soundEventAccessorComposite.Cl();
    }

    public SoundPoolEntry Cw() {
        SoundEventAccessorComposite soundEventAccessorComposite = (SoundEventAccessorComposite)this.bjn.bjh.w(this.bjk);
        return soundEventAccessorComposite == null ? SoundHandler.bjg : soundEventAccessorComposite.Cw();
    }

    @Override
    public /* synthetic */ Object Cm() {
        return this.Cw();
    }
}

