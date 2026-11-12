/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;
import net.minecraft.network.a;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.g;

public abstract class ahp
implements aj {
    private final int aOb;
    private final a aOc;

    @Override
    public void a(ak ak2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(ak ak2) {
        throw new UnsupportedOperationException();
    }

    public void a(g g2) {
    }

    @Generated
    public ahp(int n2, a a2) {
        this.aOb = n2;
        this.aOc = a2;
    }

    @Generated
    public int va() {
        return this.aOb;
    }

    @Generated
    public a vb() {
        return this.aOc;
    }
}

