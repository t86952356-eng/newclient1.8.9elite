/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.command;

import net.minecraft.command.a;
import net.minecraft.command.ac;
import net.minecraft.command.ad;
import net.minecraft.command.as;
import net.minecraft.command.aw;
import net.minecraft.nbt.n;
import net.minecraft.scoreboard.d;
import net.minecraft.scoreboard.g;
import net.minecraft.scoreboard.i;

public class ab {
    private static final int coa = ad.values().length;
    private static final String[] cob = new String[coa];
    private String[] coc = cob;
    private String[] cod = cob;

    public void a(aw aw2, ad ad2, int n2) {
        String string = this.coc[ad2.Sm()];
        if (string != null) {
            i i2;
            g g2;
            String string2;
            ac ac2 = new ac(this, aw2);
            try {
                string2 = a.e(ac2, string);
            }
            catch (as as2) {
                return;
            }
            String string3 = this.cod[ad2.Sm()];
            if (string3 != null && (g2 = (i2 = aw2.Se().SD()).fo(string3)) != null && i2.a(string2, g2)) {
                d d2 = i2.b(string2, g2);
                d2.gW(n2);
            }
        }
    }

    public void f(n n2) {
        if (n2.C("CommandStats", 10)) {
            n n3 = n2.eN("CommandStats");
            for (ad ad2 : ad.values()) {
                String string = ad2.Sn() + "Name";
                String string2 = ad2.Sn() + "Objective";
                if (!n3.C(string, 8) || !n3.C(string2, 8)) continue;
                String string3 = n3.eK(string);
                String string4 = n3.eK(string2);
                ab.a(this, ad2, string3, string4);
            }
        }
    }

    public void g(n n2) {
        n n3 = new n();
        for (ad ad2 : ad.values()) {
            String string = this.coc[ad2.Sm()];
            String string2 = this.cod[ad2.Sm()];
            if (string == null || string2 == null) continue;
            n3.R(ad2.Sn() + "Name", string);
            n3.R(ad2.Sn() + "Objective", string2);
        }
        if (!n3.aeH()) {
            n2.b("CommandStats", n3);
        }
    }

    public static void a(ab ab2, ad ad2, String string, String string2) {
        if (string != null && string.length() != 0 && string2 != null && string2.length() != 0) {
            if (ab2.coc == cob || ab2.cod == cob) {
                ab2.coc = new String[coa];
                ab2.cod = new String[coa];
            }
            ab2.coc[ad2.Sm()] = string;
            ab2.cod[ad2.Sm()] = string2;
        } else {
            ab.a(ab2, ad2);
        }
    }

    private static void a(ab ab2, ad ad2) {
        if (ab2.coc != cob && ab2.cod != cob) {
            ab2.coc[ad2.Sm()] = null;
            ab2.cod[ad2.Sm()] = null;
            boolean bl2 = true;
            for (ad ad3 : ad.values()) {
                if (ab2.coc[ad3.Sm()] == null || ab2.cod[ad3.Sm()] == null) continue;
                bl2 = false;
                break;
            }
            if (bl2) {
                ab2.coc = cob;
                ab2.cod = cob;
            }
        }
    }

    public void a(ab ab2) {
        for (ad ad2 : ad.values()) {
            ab.a(this, ad2, ab2.coc[ad2.Sm()], ab2.cod[ad2.Sm()]);
        }
    }
}

