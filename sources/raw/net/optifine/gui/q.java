/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import java.awt.Rectangle;
import java.util.ArrayList;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.optifine.aw;
import net.optifine.gui.m;
import net.optifine.gui.o;

public class q
implements o {
    @Override
    public Rectangle a(bp bp2, int n2, int n3) {
        int n4 = bp2.width / 2 - 150;
        int n5 = bp2.height / 6 - 7;
        if (n3 <= n5 + 98) {
            n5 += 105;
        }
        int n6 = n4 + 150 + 150;
        int n7 = n5 + 84 + 10;
        return new Rectangle(n4, n5, n6 - n4, n7 - n5);
    }

    @Override
    public boolean aCK() {
        return false;
    }

    @Override
    public String[] b(c c2, int n2) {
        if (!(c2 instanceof m)) {
            return null;
        }
        m m2 = (m)((Object)c2);
        net.minecraft.client.settings.c c3 = m2.aCJ();
        String[] stringArray = q.im(c3.QY());
        return stringArray;
    }

    public static String[] im(String string) {
        String string2;
        String string3;
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < 10 && (string3 = aw.ae(string2 = string + ".tooltip." + (i2 + 1), null)) != null; ++i2) {
            arrayList.add(string3);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
        return stringArray;
    }
}

