/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afl;
import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fd;
import hackclient.rise.jg;
import net.minecraft.entity.c;
import net.minecraft.network.play.client.h;
import net.minecraft.util.a;

public class ke
extends akg<jg> {
    private boolean yr;
    private boolean ys;
    @dm
    public final dk<fd> yt = fd2 -> {
        if (this.ys) {
            fd2.setCancelled(true);
            this.ys = false;
            afl.b("Turn off disabler module once this message shows up", new Object[0]);
        }
    };
    @dm
    private final dk<ei> yu = ei2 -> {
        a a2 = ke.aER.bgK.Us().ae(0.0, 1.0, 0.0);
        if (this.yr) {
            ke.aER.bgK.ue += 0.025;
        }
        if (ke.aER.bgF.a((c)ke.aER.bgK, a2).isEmpty() && !this.yr) {
            this.yr = true;
            ke.aER.bgK.jump();
            ahn.m(new h(ke.aER.bgK.gW, ke.aER.bgK.gX - 0.1, ke.aER.bgK.gY, ke.aER.bgK.pl, ke.aER.bgK.pm, false));
            this.ys = true;
        }
    };

    public ke(String string, jg jg2) {
        super(string, jg2);
    }

    @Override
    public void onEnable() {
        this.yr = false;
        this.ys = false;
    }
}

