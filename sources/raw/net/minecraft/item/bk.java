/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import net.minecraft.block.BlockDirt$DirtType;

class bk {
    static final /* synthetic */ int[] cWC;

    static {
        cWC = new int[BlockDirt$DirtType.values().length];
        try {
            bk.cWC[BlockDirt$DirtType.aTE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bk.cWC[BlockDirt$DirtType.aTF.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

