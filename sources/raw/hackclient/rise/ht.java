/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gn;
import net.minecraft.client.network.o;
import net.minecraft.entity.c;

public final class ht
extends akg<gn> {
    @dm
    public final dk<ei> rC = ei2 -> ht.aER.bgF.dCY.forEach(a2 -> {
        o o2 = aER.AU().d(a2.Ul());
        if (o2 != null && o2.Ig() < 0) {
            a.a.x().b(this, (c)a2);
        }
    });

    public ht(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

