/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.play.server;

import net.minecraft.network.aj;
import net.minecraft.network.ak;
import net.minecraft.network.play.a;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.world.w;

public class bd
implements aj<a> {
    private w jG;
    private b jI;
    private ba[] dbG;

    public bd() {
    }

    public bd(w w2, b b2, ba[] baArray) {
        this.jG = w2;
        this.jI = b2;
        this.dbG = new ba[]{baArray[0], baArray[1], baArray[2], baArray[3]};
    }

    @Override
    public void a(ak ak2) {
        this.jI = ak2.afu();
        this.dbG = new ba[4];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.dbG[i2] = ak2.afv();
        }
    }

    @Override
    public void b(ak ak2) {
        ak2.ak(this.jI);
        for (int i2 = 0; i2 < 4; ++i2) {
            ak2.j(this.dbG[i2]);
        }
    }

    @Override
    public void a(a a2) {
        a2.a(this);
    }

    public b Ab() {
        return this.jI;
    }

    public ba[] age() {
        return this.dbG;
    }
}

