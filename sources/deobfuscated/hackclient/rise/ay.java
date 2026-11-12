/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.fa;
import hackclient.rise.fg;
import rise.event.EventLink;
import rise.event.Listener;

public class ay
extends am {
    private int cC;
    @EventLink
    public final Listener<fg> cD = fg2 -> ++this.cC;
    @EventLink
    public final Listener<fa> cE = fa2 -> {
        this.cC = 0;
    };

    public boolean aV() {
        return this.cC > 0;
    }
}

