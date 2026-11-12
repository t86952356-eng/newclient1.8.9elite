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

public final class hu
extends akg<gn> {
    @dm
    public final dk<ei> rD = ei2 -> hu.aER.bgF.dCY.forEach(a2 -> {
        if (a2.csr < 20) {
            a.a.x().b(this, (c)a2);
        } else if (a2.aRg > 20) {
            a.a.x().c(this, (c)a2);
        }
    });

    public hu(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

