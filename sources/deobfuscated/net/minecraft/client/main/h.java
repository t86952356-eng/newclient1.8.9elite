/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.main;

import net.minecraft.client.Minecraft;
import rise.Client;

class h
extends Thread {
    h(String string) {
        super(string);
    }

    @Override
    public void run() {
        Client.a.b();
        Minecraft.Bh();
    }
}

