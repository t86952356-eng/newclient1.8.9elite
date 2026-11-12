/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.network;

import net.minecraft.client.gui.cu;
import net.minecraft.client.network.h;
import net.minecraft.client.network.l;
import net.minecraft.client.resources.I18n;

class k
implements Runnable {
    final /* synthetic */ String bFa;
    final /* synthetic */ String bFb;
    final /* synthetic */ h bFc;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    k(h h2, String string, String string2) {
        this.bFc = h2;
        this.bFa = string;
        this.bFb = string2;
    }

    @Override
    public void run() {
        this.bFc.bEO.a(new cu(new l(this), I18n.a("multiplayer.texturePrompt.line1", new Object[0]), I18n.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
    }
}

