/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aii;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.eh;
import hackclient.rise.ei;
import lombok.Generated;

public final class bk
extends am {
    private static boolean dj;
    private static float dD;
    private static int dE;
    @dm
    public final dk<ei> dF = ei2 -> {
        if (dj) {
            if (dE < 4) {
                bk.aER.bgC.dAp = dD;
                if (bk.aER.bgK.aO) {
                    bk.aER.bgK.jump();
                    ++dE;
                }
                ei2.setOnGround(false);
            } else if (bk.aER.bgK.tR >= 11) {
                bk.aER.bgC.dAp = 1.0f;
                dj = false;
                dD = 1.0f;
                dE = 0;
            }
        }
    };
    @dm
    public final dk<eh> dG = eh2 -> {
        if (dj) {
            aii.stop();
        }
    };

    public static void a(float f2) {
        dj = true;
        dD = f2;
        dE = 0;
    }

    @Generated
    public static boolean bd() {
        return dj;
    }

    @Generated
    public static int be() {
        return dE;
    }
}

