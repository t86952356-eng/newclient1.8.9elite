/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.d;
import hackclient.rise.e;
import hackclient.rise.m;
import hackclient.rise.o;
import net.minecraft.client.entity.b;
import net.minecraft.init.Items;
import net.minecraft.item.bg;
import net.minecraft.item.by;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ad;
import net.minecraft.network.play.server.v;

@e(R="AutoBlock", S="A", description="Unlikely sword blocking/unblocking")
public final class g
extends d {
    public g(m m2) {
        super(m2);
    }

    @Override
    public void a(aj<?> aj2) {
        ad ad2;
        if (aj2 instanceof ad && (ad2 = (ad)aj2).getEntityId() == this.R.Y().getEntityId() && ad2.agX() != null) {
            int n2 = this.a(this.R.Y());
            int n3 = this.R.W();
            if (n2 != -1 && n3 > n2) {
                if (this.a(1.0) > 2.0) {
                    this.J();
                }
            } else {
                this.b(0.1f);
            }
        }
        if (o.b(aj2) && ((v)aj2).crw == this.R.Y().getEntityId() && !this.R.V()) {
            this.b(0.985f);
        }
    }

    private int a(b b2) {
        co co2 = b2.Vk();
        if (co2 == null) {
            return -1;
        }
        net.minecraft.item.d d2 = co2.bP();
        if (d2 == Items.cPj) {
            return 4;
        }
        if (d2 instanceof cp || d2 instanceof bg || d2 instanceof by && !by.gb(co2.yc())) {
            return 1;
        }
        return -1;
    }
}

