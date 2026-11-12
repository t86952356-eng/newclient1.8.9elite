/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.bk;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import hackclient.rise.mt;
import hackclient.rise.om;
import hackclient.rise.oo;
import hackclient.rise.op;
import hackclient.rise.oq;
import hackclient.rise.or;
import hackclient.rise.os;
import hackclient.rise.ou;
import hackclient.rise.ov;
import hackclient.rise.ow;
import hackclient.rise.ox;
import hackclient.rise.oy;
import hackclient.rise.oz;
import hackclient.rise.pa;

@gl(aliases={"module.movement.longjump.name"}, description="module.movement.longjump.description", category=gj.MOVEMENT)
public class lz
extends gi {
    public final akp DD = new akp("Mode", this).a(new akg[]{new os("Vanilla", this)}).a(new akg[]{new op("Matrix 2", this)}).a(new akg[]{new oq("NCP", this)}).a(new akg[]{new ov("Vulcan", this)}).a(new akg[]{new om("Watchdog Water 1.18+", this)}).a(new akg[]{new ox("Watchdog 2", this)}).a(new akg[]{new oo("Fire Ball", this)}).a(new akg[]{new pa("Watchdog", this)}).a(new akg[]{new ow("Watchdog Glide", this)}).a(new akg[]{new oy("Watchdog Fire Ball", this)}).a(new akg[]{new oz("Watchdog Fire Ball 2", this)}).a(new akg[]{new mt("Grim", this)}).a(new akg[]{new or("Bloxd", this)}).a(new akg[]{new ou("Vulcan 2", this)}).co("Vanilla");
    public final aki DE = new aki("Auto Disable", (gi)this, (Boolean)true);
    private final aki DF = new aki("Fake Damage", (gi)this, (Boolean)false);
    private boolean DG;
    @dm
    public final dk<ei> DH = ei2 -> {
        if (((Boolean)this.DE.wD()).booleanValue() && this.DG && lz.aER.bgK.aO && !((akg)this.DD.wD()).getName().equals("Watchdog") && !((akg)this.DD.wD()).getName().equals("Watchdog 2")) {
            this.toggle();
        }
        this.DG = !lz.aER.bgK.aO && !bk.bd();
    };

    @Override
    public void onEnable() {
        if (((Boolean)this.DF.wD()).booleanValue() && lz.aER.bgK.aRg > 1) {
            aik.fakeDamage();
        }
    }

    @Override
    public void onDisable() {
        lz.aER.bgC.dAp = 1.0f;
        this.DG = false;
    }
}

