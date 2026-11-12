/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.main;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

class g
extends Authenticator {
    final /* synthetic */ String byf;
    final /* synthetic */ String byg;

    g(String string, String string2) {
        this.byf = string;
        this.byg = string2;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.byf, this.byg.toCharArray());
    }
}

