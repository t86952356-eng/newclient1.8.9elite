/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import lombok.Generated;
import rise.util.math.Vector2d;
import rise.util.math.Vector2f;

public final class agm {
    public static boolean c(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d6 > d2 && d6 < d2 + d4 && d7 > d3 && d7 < d3 + d5;
    }

    public static boolean a(Vector2d vector2d, Vector2d vector2d2, double d2, double d3) {
        return d2 > vector2d.x && d2 < vector2d.x + vector2d2.x && d3 > vector2d.y && d3 < vector2d.y + vector2d2.y;
    }

    public static boolean a(Vector2f vector2f, Vector2f vector2f2, double d2, double d3) {
        return d2 > (double)vector2f.x && d2 < (double)(vector2f.x + vector2f2.x) && d3 > (double)vector2f.y && d3 < (double)(vector2f.y + vector2f2.y);
    }

    public static boolean a(Vector2f vector2f, Vector2f vector2f2, Vector2d vector2d) {
        return vector2d.x > (double)vector2f.x && vector2d.x < (double)(vector2f.x + vector2f2.x) && vector2d.y > (double)vector2f.y && vector2d.y < (double)(vector2f.y + vector2f2.y);
    }

    @Generated
    private agm() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

