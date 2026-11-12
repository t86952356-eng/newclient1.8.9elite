/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.akg;
import hackclient.rise.akp;
import hackclient.rise.aks;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dt;
import hackclient.rise.fs;
import hackclient.rise.gg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.client.gui.bp;
import org.lwjgl.input.Keyboard;

@gl(aliases={"module.render.clickgui.name"}, description="module.render.clickgui.description", category=gj.RENDER, keyBind=54)
public final class wy
extends gi {
    private final rip.vantage.commons.util.time.a anM = new rip.vantage.commons.util.time.a();
    public final akp anN = new akp("Mode", this).a(new akg[]{new aks("Modern")}).a(new akg[]{new aks("Dropdown")}).co("Modern");
    @dm(cH=3)
    public final dk<fs> anO = fs2 -> {
        if (((akg)this.anN.wD()).getName().equals("Modern")) {
            this.b(gg.kV, 2).c(() -> a.a.v().cj());
            this.b(gg.kT, 3).c(() -> a.a.v().ci());
        } else {
            this.b(gg.kV, 2).c(() -> a.a.z().cj());
            this.b(gg.kT, 3).c(() -> a.a.z().ci());
        }
    };
    @dm
    public final dk<dt> anP = dt2 -> {
        if (!this.anM.T(50L)) {
            return;
        }
        if (dt2.cO() == this.getKey()) {
            aER.a((bp)null);
            if (wy.aER.bgR == null) {
                aER.AK();
            }
        }
    };

    @Override
    public void onEnable() {
        if (((akg)this.anN.wD()).getName().equals("Modern")) {
            aER.a(a.a.v());
        } else {
            aER.a(a.a.z());
        }
        this.anM.aX();
    }

    @Override
    public void onDisable() {
        aER.AK();
        Keyboard.enableRepeatEvents((boolean)false);
        a.a.e().c(a.a.v());
        a.a.e().c(a.a.z());
        aNC.execute(() -> a.a.p().tD().tu());
    }
}

