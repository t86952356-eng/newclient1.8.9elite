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

public final class hr
extends akg<gn> {
    @dm
    public final dk<ei> rA = ei2 -> hr.aER.bgF.dCY.forEach(a2 -> {
        if (a2.aec) {
            a.a.x().c(this, (c)a2);
        } else {
            a.a.x().b(this, (c)a2);
        }
    });

    public hr(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

