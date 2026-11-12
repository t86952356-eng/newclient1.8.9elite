/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.audio;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.client.audio.SoundList$SoundEntry;

public class SoundList {
    private final List<SoundList$SoundEntry> bjp = Lists.newArrayList();
    private boolean bjq;
    private SoundCategory bja;

    public List<SoundList$SoundEntry> CD() {
        return this.bjp;
    }

    public boolean CE() {
        return this.bjq;
    }

    public void S(boolean bl2) {
        this.bjq = bl2;
    }

    public SoundCategory Cy() {
        return this.bja;
    }

    public void a(SoundCategory soundCategory) {
        this.bja = soundCategory;
    }
}

