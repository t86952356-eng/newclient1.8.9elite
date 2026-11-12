/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ahd;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.ex;
import hackclient.rise.fg;
import net.minecraft.entity.c;

public class an
extends am
implements ahd {
    c by = null;
    @dm(cH=1)
    public final dk<ei> bz = ei2 -> {
        if (this.by != null && !an.aER.bgF.dCS.contains(this.by)) {
            a.a.e().d(new ex(this.by));
            this.by = null;
        }
    };
    @dm(cH=1)
    public final dk<eq> bA = eq2 -> {
        this.by = eq2.dc();
    };
    @dm(cH=1)
    public final dk<fg> bB = fg2 -> {
        this.by = null;
    };
}

