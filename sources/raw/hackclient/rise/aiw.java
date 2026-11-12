/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.ais;
import hackclient.rise.ait;
import hackclient.rise.akb;
import java.awt.Color;
import rip.vantage.commons.util.time.a;

public class aiw
implements aea {
    private final akb aQh;
    private final akb aQi;
    private final float aQj;
    private final Color aQk;
    private Color aQl;
    private Color aQm;
    public a bN = new a();
    public a hj = new a();
    public float apt;

    public aiw(akb akb2, Color color, akb akb3, float f2) {
        this.aQh = akb2;
        this.aQk = color;
        this.aQi = akb3;
        this.aQj = f2;
        this.bN.aX();
        this.apt = color.getAlpha();
    }

    public aiw(akb akb2, akb akb3) {
        this.aQh = akb2;
        this.aQk = ais.d(ais.a(this.rP().rQ(), this.rP().rR(), Math.random()), (int)(Math.random() * 255.0));
        this.aQi = akb3;
        this.aQj = (float)(2.0 + Math.random() * 3.0);
        this.bN.aX();
        this.apt = this.aQk.getAlpha();
    }

    public void cj() {
        if (this.aQl == null || this.aQm == null) {
            return;
        }
        ait.c((double)this.aQh.x, (double)this.aQh.y, (double)this.aQj, (double)this.aQj, this.aQj / 2.0f, this.aQl);
    }

    public void ci() {
        if (this.aQl == null || this.aQm == null) {
            return;
        }
        ait.c((double)this.aQh.x, (double)this.aQh.y, (double)this.aQj, (double)this.aQj, this.aQj / 2.0f, this.aQm);
    }

    public void jA() {
        int n2 = 0;
        while ((long)n2 <= this.bN.aKM()) {
            this.aQh.setX(this.aQh.getX() + this.aQi.getX() / 10.0f);
            this.aQh.setY(this.aQh.getY() + this.aQi.getY() / 10.0f);
            this.aQi.setX(this.aQi.getX() * 0.999f);
            this.aQi.setY(this.aQi.getY() * 0.999f);
            ++n2;
        }
        this.aQm = ais.d(this.aQk, (int)this.apt * 3);
        this.aQl = ais.d(this.aQk, (int)this.apt);
        this.apt = Math.max(this.apt - (float)this.bN.aKM() / 18.0f, 0.0f);
        this.bN.aX();
    }
}

