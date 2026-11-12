/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.am;
import hackclient.rise.dy;
import org.lwjgl.input.Mouse;
import rise.Client;
import rise.event.EventLink;
import rise.event.Listener;
import rise.event.impl.PreMotionEvent;

public class ap
extends am {
    int[] bF = new int[]{0, 1, 2, 3, 4, 5};
    boolean[] bG = new boolean[]{false, false, false, false, false, false};
    @EventLink(cH=0)
    public final Listener<PreMotionEvent> bH = preMotionEvent -> {
        for (int n2 : this.bF) {
            if (Mouse.isButtonDown((int)n2)) {
                if (!this.bG[n2]) {
                    Client.a.e().d(new dy(n2));
                }
                this.bG[n2] = true;
                continue;
            }
            this.bG[n2] = false;
        }
    };
}

