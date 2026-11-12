/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afo;
import hackclient.rise.agm;
import hackclient.rise.aka;
import rip.vantage.commons.util.time.a;

public class afn {
    public aka aqy;
    public aka atP;
    public aka aHP;
    public aka bS = new aka(0.0, 0.0);
    public boolean dragging = false;
    public a bN = new a();

    public afn(aka aka2, aka aka3) {
        this.aqy = this.atP = aka2;
        this.aHP = aka3;
    }

    public void al(int n2) {
        aka aka2 = afo.tl();
        if (agm.a(this.aqy, this.aHP, aka2.x, aka2.y) && n2 == 0) {
            this.dragging = true;
            this.bS.x = this.atP.x - aka2.x;
            this.bS.y = this.atP.y - aka2.y;
        }
    }

    public void cj() {
        aka aka2 = afo.tl();
        if (this.dragging) {
            if (this.atP == null) {
                this.atP = new aka(0.0, 0.0);
            }
            this.atP.x = aka2.x + this.bS.x;
            this.atP.y = aka2.y + this.bS.y;
        }
        if (this.atP == null) {
            return;
        }
        if (Math.abs(this.aqy.x - this.atP.x) > 1.0 || Math.abs(this.aqy.y - this.atP.y) > 1.0) {
            int n2 = 0;
            while ((long)n2 <= this.bN.aKM()) {
                this.aqy.x = (this.aqy.x * 38.0 + this.atP.x) / 39.0;
                this.aqy.y = (this.aqy.y * 38.0 + this.atP.y) / 39.0;
                ++n2;
            }
        }
        this.bN.aX();
    }

    public void pU() {
        this.dragging = false;
    }
}

