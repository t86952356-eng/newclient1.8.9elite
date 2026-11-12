/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ahj;
import hackclient.rise.aii;
import hackclient.rise.aik;
import hackclient.rise.aix;
import hackclient.rise.akg;
import hackclient.rise.aki;
import hackclient.rise.akp;
import hackclient.rise.akq;
import hackclient.rise.aks;
import hackclient.rise.bv;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dz;
import hackclient.rise.ew;
import hackclient.rise.gi;
import hackclient.rise.gj;
import hackclient.rise.gl;
import net.minecraft.block.BlockAir;
import net.minecraft.entity.r;
import net.minecraft.util.bt;

@gl(aliases={"module.combat.keeprange.name", "S Tap"}, description="module.combat.keeprange.description", category=gj.COMBAT)
public final class gs
extends gi {
    private final akq lK = new akq("Range", this, (Number)3, (Number)0, (Number)6, (Number)0.1);
    private final aki lL = new aki("Disable Near Edge", (gi)this, (Boolean)true);
    private final akq lM = new akq("Edge Range", this, (Number)5, (Number)0, (Number)6, (Number)1, () -> (Boolean)this.lL.wD() == false);
    private final akp lN = new akp("Mode", this).a(new akg[]{new aks("BackWards")}).a(new akg[]{new aks("Stop")}).co("Stop");
    private final akq lO = new akq("Combo To Start", this, (Number)2, (Number)0, (Number)6, (Number)1);
    private boolean lP;
    private int lQ;
    @dm
    public final dk<ew> lR = ew2 -> {
        if (!gs.aER.bgK.aO) {
            return;
        }
        this.lP = false;
        int n2 = ((Number)this.lM.wD()).intValue();
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                boolean bl2;
                for (int i4 = -5; i4 <= 0 && (bl2 = aik.p(i2, i4, i3) instanceof BlockAir); ++i4) {
                    if (i4 != 0) continue;
                    this.lP = true;
                    return;
                }
            }
        }
    };
    @dm
    public final dk<dz> lS = dz2 -> {
        r r2 = bv.e(10.0);
        double d2 = ((Number)this.lK.wD()).doubleValue();
        if (gs.aER.bgK.aY <= 7) {
            d2 -= 0.2;
        }
        if (r2 == null || this.lP && ((Boolean)this.lL.wD()).booleanValue()) {
            this.lQ = 0;
            return;
        }
        if (r2.cus > 0) {
            ++this.lQ;
        }
        if (gs.aER.bgK.cus > 0) {
            this.lQ = 0;
        }
        if (this.lQ <= ((Number)this.lO.wD()).intValue() * 8 && ((Number)this.lO.wD()).intValue() > 0) {
            return;
        }
        if (aik.v(r2) < d2 - 0.05) {
            float f2 = dz2.getForward();
            float f3 = dz2.getStrafe();
            double d3 = bt.aJ(aix.y(r2).getX() - 180.0f);
            if (f2 == 0.0f && f3 == 0.0f) {
                return;
            }
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = Float.MAX_VALUE;
            for (float f7 = -1.0f; f7 <= 1.0f; f7 += 1.0f) {
                for (float f8 = -1.0f; f8 <= 1.0f; f8 += 1.0f) {
                    double d4;
                    double d5;
                    if (f8 == 0.0f && f7 == 0.0f || !((d5 = ahj.n(d3, d4 = bt.aJ(Math.toDegrees(aii.direction(gs.aER.bgK.pl, f7, f8))))) < (double)f6)) continue;
                    f6 = (float)d5;
                    f4 = f7;
                    f5 = f8;
                }
            }
            switch (((akg)this.lN.wD()).getName()) {
                case "Stop": {
                    if (f4 == f2 * -1.0f) {
                        dz2.setForward(0.0f);
                    }
                    if (f5 != f3 * -1.0f) break;
                    dz2.setStrafe(0.0f);
                    break;
                }
                case "BackWards": {
                    dz2.setForward(f4);
                    dz2.setStrafe(f5);
                }
            }
        }
    };
}

