/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.gi;
import hackclient.rise.xi;

class xk
extends akp {
    xk(xi xi2, String string, gi gi2) {
        super(string, gi2);
        this.a(new akg[]{new aks("All")});
        this.a(new akg[]{new aks("Exclude render")});
        this.a(new akg[]{new aks("Only bound")});
        this.co("Exclude render");
    }
}

