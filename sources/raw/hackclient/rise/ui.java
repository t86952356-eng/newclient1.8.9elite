/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.akq;
import hackclient.rise.bm;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eg;
import hackclient.rise.ei;
import hackclient.rise.fg;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import java.util.ArrayDeque;
import java.util.Deque;

@gl(aliases={"module.player.watchdogblink.name"}, description="module.player.watchdogblink.description", category=gj.PLAYER)
public class ui
extends gi {
    public akq aid = new akq("Interval", this, (Number)4, (Number)1, (Number)20, (Number)1);
    public akq aie = new akq("Disable Ticks", this, (Number)15, (Number)1, (Number)40, (Number)1);
    private final Deque<Integer> aif = new ArrayDeque<Integer>();
    private int aig;
    private int qH;
    private boolean aih;
    private boolean aii;
    @dm
    public final dk<ei> aij = ei2 -> bm.blink();
    @dm
    public final dk<eg> aik = eg2 -> {
        int n2 = bm.bg();
        int n3 = n2 - this.aig;
        if (n3 > 0) {
            this.aif.add(n3);
        }
        if (this.aih) {
            this.N(((Number)this.aie.wD()).intValue());
            if (this.aif.isEmpty() && !bm.bh()) {
                this.aii = true;
                super.setEnabled(false);
                this.aii = false;
                return;
            }
        } else {
            ++this.qH;
            if (this.qH >= ((Number)this.aid.wD()).intValue()) {
                this.qH = 0;
                this.N(1);
            }
        }
        this.aig = bm.bg();
    };
    @dm
    public final dk<fg> ail = fg2 -> {
        this.aif.clear();
        this.qH = 0;
        this.aih = false;
        this.aig = bm.bg();
    };

    @Override
    public void setEnabled(boolean bl2) {
        if (!bl2 && this.isEnabled() && !this.aii) {
            if (this.aih) {
                return;
            }
            if (!this.aif.isEmpty() || bm.bh()) {
                this.aih = true;
                this.qH = 0;
                return;
            }
        }
        super.setEnabled(bl2);
    }

    @Override
    public void onEnable() {
        this.aih = false;
        this.aii = false;
        this.aif.clear();
        this.aig = bm.bg();
        this.qH = 0;
    }

    @Override
    public void onDisable() {
        this.aih = false;
        this.aii = false;
        this.aif.clear();
        this.qH = 0;
        bm.dispatch();
    }

    private void N(int n2) {
        Integer n3;
        for (int i2 = 0; i2 < n2 && (n3 = this.aif.poll()) != null; ++i2) {
            if (n3 <= 0) continue;
            this.d(n3);
        }
    }

    private void d(int n2) {
        bm.d(n2);
    }
}

