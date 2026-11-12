/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;

public class ce
implements aj<a> {
    private String arP;
    private String ih;

    public ce() {
    }

    public ce(String string, String string2) {
        this.arP = string;
        this.ih = string2;
        if (string2.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + string2.length() + ")");
        }
    }

    @Override
    public void a(ak ak2) {
        this.arP = ak2.gs(Short.MAX_VALUE);
        this.ih = ak2.gs(40);
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.arP);
        ak2.eS(this.ih);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String getURL() {
        return this.arP;
    }

    public String getHash() {
        return this.ih;
    }
}

