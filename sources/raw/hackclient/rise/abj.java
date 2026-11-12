/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.abz;
import hackclient.rise.aea;
import hackclient.rise.agm;
import hackclient.rise.ahf;
import hackclient.rise.ait;
import hackclient.rise.aka;
import hackclient.rise.akb;
import hackclient.rise.gb;
import hackclient.rise.gd;
import lombok.Generated;
import net.minecraft.util.cm;

public class abj
implements aea {
    private final ahf azb;
    private final String azc;
    private final String azd;
    private double au;

    public void G(double d2) {
        akb akb2 = this.v().pm();
        double d3 = this.v().po().ayX;
        ait.c((double)akb2.getX() + d3 + 8.0, (double)akb2.getY() + d2, 285.0, 38.0, 6.0, abz.aAf.ql());
        gb.ks.a(20, gd.kG).a(this.azd, (double)akb2.getX() + d3 + 18.0, (double)akb2.getY() + d2 + 9.0, a.a.d().equals((Object)this.azb) ? this.rP().j(new aka(0.0, akb2.y / 5.0f)).getRGB() : abz.aAc.qm());
        gb.ks.a(17, gd.kG).a(this.azc, (double)akb2.getX() + d3 + 18.0, (double)akb2.getY() + d2 + 24.0, abz.aAc.Z(100));
        ait.a(new cm("rise/icons/language/" + this.azb.uT() + ".png"), (double)akb2.getX() + d3 + (double)gb.ks.a(20, gd.kG).bQ(this.azd) + 25.0, (double)akb2.getY() + d2 + 5.0, 15.0, 15.0);
        this.au = d2;
    }

    public void j(double d2, double d3) {
        akb akb2 = this.v().pm();
        double d4 = this.v().po().ayX;
        if (agm.c((double)akb2.getX() + d4 + 8.0, (double)akb2.getY() + this.au, 285.0, 38.0, d2, d3)) {
            a.a.a(this.azb);
        }
    }

    @Generated
    public ahf d() {
        return this.azb;
    }

    @Generated
    public String pX() {
        return this.azc;
    }

    @Generated
    public String pY() {
        return this.azd;
    }

    @Generated
    public double ag() {
        return this.au;
    }

    @Generated
    public abj(ahf ahf2, String string, String string2) {
        this.azb = ahf2;
        this.azc = string;
        this.azd = string2;
    }
}

