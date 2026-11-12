/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import hackclient.rise.aea;
import hackclient.rise.aka;
import org.lwjgl.input.Mouse;

public class aee
implements aea {
    public static boolean a(double d2, double d3, double d4, double d5, int n2, int n3) {
        return (double)n2 >= d2 && (double)n2 < d2 + d4 && (double)n3 >= d3 && (double)n3 < d3 + d5;
    }

    public static boolean e(double d2, double d3, double d4, double d5) {
        aka aka2 = aee.sk();
        return aka2.x >= d2 && aka2.x < d2 + d4 && aka2.y >= d3 && aka2.y < d3 + d5;
    }

    public static aka sk() {
        int n2 = aee.aER.jY.getScaledWidth();
        int n3 = aee.aER.jY.getScaledHeight();
        int n4 = Mouse.getX() * n2 / aee.aER.bgz;
        int n5 = n3 - Mouse.getY() * n3 / aee.aER.bgA - 1;
        return new aka(n4, n5);
    }
}

