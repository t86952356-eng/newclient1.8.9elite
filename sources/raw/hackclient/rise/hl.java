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

public final class hl
extends akg<gn> {
    @dm
    public final dk<ei> rt = ei2 -> hl.aER.bgF.dCY.forEach(a2 -> {
        if (hl.aER.bgF.dCY.stream().anyMatch(a3 -> a3.getEntityId() == a2.getEntityId() && a3 != a2)) {
            a.a.x().b(this, (c)a2);
        }
    });

    public hl(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

