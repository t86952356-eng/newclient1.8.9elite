/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.world.storage.o;

class x
implements Callable<String> {
    final /* synthetic */ o dUB;

    x(o o2) {
        this.dUB = o2;
    }

    public String HV() {
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", this.dUB.dEq.getName(), this.dUB.dEq.awE(), this.dUB.dTE, this.dUB.dUi);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

