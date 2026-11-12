/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.ahj;
import hackclient.rise.aki;
import hackclient.rise.akj;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.ei;
import hackclient.rise.fg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.client.entity.b;

@gl(aliases={"module.player.blink.name"}, description="module.player.blink.description", category=gj.PLAYER)
public class tf
extends gi {
    public aki yz = new aki("Pulse", (gi)this, (Boolean)false);
    public akj xa = new akj("Delay", this, (Number)2, (Number)2, (Number)2, (Number)40, (Number)1, () -> (Boolean)this.yz.wD() == false);
    public int ps;
    private b pv;
    @dm
    public final dk<ei> abH = ei2 -> bm.blink();
    @dm
    public final dk<eg> abI = eg2 -> {
        if (tf.aER.bgK.aRg > this.ps && ((Boolean)this.yz.wD()).booleanValue()) {
            this.gi();
            bm.dispatch();
            this.gj();
        }
    };
    @dm
    public final dk<fg> abJ = fg2 -> this.gi();

    @Override
    public void onEnable() {
        this.gi();
    }

    @Override
    public void onDisable() {
        this.gj();
    }

    public void gi() {
        if (tf.aER.bgK == null) {
            return;
        }
        this.ps = tf.aER.bgK.aRg + (int)ahj.l(((Number)this.xa.wD()).intValue(), this.xa.wP().intValue());
    }

    public void gj() {
        if (this.pv != null) {
            a.a.x().c(this, this.pv);
            tf.aER.bgF.co(this.pv.getEntityId());
            this.pv = null;
        }
    }
}

