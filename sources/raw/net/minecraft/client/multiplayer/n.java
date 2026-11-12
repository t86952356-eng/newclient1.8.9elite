/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.multiplayer;

import java.util.concurrent.Callable;
import net.minecraft.client.multiplayer.j;

class n
implements Callable<String> {
    final /* synthetic */ j bEq;

    n(j j2) {
        this.bEq = j2;
    }

    public String HV() {
        return this.bEq.bEk.Bg() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

