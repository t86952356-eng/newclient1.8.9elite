/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;

class RenderGlobal$2 {
    static final /* synthetic */ int[] bPl;

    static {
        bPl = new int[VertexFormatElement$EnumUsage.values().length];
        try {
            RenderGlobal$2.bPl[VertexFormatElement$EnumUsage.ccu.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            RenderGlobal$2.bPl[VertexFormatElement$EnumUsage.ccx.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            RenderGlobal$2.bPl[VertexFormatElement$EnumUsage.ccw.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

