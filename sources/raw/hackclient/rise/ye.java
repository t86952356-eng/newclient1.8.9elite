/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.yf;
import lombok.Generated;
import net.minecraft.item.bg;
import net.minecraft.item.co;
import net.minecraft.potion.a;

public final class ye
implements aea {
    public static yf t(co co2) {
        bg bg2 = (bg)co2.bP();
        int n2 = bg2 != null ? bg2.aE(co2) : 0;
        float f2 = bg2 != null ? bg2.aF(co2) : 0.0f;
        return new yf(n2, f2);
    }

    public static boolean u(co co2) {
        if (!(co2.bP() instanceof bg)) {
            return false;
        }
        bg bg2 = (bg)co2.bP();
        if (bg2.ar(co2) != null) {
            return a.dgt[bg2.adV()].aiZ();
        }
        return false;
    }

    @Generated
    private ye() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

