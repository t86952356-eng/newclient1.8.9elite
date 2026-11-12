/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import net.minecraft.client.d;
import net.minecraft.client.entity.c;

final class gv {
    private final float pl;
    private final float pm;
    private final float pn;
    private final float po;
    private final float pp;
    private final float pq;
    private final float pr;

    private gv(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.pl = f2;
        this.pm = f3;
        this.pn = f4;
        this.po = f5;
        this.pp = f6;
        this.pq = f7;
        this.pr = f8;
    }

    private void gh() {
        c c2 = d.AZ().bgK;
        if (c2 == null) {
            return;
        }
        c2.pl = this.pl;
        c2.pm = this.pm;
        c2.pn = this.pn;
        c2.po = this.po;
        c2.pp = this.pp;
        c2.pq = this.pq;
        c2.pr = this.pr;
    }
}

