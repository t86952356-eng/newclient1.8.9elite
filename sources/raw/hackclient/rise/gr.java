/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.el;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;

@gl(aliases={"module.combat.fences.name"}, description="module.combat.fences.description", category=gj.COMBAT)
public final class gr
extends gi {
    @dm
    public final dk<el> lJ = el2 -> {
        gr.aER.bgK.crP = true;
        el2.h(-5.0);
    };

    @Override
    public void onDisable() {
        gr.aER.bgK.crP = false;
    }
}

