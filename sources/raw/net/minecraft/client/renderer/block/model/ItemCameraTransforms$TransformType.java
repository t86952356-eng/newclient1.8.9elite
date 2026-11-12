/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

public final class ItemCameraTransforms$TransformType
extends Enum<ItemCameraTransforms$TransformType> {
    public static final /* enum */ ItemCameraTransforms$TransformType bRl = new ItemCameraTransforms$TransformType();
    public static final /* enum */ ItemCameraTransforms$TransformType bRm = new ItemCameraTransforms$TransformType();
    public static final /* enum */ ItemCameraTransforms$TransformType bRn = new ItemCameraTransforms$TransformType();
    public static final /* enum */ ItemCameraTransforms$TransformType bRo = new ItemCameraTransforms$TransformType();
    public static final /* enum */ ItemCameraTransforms$TransformType bRp = new ItemCameraTransforms$TransformType();
    public static final /* enum */ ItemCameraTransforms$TransformType bRq = new ItemCameraTransforms$TransformType();
    public static final /* enum */ ItemCameraTransforms$TransformType bRr = new ItemCameraTransforms$TransformType();
    private static final /* synthetic */ ItemCameraTransforms$TransformType[] bRs;

    public static ItemCameraTransforms$TransformType[] values() {
        return (ItemCameraTransforms$TransformType[])bRs.clone();
    }

    public static ItemCameraTransforms$TransformType valueOf(String string) {
        return Enum.valueOf(ItemCameraTransforms$TransformType.class, string);
    }

    private static /* synthetic */ ItemCameraTransforms$TransformType[] Mg() {
        return new ItemCameraTransforms$TransformType[]{bRl, bRm, bRn, bRo, bRp, bRq, bRr};
    }

    static {
        bRs = ItemCameraTransforms$TransformType.Mg();
    }
}

