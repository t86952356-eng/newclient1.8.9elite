/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.abz;
import hackclient.rise.agm;
import hackclient.rise.ahg;
import hackclient.rise.gb;
import hackclient.rise.gd;
import rise.module.Mode;
import rise.ui.clickgui.value.ValueComponent;
import rise.util.math.Vector2d;
import rise.value.ModeValue;
import rise.value.Value;

public class abv
extends ValueComponent {
    public abv(Value<?> value) {
        super(value);
    }

    @Override
    public void a(Vector2d vector2d, int n2, int n3, float f2) {
        ModeValue modeValue = (ModeValue)this.azn;
        this.aqy = vector2d;
        String string = ahg.cf(this.azn.getName()) + ":";
        gb.ks.a(16, gd.kG).a(string, this.aqy.x, this.aqy.y, abz.aAd.Z(Math.min(this.azo, abz.aAd.ql().getAlpha())));
        gb.ks.a(16, gd.kG).a(ahg.cf(((Mode)modeValue.wD()).getName()), this.aqy.x + (double)gb.ks.a(16, gd.kG).bQ(string) + 2.0, this.aqy.y, abz.aAd.Z(Math.min(this.azo, abz.aAd.ql().getAlpha())));
    }

    @Override
    public boolean e(int n2, int n3, int n4) {
        boolean bl2;
        if (this.aqy == null) {
            return false;
        }
        ModeValue modeValue = (ModeValue)this.azn;
        boolean bl3 = n4 == 0;
        boolean bl4 = bl2 = n4 == 1;
        if (agm.c(this.aqy.x, this.aqy.y - 3.5, this.v().width - 70, this.jy, n2, n3)) {
            int n5 = modeValue.wU().indexOf(modeValue.wD());
            Mode<?> mode = null;
            if (bl3) {
                mode = modeValue.wU().size() <= n5 + 1 ? modeValue.wU().get(0) : modeValue.wU().get(n5 + 1);
            } else if (bl2) {
                mode = 0 > n5 - 1 ? modeValue.wU().get(modeValue.wU().size() - 1) : modeValue.wU().get(n5 - 1);
            }
            if (mode != null) {
                modeValue.c(mode);
            }
            return true;
        }
        return false;
    }

    @Override
    public void pP() {
    }

    @Override
    public void ci() {
    }

    @Override
    public void b(char c2, int n2) {
    }
}

