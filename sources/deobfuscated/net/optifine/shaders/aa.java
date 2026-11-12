/*
 * Decompiled with CFR 0.152.
 */
package net.optifine.shaders;

import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType;
import net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage;

public class aa {
    public static final int ewj = 14;
    public static final int ewk = 8;
    public static final int ewl = 10;
    public static final int ewm = 12;
    public static final VertexFormat ewn = aa.aEW();

    public static VertexFormat aEU() {
        VertexFormat vertexFormat = new VertexFormat();
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccu, 3));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.cck, VertexFormatElement$EnumUsage.ccw, 4));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccx, 2));
        vertexFormat.a(new VertexFormatElement(1, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccx, 2));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccv, 3));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccA, 1));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccA, 2));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 4));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 4));
        return vertexFormat;
    }

    public static VertexFormat aEV() {
        VertexFormat vertexFormat = new VertexFormat();
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccu, 3));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.cck, VertexFormatElement$EnumUsage.ccw, 4));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccx, 2));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 2));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccv, 3));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccA, 1));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccA, 2));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 4));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 4));
        return vertexFormat;
    }

    public static VertexFormat aEW() {
        VertexFormat vertexFormat = new VertexFormat();
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccu, 3));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.cck, VertexFormatElement$EnumUsage.ccA, 4));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccx, 2));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 2));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccv, 3));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccA, 1));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccA, 2));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 4));
        vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 4));
        return vertexFormat;
    }

    public static void b(VertexFormat vertexFormat) {
        if (vertexFormat != null) {
            vertexFormat.clear();
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccu, 3));
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.cck, VertexFormatElement$EnumUsage.ccw, 4));
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccx, 2));
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 2));
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccv, 3));
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccl, VertexFormatElement$EnumUsage.ccA, 1));
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccj, VertexFormatElement$EnumUsage.ccA, 2));
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 4));
            vertexFormat.a(new VertexFormatElement(0, VertexFormatElement$EnumType.ccn, VertexFormatElement$EnumUsage.ccA, 4));
        }
    }

    public static VertexFormat c(VertexFormat vertexFormat) {
        if (vertexFormat == null) {
            return null;
        }
        VertexFormat vertexFormat2 = new VertexFormat();
        aa.a(vertexFormat, vertexFormat2);
        return vertexFormat2;
    }

    public static void a(VertexFormat vertexFormat, VertexFormat vertexFormat2) {
        if (vertexFormat != null && vertexFormat2 != null) {
            vertexFormat2.clear();
            for (int i2 = 0; i2 < vertexFormat.OU(); ++i2) {
                vertexFormat2.a(vertexFormat.dS(i2));
            }
        }
    }
}

