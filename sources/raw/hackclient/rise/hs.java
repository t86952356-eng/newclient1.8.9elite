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

public final class hs
extends akg<gn> {
    @dm
    public final dk<ei> rB = ei2 -> hs.aER.bgF.dCY.forEach(a2 -> {
        String string = a2.xW().arq();
        String string2 = hs.s(string);
        long l2 = string.chars().filter(n2 -> n2 == 167).count();
        if (l2 >= 8L && string.contains("\u00a7\u0000\u00a7\u0000\u00a7\u0000\u00a7\u0000")) {
            if (hs.aER.bgK.Zz == 10) {
                afl.c("Detected bot by formatting pattern: " + string, new Object[0]);
            }
            a.a.x().b(this, (c)a2);
        }
    });

    public hs(String string, gn gn2) {
        super(string, gn2);
    }

    public static String s(String string) {
        if (string == null) {
            return null;
        }
        string = string.replaceAll("\u00a7.", "");
        return string.replaceAll("\\p{Cntrl}", "").trim();
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

