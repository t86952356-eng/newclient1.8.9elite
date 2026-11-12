/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.vertex;

import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;

class VertexFormat$1 {
    static final /* synthetic */ int[] ccd;

    static {
        ccd = new int[VertexFormatElement$EnumUsage.values().length];
        try {
            VertexFormat$1.ccd[VertexFormatElement$EnumUsage.ccv.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            VertexFormat$1.ccd[VertexFormatElement$EnumUsage.ccw.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            VertexFormat$1.ccd[VertexFormatElement$EnumUsage.ccx.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

