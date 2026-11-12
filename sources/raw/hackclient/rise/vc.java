/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bd;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.fs;
import hackclient.rise.tn;
import hackclient.rise.ua;
import net.minecraft.init.Items;
import net.minecraft.item.co;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.k;
import net.minecraft.util.b;

public final class vc
extends akg<ua> {
    public int ajG = 0;
    public boolean IJ;
    public final aki ajH = new aki("Packet", (akg<?>)this, (Boolean)true);
    @dm
    public final dk<ei> ajI = ei2 -> {
        if (!aik.vw() || this.e(tn.class).isEnabled()) {
            return;
        }
        if (vc.aER.bgK.tR == 1 && vc.aER.bgK.ue < 0.0 && aik.vw() && !aik.ad(3.0)) {
            this.IJ = true;
        }
        if (this.IJ) {
            bm.a(99999, true, false, false, false, true);
            ei2.setOnGround(true);
            ++this.ajG;
        }
        if (this.IJ && vc.aER.bgK.aO) {
            bm.dispatch();
            this.IJ = false;
            this.ajG = 0;
        }
        if (this.ajG <= 0 && (double)bd.cY > 2.9 && !this.e(tn.class).isEnabled()) {
            ei2.setPosY(ei2.getPosY() + 1.0E-13);
            ahn.m(new k(b.dtN, 0, new co(Items.cQB, 1), 0.5f, 0.5f, 0.5f));
            vc.aER.bgC.dAp = 0.5f;
            ahn.m(new e(true));
            bd.cY = 0.0f;
        }
    };
    @dm
    public final dk<fs> ajJ = fs2 -> {
        if (this.ajG > 0) {
            vc.aER.fontRendererObj.c("Blinking: " + this.ajG, (double)vc.aER.jY.getScaledWidth() / 2.0, (double)vc.aER.jY.getScaledHeight() / 2.0 + 20.0, -1);
        }
    };

    public vc(String string, ua ua2) {
        super(string, ua2);
    }
}

