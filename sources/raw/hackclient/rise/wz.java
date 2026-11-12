/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.yp;
import hackclient.rise.yq;
import hackclient.rise.yr;

@gl(aliases={"module.render.esp.name"}, description="module.render.esp.description", category=gj.RENDER)
public final class wz
extends gi {
    private final aki anQ = new aki("Glow", (gi)this, (Boolean)false, new yq("", this));
    private final aki anR = new aki("Chams", (gi)this, (Boolean)false, new yp("", this));
    public final aki anS = new aki("Static Color", (gi)this, (Boolean)false, () -> (Boolean)this.anR.wD() == false);
    private final aki anT = new aki("Skeletal", (gi)this, (Boolean)false, new yr("", this));
    public final aki anU = new aki("White Color", (gi)this, (Boolean)false, () -> (Boolean)this.anT.wD() == false);
    public final akq anV = new akq("Width", this, (Number)0.5, (Number)0.1, (Number)1.5, (Number)0.1);
}

