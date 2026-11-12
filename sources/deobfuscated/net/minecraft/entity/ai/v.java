/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.av;
import net.minecraft.entity.j;
import net.minecraft.entity.r;
import net.minecraft.util.a;

public class v
extends av {
    private final boolean cyf;
    private int cyg;
    private final Class[] cyh;

    public v(j j2, boolean bl2, Class ... classArray) {
        super(j2, false);
        this.cyf = bl2;
        this.cyh = classArray;
        this.eO(1);
    }

    @Override
    public boolean WC() {
        int n2 = this.czA.VD();
        return n2 != this.cyg && this.a(this.czA.VC(), false);
    }

    @Override
    public void WG() {
        this.czA.S(this.czA.VC());
        this.cyg = this.czA.VD();
        if (this.cyf) {
            double d2 = this.WV();
            for (j j2 : this.czA.baU.a(this.czA.getClass(), new a(this.czA.gW, this.czA.gX, this.czA.gY, this.czA.gW + 1.0, this.czA.gX + 1.0, this.czA.gY + 1.0).ad(d2, 10.0, d2))) {
                if (this.czA == j2 || j2.UW() != null || j2.U(this.czA.VC())) continue;
                boolean bl2 = false;
                for (Class clazz : this.cyh) {
                    if (j2.getClass() != clazz) continue;
                    bl2 = true;
                    break;
                }
                if (bl2) continue;
                this.a(j2, this.czA.VC());
            }
        }
        super.WG();
    }

    protected void a(j j2, r r2) {
        j2.S(r2);
    }
}

