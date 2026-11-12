/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer;

import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;

class WorldVertexBufferUploader$1 {
    static final /* synthetic */ int[] bQq;

    static {
        bQq = new int[VertexFormatElement$EnumUsage.values().length];
        try {
            WorldVertexBufferUploader$1.bQq[VertexFormatElement$EnumUsage.ccu.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            WorldVertexBufferUploader$1.bQq[VertexFormatElement$EnumUsage.ccx.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            WorldVertexBufferUploader$1.bQq[VertexFormatElement$EnumUsage.ccw.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            WorldVertexBufferUploader$1.bQq[VertexFormatElement$EnumUsage.ccv.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

