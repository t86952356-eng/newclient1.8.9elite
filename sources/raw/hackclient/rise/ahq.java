/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahp;
import net.minecraft.network.a;
import net.minecraft.network.ak;
import net.minecraft.network.play.client.k;

public class ahq
extends ahp {
    private final k aOd;

    public ahq(k k2) {
        super(46, a.cYG);
        this.aOd = k2;
    }

    @Override
    public void b(ak ak2) {
        ak2.gr(0);
        ak2.ak(this.aOd.yl());
        ak2.gr(this.aOd.getPlacedBlockDirection());
        ak2.writeFloat(this.aOd.dbi);
        ak2.writeFloat(this.aOd.dbj);
        ak2.writeFloat(this.aOd.dbk);
        ak2.writeBoolean(false);
    }

    @Override
    public void a(ak ak2) {
    }
}

