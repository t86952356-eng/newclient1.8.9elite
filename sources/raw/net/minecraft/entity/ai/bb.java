/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity.ai;

import net.minecraft.entity.ai.bf;
import net.minecraft.entity.item.i;
import net.minecraft.entity.passive.z;
import net.minecraft.init.Items;
import net.minecraft.inventory.ad;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.util.bt;

public class bb
extends bf {
    private int czX;
    private final z czY;

    public bb(z z2) {
        super(z2, z.class, 3.0f, 0.02f);
        this.czY = z2;
    }

    @Override
    public void WG() {
        super.WG();
        this.czX = this.czY.aby() && this.cAj instanceof z && ((z)this.cAj).abz() ? 10 : 0;
    }

    @Override
    public void WF() {
        super.WF();
        if (this.czX > 0) {
            --this.czX;
            if (this.czX == 0) {
                ad ad2 = this.czY.abw();
                for (int i2 = 0; i2 < ad2.YI(); ++i2) {
                    co co2 = ad2.fi(i2);
                    co co3 = null;
                    if (co2 != null) {
                        d d2 = co2.bP();
                        if ((d2 == Items.cPT || d2 == Items.cRW || d2 == Items.cRV) && co2.cWZ > 3) {
                            var6_7 = co2.cWZ / 2;
                            co2.cWZ -= var6_7;
                            co3 = new co(d2, var6_7, co2.yc());
                        } else if (d2 == Items.cPS && co2.cWZ > 5) {
                            var6_7 = co2.cWZ / 2 / 3 * 3;
                            int n2 = var6_7 / 3;
                            co2.cWZ -= var6_7;
                            co3 = new co(Items.cPT, n2, 0);
                        }
                        if (co2.cWZ <= 0) {
                            ad2.g(i2, null);
                        }
                    }
                    if (co3 == null) continue;
                    double d3 = this.czY.gX - (double)0.3f + (double)this.czY.getEyeHeight();
                    i i3 = new i(this.czY.baU, this.czY.gW, d3, this.czY.gY, co3);
                    float f2 = 0.3f;
                    float f3 = this.czY.pn;
                    float f4 = this.czY.pm;
                    i3.ud = -bt.bx(f3 / 180.0f * (float)Math.PI) * bt.bB(f4 / 180.0f * (float)Math.PI) * 0.3f;
                    i3.uf = bt.bB(f3 / 180.0f * (float)Math.PI) * bt.bB(f4 / 180.0f * (float)Math.PI) * 0.3f;
                    i3.ue = -bt.bx(f4 / 180.0f * (float)Math.PI) * 0.3f + 0.1f;
                    i3.Yn();
                    this.czY.baU.G(i3);
                    break;
                }
            }
        }
    }
}

