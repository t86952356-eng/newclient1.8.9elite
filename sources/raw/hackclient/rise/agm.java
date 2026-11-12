/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package hackclient.rise;

import hackclient.rise.aka;
import hackclient.rise.akb;
import lombok.Generated;

public final class agm {
    public static boolean c(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d6 > d2 && d6 < d2 + d4 && d7 > d3 && d7 < d3 + d5;
    }

    public static boolean a(aka aka2, aka aka3, double d2, double d3) {
        return d2 > aka2.x && d2 < aka2.x + aka3.x && d3 > aka2.y && d3 < aka2.y + aka3.y;
    }

    public static boolean a(akb akb2, akb akb3, double d2, double d3) {
        return d2 > (double)akb2.x && d2 < (double)(akb2.x + akb3.x) && d3 > (double)akb2.y && d3 < (double)(akb2.y + akb3.y);
    }

    public static boolean a(akb akb2, akb akb3, aka aka2) {
        return aka2.x > (double)akb2.x && aka2.x < (double)(akb2.x + akb3.x) && aka2.y > (double)akb2.y && aka2.y < (double)(akb2.y + akb3.y);
    }

    @Generated
    private agm() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

