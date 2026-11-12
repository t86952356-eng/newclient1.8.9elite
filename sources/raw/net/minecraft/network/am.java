/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network;

import net.minecraft.network.aj;
import net.minecraft.network.al;
import net.minecraft.network.g;

class am
implements Runnable {
    final /* synthetic */ aj dau;
    final /* synthetic */ g dav;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    am(aj aj2, g g2) {
        this.dau = aj2;
        this.dav = g2;
    }

    @Override
    public void run() {
        al.F(this.dau);
        this.dau.a(this.dav);
    }
}

