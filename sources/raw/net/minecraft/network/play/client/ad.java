/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;
import net.minecraft.network.play.client.ae;

public class ad
implements aj<b> {
    private String ih;
    private ae dbV;

    public ad() {
    }

    public ad(String string, ae ae2) {
        if (string.length() > 40) {
            string = string.substring(0, 40);
        }
        this.ih = string;
        this.dbV = ae2;
    }

    @Override
    public void a(ak ak2) {
        this.ih = ak2.gs(40);
        this.dbV = ak2.k(ae.class);
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.ih);
        ak2.b(this.dbV);
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }
}

