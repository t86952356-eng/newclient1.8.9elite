/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.vertex;

public final class VertexFormatElement$EnumType
extends Enum<VertexFormatElement$EnumType> {
    public static final /* enum */ VertexFormatElement$EnumType ccj = new VertexFormatElement$EnumType(4, "Float", 5126);
    public static final /* enum */ VertexFormatElement$EnumType cck = new VertexFormatElement$EnumType(1, "Unsigned Byte", 5121);
    public static final /* enum */ VertexFormatElement$EnumType ccl = new VertexFormatElement$EnumType(1, "Byte", 5120);
    public static final /* enum */ VertexFormatElement$EnumType ccm = new VertexFormatElement$EnumType(2, "Unsigned Short", 5123);
    public static final /* enum */ VertexFormatElement$EnumType ccn = new VertexFormatElement$EnumType(2, "Short", 5122);
    public static final /* enum */ VertexFormatElement$EnumType cco = new VertexFormatElement$EnumType(4, "Unsigned Int", 5125);
    public static final /* enum */ VertexFormatElement$EnumType ccp = new VertexFormatElement$EnumType(4, "Int", 5124);
    private final int ccq;
    private final String ccr;
    private final int ccs;
    private static final /* synthetic */ VertexFormatElement$EnumType[] cct;

    public static VertexFormatElement$EnumType[] values() {
        return (VertexFormatElement$EnumType[])cct.clone();
    }

    public static VertexFormatElement$EnumType valueOf(String string) {
        return Enum.valueOf(VertexFormatElement$EnumType.class, string);
    }

    private VertexFormatElement$EnumType(int n3, String string2, int n4) {
        this.ccq = n3;
        this.ccr = string2;
        this.ccs = n4;
    }

    public int getSize() {
        return this.ccq;
    }

    public String getDisplayName() {
        return this.ccr;
    }

    public int Pb() {
        return this.ccs;
    }

    private static /* synthetic */ VertexFormatElement$EnumType[] Pc() {
        return new VertexFormatElement$EnumType[]{ccj, cck, ccl, ccm, ccn, cco, ccp};
    }

    static {
        cct = VertexFormatElement$EnumType.Pc();
    }
}

