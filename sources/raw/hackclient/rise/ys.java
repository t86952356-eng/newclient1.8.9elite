/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.xd;
import net.minecraft.potion.a;
import net.minecraft.potion.d;

public final class ys
extends akg<xd> {
    @dm
    public final dk<fe> asS = fe2 -> ys.aER.bgK.b(new d(a.dgL.dhb, Integer.MAX_VALUE, 1));

    public ys(String string, xd xd2) {
        super(string, xd2);
    }

    @Override
    public void onDisable() {
        if (ys.aER.bgK.a(a.dgL)) {
            ys.aER.bgK.eL(a.dgL.dhb);
        }
    }
}

