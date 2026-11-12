/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.cg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.c;
import net.minecraft.util.ba;

@gl(aliases={"module.other.hypixelautoplay.name"}, description="module.other.hypixelautoplay.description", category=gj.PLAYER)
public final class ro
extends gi {
    private final akp TQ = new akp("Mode", this).a(new akg[]{new aks("Hypixel")}).co("Hypixel");
    @dm
    public final dk<fh> TR = fh2 -> {
        aj<?> aj2 = fh2.dq();
        if (aj2 instanceof c) {
            c c2 = (c)aj2;
            if (((akg)this.TQ.wD()).getName().equals("Hypixel")) {
                if (c2.isChat()) {
                    return;
                }
                if (c2.DM().getFormattedText().contains("play again?")) {
                    block0: for (ba ba2 : c2.DM().aro()) {
                        for (String string : ba2.toString().split("'")) {
                            if (!string.startsWith("/play") || string.contains(".")) continue;
                            afl.i(string);
                            cg.a("Auto Play", "Joined a new game", 7000);
                            continue block0;
                        }
                    }
                }
            }
        }
    };
}

