/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.aix;
import hackclient.rise.aki;
import hackclient.rise.bb;
import hackclient.rise.bs;
import hackclient.rise.cb;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ej;
import hackclient.rise.fe;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.entity.c;
import net.minecraft.network.play.client.d;
import net.minecraft.network.play.client.m;
import rip.vantage.commons.util.time.a;

@gl(aliases={"module.player.antifireball.name"}, description="module.player.antifireball.description", category=gj.PLAYER)
public class sz
extends gi {
    private final aki abg = new aki("Rotate", (gi)this, (Boolean)true);
    private final aki abh = new aki("Movement Correction", (gi)this, (Boolean)true, () -> (Boolean)this.abg.wD() == false);
    private final aki abi = new aki("Bad Packets Check", (gi)this, (Boolean)false);
    public final a abj = new a();
    public int abk = 0;
    private final HashSet<UUID> abl = new HashSet();
    @dm(cH=-100)
    public final dk<ej> abm = ej2 -> this.jy();
    @dm(cH=-100)
    public final dk<fe> abn = fe2 -> this.jy();

    public final void jy() {
        if (bb.aW() && ((Boolean)this.abi.wD()).booleanValue() || !this.abj.T(this.abk)) {
            return;
        }
        for (c c2 : sz.aER.bgF.dCS) {
            if (!(c2 instanceof net.minecraft.entity.projectile.c) || !(c2.S(sz.aER.bgK) < 6.0f)) continue;
            if (((Boolean)this.abg.wD()).booleanValue()) {
                bs.a(aix.y(c2), 10.0, (Boolean)this.abh.wD() != false ? cb.gH : cb.gG);
            }
            aii.strafe(0.0);
            if (c2.S(sz.aER.bgK) <= 3.0f && !this.abl.contains(c2.Ul())) {
                ahn.m(new m());
                ahn.m(new net.minecraft.network.play.client.c(c2, d.daU));
                this.abl.add(c2.Ul());
                break;
            }
            aik.h(0, true);
            aik.h(0, false);
            break;
        }
    }
}

