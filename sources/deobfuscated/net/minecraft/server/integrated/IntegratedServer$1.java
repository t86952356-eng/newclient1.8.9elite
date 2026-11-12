/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server.integrated;

import java.util.concurrent.Callable;
import net.minecraft.server.integrated.IntegratedServer;

class IntegratedServer$1
implements Callable<String> {
    IntegratedServer$1(IntegratedServer integratedServer) {
    }

    public String HV() {
        return "Integrated Server (map_client.txt)";
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

