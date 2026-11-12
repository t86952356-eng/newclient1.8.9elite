/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.gn;
import net.minecraft.entity.c;

public final class hn
extends akg<gn> {
    @dm
    private final dk<ej> rv = ej2 -> hn.aER.bgF.dCY.forEach(a2 -> {
        if (a2.xW().arq().contains("\u00a7")) {
            a.a.x().c(this, (c)a2);
            return;
        }
        a.a.x().b(this, (c)a2);
    });

    public hn(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

