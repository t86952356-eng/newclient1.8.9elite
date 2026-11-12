/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.jm;
import java.util.Locale;
import net.minecraft.network.play.client.b;
import net.minecraft.network.play.server.bi;
import net.minecraft.network.play.server.bj;
import net.minecraft.network.play.server.bk;

public class ku
extends akg<jm> {
    @dm
    public final dk<fh> Aj = fh2 -> {
        if (fh2.dq() instanceof bi) {
            bi bi2 = (bi)fh2.dq();
            if (bi2.ahO() != bj.dey) {
                return;
            }
            for (bk bk2 : bi2.ahN()) {
                String string;
                if (bk2 == null || bk2.afK() == null || bk2.afK().getName() == null || (string = bk2.afK().getName()).equals("SHOP") || string.equals("UPGRADES") || !((jm)this.wy()).w(string.toLowerCase(Locale.ROOT))) continue;
                afl.b("\u00a7cStaff Detected: " + string, new Object[0]);
                if (!((jm)this.wy()).gD()) continue;
                ahn.m(new b("/hub"));
            }
        }
    };

    public ku(String string, jm jm2) {
        super(string, jm2);
    }
}

