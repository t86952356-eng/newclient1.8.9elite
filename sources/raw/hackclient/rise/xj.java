/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.gi;
import hackclient.rise.xi;
import hackclient.rise.yu;
import hackclient.rise.yv;
import hackclient.rise.yy;
import hackclient.rise.zd;

class xj
extends akp {
    xj(xi xi2, String string, gi gi2) {
        super(string, gi2);
        this.a(new akg[]{new yy("Modern", (xi)this.wF())});
        this.a(new akg[]{new zd("Wurst", (xi)this.wF())});
        this.a(new akg[]{new yv("Classic", (xi)this.wF())});
        this.a(new akg[]{new yu("Creida", (xi)this.wF())});
        this.co("Modern");
    }
}

