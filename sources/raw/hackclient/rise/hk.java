/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.afl;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gn;
import net.minecraft.entity.c;

public final class hk
extends akg<gn> {
    @dm
    public final dk<ei> rs = ei2 -> hk.aER.bgF.dCY.forEach(a2 -> {
        String string = a2.xW().arq();
        if (!hk.r(string)) {
            afl.c("Detected bot (invalid colour start): " + string, new Object[0]);
            a.a.x().b(this, (c)a2);
        }
    });

    public hk(String string, gn gn2) {
        super(string, gn2);
    }

    public static boolean r(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        return string.matches("^\u00a7[0-9a-fk-or].*");
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

