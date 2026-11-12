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
import net.minecraft.network.play.client.h;

public final class id
extends akg<ha> {
    private final akq sm = new akq("Minimum Health", this, (Number)15, (Number)1, (Number)20, (Number)1);
    private final akq sn = new akq("Speed", this, (Number)20, (Number)1, (Number)100, (Number)1);
    @dm
    public final dk<ei> so = ei2 -> {
        if (id.aER.bgK.getHealth() < ((Number)this.sm.wD()).floatValue()) {
            for (int i2 = 0; i2 < ((Number)this.sn.wD()).intValue(); ++i2) {
                ahn.m(new h(id.aER.bgK.gW, id.aER.bgK.gX, id.aER.bgK.gY, id.aER.bgK.pl, id.aER.bgK.pm, id.aER.bgK.aO));
            }
        }
    };

    public id(String string, ha ha2) {
        super(string, ha2);
    }
}

