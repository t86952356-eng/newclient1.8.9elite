/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.au;
import net.minecraft.client.gui.c;

class av
extends c {
    av(au au2, int n2, int n3, int n4, int n5, int n6, String string) {
        super(n2, n3, n4, n5, n6, string);
    }

    @Override
    public void playPressSound(SoundHandler soundHandler) {
        SoundEventAccessorComposite soundEventAccessorComposite = soundHandler.a(SoundCategory.biN, SoundCategory.biL, SoundCategory.biM, SoundCategory.biO, SoundCategory.biK);
        if (soundEventAccessorComposite != null) {
            soundHandler.a(PositionedSoundRecord.a(soundEventAccessorComposite.Cx(), 0.5f));
        }
    }
}

