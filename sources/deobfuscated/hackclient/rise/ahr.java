/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahp;
import net.minecraft.network.a;
import net.minecraft.network.ak;

public final class ahr
extends ahp {
    private int aOe;

    public ahr(int n2) {
        super(0, a.cYG);
        this.aOe = n2;
    }

    @Override
    public void a(ak ak2) {
        this.aOe = ak2.readInt();
    }

    @Override
    public void b(ak ak2) {
        ak2.writeInt(this.aOe);
    }

    @Override
    public int va() {
        return 29;
    }
}

