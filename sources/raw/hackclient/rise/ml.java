/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.akd;
import hackclient.rise.aki;
import hackclient.rise.akq;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.fe;
import hackclient.rise.fi;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.network.aj;
import net.minecraft.network.play.client.c;
import net.minecraft.network.play.client.e;
import net.minecraft.network.play.client.g;
import net.minecraft.network.play.client.i;
import net.minecraft.network.play.client.k;

@gl(aliases={"module.movement.stuck.name", "stasis"}, description="module.movement.stuck.description", category=gj.MOVEMENT)
public class ml
extends gi {
    private akd EC;
    private final aki ED = new aki("Rotate", (gi)this, (Boolean)false);
    private final aki EE = new aki("Test", (gi)this, (Boolean)false);
    private final akq EF = new akq("Pulse Ticks", this, (Number)0, (Number)0, (Number)30, (Number)1);
    private boolean EG;
    private int EH;
    private int EI;
    @dm
    public final dk<eh> EJ = eh2 -> {
        if (!this.EG) {
            return;
        }
        aii.stop();
        ml.aER.bgK.ue = 0.0;
    };
    @dm
    public final dk<fe> EK = fe2 -> {
        int n2 = ((Number)this.EF.wD()).intValue();
        if (n2 <= 0) {
            if (!this.EG) {
                this.hm();
            }
            this.EH = 0;
            this.EI = 0;
            return;
        }
        if (this.EG) {
            if (++this.EH >= n2) {
                this.hn();
                this.EH = 0;
                this.EI = 1;
            }
            return;
        }
        if (this.EI > 0 && --this.EI <= 0) {
            this.hm();
        }
    };
    @dm
    public final dk<fi> EL = fi2 -> {
        aj<?> aj2 = fi2.dq();
        if (((Boolean)this.EE.wD()).booleanValue() && this.EG && (aj2 instanceof c || aj2 instanceof i || aj2 instanceof k)) {
            this.ho();
        }
        if (this.EG && aj2 instanceof e) {
            if (!((Boolean)this.ED.wD()).booleanValue()) {
                fi2.cF();
                return;
            }
            if (!(aj2 instanceof g)) {
                fi2.cF();
            }
        }
    };

    @Override
    public void onEnable() {
        this.EG = false;
        this.EH = 0;
        this.EI = 0;
        this.hm();
    }

    @Override
    public void onDisable() {
        this.EH = 0;
        this.EI = 0;
        this.hn();
    }

    private void hm() {
        if (this.EG) {
            return;
        }
        this.EC = new akd(ml.aER.bgK.ud, ml.aER.bgK.ue, ml.aER.bgK.uf);
        this.EG = true;
    }

    private void hn() {
        if (!this.EG) {
            return;
        }
        if (this.EC != null) {
            ml.aER.bgK.ud = this.EC.x;
            ml.aER.bgK.ue = this.EC.y;
            ml.aER.bgK.uf = this.EC.z;
        }
        this.EG = false;
    }

    private void ho() {
        this.hn();
        this.EH = 0;
        this.EI = 1;
    }
}

