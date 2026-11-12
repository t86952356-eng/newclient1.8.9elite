/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client;

import net.minecraft.client.d;

class e
extends Thread {
    final /* synthetic */ d bhW;

    e(d d2, String string) {
        this.bhW = d2;
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

