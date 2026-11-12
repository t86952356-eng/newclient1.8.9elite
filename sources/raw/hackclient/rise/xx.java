/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.akn;
import hackclient.rise.akp;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.zv;
import hackclient.rise.zx;

@gl(aliases={"module.render.sessionstats.name"}, description="module.render.sessionstats.description", category=gj.RENDER)
public final class xx
extends gi {
    private final akn aqp = new akn("", (gi)this, new aka(100.0, 200.0), true);
    private final akp aqq = new akp("Mode", this).a(new akg[]{new zx("Rue", this)}).a(new akg[]{new zv("Modern", this)}).co("Modern");

    public akn mx() {
        return this.aqp;
    }
}

