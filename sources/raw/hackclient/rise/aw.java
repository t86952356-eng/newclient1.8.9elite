/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fb;
import hackclient.rise.fe;
import hackclient.rise.fh;
import java.util.List;
import net.minecraft.network.play.server.b;
import net.minecraft.network.play.server.c;
import net.minecraft.network.play.server.h;
import net.minecraft.util.an;

public final class aw
extends am {
    private static final String cw = "An exception occurred in your connection, so you have been routed to limbo!";
    private int cx;
    private boolean cy;
    @dm
    public final dk<fh> cz = fh2 -> {
        c c2;
        String string;
        if (fh2.dq() instanceof c && (string = (c2 = (c)fh2.dq()).DM().arq()) != null && string.contains(cw)) {
            this.cy = true;
            this.cx = 100;
            return;
        }
        if (this.cy && this.cx > 0 && (fh2.dq() instanceof b || fh2.dq() instanceof h)) {
            return;
        }
    };
    @dm
    public final dk<fe> cA = fe2 -> {
        if (this.cx > 0) {
            --this.cx;
            if (this.cx == 0) {
                this.cy = false;
            }
        }
    };
    @dm
    public final dk<fb> cB = fb2 -> {
        if (!this.cy) {
            return;
        }
        if (this.cx <= 0) {
            return;
        }
        List<String> list = fb2.dm();
        if (list == null || list.isEmpty()) {
            return;
        }
        an an2 = a.a.k().rP().rX();
        this.cy = false;
        this.cx = 0;
    };

    @Override
    public void aT() {
        this.cx = 0;
        this.cy = false;
    }
}

