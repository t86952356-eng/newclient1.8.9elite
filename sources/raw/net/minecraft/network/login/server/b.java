/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.login.server;

import java.security.PublicKey;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.login.a;
import net.minecraft.util.ac;

public class b
implements aj<a> {
    private String daN;
    private PublicKey daO;
    private byte[] daP;

    public b() {
    }

    public b(String string, PublicKey publicKey, byte[] byArray) {
        this.daN = string;
        this.daO = publicKey;
        this.daP = byArray;
    }

    @Override
    public void a(ak ak2) {
        this.daN = ak2.gs(20);
        this.daO = ac.l(ak2.aft());
        this.daP = ak2.aft();
    }

    @Override
    public void b(ak ak2) {
        ak2.eS(this.daN);
        ak2.k(this.daO.getEncoded());
        ak2.k(this.daP);
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public String afM() {
        return this.daN;
    }

    public PublicKey afN() {
        return this.daO;
    }

    public byte[] afO() {
        return this.daP;
    }
}

