/*
 * Decompiled with CFR 0.152.
 */
package hackclient.rise;

import hackclient.rise.aca;
import rise.ui.clickgui.ModernClickGui;
import rise.util.InstanceAccess;
import rise.util.math.Vector2f;

public final class acf
implements aca,
InstanceAccess {
    @Override
    public void b(int n2, int n3, float f2) {
        ModernClickGui modernClickGui = this.v();
        Vector2f vector2f = new Vector2f(modernClickGui.ayt.x + 20.0f, modernClickGui.ayt.y + 20.0f);
        Vector2f vector2f2 = new Vector2f(modernClickGui.ayt.x + modernClickGui.alQ.x / 2.0f, modernClickGui.ayt.y + modernClickGui.alQ.y - 14.0f);
        String string = "Start typing to search...";
    }
}

