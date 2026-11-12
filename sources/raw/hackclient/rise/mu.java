/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.bb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.lw;
import hackclient.rise.tn;
import java.util.Random;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.play.client.k;
import net.minecraft.util.ao;
import net.minecraft.util.b;

public class mu
extends akg<lw> {
    @dm
    private final dk<fd> Fq = fd2 -> {};
    @dm
    private final dk<ei> Fr = ei2 -> {
        if (!bb.a(true, true, true, true, true) && !this.e(tn.class).isEnabled()) {
            Random random = new Random();
            float f2 = random.nextFloat();
            float f3 = random.nextFloat();
            ahn.m(new k(new b(mu.aER.bgK.gW, mu.aER.bgK.gX, mu.aER.bgK.gY), ao.dwr.OY(), new co(Items.cQB), f2, 1.0f, f3));
        }
    };

    public mu(String string, lw lw2) {
        super(string, lw2);
    }

    @Override
    public void onEnable() {
        afl.b("Collide with a block to fly and remember to collide into a wall in Bedwars to avoid fall damage when landing, press shift to fall faster", new Object[0]);
    }
}

