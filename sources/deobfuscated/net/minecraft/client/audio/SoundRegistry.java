/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.audio;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.audio.SoundEventAccessorComposite;
import net.minecraft.util.ck;
import net.minecraft.util.cm;

public class SoundRegistry
extends ck<cm, SoundEventAccessorComposite> {
    private Map<cm, SoundEventAccessorComposite> bjP;

    @Override
    protected Map<cm, SoundEventAccessorComposite> CX() {
        this.bjP = Maps.newHashMap();
        return this.bjP;
    }

    public void a(SoundEventAccessorComposite soundEventAccessorComposite) {
        this.b(soundEventAccessorComposite.Cx(), soundEventAccessorComposite);
    }

    public void CY() {
        this.bjP.clear();
    }
}

