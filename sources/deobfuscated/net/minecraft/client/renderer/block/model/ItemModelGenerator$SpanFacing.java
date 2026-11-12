/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

import net.minecraft.util.ao;

final class ItemModelGenerator$SpanFacing
extends Enum<ItemModelGenerator$SpanFacing> {
    public static final /* enum */ ItemModelGenerator$SpanFacing bRy = new ItemModelGenerator$SpanFacing(ao.dwr, 0, -1);
    public static final /* enum */ ItemModelGenerator$SpanFacing bRz = new ItemModelGenerator$SpanFacing(ao.dwq, 0, 1);
    public static final /* enum */ ItemModelGenerator$SpanFacing bRA = new ItemModelGenerator$SpanFacing(ao.dwv, -1, 0);
    public static final /* enum */ ItemModelGenerator$SpanFacing bRB = new ItemModelGenerator$SpanFacing(ao.dwu, 1, 0);
    private final ao bRC;
    private final int bRD;
    private final int bRE;
    private static final /* synthetic */ ItemModelGenerator$SpanFacing[] bRF;

    public static ItemModelGenerator$SpanFacing[] values() {
        return (ItemModelGenerator$SpanFacing[])bRF.clone();
    }

    public static ItemModelGenerator$SpanFacing valueOf(String string) {
        return Enum.valueOf(ItemModelGenerator$SpanFacing.class, string);
    }

    private ItemModelGenerator$SpanFacing(ao ao2, int n3, int n4) {
        this.bRC = ao2;
        this.bRD = n3;
        this.bRE = n4;
    }

    public ao yx() {
        return this.bRC;
    }

    public int Ml() {
        return this.bRD;
    }

    public int Mm() {
        return this.bRE;
    }

    private boolean Mn() {
        return this == bRz || this == bRy;
    }

    private static /* synthetic */ ItemModelGenerator$SpanFacing[] Mo() {
        return new ItemModelGenerator$SpanFacing[]{bRy, bRz, bRA, bRB};
    }

    static {
        bRF = ItemModelGenerator$SpanFacing.Mo();
    }
}

