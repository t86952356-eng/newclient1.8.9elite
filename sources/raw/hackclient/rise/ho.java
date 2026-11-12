/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.fg;
import hackclient.rise.gn;
import net.minecraft.client.network.o;

public class ho
extends akg<gn> {
    @dm
    public final dk<ei> rw = ei2 -> {
        if (ho.aER.bgF == null || ho.aER.bgK == null) {
            return;
        }
        for (net.minecraft.entity.player.a a2 : ho.aER.bgF.dCY) {
            if (a2 == ho.aER.bgK) continue;
            o o2 = aER.AU().d(a2.Ul());
            if (o2 == null) {
                a.a.x().b(this, a2);
                continue;
            }
            a.a.x().c(this, a2);
        }
    };
    @dm
    public final dk<fg> rx = fg2 -> a.a.x().a(this);
    @dm
    public final dk<fd> ry = fd2 -> a.a.x().a(this);

    public ho(String string, gn gn2) {
        super(string, gn2);
    }

    @Override
    public void onDisable() {
        a.a.x().a(this);
    }
}

