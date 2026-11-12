/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.audio;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.client.audio.ISoundEventAccessor;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.SoundPoolEntry;
import net.minecraft.util.cm;

public class SoundEventAccessorComposite
implements ISoundEventAccessor<SoundPoolEntry> {
    private final List<ISoundEventAccessor<SoundPoolEntry>> biX = Lists.newArrayList();
    private final Random biY = new Random();
    private final cm biZ;
    private final SoundCategory bja;
    private final double bjb;
    private final double bjc;

    public SoundEventAccessorComposite(cm cm2, double d2, double d3, SoundCategory soundCategory) {
        this.biZ = cm2;
        this.bjc = d3;
        this.bjb = d2;
        this.bja = soundCategory;
    }

    @Override
    public int Cl() {
        int n2 = 0;
        for (ISoundEventAccessor<SoundPoolEntry> iSoundEventAccessor : this.biX) {
            n2 += iSoundEventAccessor.Cl();
        }
        return n2;
    }

    public SoundPoolEntry Cw() {
        int n2 = this.Cl();
        if (!this.biX.isEmpty() && n2 != 0) {
            int n3 = this.biY.nextInt(n2);
            for (ISoundEventAccessor<SoundPoolEntry> iSoundEventAccessor : this.biX) {
                if ((n3 -= iSoundEventAccessor.Cl()) >= 0) continue;
                SoundPoolEntry soundPoolEntry = iSoundEventAccessor.Cm();
                soundPoolEntry.ah(soundPoolEntry.ax() * this.bjb);
                soundPoolEntry.ai(soundPoolEntry.CV() * this.bjc);
                return soundPoolEntry;
            }
            return SoundHandler.bjg;
        }
        return SoundHandler.bjg;
    }

    public void a(ISoundEventAccessor<SoundPoolEntry> iSoundEventAccessor) {
        this.biX.add(iSoundEventAccessor);
    }

    public cm Cx() {
        return this.biZ;
    }

    public SoundCategory Cy() {
        return this.bja;
    }

    @Override
    public /* synthetic */ Object Cm() {
        return this.Cw();
    }
}

