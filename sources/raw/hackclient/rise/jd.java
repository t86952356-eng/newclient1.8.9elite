/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.akr;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fe;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.entity.player.a;

@gl(aliases={"module.exploit.blocktracker.name"}, description="module.exploit.blocktracker.description", category=gj.EXPLOIT)
public class jd
extends gi {
    private final akr we = new akr("Name", (gi)this, "");
    private boolean nQ;
    private boolean wf;
    private int nY;
    @dm
    public final dk<fe> wg = fe2 -> {
        String string = ((String)this.we.wD()).isEmpty() ? aER.Bl().bX() : (String)this.we.wD();
        a a2 = null;
        for (a a3 : jd.aER.bgF.dCY) {
            if (a3 == jd.aER.bgK || !a3.xU().contains(string)) continue;
            a2 = a3;
            break;
        }
        if (a2 == null) {
            this.nQ = false;
            this.wf = false;
            this.nY = 0;
            return;
        }
        boolean bl2 = a2.abK();
        if (this.wf && bl2 != this.nQ) {
            if (bl2) {
                afl.b(a2.xU() + " \u00a7astarted\u00a7r blocking", new Object[0]);
            } else {
                afl.b(a2.xU() + " \u00a7cstopped\u00a7r blocking after \u00a7e" + this.nY + "\u00a7r tick" + (this.nY == 1 ? "" : "s"), new Object[0]);
            }
        }
        this.nY = bl2 ? (this.nQ ? this.nY + 1 : 1) : 0;
        this.nQ = bl2;
        this.wf = true;
    };

    @Override
    public void onEnable() {
        this.nQ = false;
        this.wf = false;
        this.nY = 0;
    }
}

