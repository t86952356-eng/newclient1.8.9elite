/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.bs;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eo;
import hackclient.rise.mh;
import hackclient.rise.tn;
import net.minecraft.util.bt;

public class vk
extends akg<tn> {
    private int dm;
    private boolean LV;
    @dm
    public final dk<eo> ajW = eo2 -> {
        boolean bl2;
        float f2 = vk.aER.bgK.pl;
        float f3 = bt.bN(f2);
        bs.d(false);
        this.e(mh.class).setEnabled(false);
        boolean bl3 = bl2 = Math.abs(f3 % 80.0f) <= 15.0f || Math.abs(f3 % 90.0f) >= 75.0f;
        if (!bl2) {
            vk.aER.bgK.ud *= 0.95;
            vk.aER.bgK.uf *= 0.95;
        }
    };

    public vk(String string, tn tn2) {
        super(string, tn2);
    }
}

