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
import net.minecraft.entity.c;

public final class hm
extends akg<gn> {
    @dm
    public final dk<ei> ru = ei2 -> hm.aER.bgF.dCY.forEach(a3 -> {
        String string = a3.xW().arq();
        if (hm.aER.bgF.dCY.stream().anyMatch(a2 -> string.equals(a2.xW().arq()))) {
            a.a.x().b(this, (c)a3);
        }
    });

    public hm(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

