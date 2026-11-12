/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.login.client;

import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.util.ac;

public class b
implements aj<net.minecraft.network.login.b> {
    private byte[] daK = new byte[0];
    private byte[] daL = new byte[0];

    public b() {
    }

    public b(SecretKey secretKey, PublicKey publicKey, byte[] byArray) {
        this.daK = ac.a(publicKey, secretKey.getEncoded());
        this.daL = ac.a(publicKey, byArray);
    }

    @Override
    public void a(ak ak2) {
        this.daK = ak2.aft();
        this.daL = ak2.aft();
    }

    @Override
    public void b(ak ak2) {
        ak2.k(this.daK);
        ak2.k(this.daL);
    }

    @Override
    public void a(net.minecraft.network.login.b b2) {
        b2.a(this);
    }

    public SecretKey a(PrivateKey privateKey) {
        return ac.a(privateKey, this.daK);
    }

    public byte[] b(PrivateKey privateKey) {
        return privateKey == null ? this.daL : ac.b(privateKey, this.daL);
    }
}

