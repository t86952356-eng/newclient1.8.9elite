/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.vertex;

public final class VertexFormatElement$EnumUsage
extends Enum<VertexFormatElement$EnumUsage> {
    public static final /* enum */ VertexFormatElement$EnumUsage ccu = new VertexFormatElement$EnumUsage("Position");
    public static final /* enum */ VertexFormatElement$EnumUsage ccv = new VertexFormatElement$EnumUsage("Normal");
    public static final /* enum */ VertexFormatElement$EnumUsage ccw = new VertexFormatElement$EnumUsage("Vertex Color");
    public static final /* enum */ VertexFormatElement$EnumUsage ccx = new VertexFormatElement$EnumUsage("UV");
    public static final /* enum */ VertexFormatElement$EnumUsage ccy = new VertexFormatElement$EnumUsage("Bone Matrix");
    public static final /* enum */ VertexFormatElement$EnumUsage ccz = new VertexFormatElement$EnumUsage("Blend Weight");
    public static final /* enum */ VertexFormatElement$EnumUsage ccA = new VertexFormatElement$EnumUsage("Padding");
    private final String ccB;
    private static final /* synthetic */ VertexFormatElement$EnumUsage[] ccC;

    public static VertexFormatElement$EnumUsage[] values() {
        return (VertexFormatElement$EnumUsage[])ccC.clone();
    }

    public static VertexFormatElement$EnumUsage valueOf(String string) {
        return Enum.valueOf(VertexFormatElement$EnumUsage.class, string);
    }

    private VertexFormatElement$EnumUsage(String string2) {
        this.ccB = string2;
    }

    public String getDisplayName() {
        return this.ccB;
    }

    private static /* synthetic */ VertexFormatElement$EnumUsage[] Pd() {
        return new VertexFormatElement$EnumUsage[]{ccu, ccv, ccw, ccx, ccy, ccz, ccA};
    }

    static {
        ccC = VertexFormatElement$EnumUsage.Pd();
    }
}

