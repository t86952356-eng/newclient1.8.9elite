/*
 * Decompiled with CFR 0.152.
 */
package com.alan.clients.security;

import com.alan.clients.security.a;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.fh;
import hackclient.rise.rl;
import java.util.ArrayList;
import net.minecraft.client.d;
import net.minecraft.network.aj;

public final class b
extends ArrayList<a> {
    private rl axO;
    @dm
    public final dk<fh> axP = fh2 -> fh2.setCancelled(this.l(fh2.dq()));

    public void init() {
        hackclient.rise.a.a.e().b(this);
        this.axO = hackclient.rise.a.a.g().c(rl.class);
        if (this.axO == null) {
            return;
        }
    }

    public boolean l(aj<?> aj2) {
        return this.axO != null && this.axO.isEnabled() && !d.AZ().isSingleplayer() && this.stream().anyMatch(a2 -> a2.k(aj2));
    }
}

