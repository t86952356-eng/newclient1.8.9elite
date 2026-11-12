/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import java.awt.Rectangle;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.c;
import net.optifine.gui.o;
import net.optifine.gui.q;
import net.optifine.shaders.gui.a;
import net.optifine.shaders.gui.b;

public class p
implements o {
    @Override
    public Rectangle a(GuiScreen guiScreen, int n2, int n3) {
        int n4 = guiScreen.width - 450;
        int n5 = 35;
        if (n4 < 10) {
            n4 = 10;
        }
        if (n3 <= n5 + 94) {
            n5 += 100;
        }
        int n6 = n4 + 150 + 150;
        int n7 = n5 + 84 + 10;
        return new Rectangle(n4, n5, n6 - n4, n7 - n5);
    }

    @Override
    public boolean aCK() {
        return true;
    }

    @Override
    public String[] b(c c2, int n2) {
        if (c2 instanceof a) {
            return q.im("of.options.shaders.DOWNLOAD");
        }
        if (!(c2 instanceof b)) {
            return null;
        }
        b b2 = (b)c2;
        net.optifine.shaders.config.a a2 = b2.aIs();
        String[] stringArray = this.a(a2);
        return stringArray;
    }

    private String[] a(net.optifine.shaders.config.a a2) {
        return q.im(a2.acf());
    }
}

