/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ahn;
import hackclient.rise.aik;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.bd;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.ei;
import hackclient.rise.jg;
import hackclient.rise.lw;
import hackclient.rise.lz;
import hackclient.rise.mh;
import hackclient.rise.tn;
import hackclient.rise.ua;
import net.minecraft.block.Block;
import net.minecraft.client.multiplayer.j;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.e;
import net.minecraft.util.b;

public class vb
extends akg<ua> {
    public final aki ajE = new aki("Prediction", (akg<?>)this, (Boolean)false);
    @dm
    public final dk<ei> ajF = ei2 -> {
        boolean bl2 = false;
        for (int i2 = 0; i2 <= 200; ++i2) {
            j j2 = aik.aER.bgF;
            b b2 = new b(vb.aER.bgK.gW, vb.aER.bgK.gX - (double)i2, vb.aER.bgK.gY);
            Block block = j2.L(b2).df();
            if (block != Blocks.cLc || vb.aER.bgK.aO) {
                bl2 = false;
                break;
            }
            bl2 = true;
        }
        if (!(!((double)bd.cY > 3.1 + vb.aER.bgK.ue) || bl2 || this.e(tn.class).isEnabled() || this.e(lz.class).isEnabled() || this.e(lw.class).isEnabled() && ((Boolean)this.ajE.wD()).booleanValue() || this.e(mh.class).isEnabled() && ((Boolean)this.ajE.wD()).booleanValue())) {
            if (!((Boolean)this.e(jg.class).wu.wD()).booleanValue() || !this.e(jg.class).isEnabled()) {
                ei2.setPosY(ei2.getPosY() + 1.0E-13);
            }
            ahn.m(new e(true));
            vb.aER.bgC.dAp = 0.5f;
            bd.cY = 0.0f;
        } else if (!(!((double)bd.cY > 3.1 + vb.aER.bgK.ue) || this.e(tn.class).isEnabled() || this.e(lw.class).isEnabled() && ((Boolean)this.ajE.wD()).booleanValue() || this.e(lz.class).isEnabled() && ((akg)a.a.g().c(lz.class).DD.wD()).getName().equals("Watchdog 2"))) {
            if (!bl2 || this.e(lz.class).isEnabled() && ((akg)a.a.g().c(lz.class).DD.wD()).getName().equals("Watchdog Fire Ball 2")) {
                if (!((Boolean)this.e(jg.class).wu.wD()).booleanValue() || !this.e(jg.class).isEnabled()) {
                    ei2.setPosY(ei2.getPosY() + 1.0E-13);
                }
                ahn.m(new e(true));
                vb.aER.bgC.dAp = 0.5f;
                bd.cY = 0.0f;
            }
        } else if (((akg)a.a.g().c(lz.class).DD.wD()).getName().equals("Watchdog 2") && this.e(lz.class).isEnabled() && (double)bd.cY > 4.0 + vb.aER.bgK.ue) {
            ei2.setPosY(ei2.getPosY() + 1.0E-13);
            ahn.m(new e(true));
            vb.aER.bgC.dAp = 0.5f;
            bd.cY = 0.0f;
        }
        if ((double)bd.cY > 3.1 + vb.aER.bgK.ue && !bl2 && this.e(mh.class).isEnabled() && ((Boolean)this.ajE.wD()).booleanValue() && (!((Boolean)this.e(jg.class).wu.wD()).booleanValue() || !this.e(jg.class).isEnabled())) {
            ei2.setPosY(ei2.getPosY() + 1.0E-13);
            ahn.m(new e(true));
            vb.aER.bgC.dAp = 0.5f;
            bd.cY = 0.0f;
        }
    };

    public vb(String string, ua ua2) {
        super(string, ua2);
    }
}

