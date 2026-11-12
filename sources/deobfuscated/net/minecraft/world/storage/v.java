/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world.storage;

import java.util.concurrent.Callable;
import net.minecraft.world.storage.o;

class v
implements Callable<String> {
    final /* synthetic */ o dUz;

    v(o o2) {
        this.dUz = o2;
    }

    public String HV() {
        String string = "Unknown?";
        try {
            switch (this.dUz.dUc) {
                case 19132: {
                    string = "McRegion";
                    break;
                }
                case 19133: {
                    string = "Anvil";
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return String.format("0x%05X - %s", this.dUz.dUc, string);
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

