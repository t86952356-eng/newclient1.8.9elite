/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.renderer.block.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType;
import net.minecraft.client.renderer.block.model.ItemTransformVec3f;

public class ItemCameraTransforms {
    public static final ItemCameraTransforms bQV = new ItemCameraTransforms();
    public static float bQW = 0.0f;
    public static float bQX = 0.0f;
    public static float bQY = 0.0f;
    public static float bQZ = 0.0f;
    public static float bRa = 0.0f;
    public static float bRb = 0.0f;
    public static float bRc = 0.0f;
    public static float bRd = 0.0f;
    public static float bRe = 0.0f;
    public final ItemTransformVec3f bRf;
    public final ItemTransformVec3f bRg;
    public final ItemTransformVec3f bRh;
    public final ItemTransformVec3f bRi;
    public final ItemTransformVec3f bRj;
    public final ItemTransformVec3f bRk;

    private ItemCameraTransforms() {
        this(ItemTransformVec3f.bRG, ItemTransformVec3f.bRG, ItemTransformVec3f.bRG, ItemTransformVec3f.bRG, ItemTransformVec3f.bRG, ItemTransformVec3f.bRG);
    }

    public ItemCameraTransforms(ItemCameraTransforms itemCameraTransforms) {
        this.bRf = itemCameraTransforms.bRf;
        this.bRg = itemCameraTransforms.bRg;
        this.bRh = itemCameraTransforms.bRh;
        this.bRi = itemCameraTransforms.bRi;
        this.bRj = itemCameraTransforms.bRj;
        this.bRk = itemCameraTransforms.bRk;
    }

    public ItemCameraTransforms(ItemTransformVec3f itemTransformVec3f, ItemTransformVec3f itemTransformVec3f2, ItemTransformVec3f itemTransformVec3f3, ItemTransformVec3f itemTransformVec3f4, ItemTransformVec3f itemTransformVec3f5, ItemTransformVec3f itemTransformVec3f6) {
        this.bRf = itemTransformVec3f;
        this.bRg = itemTransformVec3f2;
        this.bRh = itemTransformVec3f3;
        this.bRi = itemTransformVec3f4;
        this.bRj = itemTransformVec3f5;
        this.bRk = itemTransformVec3f6;
    }

    public void a(ItemCameraTransforms$TransformType itemCameraTransforms$TransformType) {
        ItemTransformVec3f itemTransformVec3f = this.b(itemCameraTransforms$TransformType);
        if (itemTransformVec3f != ItemTransformVec3f.bRG) {
            GlStateManager.j(itemTransformVec3f.bRI.x + bQW, itemTransformVec3f.bRI.y + bQX, itemTransformVec3f.bRI.z + bQY);
            GlStateManager.d(itemTransformVec3f.bRH.y + bRa, 0.0f, 1.0f, 0.0f);
            GlStateManager.d(itemTransformVec3f.bRH.x + bQZ, 1.0f, 0.0f, 0.0f);
            GlStateManager.d(itemTransformVec3f.bRH.z + bRb, 0.0f, 0.0f, 1.0f);
            GlStateManager.i(itemTransformVec3f.bRJ.x + bRc, itemTransformVec3f.bRJ.y + bRd, itemTransformVec3f.bRJ.z + bRe);
        }
    }

    public ItemTransformVec3f b(ItemCameraTransforms$TransformType itemCameraTransforms$TransformType) {
        switch (itemCameraTransforms$TransformType.ordinal()) {
            case 1: {
                return this.bRf;
            }
            case 2: {
                return this.bRg;
            }
            case 3: {
                return this.bRh;
            }
            case 4: {
                return this.bRi;
            }
            case 5: {
                return this.bRj;
            }
            case 6: {
                return this.bRk;
            }
        }
        return ItemTransformVec3f.bRG;
    }

    public boolean c(ItemCameraTransforms$TransformType itemCameraTransforms$TransformType) {
        return !this.b(itemCameraTransforms$TransformType).equals(ItemTransformVec3f.bRG);
    }
}

