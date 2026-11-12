/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.server.integrated;

import com.google.common.collect.Lists;
import net.minecraft.entity.player.e;
import net.minecraft.server.integrated.IntegratedServer;

class IntegratedServer$3
implements Runnable {
    final /* synthetic */ IntegratedServer dlE;

    IntegratedServer$3(IntegratedServer integratedServer) {
        this.dlE = integratedServer;
    }

    @Override
    public void run() {
        for (e e2 : Lists.newArrayList(this.dlE.alE().amB())) {
            this.dlE.alE().s(e2);
        }
    }
}

