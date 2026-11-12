/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.c;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fh;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import lombok.Generated;
import net.minecraft.client.entity.b;

@gl(aliases={"module.other.cheatdetector.name"}, description="module.other.cheatdetector.description", category=gj.PLAYER)
public final class rr
extends gi {
    private final c Uk = new c();
    public akp Ul = new akp("Alert Type", this).a(new akg[]{new aks("ClientSide")}).a(new akg[]{new aks("ServerSide")}).co("ClientSide");
    @dm
    public final dk<ei> Um = ei2 -> a.a.n().F();
    @dm
    public final dk<fh> Un = fh2 -> a.a.n().M.values().forEach(m2 -> {
        if (m2 == null) {
            return;
        }
        try {
            m2.a(fh2.dq());
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
    });

    @Override
    public void onDisable() {
        a.a.n().M.clear();
    }

    @Override
    public void onEnable() {
        if (rr.aER.bgF == null) {
            return;
        }
        a.a.n().M.clear();
        rr.aER.bgF.dCY.forEach(a2 -> {
            if (a2 instanceof b && a2 != rr.aER.bgK) {
                a.a.n().H().b((b)a2);
            }
        });
    }

    @Generated
    public c I() {
        return this.Uk;
    }
}

