/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.a;
import hackclient.rise.abf;
import hackclient.rise.aea;
import hackclient.rise.ait;
import hackclient.rise.akb;
import java.awt.Color;

public class abk
implements aea {
    public akb alQ;

    public void pZ() {
        abf abf2 = a.a.v();
        double d2 = abf2.ayt.x;
        double d3 = abf2.ayt.y;
        double d4 = abf2.alQ.x;
        double d5 = abf2.alQ.y;
        if (this.alQ == null) {
            return;
        }
        ait.a(60, (double)((float)(d2 + d4 / 2.0 - (double)(this.alQ.x / 2.0f))), (double)((float)(d3 + d5 / 2.0 - (double)(this.alQ.y / 2.0f))), (double)this.alQ.x, (double)this.alQ.y, 50.0, 34.0);
        ait.c(d2 + d4 / 2.0 - (double)(this.alQ.x / 2.0f), d3 + d5 / 2.0 - (double)(this.alQ.y / 2.0f), (double)this.alQ.x, (double)this.alQ.y, 9.0, new Color(0, 0, 0, 230));
    }
}

