/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.ait;
import java.awt.Color;
import rise.Client;
import rise.ui.clickgui.ModernClickGui;
import rise.util.InstanceAccess;
import rise.util.math.Vector2f;

public class abk
implements InstanceAccess {
    public Vector2f alQ;

    public void pZ() {
        ModernClickGui modernClickGui = Client.a.v();
        double d2 = modernClickGui.ayt.x;
        double d3 = modernClickGui.ayt.y;
        double d4 = modernClickGui.alQ.x;
        double d5 = modernClickGui.alQ.y;
        if (this.alQ == null) {
            return;
        }
        ait.a(60, (double)((float)(d2 + d4 / 2.0 - (double)(this.alQ.x / 2.0f))), (double)((float)(d3 + d5 / 2.0 - (double)(this.alQ.y / 2.0f))), (double)this.alQ.x, (double)this.alQ.y, 50.0, 34.0);
        ait.c(d2 + d4 / 2.0 - (double)(this.alQ.x / 2.0f), d3 + d5 / 2.0 - (double)(this.alQ.y / 2.0f), (double)this.alQ.x, (double)this.alQ.y, 9.0, new Color(0, 0, 0, 230));
    }
}

