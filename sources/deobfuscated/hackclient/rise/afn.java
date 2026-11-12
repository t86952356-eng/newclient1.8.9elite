/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.afo;
import hackclient.rise.agm;
import rip.vantage.commons.util.time.a;
import rise.util.math.Vector2d;

public class afn {
    public Vector2d aqy;
    public Vector2d atP;
    public Vector2d aHP;
    public Vector2d bS = new Vector2d(0.0, 0.0);
    public boolean dragging = false;
    public a bN = new a();

    public afn(Vector2d vector2d, Vector2d vector2d2) {
        this.aqy = this.atP = vector2d;
        this.aHP = vector2d2;
    }

    public void al(int n2) {
        Vector2d vector2d = afo.tl();
        if (agm.a(this.aqy, this.aHP, vector2d.x, vector2d.y) && n2 == 0) {
            this.dragging = true;
            this.bS.x = this.atP.x - vector2d.x;
            this.bS.y = this.atP.y - vector2d.y;
        }
    }

    public void cj() {
        Vector2d vector2d = afo.tl();
        if (this.dragging) {
            if (this.atP == null) {
                this.atP = new Vector2d(0.0, 0.0);
            }
            this.atP.x = vector2d.x + this.bS.x;
            this.atP.y = vector2d.y + this.bS.y;
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

