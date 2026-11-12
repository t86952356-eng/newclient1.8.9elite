/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.client;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.b;
import net.minecraft.util.ba;
import net.minecraft.util.bb;

public class v
implements aj<b> {
    private net.minecraft.util.b aZf;
    private ba[] dbG;

    public v() {
    }

    public v(net.minecraft.util.b b2, ba[] baArray) {
        this.aZf = b2;
        this.dbG = new ba[]{baArray[0], baArray[1], baArray[2], baArray[3]};
    }

    @Override
    public void a(ak ak2) {
        this.aZf = ak2.afu();
        this.dbG = new ba[4];
        for (int i2 = 0; i2 < 4; ++i2) {
            ba ba2;
            String string = ak2.gs(384);
            this.dbG[i2] = ba2 = bb.gi(string);
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.ak(this.aZf);
        for (int i2 = 0; i2 < 4; ++i2) {
            ba ba2 = this.dbG[i2];
            String string = bb.q(ba2);
            ak2.eS(string);
        }
    }

    @Override
    public void a(b b2) {
        b2.a(this);
    }

    public net.minecraft.util.b yl() {
        return this.aZf;
    }

    public ba[] age() {
        return this.dbG;
    }
}

