/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.d;
import hackclient.rise.e;
import hackclient.rise.m;
import net.minecraft.client.entity.b;
import net.minecraft.item.co;
import net.minecraft.item.cp;
import net.minecraft.network.aj;
import net.minecraft.network.play.server.ad;

@e(R="AutoBlock", S="B", description="Impossible 'Sprinting' and 'Use-Item' status combination.")
public final class h
extends d {
    public h(m m2) {
        super(m2);
    }

    @Override
    public void a(aj<?> aj2) {
        double d2;
        b b2;
        co co2;
        ad ad2;
        if (aj2 instanceof ad && (ad2 = (ad)aj2).getEntityId() == this.R.Y().getEntityId() && ad2.agX() != null && this.R.W() > 1 && this.R.isUsingItem() && this.R.isSprinting() && (co2 = (b2 = this.R.Y()).Vk()) != null && co2.bP() instanceof cp && (d2 = this.a(1.0)) >= 4.0) {
            this.J();
            this.M();
        }
    }
}

