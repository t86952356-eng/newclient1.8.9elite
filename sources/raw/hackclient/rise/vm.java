/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.akg;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fi;
import hackclient.rise.tn;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.k;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;

public class vm
extends akg<tn> {
    private final akq ajZ = new akq("Speed", this, (Number)1.3, (Number)0.9, (Number)1.3, (Number)0.05);
    private int dm;
    private int aka;
    @dm
    public final dk<ei> akb = ei2 -> {
        vm.aER.bgK.setSprinting(false);
        double d2 = ((Number)this.ajZ.wD()).doubleValue();
        if (!vm.aER.aIY.chq.Re() && d2 > 0.9 && vm.aER.bgK.crx >= 2 && this.aka <= 10) {
            aii.strafe(aii.getAllowedHorizontalDistance() * d2);
            vm.aER.bgK.jump();
            vm.aER.bgK.ue = 0.012500047683714;
        }
        if (vm.aER.bgK.aO) {
            aii.strafe();
        }
        ++this.dm;
        ++this.aka;
        switch (this.dm) {
            case 1: {
                ahn.m(new n(vm.aER.bgK, o.dbp));
                break;
            }
            case 10: {
                this.dm = 0;
            }
        }
    };
    @dm
    public final dk<fi> akc = fi2 -> {
        k k2;
        aj<?> aj2 = fi2.dq();
        if (aj2 instanceof k && (k2 = (k)aj2).getPlacedBlockDirection() != 255) {
            this.aka = 0;
        }
    };

    public vm(String string, tn tn2) {
        super(string, tn2);
    }

    @Override
    public void onDisable() {
        if (this.dm == 1) {
            ahn.m(new n(vm.aER.bgK, o.dbq));
        }
    }
}

