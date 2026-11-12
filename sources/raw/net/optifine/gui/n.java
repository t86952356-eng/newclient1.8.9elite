/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.gui;

import hackclient.rise.agg;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.d;
import net.minecraft.client.gui.b;
import net.minecraft.client.gui.bp;
import net.minecraft.client.gui.c;
import net.optifine.gui.l;
import net.optifine.gui.o;

public class n {
    private final bp eke;
    private final o ekf;
    private int ekg = 0;
    private int ekh = 0;
    private long eki = 0L;

    public n(bp bp2, o o2) {
        this.eke = bp2;
        this.ekf = o2;
    }

    public void b(int n2, int n3, List list) {
        if (Math.abs(n2 - this.ekg) <= 5 && Math.abs(n3 - this.ekh) <= 5) {
            c c2;
            int n4 = 700;
            if (System.currentTimeMillis() >= this.eki + 700L && (c2 = l.a(n2, n3, list)) != null) {
                Rectangle rectangle = this.ekf.a(this.eke, n2, n3);
                String[] stringArray = this.ekf.b(c2, rectangle.width);
                if (stringArray != null) {
                    int n5;
                    if (stringArray.length > 8) {
                        stringArray = Arrays.copyOf(stringArray, 8);
                        stringArray[stringArray.length - 1] = stringArray[stringArray.length - 1] + " ...";
                    }
                    if (this.ekf.aCK()) {
                        n5 = -528449408;
                        this.f(rectangle.x, rectangle.y, rectangle.x + rectangle.width, rectangle.y + rectangle.height, -528449408);
                    }
                    b.drawRect(rectangle.x, rectangle.y, rectangle.x + rectangle.width, rectangle.y + rectangle.height, -536870912);
                    for (n5 = 0; n5 < stringArray.length; ++n5) {
                        String string = stringArray[n5];
                        int n6 = 0xDDDDDD;
                        if (string.endsWith("!")) {
                            n6 = 0xFF2020;
                        }
                        agg agg2 = d.AZ().fontRendererObj;
                        agg2.b(string, rectangle.x + 5, rectangle.y + 6 + n5 * 11, n6);
                    }
                }
            }
        } else {
            this.ekg = n2;
            this.ekh = n3;
            this.eki = System.currentTimeMillis();
        }
    }

    private void f(int n2, int n3, int n4, int n5, int n6) {
        b.drawRect(n2, n3 - 1, n4, n3, n6);
        b.drawRect(n2, n5, n4, n5 + 1, n6);
        b.drawRect(n2 - 1, n3, n2, n5, n6);
        b.drawRect(n4, n3, n4 + 1, n5, n6);
    }
}

