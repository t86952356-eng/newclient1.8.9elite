/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.audio;

import net.minecraft.client.audio.SoundList$SoundEntry$Type;

public class SoundList$SoundEntry {
    private String gK;
    private float aSO = 1.0f;
    private float ha = 1.0f;
    private int biW = 1;
    private SoundList$SoundEntry$Type bjr = SoundList$SoundEntry$Type.bjt;
    private boolean bjs = false;

    public String CF() {
        return this.gK;
    }

    public void cC(String string) {
        this.gK = string;
    }

    public float CG() {
        return this.aSO;
    }

    public void M(float f2) {
        this.aSO = f2;
    }

    public float CH() {
        return this.ha;
    }

    public void N(float f2) {
        this.ha = f2;
    }

    public int CI() {
        return this.biW;
    }

    public void by(int n2) {
        this.biW = n2;
    }

    public SoundList$SoundEntry$Type CJ() {
        return this.bjr;
    }

    public void a(SoundList$SoundEntry$Type soundList$SoundEntry$Type) {
        this.bjr = soundList$SoundEntry$Type;
    }

    public boolean CK() {
        return this.bjs;
    }

    public void T(boolean bl2) {
        this.bjs = bl2;
    }
}

