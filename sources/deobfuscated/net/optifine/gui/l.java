/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import java.util.List;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.minecraft.client.gui.cs;

public class l
extends GuiScreen {
    protected void a(c c2) {
    }

    @Override
    protected void mouseClicked(int n2, int n3, int n4) {
        c c2;
        super.mouseClicked(n2, n3, n4);
        if (n4 == 1 && (c2 = l.a(n2, n3, this.buttonList)) != null && c2.enabled) {
            c2.playPressSound(aER.Bx());
            this.a(c2);
        }
    }

    public static c a(int n2, int n3, List<c> list) {
        for (c c2 : list) {
            if (!c2.visible) continue;
            int n4 = cs.b(c2);
            int n5 = cs.c(c2);
            if (n2 < c2.xPosition || n3 < c2.yPosition || n2 >= c2.xPosition + n4 || n3 >= c2.yPosition + n5) continue;
            return c2;
        }
        return null;
    }
}

