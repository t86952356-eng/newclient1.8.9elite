/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eq;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.d;

@gl(aliases={"module.combat.comboonehit.name", "Insta Kill", "Instant Kill"}, description="module.combat.comboonehit.description", category=gj.COMBAT)
public final class gp
extends gi {
    public final akq lG = new akq("Attack Packets", this, (Number)50, (Number)1, (Number)1000, (Number)1);
    @dm
    public final dk<eq> lH = eq2 -> {
        for (int i2 = 0; i2 < ((Number)this.lG.wD()).intValue(); ++i2) {
            ahn.m(new c((net.minecraft.entity.c)eq2.dc(), d.daU));
        }
    };
}

