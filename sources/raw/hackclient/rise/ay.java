/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fa;
import hackclient.rise.fg;

public class ay
extends am {
    private int cC;
    @dm
    public final dk<fg> cD = fg2 -> ++this.cC;
    @dm
    public final dk<fa> cE = fa2 -> {
        this.cC = 0;
    };

    public boolean aV() {
        return this.cC > 0;
    }
}

