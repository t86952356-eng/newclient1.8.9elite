/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.am;
import hackclient.rise.dk;
import hackclient.rise.dm;
import hackclient.rise.dy;
import hackclient.rise.ei;
import org.lwjgl.input.Mouse;

public class ap
extends am {
    int[] bF = new int[]{0, 1, 2, 3, 4, 5};
    boolean[] bG = new boolean[]{false, false, false, false, false, false};
    @dm(cH=0)
    public final dk<ei> bH = ei2 -> {
        for (int n2 : this.bF) {
            if (Mouse.isButtonDown((int)n2)) {
                if (!this.bG[n2]) {
                    a.a.e().d(new dy(n2));
                }
                this.bG[n2] = true;
                continue;
            }
            this.bG[n2] = false;
        }
    };
}

