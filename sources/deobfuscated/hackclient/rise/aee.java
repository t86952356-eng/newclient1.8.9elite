/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package hackclient.rise;

import org.lwjgl.input.Mouse;
import rise.util.InstanceAccess;
import rise.util.math.Vector2d;

public class aee
implements InstanceAccess {
    public static boolean a(double d2, double d3, double d4, double d5, int n2, int n3) {
        return (double)n2 >= d2 && (double)n2 < d2 + d4 && (double)n3 >= d3 && (double)n3 < d3 + d5;
    }

    public static boolean e(double d2, double d3, double d4, double d5) {
        Vector2d vector2d = aee.sk();
        return vector2d.x >= d2 && vector2d.x < d2 + d4 && vector2d.y >= d3 && vector2d.y < d3 + d5;
    }

    public static Vector2d sk() {
        int n2 = aee.aER.jY.getScaledWidth();
        int n3 = aee.aER.jY.getScaledHeight();
        int n4 = Mouse.getX() * n2 / aee.aER.bgz;
        int n5 = n3 - Mouse.getY() * n3 / aee.aER.bgA - 1;
        return new Vector2d(n4, n5);
    }
}

