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
    private int ddK;
    private b ddL;
    private int ddM;
    private boolean ddN;

    public as() {
    }

    public as(int n2, b b2, int n3, boolean bl2) {
        this.ddK = n2;
        this.ddL = b2;
        this.ddM = n3;
        this.ddN = bl2;
    }

    @Override
    public void a(ak ak2) {
        this.ddK = ak2.readInt();
        this.ddL = ak2.afu();
        this.ddM = ak2.readInt();
        this.ddN = ak2.readBoolean();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.ddK);
        ak2.ak(this.ddL);
        ak2.writeInt(this.ddM);
        ak2.writeBoolean(this.ddN);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public boolean isSoundServerwide() {
        return this.ddN;
    }

    public int getSoundType() {
        return this.ddK;
    }

    public int getSoundData() {
        return this.ddM;
    }

    public b ahq() {
        return this.ddL;
    }
}

