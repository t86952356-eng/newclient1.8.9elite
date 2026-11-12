/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.world.storage.o;

class q
implements Callable<String> {
    final /* synthetic */ o dUu;

    q(o o2) {
        this.dUu = o2;
    }

    public String HV() {
        return String.format("ID %02d - %s, ver %d. Features enabled: %b", this.dUu.dDL.awP(), this.dUu.dDL.awI(), this.dUu.dDL.awL(), this.dUu.dEr);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

