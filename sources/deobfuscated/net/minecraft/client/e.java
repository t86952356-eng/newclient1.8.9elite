/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;

import net.minecraft.client.Minecraft;

class e
extends Thread {
    final /* synthetic */ Minecraft bhW;

    e(Minecraft minecraft, String string) {
        this.bhW = minecraft;
        super(string);
    }

    @Override
    public void run() {
        while (this.bhW.bhP) {
            try {
                Thread.sleep(Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

