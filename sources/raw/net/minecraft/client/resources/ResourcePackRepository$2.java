/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.resources;

import net.minecraft.client.d;
import net.minecraft.client.gui.cd;

class ResourcePackRepository$2
implements Runnable {
    final /* synthetic */ d cdF;
    final /* synthetic */ cd cdG;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    ResourcePackRepository$2() {
        void var3_-1;
        void var2_-1;
        this.cdF = var2_-1;
        this.cdG = var3_-1;
    }

    @Override
    public void run() {
        this.cdF.a(this.cdG);
    }
}

