/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;

public class as
implements aj<a> {
    private int soundType;
    private b ddL;
    private int soundData;
    private boolean soundServerwide;

    public as() {
    }

    public as(int n2, b b2, int n3, boolean bl2) {
        this.soundType = n2;
        this.ddL = b2;
        this.soundData = n3;
        this.soundServerwide = bl2;
    }

    @Override
    public void a(ak ak2) {
        this.soundType = ak2.readInt();
        this.ddL = ak2.afu();
        this.soundData = ak2.readInt();
        this.soundServerwide = ak2.readBoolean();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.soundType);
        ak2.ak(this.ddL);
        ak2.writeInt(this.soundData);
        ak2.writeBoolean(this.soundServerwide);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public boolean isSoundServerwide() {
        return this.soundServerwide;
    }

    public int getSoundType() {
        return this.soundType;
    }

    public int getSoundData() {
        return this.soundData;
    }

    public b ahq() {
        return this.ddL;
    }
}

