/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.vecmath.Vector4d
 */
package hackclient.rise;

import hackclient.rise.aaa;
import hackclient.rise.aac;
import hackclient.rise.aad;
import hackclient.rise.aaf;
import hackclient.rise.aag;
import hackclient.rise.aah;
import hackclient.rise.aai;
import hackclient.rise.aka;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akn;
import hackclient.rise.akp;
import hackclient.rise.cj;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.eq;
import hackclient.rise.fs;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.zz;
import javax.vecmath.Vector4d;
import net.minecraft.client.gui.f;
import net.minecraft.entity.c;
import rip.vantage.commons.util.time.a;

@gl(aliases={"module.render.targetinfo.name"}, description="module.render.targetinfo.description", category=gj.RENDER)
public final class xz
extends gi {
    private final akp aqv = new akp("Mode", this).a(new akg[]{new zz("BMS", this)}).a(new akg[]{new aaf("Compact", this)}).a(new akg[]{new aad("Modern", this)}).a(new akg[]{new aag("Novoline", this)}).a(new akg[]{new aah("Godly", this)}).a(new akg[]{new aaa("Creida Modern", this)}).a(new akg[]{new aac("Exhibition", this)}).a(new akg[]{new aai("Wurst", this)}).co("Modern");
    public final akn aqw = new akn("Position", (gi)this, new aka(200.0, 200.0));
    public final aki aqx = new aki("Follow Player", (gi)this, (Boolean)false);
    public aka aqy = new aka(0.0, 0.0);
    public c by;
    public double amy;
    public boolean aqz;
    public a rG = new a();
    @dm
    public final dk<ei> aqA = ei2 -> {
        if (xz.aER.bgR instanceof f) {
            this.rG.aX();
            this.by = xz.aER.bgK;
        }
        if (this.by == null) {
            this.aqz = false;
            return;
        }
        this.amy = xz.aER.bgK.T(this.by);
        this.aqz = xz.aER.bgF.dCS.contains(this.by);
    };
    @dm
    public final dk<eq> aqB = eq2 -> {
        if (eq2.dc() instanceof net.minecraft.client.entity.a) {
            this.by = eq2.dc();
            this.rG.aX();
        }
    };
    @dm
    public final dk<fs> aqC = fs2 -> {
        if (this.by == null) {
            return;
        }
        if (((Boolean)this.aqx.wD()).booleanValue() && this.by != xz.aER.bgK) {
            Vector4d vector4d = cj.e(this.by);
            if (vector4d == null) {
                return;
            }
            this.aqy.x = vector4d.z;
            this.aqy.y = vector4d.w - (vector4d.w - vector4d.y) / 2.0 - this.aqw.aHP.y / 2.0;
        } else {
            this.aqy = this.aqw.aqy;
        }
    };
}

