/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.akg;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.ei;
import hackclient.rise.mg;
import net.minecraft.network.play.client.n;
import net.minecraft.network.play.client.o;

public class py
extends akg<mg> {
    @dm
    public final dk<ei> Pj = ei2 -> {
        py.aER.bgK.bkr.jr = py.aER.bgK.bkd.bEQ;
        ahn.m(new n(py.aER.bgK, o.dbq));
    };
    @dm
    public final dk<eg> Pk = eg2 -> ahn.m(new n(py.aER.bgK, o.dbp));

    public py(String string, mg mg2) {
        super(string, mg2);
    }

    @Override
    public void onDisable() {
        ahn.m(new n(py.aER.bgK, o.dbq));
    }
}

