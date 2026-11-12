/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.ha;
import net.minecraft.network.play.client.f;

public final class ie
extends akg<ha> {
    private final akq sp = new akq("Minimum Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    @dm
    public final dk<ei> sq = ei2 -> {
        if (ie.aER.bgK.getHealth() < ((Number)this.sp.wD()).floatValue()) {
            for (int i2 = 0; i2 < 30; ++i2) {
                if (!ie.aER.bgK.aO) continue;
                ahn.n(new f(ie.aER.bgK.gW, ie.aER.bgK.gX, ie.aER.bgK.gY, true));
            }
        }
    };

    public ie(String string, ha ha2) {
        super(string, ha2);
    }
}

