/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;

public class b
implements aj<net.minecraft.network.play.b> {
    private String message;

    public b() {
    }

    public b(String string) {
        if (string.length() > 100) {
            string = string.substring(0, 100);
        }
        this.message = string;
    }

    @Override
    public void a(ak ak2) {
        this.message = ak2.gs(100);
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.message);
    }

    @Override
    public void a(net.minecraft.network.play.b b2) {
        b2.a(this);
    }

    public String getMessage() {
        return this.message;
    }
}

