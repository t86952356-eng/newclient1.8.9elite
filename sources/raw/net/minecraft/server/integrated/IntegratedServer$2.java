/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.server.integrated;

import java.util.concurrent.Callable;
import net.minecraft.client.b;
import net.minecraft.client.d;
import net.minecraft.server.integrated.IntegratedServer;

class IntegratedServer$2
implements Callable<String> {
    final /* synthetic */ IntegratedServer dlD;

    IntegratedServer$2(IntegratedServer integratedServer) {
        this.dlD = integratedServer;
    }

    public String HV() {
        String string = b.An();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = this.dlD.alg();
        return !string.equals("vanilla") ? "Definitely; Server brand changed to '" + string + "'" : (d.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.");
    }

    @Override
    public /* synthetic */ Object call() {
        return this.HV();
    }
}

