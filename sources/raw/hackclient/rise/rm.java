/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akr;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;

@gl(aliases={"module.other.autogg.name"}, description="module.other.autogg.description", category=gj.PLAYER)
public final class rm
extends gi {
    private final akr TD = new akr("Message", (gi)this, "Why waste another game without Rise?");
    private boolean dj;
    private boolean TE;
    @dm
    public final dk<ei> TF = ei2 -> {
        if (rm.aER.bgK.aRg % 18 != 0 || !rm.aER.bgK.bkd.bEQ || aER.Bf()) {
            return;
        }
        if (rm.aER.bgF.dCY.stream().filter(a2 -> !a2.isInvisible() || a2 == rm.aER.bgK).count() <= 1L) {
            if (this.dj) {
                rm.aER.bgK.sendChatMessage((String)this.TD.wD());
                this.dj = false;
            }
        } else if (this.TE) {
            this.dj = true;
            this.TE = false;
        }
    };
    @dm
    public final dk<fg> TG = fg2 -> {
        this.TE = true;
    };

    @Override
    public void onEnable() {
        this.TE = true;
    }
}

